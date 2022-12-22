package Java_L_S_D_ooP.DZ.Dz_2.Data;

// Создать класс StudentGroup, содержащая в себе поля Teacher и список студентов.
// Создать класс StudentGroupServiceImpl, в котором реализована логика чтения 
// Студентов и Преподавателя из файла txt (реализация чтения файла опциональна), 
// создания класса StudentGroup и возвращения его.
// Создать метод в Controller createGroup(int groupNumber), в который передается номер 
// группы, а возвращается StudentGroup.
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре.

import java.util.List;

public class StudentGroup {
    private Teacher teacher;
    private List <Student> students;
    private int groupNumber;

    public StudentGroup(Teacher teacher, List <Student> students, int groupNumber) {
        this.teacher = teacher;
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


}
