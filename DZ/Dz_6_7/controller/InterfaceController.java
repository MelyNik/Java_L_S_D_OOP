package Java_L_S_D_ooP.DZ.Dz_6_7.controller;

public interface InterfaceController<E, I> {
    
    E save(E entity);
    E find(I id);
}
