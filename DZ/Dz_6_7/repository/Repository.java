package Java_L_S_D_ooP.DZ.Dz_6_7.repository;

public interface Repository<E, I>{

    E save(E entity);
    E findByid(I id);  
}
