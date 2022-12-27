package Java_L_S_D_ooP.DZ.Dz_3.View;

import java.util.List;

import Java_L_S_D_ooP.DZ.Dz_3.Data.User;

public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }
    
}
