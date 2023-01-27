package Java_L_S_D_ooP.DZ.Dz_6_7.terminal;

import java.util.Scanner;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.conclusion.ConclusionCommandFactory;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutableFactory;

public class TerminalReader{
    
    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;
    
    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactor){
        if(terminalReader == null){
            terminalReader = new TerminalReader(commandParser, commandExecutableFactor);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactor){
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactor;
    }

    public void getI(){
        Scanner in = new Scanner(System.in);
        while(true){
            String command = in.nextLine();
            Command parseCommand = commandParser.parseCommand(command);
            CommandExecutable commandExecutable = commandExecutableFactory.command(parseCommand);
            commandExecutableFactory.command(parseCommand).execute();
            ConclusionCommandFactory conclusionCommandFactory = new ConclusionCommandFactory();
            conclusionCommandFactory.conclusion(parseCommand, commandExecutable).conclusion();
        }
    }

}
