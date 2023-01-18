package Java_L_S_D_ooP.DZ.Dz_5.terminal;

import java.util.Scanner;

public class TerminalReader {
    
    private static TerminalReader terminalReader;
    private CommandParser comandParser;
    
    public static TerminalReader getInstance(CommandParser comandParser){
        if(terminalReader == null){
            terminalReader = new TerminalReader(comandParser);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser comandParser){
        this.comandParser = comandParser;
    }

    public void getI(int f){
        Scanner in = new Scanner(System.in);
        String command;
        while(true){
            command = in.nextLine();
        }
    }

}
