package Java_L_S_D_ooP.DZ.Dz_6_7.db;

import Java_L_S_D_ooP.DZ.Dz_6_7.data.Student;

public class StudentTable extends Table<Student> {

    public boolean deleteByFio(String FIO) {
        int counter = 0;
        for(int i = 0; i < elements.size(); i++) 
            {
                if (elements.get(i).getFIO().equals(FIO)) 
                    {
                        elements.remove(elements.get(i));
                        counter++;
                        i--;
                    }
            }
        for (Student student : elements) 
            {
                System.out.println(student);
            }
        if (counter > 0) 
            {
                return true;
            }
        else 
            {
                return false;
            }
    }

    public boolean deleteStudent(Student studentForDelete) {
        for (Student student : elements) 
            {
                if(student.equals(studentForDelete)) 
                    {
                        elements.remove(studentForDelete);
                        return true;
                    }
            }
        return false;
    }
}
