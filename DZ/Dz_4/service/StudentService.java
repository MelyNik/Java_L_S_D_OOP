package Java_L_S_D_ooP.DZ.Dz_4.service;

import Java_L_S_D_ooP.DZ.Dz_4.data.Student;
import Java_L_S_D_ooP.DZ.Dz_4.data.User;
import Java_L_S_D_ooP.DZ.Dz_4.repository.StudentRepository;
import Java_L_S_D_ooP.DZ.Dz_4.util.ReaderFromTxt;
import Java_L_S_D_ooP.DZ.Dz_4.util.WriterFromTxt;

public class StudentService implements DataService<Student>  {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public Student findStudentById(int id) {
        return studentRepository.findById(id);
    }

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public User create(User user) {
        return  WriterFromTxt.write(user);
    }
    
}
