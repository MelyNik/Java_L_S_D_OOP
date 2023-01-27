package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.Command;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{
    
    private final StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService){
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable command(Command input){
        if(input.isCreateCommand())
            {
                return new CreateStudentExecutable(studentService, new Student(input.getFirstArguments()));
            }
        else if (input.isDeleteCommand()) 
            {
                return new DeleteStudentExecutable(studentService, new Student(input.getFirstArguments()));
            }
        else if (input.isByFioCommand()) 
            {
                return new DeleteStudentByFioExecutable(studentService, input.getFirstArguments());
            }
        else if (input.isByGroupBirthdayCommand()) 
            {
                Integer.parseInt(input.getFirstArguments().split("")[0]);
                return new DeleteStudentByGroupBirthdayExecutable(studentService, Integer.parseInt(input.getFirstArguments().split("")[0]),Integer.parseInt(input.getFirstArguments().split("")[1]));
            }
        else
            {
                return new UnknownCommandExecutable();
            }
    }
    
}
