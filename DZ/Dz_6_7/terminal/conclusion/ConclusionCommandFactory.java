package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.conclusion;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.Command;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutable;

public class ConclusionCommandFactory{

    public ConclusionCommand conclusion(Command command, CommandExecutable commandExecutable){
        if (command.isCreateCommand()) 
            {
                return new ConclusionCreateStudent(commandExecutable);
            } 
        else if (command.isByFioCommand()) 
            {
                return new ConclusionDeleteStudentByFio(commandExecutable);
            }
        else 
            {
                return new ConclusionUnknownCommand(commandExecutable);
            }
    }
    
}
