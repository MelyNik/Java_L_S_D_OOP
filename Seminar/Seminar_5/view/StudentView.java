package Java_L_S_D_ooP.Seminar.Seminar_5.view;

import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.User;


public class StudentView extends UserView {

    @Override
    User findTheBest(List<User> userlist) {
        return userlist.get(0);
    }
    
}
