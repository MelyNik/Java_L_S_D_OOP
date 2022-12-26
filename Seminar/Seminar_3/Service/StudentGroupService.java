package Java_L_S_D_ooP.Seminar.Seminar_3.Service;

import java.util.Collection;
import java.util.Collections;

import Java_L_S_D_ooP.Seminar.Seminar_3.Data.StudentGroup;

public interface StudentGroupService {

    public StudentGroup readGroup(int groupNumber, String path){
        super(groupNumber, path);
    }

    public void removeStudent(String fio, StudentGroup studentGroup){
        super(fio, studentGroup);
    }

    public void sortStudent(StudentGroup studentGroup){
        Collections.sort(studentGroup.getStudents());
    }

}