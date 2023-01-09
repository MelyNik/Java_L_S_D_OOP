package Java_L_S_D_ooP.DZ.Dz_4.controller;

import Java_L_S_D_ooP.DZ.Dz_4.data.StudentGroup;
import Java_L_S_D_ooP.DZ.Dz_4.service.StudentGroupServiceImpl;

public class StudentGroupController implements InterfaceController<StudentGroup, Integer> {

    private final StudentGroupServiceImpl studentGroupServiceImpl;

    public StudentGroupController(StudentGroupServiceImpl studentGroupServiceImpl) {
        this.studentGroupServiceImpl = studentGroupServiceImpl;
    }

    @Override
    public StudentGroup save(StudentGroup studentGroup) {
        return studentGroupServiceImpl.saveGroup(studentGroup);
    }

    @Override
    public StudentGroup find(Integer id) {
        return studentGroupServiceImpl.findGroup(id);
    }
}
