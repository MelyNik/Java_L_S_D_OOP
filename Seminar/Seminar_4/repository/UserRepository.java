package Java_L_S_D_ooP.Seminar.Seminar_4.repository;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    E findByFio(String fio);
}
