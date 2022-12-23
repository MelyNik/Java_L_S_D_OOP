package Java_L_S_D_ooP.DZ.Dz_2.Service;

import Java_L_S_D_ooP.DZ.Dz_2.Data.User;
import Java_L_S_D_ooP.DZ.Dz_2.Util.ReaderFromTxt;
import Java_L_S_D_ooP.DZ.Dz_2.Util.WriterToTxt;

public class TeacherDataService implements DataService {
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
