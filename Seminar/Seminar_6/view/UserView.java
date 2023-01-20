package Java_L_S_D_ooP.Seminar.Seminar_6.view;

import java.util.List;
import Java_L_S_D_ooP.Seminar.Seminar_6.data.User;

public abstract class UserView {
    
    abstract User findTheBest (List<User> userlist);

    public void showTheBest (List<User> userList) {
        System.out.println(findTheBest(userList));
    }
}
