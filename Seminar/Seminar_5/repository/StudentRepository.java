package Java_L_S_D_ooP.Seminar.Seminar_5.repository;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    
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
