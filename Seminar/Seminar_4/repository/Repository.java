package Java_L_S_D_ooP.Seminar.Seminar_4.repository;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.StudentGroup;

public interface Repository<E, I>{

    StudentGroup save(E entity);
    E findByid(I id);  
}
