package Java_L_S_D_ooP.DZ.Dz_2.View;

import java.util.List;

import Java_L_S_D_ooP.DZ.Dz_2.Data.User;

public class StudentView extends UserView{

    @Override
    protected User findTheBest(List<User> userList) {
        User user = userList.get(0);
        return user;
    }
}
