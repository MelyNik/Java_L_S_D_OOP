package Java_L_S_D_ooP.DZ.Dz_6_7.data;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {

    @Override
    public int compare(User user_1, User user_2) {
        int comparator = user_1.getFIO().compareTo(user_2.getFIO());
        if (comparator < 0)
            {
                return -1;
            }
        else if (comparator > 0)
            {
                return 1;
            }
        else
            {
                return 0;
            }
    }
}
