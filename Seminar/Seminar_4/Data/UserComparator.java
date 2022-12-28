package Java_L_S_D_ooP.Seminar.Seminar_4.Data;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    
    @Override
    public int compare(User us1, User us2){
        int compare = us1.getFIO().compareTo(us2.getFIO()); 
        if(compare < 0) 
            {
                return -1;
            }
        else if(compare > 0) 
            {
                return 1;
            }
        else
            {
                return 0;
            }
    }
}
