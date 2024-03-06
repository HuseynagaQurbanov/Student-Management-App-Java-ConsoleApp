package service.menu;

import service.menu.inter.IMenuLoginService;

public class MenuLoginService implements IMenuLoginService {

    @Override
    public void precess() {
        System.out.println("Login");
    }
    
}
