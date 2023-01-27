package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.Command;

public interface CommandExecutableFactory{
    
    CommandExecutable command(Command command);
    
}
