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

    public static class Builder {
        private Set<DayOfWeek> days;
        private LocalTime from;
        private LocalTime to;
        private LocalDate dateFrom;
        private LocalDate dateTo;

        public Builder(){}

        public Builder days(Set<DayOfWeek> days) {
            this.days = days;
            return this;
        }

        public Builder from(LocalTime from) {
            this.from = from;
            return this;
        }

        public Builder to(LocalTime to) {
            this.to = to;
            return this;
        }

        public Builder dateFrom(LocalDate dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }

        public Builder dateTo(LocalDate dateTo) {
            this.dateTo = dateTo;
            return this;
        }

        public Schedule build() {
            return new Schedule(this);
        }
    }

    private Schedule(Schedule.Builder b) {
        this.days = b.days;
        this.from = b.from;
        this.to = b.to;
        this.dateFrom = b.dateFrom;
        this.dateTo = b.dateTo;
    }

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
