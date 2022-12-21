package Java_L_S_D_ooP.Lectures.task_1;

public class Point2D_task_1{
    private int x,y;

    /** */

    public Point2D_task_1(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D_task_1(int value) {
        this(value, value);
    }

    public Point2D_task_1() {
        this(0);
    }

    //public Point2D_task_1() {
    //    x = 0;
    //    y = 0;
    //}

    //public Point2D_task_1(int value) {
    //    x = value;
    //    y = value;
    //}

    public int getX(){
        return x; // метод возвращения координаты x.
    }

    public int getY(){
        return y; // метод возвращения координаты y.
    }

    public void setX(int value) {
        this.x = value; // метод изменения координаты x.
    }

    public void setY(int value) {
        this.y = value; // метод изменения координаты y.
    }

    private String getInfo() {
        return String.format("x: %d; y: %d", x, y)
    }


    @Override
    public String toString() {
        return getInfo; // Можно сразу посдставить из метода getInfo всю строку String.format("x: %d; y: %d", x, y).
    }
}
    

