package Java_L_S_D_ooP.Seminar.Seminar_5.terminal;

import java.util.Scanner;

public class TerminalReader {
    
    private ComandParser comandParser;

    public TerminalReader(ComandParser comandParser){
        this.comandParser = comandParser;
    }

    public void getI(int f){
        Scanner in = new Scanner(System.in);
        while(true){
            in.nextLine();
        }
    }

}
