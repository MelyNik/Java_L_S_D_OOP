package Java_L_S_D_ooP.DZ.Dz_4.controller;

import Java_L_S_D_ooP.DZ.Dz_4.data.Teacher;

public class TeacherController implements InterfaceController<Teacher, Integer> {

    private final Teacher teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher save(Teacher teacher) {
        return teacherService.saveTeacher(teacher);
    }

    @Override
    public Teacher find(Integer id) {
        return teacherService.findTeacherById(id);
    }

}
