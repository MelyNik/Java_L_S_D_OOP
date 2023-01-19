package Java_L_S_D_ooP.DZ.Dz_5.service;

import Java_L_S_D_ooP.DZ.Dz_5.data.Teacher;
import Java_L_S_D_ooP.DZ.Dz_5.repository.TeacherRepository;
import Java_L_S_D_ooP.DZ.Dz_5.util.ReaderFromTxt;
import Java_L_S_D_ooP.DZ.Dz_5.util.WriterFromTxt;

public class TeacherService implements DataService<Teacher> {

    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher read() {
        return (Teacher) ReaderFromTxt.read();
    }

    @Override
    public Teacher create(Teacher user) {
        return (Teacher) WriterFromTxt.write(user);
    }

    @Override
    public Teacher saveUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findUserById(int id) {
        return teacherRepository.findByid(id);
    }

}
