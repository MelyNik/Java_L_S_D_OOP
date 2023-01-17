package Java_L_S_D_ooP.Seminar.Seminar_5.service;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.Teacher;
import Java_L_S_D_ooP.Seminar.Seminar_5.data.User;
import Java_L_S_D_ooP.Seminar.Seminar_5.repository.TeacherRepository;
import Java_L_S_D_ooP.Seminar.Seminar_5.util.ReaderFromTxt;
import Java_L_S_D_ooP.Seminar.Seminar_5.util.WriterFromTxt;

public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);
    }

    public Teacher findTeacherById(int id) {
        return teacherRepository.findByid(id);
    }

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public User create(User user) {
        return WriterFromTxt.write(user);
    }

}
