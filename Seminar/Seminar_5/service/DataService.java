package Java_L_S_D_ooP.Seminar.Seminar_5.service;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.User;

public interface DataService<E extends User> {
    
    public User read();

    public User create(User user);
}
