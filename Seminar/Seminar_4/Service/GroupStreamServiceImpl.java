package Java_L_S_D_ooP.Seminar.Seminar_4.Service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_4.Data.GroupStream;
import Java_L_S_D_ooP.Seminar.Seminar_4.Data.GroupStreamComparator;



public class GroupStreamServiceImpl {
    private List<GroupStream> groupStreams;

    public void sortGroupStream (List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    } 
}
