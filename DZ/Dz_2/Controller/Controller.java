package Java_L_S_D_ooP.DZ.Dz_2.Controller;

// 1. Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.

// 2. Создать класс StudentGroupServiceImpl, в котором реализована логика чтения Студентов и 
// Преподавателя из файла txt (реализация чтения файла опциональна), 
// создания класса StudentGroup и возвращения его.

// 3. Создать метод в Controller createGroup(int groupNumber), в который передается номер группы, 
// а возвращается StudentGroup.

// 4. Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.



import Java_L_S_D_ooP.DZ.Dz_2.Data.StudentGroup;
import Java_L_S_D_ooP.DZ.Dz_2.Data.Student;
import Java_L_S_D_ooP.DZ.Dz_2.Data.Teacher;
import Java_L_S_D_ooP.DZ.Dz_2.Service.DataService;
import Java_L_S_D_ooP.DZ.Dz_2.Service.StudentDataService;
import Java_L_S_D_ooP.DZ.Dz_2.Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent(Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher(Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup(int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}