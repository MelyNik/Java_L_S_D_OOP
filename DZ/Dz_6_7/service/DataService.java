package Java_L_S_D_ooP.DZ.Dz_6_7.service;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.User;

public interface DataService<E extends User> {
    
    E read();
    E create(E user);
    E saveUser(E user);
    E findUserById(int id);

}
