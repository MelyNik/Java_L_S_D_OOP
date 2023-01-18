package Java_L_S_D_ooP.DZ.Dz_5.data;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup> {
    
    private List <StudentGroup> studentGroup;
    private int cursor;

    public GroupStreamIterator(List <StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroup.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroup.get(cursor++);

    }
}