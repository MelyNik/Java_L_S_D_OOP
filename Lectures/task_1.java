package Java_L_S_D_ooP.Lectures;

public class task_1 {
    public static void main(String[] args) {
        // Могло быть так:
        // int ax = 0;
        // int ay = 0;
        // int bx = 0;
        // int by = 1;
        // System.out.println(distance(ax, ay, bx, by));

        // Могло быть так:
        // Point2D_task_1 a = new Point2D_task_1();
        // a.x = 0;
        // a.y = 2;
        // System.out.println(a.toString());

        // Point2D_task_1 b = new Point2D_task_1();
        // b.x = 0;
        // b.y = 10;
        // System.out.println(b.toString());

        Point2D_task_1 a = new Point2D_task_1(0, 2);
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println(a.getInfo()); // Благодоря функции getInfo выведет именно значение.
        a.setX();
        System.out.println(a.getX());

        Point2D_task_1 b = new Point2D_task_1(0);
        System.out.println(b);           // По умолчания toString и там и там.
        System.out.println(b.toString());// По умолчания toString и там и там.
        System.out.println(b); // Благодоря функции toString именно созданной в Point2D_task_1, теперь не нужно
                               // обращаться к функции, что бы вывести именно значение.
        b.setY();
        System.out.println(b.getY());

        System.out.println(distance(a, b));

        var dis = Point2D_task_1(distance(a, b));
        System.out.println(dis);

    }
    // Могло быть так:
    static double distance(int x1, int y1, int x2, int y2)
        {
            return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        }
    
    static double distance(Point2D_task_1 a, Point2D_task_1 b)
    {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

}
