package Java_L_S_D_ooP.Seminar.Seminar_5.terminal;

import java.util.Scanner;
import Java_L_S_D_ooP.Seminar.Seminar_5.terminal.executable.CommandExecutable;

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
        while(true){
            String command = in.nextLine();
            String[] input = comandParser.parseCommand(command);
            CommandExecutableFactor commandExecutableFactor = new CommandExecutableFactor();
            CommandExecutable commandExecutable = commandExecutableFactor.create(input);
            commandExecutable.execute();
        }
    }

}
