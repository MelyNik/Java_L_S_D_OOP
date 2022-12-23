package Java_L_S_D_ooP.DZ.Dz_2.Service;

import Java_L_S_D_ooP.DZ.Dz_2.Data.Student;
import Java_L_S_D_ooP.DZ.Dz_2.Data.StudentGroup;
import Java_L_S_D_ooP.DZ.Dz_2.Data.Teacher;
import Java_L_S_D_ooP.DZ.Dz_2.Util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService {
    private StudentGroup group;

    public StudentGroupServiceImpl(StudentGroup group) {
        this.group = group;
    }
    
    public StudentGroup getGroup() {
        return group;
    }

    public void setGroup(StudentGroup group) {
        this.group = group;
    }

    @Override
    public Student read(Student student) {
        return ReaderFromTxt.read(student);
    }

    @Override
    public Teacher read(Teacher teacher) {
        return ReaderFromTxt.read(teacher);
    }

}
