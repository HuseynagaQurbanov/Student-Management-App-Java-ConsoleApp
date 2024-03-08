package service.menu;

import bean.Config;
import bean.Teacher;
import service.inter.menu.IMenuShowAllTeacherService;

public class MenuShowAllTeacherService implements IMenuShowAllTeacherService {

    @Override
    public void processLogic() {
        System.out.println("==================== All Teachers ====================");
        Teacher[] allTeacher = Config.instance().getTeachers();
        for (int i = 0; i < allTeacher.length; i++) {
            System.out.println(allTeacher[i]);
        }
    }
    
}
