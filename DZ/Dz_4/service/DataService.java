package Java_L_S_D_ooP.DZ.Dz_4.service;

import Java_L_S_D_ooP.DZ.Dz_4.data.User;

public interface DataService<E extends User> {
    
    public User read();

    public User create(User user);
}
