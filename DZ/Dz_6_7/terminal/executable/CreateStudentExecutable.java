package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;

public class CreateStudentExecutable implements CommandExecutable{
    
    private StudentService studentService;
    private Student student;

    public CreateStudentExecutable(StudentService studentService, Student student){
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute(){
        studentService.saveUser(student);
        System.out.println("Add student: " + student.getFIO());
    }

}
