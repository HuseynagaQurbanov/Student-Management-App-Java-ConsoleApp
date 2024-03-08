package studentmanagmentconsoleapp;

import bean.Config;
import util.MenuUtil;

public class StudentManagmentConsoleApp {

    public static void main(String[] args) {
        Config.initialize();
        MenuUtil.showMenu();
    }
}
