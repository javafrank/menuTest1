package com.momentous.test.menu.util;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static java.time.DayOfWeek.*;

/**
 * Created by frank on 8/14/16.
 */
public class DateTimeUtil {
    public Set<DayOfWeek> weekDays() {
        return new HashSet<>(Arrays.asList(MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY));
    }
}
