package Java_L_S_D_ooP.DZ.Dz_6_7.repository;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;
import Java_L_S_D_ooP.DZ.Dz_6_7.db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer> {

    private StudentTable studentTable;
    
    public StudentRepository(StudentTable studentTable){
        this.studentTable = studentTable;
    }

    public Student deleteStudent(Student student){
        studentTable.deleteStudent(student);
        return null;
    }

    public Student deleteStudentByFio(String fio){
        studentTable.deleteByFio(fio);
        return null;
    }

    public Student deleteStudentByGroupBirthday(int groupNumber, int birthday){
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
