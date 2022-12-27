package Java_L_S_D_ooP.DZ.Dz_3.Data;

import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream>{

    @Override
    public int compare(GroupStream groups1, GroupStream groups2) {
        if(groups1.getStudentGroup().size() > groups1.getStudentGroup().size())
            {
                return 1;
            }
        else if(groups1.getStudentGroup().size() < groups1.getStudentGroup().size())
            {
                return -1;
            }
        else
            {
                return 0;
            }
    }  
}
