package Java_L_S_D_ooP.Seminar.Seminar_4.Service;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_4.Data.User;
import Java_L_S_D_ooP.Seminar.Seminar_4.Util.ReaderFromTxt;
import Java_L_S_D_ooP.Seminar.Seminar_4.Util.WriterFromTxt;
import Java_L_S_D_ooP.Seminar.Seminar_4.repository.StudentRepository;

public class StudentService implements DataService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public void create(User user) {
        WriterFromTxt.write(user);
    }

    public void saveStudent(Student entity){
        studentRepository.save(entity);
    }

    public Student findStudentByid(int id){
        return studentRepository.findByid(id);
    }

    public Student finStudentBiFio(String fio){
        return studentRepository.findByFio(fio);
    }
    
}
