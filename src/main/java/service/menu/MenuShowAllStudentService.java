package service.menu;

import service.menu.inter.IMenuShowAllStudentService;

public class MenuShowAllStudentService implements IMenuShowAllStudentService {

    @Override
    public void precess() {
        System.out.println("Show All Students");
    }
    
}
