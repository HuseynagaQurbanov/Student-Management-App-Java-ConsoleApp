package util;

public class MenuUtil {
    public void show() {
        MenuEnum[] menus = MenuEnum.values();
        
        for (int i = 0; i < menus.length; i++) {
            System.out.println((i+1) + "." + menus[i]);
        }
    }
    
}
