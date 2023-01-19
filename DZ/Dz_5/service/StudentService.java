package Java_L_S_D_ooP.DZ.Dz_5.service;

import Java_L_S_D_ooP.DZ.Dz_5.data.Student;
import Java_L_S_D_ooP.DZ.Dz_5.repository.StudentRepository;
import Java_L_S_D_ooP.DZ.Dz_5.util.ReaderFromTxt;
import Java_L_S_D_ooP.DZ.Dz_5.util.WriterFromTxt;

public class StudentService implements DataService<Student>  {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student deleteStudent(Student student) {
        return studentRepository.deleteStudent(student);
    }

    public Student deleteStudentByFio(String fio) {
        return studentRepository.deleteStudentByFio(fio);
    }

    public Student deleteStudentByGroupBirthday(int groupNumber, int birthday) {
        return studentRepository.deleteStudentByGroupBirthday(groupNumber, birthday);
    }

    @Override
    public Student read() {
        return (Student) ReaderFromTxt.read();
    }

    @Override
    public Student create(Student student) {
        return (Student) WriterFromTxt.write(student);
    }

    @Override
    public Student findUserById(int id) {
        return studentRepository.findByid(id);
    }

    @Override
    public Student saveUser(Student user) {
        return studentRepository.save(user);
    }
    
}
