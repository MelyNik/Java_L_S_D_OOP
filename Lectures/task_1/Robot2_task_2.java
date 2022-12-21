package Java_L_S_D_ooP.Lectures.task_1;

public class Robot2_task_2 {
    private String name;
    private int level;

    public Robot2_task_2(String name, int level)
        {
            this.name = name;
            this.level = level;
        }

    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOff(){
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    public int getLevel(){
        return this.level;
    }
    public String getName(){
        return this.name;
    }

    private void startBIOS()
        {
            System.out.println("Start BIOS...");
        }
    private void startOS()
        {
            System.out.println("Start OS...");
        }
    private void sayHi()
        {
            System.out.println("Hello world...");
        }
    private void stopOS()
        {
            System.out.println("Stop OS...");
        }
    private void stopBIOS()
        {
            System.out.println("Stop BIOS...");
        }
    private void sayBye()
        {
            System.out.println("Bye...");
        }
    public void work()
        {
            System.out.println("Working...");
        }
}
