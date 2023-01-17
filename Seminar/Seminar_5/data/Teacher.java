package Java_L_S_D_ooP.Seminar.Seminar_5.data;

public class Teacher extends User {
    
    private String department;

    public Teacher(String FIO, int birthday, int passport, String departament) {
        super(FIO, birthday, passport);
        this.department = departament;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
