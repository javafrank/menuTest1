package com.momentous.test.menu.data;

import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.item.comparator.ItemPriceComparator;
import com.momentous.test.menu.util.MenuUtil;

import java.util.Collections;
import java.util.List;

/**
 * Created by frank on 8/14/16.
 */
public class ItemSearch {
    public static List<Item> getItemsOrderByPrice(long id) {
        List<Item> items = MenuSearch.search(MenuUtil.root(), id).getItems();
        Collections.sort(items, new ItemPriceComparator());
        return items;
    }

    public static List<Item> getItems(long id) {
        List<Item> items = MenuSearch.search(MenuUtil.root(), id).getItems();
        return items;
    }
}
