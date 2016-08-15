package com.momentous.test.menu.model.menu;

import com.momentous.test.menu.model.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fcontreras on 11/08/16.
 */
public class Menu {
    private long id;
    private String description;
    private boolean enabled;

    private List<Menu> menues;
    private List<Item> items;

    public Menu(long id, String description, boolean enabled) {
        this.id = id;
        this.description = description;
        this.enabled = enabled;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public List<Menu> getMenues() {
        return menues;
    }

    public void setMenues(List<Menu> menues) {
        this.menues = menues;
    }

    public void addMenu(Menu menu) {
        if (menues == null) menues = new ArrayList<>();
        this.menues.add(menu);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void addItem(Item item) {
        if (items == null) items = new ArrayList<>();
        this.items.add(item);
    }
}
