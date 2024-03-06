package util;

import service.menu.MenuAddTeacherService;
import service.menu.MenuLoginService;
import service.menu.MenuRegisterService;
import service.menu.MenuService;
import service.menu.MenuShowAllStudentService;
import service.menu.MenuShowAllTeacherService;

public enum MenuEnum {
    LOGIN("Login", new MenuLoginService()), 
    REGISTER("Register", new MenuRegisterService()), 
    ADD_TEACHER("Add Teacher", new MenuAddTeacherService()), 
    SHOW_ALL_TEACHER("Show all teachers", new MenuShowAllTeacherService()), 
    SHOW_ALL_STUDENT("Show all students", new MenuShowAllStudentService());
    
    String message;
    MenuService service;
    
    MenuEnum(String message, MenuService service){
        this.message = message;
        this.service = service;
    }
    
    public String getMessage(){
        return message;
    }

    @Override
    public String toString() {
        return message;
    }
    
    public void process(){
        service.precess();
    }
}
