package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.Command;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{

    public LogingCommandExecutableFactory(StudentService studentService){
        super(studentService);
    }

    @Override
    public CommandExecutable command(Command input){
        System.out.println(input);
        CommandExecutable commandExecutable = super.command(input);
        System.out.println("Something wrong");
        return commandExecutable;
    }
    
}
