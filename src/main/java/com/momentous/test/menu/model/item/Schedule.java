package com.momentous.test.menu.model.item;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Set;

/**
 * Created by frank on 8/14/16.
 */
public class Schedule {
    private Set<DayOfWeek> days;
    private LocalTime from;
    private LocalTime to;
    private LocalDate dateFrom;
    private LocalDate dateTo;

    public Set<DayOfWeek> getDays() {
        return days;
    }

    public void setDays(Set<DayOfWeek> days) {
        this.days = days;
    }

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
        this.to = to;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
    }
}
