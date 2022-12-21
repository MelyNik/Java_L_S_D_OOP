package Java_L_S_D_ooP.Lectures.task_2;

class Doo extends Foo{
    public void M(){
        //Foo.getCount();
        Foo.count = 123;
    }
}


public class Foo {
    public Integer value;
    
    protected static Integer count;
    public static Integer getCount(){
        return count;
    }

    static {
        count = 0;
    }

    public void printCount()
        {
            System.out.println(count);
        }

    public Foo(Integer value, Integer count)
        {
            this.value = value;
            this.count = count;
        }

    public Foo()
        {
            count++;
        }
    

    @Override
    public String toString() {
        return value.toString();
    }

}
