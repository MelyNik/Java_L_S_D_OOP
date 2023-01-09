package Java_L_S_D_ooP.DZ.Dz_4.controller;

public interface InterfaceController<E, I> {
    
    E save(E entity);
    E find(I id);
}
