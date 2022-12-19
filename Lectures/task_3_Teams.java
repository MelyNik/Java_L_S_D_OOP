package Java_L_S_D_ooP.Lectures;

import java.util.Random;

public class task_3_Teams {
    public static void main(String[] args) {
        int teamCount = 10;
        Random rand = new Random();
        int magicianCount = rand.nextInt(0, teamCount);
        int priestCount = teamCount - magicianCount;

        System.out.printf("magicalCount: %d priestCount: %d \n", magicianCount, priestCount);

        task_3_Priest[] priests = new task_3_Priest[priestCount];
        task_3_mag[] magicians = new task_3_mag[magicianCount]; 

        for (int i = 0; i < priestCount; i++) {
            priests[i] = new task_3_Priest();
            System.out.println(priests[i].getInfo());
        }
        System.out.println();

        for (int i = 0; i < magicianCount; i++) {
            magicians[i] = new task_3_mag();
            System.out.println(magicians[i].getInfo());
        }

    }

}
