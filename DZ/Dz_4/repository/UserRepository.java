package Java_L_S_D_ooP.DZ.Dz_4.repository;

import Java_L_S_D_ooP.DZ.Dz_4.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I> {
    public abstract E findByFio(String fio);
}
