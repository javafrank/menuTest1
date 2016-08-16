package com.momentous.test.menu.util;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by frank on 8/14/16.
 */
public class CurrencyUtil {
    /**
     * Returns the currency instance of system
     * @return
     */
    public static Currency get() {
        return Currency.getInstance(Locale.US);
    }
}
