package Java_L_S_D_ooP.Seminar.Seminar_6.terminal;

import java.util.List;

public class Command {
    
    private static final String ADD = "/add";
    private static final String DELETE = "/delete";
    private static final String BYFIO = "/deleteByFio";
    private static final String BYGROUPBIRTHDAY = "/deleteByGroupBirthday";

    private List<String> arguments;
    private String mainFirstCommand;

    public String getFirstArguments(){
        return arguments.get(0);
    }

    public boolean isCreateCommand(){
        return mainFirstCommand.equals(ADD);
    }

    public boolean isDeleteCommand(){
        return mainFirstCommand.equals(DELETE);
    }

    public boolean isByFioCommand(){
        return mainFirstCommand.equals(BYFIO);
    }

    public boolean isByGroupBirthdayCommand(){
        return mainFirstCommand.equals(BYGROUPBIRTHDAY);
    }

}
