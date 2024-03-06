package util;

import java.util.Scanner;

public class MenuUtil {
    public static MenuEnum showMenu() {
        MenuEnum.showAllMenu();
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select menu.");
        int selectedMenu = sc.nextInt();
        
        return MenuEnum.find(selectedMenu);
    }
    
    public static void processMenu(MenuEnum menu) {
        menu.process();
    }
    
    
}
