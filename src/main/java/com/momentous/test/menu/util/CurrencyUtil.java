package com.momentous.test.menu.util;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by frank on 8/14/16.
 */
public class CurrencyUtil {
    public static Currency get() {
        return Currency.getInstance(Locale.US);
    }
}
