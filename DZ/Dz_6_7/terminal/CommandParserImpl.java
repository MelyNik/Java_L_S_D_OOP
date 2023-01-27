package Java_L_S_D_ooP.DZ.Dz_6_7.terminal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CommandParserImpl implements CommandParser<String>{
    
    @Override
    public Command parseCommand(String inputCommand){
        List<String> input = new ArrayList<String>(Arrays.asList(inputCommand.split(" ")));
        return new Command(input);
    }

}
