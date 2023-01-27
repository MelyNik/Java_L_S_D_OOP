package Java_L_S_D_ooP.DZ.Dz_6_7;

import Java_L_S_D_ooP.DZ.Dz_6_7.db.StudentTable;
import Java_L_S_D_ooP.DZ.Dz_6_7.repository.StudentRepository;
import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.CommandParserImpl;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.TerminalReader;
import Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable.CommandExecutableFactoryImpl;

public abstract class Main {
    public static void main(String[] args){

        TerminalReader.getInstance(new CommandParserImpl(), new CommandExecutableFactoryImpl(new StudentService(new StudentRepository(new StudentTable())))).getI();
    }
    
}
