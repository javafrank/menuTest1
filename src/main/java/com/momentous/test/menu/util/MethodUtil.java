package com.momentous.test.menu.util;

import com.momentous.test.menu.service.MenuManagerServiceImpl;

import java.text.DecimalFormat;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

import static javafx.scene.input.KeyCode.T;

/**
 * Created by fcontreras on 15/08/16.
 */
public class MethodUtil {
    private final static Logger LOGGER = Logger.getLogger(MethodUtil.class.getName());

    public static <T> T call(Callable<T> func, String methodName) {
        long startTime = System.nanoTime();
        T returns = null;
        try {
            returns = func.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        LOGGER.info("Call to method " + methodName + " takes " + toSec(duration) + " sec.");

        return returns;
    }

    public static void callVoid(Callable func, String methodName) {
        long startTime = System.nanoTime();
        try {
            func.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime);

        LOGGER.info("Call to method " + methodName + " takes " + toSec(duration) + " sec.");
    }

    private static String toSec(long nanoSec) {
        DecimalFormat df = new DecimalFormat("0.000000000");
        return df.format((double) nanoSec / 1000000000.0);
    }
}
