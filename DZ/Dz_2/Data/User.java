package Java_L_S_D_ooP.DZ.Dz_2.Data;

public abstract class User {
    private String FIO;
    private int birthday;
    private int passport;

    public User(String FIO, int birthday, int passport) {
        this.FIO = FIO;
        this.birthday = birthday;
        this.passport = passport;
    }

    public String getFIO() {
        return FIO;
    }
    public void setFIO(String[] fIO) {
        this.FIO = FIO;
    }
    public int getBirthday() {
        return birthday;
    }
    public void setBirthday(int birthday) {
        this.birthday = birthday;
    }
    public int getPassport() {
        return passport;
    }
    public void setPassport(int passport) {
        this.passport = passport;
    }
}
