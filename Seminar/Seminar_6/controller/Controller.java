package Java_L_S_D_ooP.Seminar.Seminar_6.controller;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_6.data.StudentGroup;
import Java_L_S_D_ooP.Seminar.Seminar_6.repository.GroupRepository;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.GroupStreamServiceImpl;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.StudentGroupServiceImpl;
import Java_L_S_D_ooP.Seminar.Seminar_6.service.StudentService;

public class Controller {

    private StudentService studentService;

    public Controller(StudentService studentService) {
        this.studentService = studentService;
    }

    public Student createStudent(Student student) {
        studentService.create(student);
        return (Student) studentService.read();
    }

    public StudentGroup createStudentGroup(int groupNumber) {
        return new StudentGroupServiceImpl(new GroupRepository()).getStudentGroup();
    }

    public void removeStudent(String fio) {
        StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl(new GroupRepository());
        studentGroupServiceImpl.removeStudent(fio);
    }

    public void sortGroupStream(GroupStreamServiceImpl groupStreamServiceImpl) {
        sortGroupStream(groupStreamServiceImpl);
    }
}