package Java_L_S_D_ooP.Lectures;

import java.util.ArrayList;

public class Robot3_task_2 {
    enum State{
        On, Off
    }

    private static int defaultIndex;
    private static ArrayList<String> names;

    static{
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    private int level;
    private String name;
    private State state; // Состояние.

    public Robot3_task_2(String name, int level)
        {
            if((name.isEmpty()) // Если имя пустое.
                || Character.isDigit((name.charAt(0))) // Или имя является числом.
                || Robot3_task_2.names.indexOf(name) != -1) // Или имя было ранее.
                {
                    this.name = String.format("DefaultName_%d", defaultIndex++); // То мы придуимываем имя.
                }
            else{
                this.name = name;
            }
            Robot3_task_2.names.add(this.name);
            this.level = level;
            this.state = State.Off;
        }
    
    public Robot3_task_2(String name){
        this(name, 1);
    }

    public Robot3_task_2(){
        this("");
    }

    // Система включения.

    public void power(){
        if(this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        } else{
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
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
