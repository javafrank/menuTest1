package com.momentous.test.menu.exception;

/**
 * Created by fcontreras on 12/08/16.
 */

public class MenuException extends RuntimeException {
    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }
}
