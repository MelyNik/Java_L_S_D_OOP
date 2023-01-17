package Java_L_S_D_ooP.Seminar.Seminar_5.service;

import java.util.Collections;
import java.util.List;

import Java_L_S_D_ooP.Seminar.Seminar_5.data.GroupStream;
import Java_L_S_D_ooP.Seminar.Seminar_5.data.GroupStreamComparator;
import Java_L_S_D_ooP.Seminar.Seminar_5.repository.GroupStreamRepository;


public class GroupStreamServiceImpl implements GroupStreamService {

    private final GroupStreamRepository groupStreamRepository;
    
    public GroupStreamServiceImpl(GroupStreamRepository groupStreamRepository) {
        this.groupStreamRepository = groupStreamRepository;
    }

    public GroupStream saveGroupStream(GroupStream groupStream) {
        return groupStreamRepository.save(groupStream);
    }

    public GroupStream findGroupStreamById(int id) {
        return groupStreamRepository.findByid(id);
    }

    public void sortGroupStream(List<GroupStream> groupStreams) {
        Collections.sort(groupStreams, new GroupStreamComparator());
    }
}
