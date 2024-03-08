package util;

import java.util.Scanner;

public class MenuUtil {

    public static void showMenu() {
        MenuEnum.showAllMenu();
        System.out.print("Please select menu: ");

        Scanner sc = new Scanner(System.in);
        int selectedMenuNumber = sc.nextInt();

        MenuEnum selectedMenu = MenuEnum.find(selectedMenuNumber);
        selectedMenu.process();
    }

    public static void processMenu(MenuEnum menu) {
        menu.process();
    }

}
