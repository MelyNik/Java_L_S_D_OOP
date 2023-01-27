package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.conclusion;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.UnknownCommandExecutable;

public class ConclusionUnknownCommand implements ConclusionCommand{
    
    private final CommandExecutable commandExecutable;

    public ConclusionUnknownCommand(CommandExecutable commandExecutable){
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void conclusion() {
        if (commandExecutable instanceof UnknownCommandExecutable){
            System.out.println("Unknown command");
        }
    }
    
}
