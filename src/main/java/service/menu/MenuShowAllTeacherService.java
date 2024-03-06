package service.menu;

import service.menu.inter.IMenuShowAllTeacherService;

public class MenuShowAllTeacherService implements IMenuShowAllTeacherService {

    @Override
    public void precess() {
        System.out.println("Show All Teachers");
    }
    
}
