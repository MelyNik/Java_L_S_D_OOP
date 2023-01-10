package Java_L_S_D_ooP.DZ.Dz_4.view;

import java.util.List;
import Java_L_S_D_ooP.DZ.Dz_4.data.User;

public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }
    
}
