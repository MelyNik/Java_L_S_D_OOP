package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable {

    private StudentService studentService;
    private Student student;

    public DeleteStudentByFioExecutable(StudentService studentService, Student student) {
        this.studentService = studentService;
        this.student = student;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByFio(student.getFIO());
        System.out.println("Delete student: " + student.getFIO());
    }
}
