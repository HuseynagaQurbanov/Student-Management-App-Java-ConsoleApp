package util;

import bean.Config;
import service.inter.IProcess;
import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuShowAllStudentService;
import service.menu.MenuShowAllTeacherService;

public enum MenuEnum {
    LOGIN("Login", new MenuLoginService(), 1),
    ADD_TEACHER("Add Teacher", new MenuAddTeacherService(), 2),
    ADD_STUDENT("Add Student", new MenuAddStudentService(), 3),
    SHOW_ALL_TEACHER("Show all teachers", new MenuShowAllTeacherService(), 4),
    SHOW_ALL_STUDENT("Show all students", new MenuShowAllStudentService(), 5),
    UNKNOWN();

    private String message;
    private IProcess service;
    private int number;

    MenuEnum() {

    }

    MenuEnum(String message, IProcess service, int number) {
        this.message = message;
        this.service = service;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return number + "." + message;
    }

    public void process() {
        service.process();
        MenuUtil.showMenu();
    }

    public int getNumber() {
        return this.number;
    }

    public static MenuEnum find(int number) {
        MenuEnum[] menus = MenuEnum.values();

        for (int i = 0; i < menus.length; i++) {
            if (menus[i].getNumber() == number) {
                return menus[i];
            }
        }

        return MenuEnum.UNKNOWN;
    }

    public static void showAllMenu() {
        MenuEnum[] menus = MenuEnum.values();
        for (int i = 0; i < menus.length; i++) {
            if (menus[i] != UNKNOWN) {
                if (menus[i] == LOGIN) {
                    if (!Config.isLoggedIn()) {
                        System.out.println(menus[i]);
                    }
                } else if (Config.isLoggedIn()) {
                    System.out.println(menus[i]);
                }
            }
        }
    }
}
