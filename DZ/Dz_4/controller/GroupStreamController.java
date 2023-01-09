package Java_L_S_D_ooP.DZ.Dz_4.controller;

import Java_L_S_D_ooP.DZ.Dz_4.data.GroupStream;
import Java_L_S_D_ooP.DZ.Dz_4.service.GroupStreamServiceImpl;

public class GroupStreamController implements InterfaceController<GroupStream, Integer> {

    private final GroupStreamServiceImpl groupStreamServiceImpl;

    public GroupStreamController(GroupStreamServiceImpl groupStreamServiceImpl) {
        this.groupStreamServiceImpl = groupStreamServiceImpl;
    }

    @Override
    public GroupStream save(GroupStream groupStream) {
        return groupStreamServiceImpl.saveGroupStream(groupStream);
    }

    @Override
    public GroupStream find(Integer id) {
        return groupStreamServiceImpl.findGroupStreamById(id);
    }

}
