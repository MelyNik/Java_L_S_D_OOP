package Java_L_S_D_ooP.Seminar.Seminar_6.service;

import Java_L_S_D_ooP.Seminar.Seminar_6.data.User;

public interface DataService<E extends User> {
    
    E read();
    E create(E user);
    E saveUser(E user);
    E findUserById(int id);

}
