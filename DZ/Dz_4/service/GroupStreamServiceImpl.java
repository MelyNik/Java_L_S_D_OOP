package Java_L_S_D_ooP.DZ.Dz_4.service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.DZ.Dz_4.data.GroupStream;
import Java_L_S_D_ooP.DZ.Dz_4.data.GroupStreamComparator;
import Java_L_S_D_ooP.DZ.Dz_4.repository.GroupStreamRepository;


public class GroupStreamServiceImpl implements GroupStreamService {

    private final GroupStreamRepository groupStreamRepository;
    
    public GroupStreamServiceImpl(GroupStreamRepository groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    public GroupStream findGroupStreamById(int id) {
        return groupStreamRepository.findById(id);
    }

    public void sortGroupStream(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    }
}
