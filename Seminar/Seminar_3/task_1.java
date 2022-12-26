package Java_L_S_D_ooP.Seminar.Seminar_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class task_1 {
    public static void main(String[] args) {
        List list = new ArrayList();

        // Раньше распечатывали так:

        for(var i : list)
        {
            System.out.println(i);
        }

        // Можно так:

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) //Т.е. возвращается True или False если следующий элемент в списке.
            {
                var i = iterator.next();

                if( i == null)
                    {
                        iterator.remove(); // Правильно удалять именно через Iterator.
                    }

                System.out.println(i);
            }


    }
}
