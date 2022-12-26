package Java_L_S_D_ooP.Seminar.Seminar_3.Controller;

// Создать package – view. Работу продолжаем в нем
// Создать абстрактный класс  UserView, содержащий в себе метод 
// void showTheBest(List<User> userList) , нутри вызывающий абстрактный метод 
// User findTheBest(List<User> userList)
// 3.    Создать класс StudentView, унаследованный или имплементирующий UserView , 
// содержащий в себе реализация findTheBest

import Java_L_S_D_ooP.Seminar.Seminar_2.Data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_2.Data.Teacher;
import Java_L_S_D_ooP.Seminar.Seminar_2.Service.DataService;
import Java_L_S_D_ooP.Seminar.Seminar_2.Service.StudentDataService;
import Java_L_S_D_ooP.Seminar.Seminar_2.Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent (Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher teacherService (Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }
}