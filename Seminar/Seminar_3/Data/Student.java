package Java_L_S_D_ooP.Seminar.Seminar_3.Data;

public class Student extends User implements Comparable<Student>{
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

    @Override
    public int compareTo(Student student){
        return Integer.compare(this.getYearOfBirth(), student.getYearOfBirth());


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
