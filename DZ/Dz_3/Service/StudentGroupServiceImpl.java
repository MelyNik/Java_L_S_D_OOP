package Java_L_S_D_ooP.DZ.Dz_3.Service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.DZ.Dz_3.Data.Student;
import Java_L_S_D_ooP.DZ.Dz_3.Data.StudentGroup;
import Java_L_S_D_ooP.DZ.Dz_3.Data.UserComparator;
import Java_L_S_D_ooP.DZ.Dz_3.Util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService{

    @Override
    public StudentGroup getStudentGroup() {
        StudentGroup studentGroup = new StudentGroup(ReaderFromTxt.readTeacher(), ReaderFromTxt.readStudents());
        return studentGroup;
    }

    public void removeStudent(String FIO) {
        for (int i = 0; i < getStudentGroup().getStudents().size(); i++)
            {
                if(FIO.equals(getStudentGroup().getStudents().get(i).getFIO()))
                    {
                        this.getStudentGroup().getStudents().remove(i);
                    }
            }
    }

    public void sortStudents(StudentGroup studentGroup) {
        Collections.sort(studentGroup.getStudents());
    }

    public void sortStudentsToFIO(List<Student> students) {
        Collections.sort(students, new UserComparator());
    }
}
