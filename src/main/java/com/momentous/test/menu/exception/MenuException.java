package com.momentous.test.menu.exception;

/**
 * Created by fcontreras on 12/08/16.
 */

/**
 * Base of all exceptions in this project
 */
public class MenuException extends RuntimeException {
    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }
}
