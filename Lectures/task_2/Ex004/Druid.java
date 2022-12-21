package Java_L_S_D_ooP.Lectures.task_2.Ex004;

public class Druid extends BaseHero {


    int mp;

    public Druid(String name, int hp, int mp) {
        super(name, hp);
        this.mp = mp;
        System.out.println("Вызван Druid(String name, int hp)");
        //this.hp = (int)(this.hp * 0.8);
    }

    public Druid() {
        this("", 0, 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}