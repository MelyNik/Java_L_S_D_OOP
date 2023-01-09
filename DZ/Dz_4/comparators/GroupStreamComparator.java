package Java_L_S_D_ooP.DZ.Dz_4.comparators;

import java.util.Comparator;
import Java_L_S_D_ooP.DZ.Dz_4.data.GroupStream;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream groups1, GroupStream groups2) {
        int size1 = groups1.getListStudentGroup().size();
        int size2 = groups1.getListStudentGroup().size();
        if (size1 > size2)
            return 1;
        else if (size1 < size2)
            return -1;
        else
            return 0;
    }
}
