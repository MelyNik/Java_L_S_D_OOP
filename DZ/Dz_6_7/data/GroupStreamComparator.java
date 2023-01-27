package Java_L_S_D_ooP.DZ.Dz_6_7.data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream>{

    @Override
    public int compare(GroupStream groups_1, GroupStream groups_2){
        int size_1 = groups_1.getStudentGroup().size();
        int size_2 = groups_1.getStudentGroup().size();
        if (size_1 > size_2)
            {
                return 1;
            }
        else if (size_1 < size_2)
            {
                return -1;
            }
        else
            {
                return 0;
            }
    }
    
}
