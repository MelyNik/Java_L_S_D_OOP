package Java_L_S_D_ooP.Seminar.Seminar_3.Service;

import Java_L_S_D_ooP.Seminar.Seminar_2.Data.User;
import Java_L_S_D_ooP.Seminar.Seminar_2.Util.ReaderFromTxt;
import Java_L_S_D_ooP.Seminar.Seminar_2.Util.WriterToTxt;
import Java_L_S_D_ooP.Seminar.Seminar_2.Data.User;

public class StudentDataService implements DataService {
    
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }
    
    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
