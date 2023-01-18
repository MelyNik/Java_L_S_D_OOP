package Java_L_S_D_ooP.DZ.Dz_5.data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream> {

    @Override
    public int compare(GroupStream groups1, GroupStream groups2) {
        int size1 = groups1.getStudentGroup().size();
        int size2 = groups1.getStudentGroup().size();
        if (size1 > size2)
            return 1;
        else if (size1 < size2)
            return -1;
        else
            return 0;
    }
}
