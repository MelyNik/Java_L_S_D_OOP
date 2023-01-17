package Java_L_S_D_ooP.Seminar.Seminar_5.controller;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_5.data.StudentGroup;
import Java_L_S_D_ooP.Seminar.Seminar_5.repository.GroupRepository;
import Java_L_S_D_ooP.Seminar.Seminar_5.service.GroupStreamServiceImpl;
import Java_L_S_D_ooP.Seminar.Seminar_5.service.StudentGroupServiceImpl;
import Java_L_S_D_ooP.Seminar.Seminar_5.service.StudentService;

// 1. Реализовать класc TeacherRepository (обобщение на ваше усмотрение).

// 2. Обобщить интерфейс DataService, чтобы он работал только с наследникам класса User.

// 3. Реализовать методы поиска и сохранения в классе TeacherService.

// 4. Реализовать как можно более обобщенный интерфейс Controller.

// 5. Создать классы StudentController, TeacherController, GroupController с методами сохранения и 
// поиска соответствующих объектов.

// *6. Реализовать такой же функционал для класса GroupStream.



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