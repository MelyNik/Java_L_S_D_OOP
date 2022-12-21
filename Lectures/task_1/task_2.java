package Java_L_S_D_ooP.Lectures.task_1;

public class task_2 {
    public static void main(String[] args) {
        Robot1_task_2 robot1 = new Robot1_task_2("name_1", 1);
        System.out.printf("%s %d\n", robot1.name, robot1.level);

        robot1.level = 5341;

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();
        robot1.work();
        robot1.work();

        Robot2_task_2 robot2 = new Robot2_task_2("name_2", 1);
        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());
        robot2.powerOn();
        robot2.work();
        robot1.work();
        robot1.work();
        robot2.powerOff();

        Robot3_task_2 robot3 = new Robot3_task_2("name_3", 12);
        System.out.println("-----------");
        System.out.println(robot3);
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();

        robot3.power();

    }
}
