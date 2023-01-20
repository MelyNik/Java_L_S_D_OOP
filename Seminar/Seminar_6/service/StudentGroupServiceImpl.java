package Java_L_S_D_ooP.Seminar.Seminar_6.service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_6.data.StudentGroup;
import Java_L_S_D_ooP.Seminar.Seminar_6.data.UserComparator;
import Java_L_S_D_ooP.Seminar.Seminar_6.repository.Repository;
import Java_L_S_D_ooP.Seminar.Seminar_6.util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService{

    private final Repository<StudentGroup, Integer> studentGroupIntegerRepository;

    public StudentGroupServiceImpl(Repository<StudentGroup, Integer> studentGroupIntegerRepository) {
        this.studentGroupIntegerRepository = studentGroupIntegerRepository;
    }

    public StudentGroup saveGroup(StudentGroup studentGroup) {
        return studentGroupIntegerRepository.save(studentGroup);
    }

    public StudentGroup findGroup(int groupNumber) {
        return studentGroupIntegerRepository.findByid(groupNumber);
    }

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
