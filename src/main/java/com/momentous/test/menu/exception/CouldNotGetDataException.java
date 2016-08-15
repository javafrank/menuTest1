package com.momentous.test.menu.exception;

/**
 * Created by fcontreras on 15/08/16.
 */
public class CouldNotGetDataException extends Exception {
    public CouldNotGetDataException(Throwable cause) {
        super("The data could not be obtained", cause);
    }
}
