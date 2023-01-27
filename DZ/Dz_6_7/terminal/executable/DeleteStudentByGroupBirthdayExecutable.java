package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;

public class DeleteStudentByGroupBirthdayExecutable implements CommandExecutable{

    private StudentService studentService;
    private int groupNumber;
    private int birthday;

    public DeleteStudentByGroupBirthdayExecutable(StudentService studentService, int groupNumber, int birthday){
        this.studentService = studentService;
        this.groupNumber = groupNumber;
        this.birthday = birthday;
    }

    @Override
    public void execute(){
        studentService.deleteStudentByGroupBirthday(groupNumber, birthday);
    }
    
}
