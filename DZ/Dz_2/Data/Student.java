package Java_L_S_D_ooP.DZ.Dz_2.Data;

public class Student extends User{
    private int numberOfGroup;

    public Student(String FIO, int birthday, int passport, int numberOfGroup) {
        super(FIO, birthday, passport);
        this.numberOfGroup = numberOfGroup;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

}
