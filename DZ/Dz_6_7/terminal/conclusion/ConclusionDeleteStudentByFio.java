package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.conclusion;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.DeleteStudentByFioExecutable;

public class ConclusionDeleteStudentByFio implements ConclusionCommand{

    private final CommandExecutable commandExecutable;

    public ConclusionDeleteStudentByFio(CommandExecutable commandExecutable){
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void conclusion() {
        if (commandExecutable instanceof DeleteStudentByFioExecutable){
            System.out.println("Delete Students");
        }
    }

}
