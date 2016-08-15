package com.momentous.test.menu.model.item.comparator;

import com.momentous.test.menu.model.item.Item;

/**
 * Created by frank on 8/14/16.
 */
public class ItemPriceComparator implements ItemComparator {
    public int compare(Item item1, Item item2) {
        return item1.getPrice().compareTo(item2.getPrice());
    }
}
