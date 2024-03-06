package service.menu;

import service.menu.inter.IMenuAddStudentService;

public class MenuAddStudentService implements IMenuAddStudentService {

    @Override
    public void precess() {
        System.out.println("Add Student");
    }
    
}
