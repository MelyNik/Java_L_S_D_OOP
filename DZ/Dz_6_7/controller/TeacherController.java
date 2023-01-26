package Java_L_S_D_ooP.DZ.Dz_6_7.controller;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Teacher;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.TeacherService;

public class TeacherController implements InterfaceController<Teacher, Integer> {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.saveUser(teacher);
    }

    @Override
    public Teacher find(Integer id) {
        return teacherService.findUserById(id);
    }

}
