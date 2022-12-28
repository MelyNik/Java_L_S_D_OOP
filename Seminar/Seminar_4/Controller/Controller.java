package Java_L_S_D_ooP.Seminar.Seminar_4.Controller;

import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.StudentGroup;
import Java_L_S_D_ooP.Seminar.Seminar_4.Service.GroupStreamServiceImpl;
import Java_L_S_D_ooP.Seminar.Seminar_4.Service.StudentGroupServiceImpl;



// 1. Создать класс GroupStream, содержащий в себе список StudentGroup и 
// реализующий интерфейс Iterable<StudentGroup>.

// 2. Создать класс GroupStreamComparator<GroupStream>, 
// реализующий сравнение количества групп входящих в GroupStream.

// 3. Создать класс GroupStreamServiceImpl, добавив в него метод сортировки списка потоков, 
// используя созданный GroupStreamComparator.

// 4. Модифицировать класс Controller, добавив в него созданный сервис.

// 5. Модифицировать класс Controller, добавив в него метод, 
// сортирующий список потоков, путем вызова созданного сервиса.



public class Controller {
    private List<StudentGroupServiceImpl> studentGroupServiceImpls_1;

    public StudentGroup creatingStudentGroup(int groupNumber) {
        StudentGroupServiceImpl studentGroupServiceImpl = new StudentGroupServiceImpl(null);
        for (int i = 0; i < studentGroupServiceImpls_1.size(); i++) 
            {
                if(groupNumber == studentGroupServiceImpls_1.get(i).getStudentGroup().getStudents().get(0).getGroupNumber())
                    {
                        studentGroupServiceImpl = studentGroupServiceImpls_1.get(i);
                    }
            }
        return studentGroupServiceImpl.getStudentGroup();
    }

    public void removeStudent (String FIO) {
        for (int i = 0; i < studentGroupServiceImpls_1.size(); i++) 
            {
                studentGroupServiceImpls_1.get(i).removeStudent(FIO);
            }
    }

    public void sortGroupStream (GroupStreamServiceImpl groupStreamServiceImpl) {
        sortGroupStream(groupStreamServiceImpl);
    }
}