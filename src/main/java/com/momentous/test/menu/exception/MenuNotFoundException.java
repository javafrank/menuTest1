package com.momentous.test.menu.exception;

/**
 * Created by fcontreras on 15/08/16.
 */
public class MenuNotFoundException extends Exception {
    public MenuNotFoundException() {
        super("Menu not found");
    }
}
