package com.momentous.test.menu.model.item;

import java.math.BigDecimal;
import java.util.Currency;

/**
 * Created by frank on 8/14/16.
 */
public class Item {
    private long id;
    private String name;
    private String description;
    private Currency currency;
    private BigDecimal price;
    private byte[] image;
    private Rank rank;
    private Schedule schedule;

    public static class Builder {
        private long id;
        private String name;
        private String description;
        private Currency currency;
        private BigDecimal price;
        private byte[] image;
        private Rank rank;
        private Schedule schedule;

        public Builder(){}

        public Builder id(long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder currency(Currency currency) {
            this.currency = currency;
            return this;
        }

        public Builder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Builder image(byte[] image) {
            this.image = image;
            return this;
        }

        public Builder rank(Rank rank) {
            this.rank = rank;
            return this;
        }

        public Builder schedule(Schedule schedule) {
            this.schedule = schedule;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }

    private Item(Builder b) {
        this.id = b.id;
        this.name = b.name;
        this.description = b.description;
        this.currency = b.currency;
        this.price = b.price;
        this.image = b.image;
        this.rank = b.rank;
        this.schedule = b.schedule;
    }

    public Item(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
