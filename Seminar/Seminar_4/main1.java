package Java_L_S_D_ooP.Seminar.Seminar_4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main1 {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(5);
        intList.add(1);
        intList.add(3);
        
        List<String> strList = new ArrayList<>();
        strList.add("Hello");
        strList.add("From");
        strList.add("Java");



        System.out.println(intList);
        System.out.println(strList);

        intList = orderList(intList);
        strList = orderList(strList);

        System.out.println(intList);
        System.out.println(strList);

    }

    static <T extends Comparable<T>> List<T> orderList(List<T> list){
        Collections.sort(list);
        return list;
    }
}
