package Java_L_S_D_ooP.Seminar.Seminar_6.terminal;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.StudentService;
import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.CreateStudentExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.DeleteStudentByFioExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.DeleteStudentByGroupBirthdayExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.DeleteStudentExecutable;

public class CommandExecutableFactor {
    
    private StudentService studentService;

    public CommandExecutableFactor(){
        this.studentService = null;
    }

    public CommandExecutable create(Command input){
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
                return new DeleteStudentByFioExecutable(studentService, new Student(input.getFirstArguments()));
            }
        else if (input.isByGroupBirthdayCommand()) 
            {
                return new DeleteStudentByGroupBirthdayExecutable(studentService, new Student(input.getFirstArguments()));
            }
        else
            {
                return null;
            }
        
    }
}
