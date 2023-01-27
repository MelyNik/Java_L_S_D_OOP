package Java_L_S_D_ooP.DZ.Dz_6_7.view;

import java.util.List;
import Java_L_S_D_ooP.DZ.Dz_6_7.data.User;

public class StudentView extends UserView{

    @Override
    User findTheBest(List<User> userlist){
        return userlist.get(0);
    }
    
}
