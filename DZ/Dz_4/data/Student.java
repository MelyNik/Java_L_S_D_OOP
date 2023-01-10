package Java_L_S_D_ooP.DZ.Dz_4.data;

public class Student extends User implements Comparable<Student>{
    
    private int groupNumber;

    public Student(String FIO, int birthday, int passport, int groupNumber) {
        super(FIO, birthday, passport);
        this.groupNumber = groupNumber;
    }
    
    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public int compareTo(Student student){
        return Integer.compare(this.getBirthday(), student.getBirthday());


        // if(student.getYearOfBirth() < this.getYearOfBirth())
        //      {
        //           return 1;
        //      }
        // if(student.getYearOfBirth() > this.getYearOfBirth())
        //      {
        //           return -1;
        //      }
        // return 0;


    }
}
