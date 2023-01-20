package Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.StudentService;

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
