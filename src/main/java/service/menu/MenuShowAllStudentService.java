package service.menu;

import bean.Config;
import bean.Student;
import service.inter.menu.IMenuShowAllStudentService;

public class MenuShowAllStudentService implements IMenuShowAllStudentService {

    @Override
    public void processLogic() {
        System.out.println("==================== All Students ====================");
        Student[] allStudent = Config.instance().getStudents();
        for (int i = 0; i < allStudent.length; i++) {
            System.out.println(allStudent[i]);
        }
    }

}
