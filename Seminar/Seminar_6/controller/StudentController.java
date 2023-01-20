package Java_L_S_D_ooP.Seminar.Seminar_6.controller;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.StudentService;

public class StudentController implements InterfaceController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public Student save(Student student) {
        return studentService.saveUser(student);
    }

    @Override
    public Student find(Integer id) {
        return studentService.findUserById(id);
    }
}
