package Java_L_S_D_ooP.Seminar.Seminar_3.Service;


import Java_L_S_D_ooP.Seminar.Seminar_3.Data.Student;
import Java_L_S_D_ooP.Seminar.Seminar_3.Data.StudentGroup;
import Java_L_S_D_ooP.Seminar.Seminar_3.Data.Teacher;
import Java_L_S_D_ooP.Seminar.Seminar_3.Data.User;
import Java_L_S_D_ooP.Seminar.Seminar_3.Util.ReaderFromTxt;

public class StudentGroupServiceImpl implements DataService {

    public StudentGroup getGroup(){
        return new StudentGroup( null, null, 0);
    }
    

    @Override
    public void create(User user){
    } 

    @Override
    public User read(User user){
        return DataService.super.read(user);
    }

    @Override
    public StudentGroup getGroup(){
        return new StudentGroup(null, null, 0);
    }

    @Override
    public void remove(Student fio){
        StudentGroup studentGroup = getGroup().iterator();
        while(studentGroup.hasNext()){
            Student student = studentGroup.next();
            if(fio.equals(student)){
                studentGroup.remove();
            }
        }
    }

}
