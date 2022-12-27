package Java_L_S_D_ooP.Seminar.Seminar_3.Data;

import java.util.Comparator;

public class UserComparator implements Comparator<Student> {
    
    @Override
    public int compare(Student student1, Student student2){
        return (student1.getFIO().compareTo(student2.getFIO()));
    }
}
