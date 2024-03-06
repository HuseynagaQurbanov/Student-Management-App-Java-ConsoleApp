package main;

import util.MenuEnum;
import util.MenuUtil;


public class Main {
    public static void main(String[] args){
        MenuEnum menu = MenuUtil.showMenu();
        menu.process();
    }
}
