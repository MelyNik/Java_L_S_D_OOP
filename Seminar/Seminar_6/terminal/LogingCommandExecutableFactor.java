package Java_L_S_D_ooP.Seminar.Seminar_6.terminal;

import Java_L_S_D_ooP.Seminar.Seminar_6.terminal.executable.CommandExecutable;

public class LogingCommandExecutableFactor extends CommandExecutableFactor{

    public LogingCommandExecutableFactor(){
        super();
    }

    @Override
    public CommandExecutable create(Command command){
        System.out.println(command);
        CommandExecutable commandExecutable = super.create(command);
        System.out.printf("");
        return commandExecutable;
    }
}
