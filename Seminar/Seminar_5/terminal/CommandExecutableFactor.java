package Java_L_S_D_ooP.Seminar.Seminar_5.terminal;

import Java_L_S_D_ooP.Seminar.Seminar_5.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_5.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_5.service.StudentService;
import Java_L_S_D_ooP.Seminar.Seminar_5.terminal.executable.CreateStudentExecutable;
import Java_L_S_D_ooP.Seminar.Seminar_5.terminal.executable.DeleteStudentExecutable;

public class CommandExecutableFactor {
    
    private StudentService studentService;

    public CommandExecutable create(String[] input){
        if(input[0].equals("add"))
            {
                return new CreateStudentExecutable(studentService, new Student(input[1]));
            }
        else
            {
                return new DeleteStudentExecutable(studentService, new Student(input[1])); 
            }
    }
}
