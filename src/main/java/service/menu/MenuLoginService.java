package service.menu;

import bean.Config;
import java.util.Scanner;
import service.inter.menu.IMenuLoginService;

public class MenuLoginService implements IMenuLoginService {

    @Override
    public void processLogic() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();
        
        if (!(username.equals("huseyn") && password.equals("zakir123"))) {
            throw new IllegalArgumentException("Username or password is incorrect");
        }
        
        Config.setLoggedIn(true);
    }
    
}
