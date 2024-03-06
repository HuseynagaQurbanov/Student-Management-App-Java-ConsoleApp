package util;

import service.menu.MenuAddStudentService;
import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuShowAllStudentService;
import service.menu.MenuShowAllTeacherService;
import service.menu.inter.IMenuService;

public enum MenuEnum {
    LOGIN("Login", new MenuLoginService(), 1),
    REGISTER("Register", new MenuRegisterService(), 2),
    ADD_TEACHER("Add Teacher", new MenuAddTeacherService(), 3),
    ADD_STUDENT("Add Student", new MenuAddStudentService(), 4),
    SHOW_ALL_TEACHER("Show all teachers", new MenuShowAllTeacherService(), 5),
    SHOW_ALL_STUDENT("Show all students", new MenuShowAllStudentService(), 6),
    UNKNOWN;

    private String message;
    private IMenuService service;
    private int number;

    MenuEnum() {

    }

    MenuEnum(String message, IMenuService service, int number) {
        this.message = message;
        this.service = service;
        this.number = number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return number+"."+message;
    }

    public void process() {
        service.precess();
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
                System.out.println(menus[i]);
            }
        }
    }
}
