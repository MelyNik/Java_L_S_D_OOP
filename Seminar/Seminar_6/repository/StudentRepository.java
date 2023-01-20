package Java_L_S_D_ooP.Seminar.Seminar_6.repository;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    
    public Student deleteStudent(Student student) {
        return null;
    }

    public Student deleteStudentByFio(String fio) {
        return null;
    }

    public Student deleteStudentByGroupBirthday(int groupNumber, int birthday) {
        return null;
    }

    @Override
    public Student save(Student entity){
        return null;
    }
    
    @Override
    public Student findByid(Integer id){
        return null;
    }

    @Override
    public Student findByFio(String fio){
        return null;
    }

}
