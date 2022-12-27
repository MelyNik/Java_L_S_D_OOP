package Java_L_S_D_ooP.DZ.Dz_3.Service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.DZ.Dz_3.Data.GroupStream;
import Java_L_S_D_ooP.DZ.Dz_3.Data.GroupStreamComparator;

public class GroupStreamServiceImpl {
    private List<GroupStream> groupStreams;

    public void sortGroupStream (List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    } 
}
