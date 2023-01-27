package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.conclusion;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutable;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CreateStudentExecutable;

public class ConclusionCreateStudent implements ConclusionCommand{

    private final CommandExecutable commandExecutable;

    public ConclusionCreateStudent(CommandExecutable commandExecutable){
        this.commandExecutable = commandExecutable;
    }

    @Override
    public void conclusion() {
        if (commandExecutable instanceof CreateStudentExecutable){
            System.out.println("Add Student");
        }
    }

}
