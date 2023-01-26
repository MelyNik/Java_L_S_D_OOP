package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;

public class DeleteStudentByGroupBirthdayExecutable implements CommandExecutable {
    private StudentService studentService;
    private Student student;

    public DeleteStudentByGroupBirthdayExecutable(StudentService studentService, Student student) {
        this.student = student;
        this.studentService = studentService;
    }

    @Override
    public void execute() {
        studentService.deleteStudentByGroupBirthday(student.getGroupNumber(), student.getBirthday());
        System.out.println("Delete student: " + student.getFIO());
    }

}
