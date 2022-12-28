package Java_L_S_D_ooP.Seminar.Seminar_4.repository;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.Student;

public class StudentRepository implements UserRepository<Student, Integer> {
    @Override
    public void save(Student entity){
        
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
