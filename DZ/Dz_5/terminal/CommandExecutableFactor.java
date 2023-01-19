package Java_L_S_D_ooP.DZ.Dz_5.terminal;

import Java_L_S_D_ooP.DZ.Dz_5.data.Student;
import Java_L_S_D_ooP.DZ.Dz_5.service.StudentService;
import Java_L_S_D_ooP.DZ.Dz_5.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.DZ.Dz_5.terminal.executable.CreateStudentExecutable;
import Java_L_S_D_ooP.DZ.Dz_5.terminal.executable.DeleteStudentByFioExecutable;
import Java_L_S_D_ooP.DZ.Dz_5.terminal.executable.DeleteStudentByGroupBirthdayExecutable;
import Java_L_S_D_ooP.DZ.Dz_5.terminal.executable.DeleteStudentExecutable;

public class CommandExecutableFactor {
    
    private StudentService studentService;

    public CommandExecutable create(String[] input){
        if(input[0].equals("/add"))
            {
                return new CreateStudentExecutable(studentService, new Student(input[1]));
            }
        else if (input[0].equals("/delete")) 
            {
                return new DeleteStudentExecutable(studentService, new Student(input[1]));
            }
        else if (input[0].equals("/deleteByFio")) 
            {
                return new DeleteStudentByFioExecutable(studentService, new Student(input[1]));
            }
        else if (input[0].equals("/deleteByGroupBirthday")) 
            {
                return new DeleteStudentByGroupBirthdayExecutable(studentService, new Student(input[1]));
            }
        else
            {
                return null;
            }
        
    }
}
