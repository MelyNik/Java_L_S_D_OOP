package Java_L_S_D_ooP.DZ.Dz_6_7.db;

import java.util.ArrayList;
import java.util.List;

public abstract class Table<E> {

    protected List<E> elements;

    protected Table() {
        elements = new ArrayList<>();
    }

    public E save(E entity) {
        elements.add(entity);
        for (E obj: elements) {
            System.out.println(obj);
        }
        return entity;
    }
}
