package Java_L_S_D_ooP.DZ.Dz_3.Service;

import Java_L_S_D_ooP.DZ.Dz_3.Data.User;
import Java_L_S_D_ooP.DZ.Dz_3.Util.ReaderFromTxt;
import Java_L_S_D_ooP.DZ.Dz_3.Util.WriterFromTxt;

public class StudentService implements DataService {

    @Override
    public User read() {
        return ReaderFromTxt.read();
    }

    @Override
    public void create(User user) {
        WriterFromTxt.write(user);
    }
    
}
