package Java_L_S_D_ooP.DZ.Dz_6_7.terminal.executable;

import Java_L_S_D_ooP.DZ.Dz_6_7.service.StudentService;

public class DeleteStudentByFioExecutable implements CommandExecutable{

    private StudentService studentService;
    private String FIO;

    public DeleteStudentByFioExecutable(StudentService studentService, String FIO){
        this.studentService = studentService;
        this.FIO = FIO;
    }

    @Override
    public void execute(){
        studentService.deleteStudentByFio(FIO);
    }

}
