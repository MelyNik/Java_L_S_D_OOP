package Java_L_S_D_ooP.Seminar.Seminar_4.View;

import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.User;



public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }
    
}
