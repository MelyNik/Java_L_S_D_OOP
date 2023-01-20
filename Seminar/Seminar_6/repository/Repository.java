package Java_L_S_D_ooP.Seminar.Seminar_6.repository;

public interface Repository<E, I>{

    E save(E entity);
    E findByid(I id);  
}
