package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.CouldNotGetDataException;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.exception.MenuNotFoundException;
import com.momentous.test.menu.model.item.comparator.ItemPriceComparator;
import com.momentous.test.menu.util.MenuUtil;

import java.util.Collections;
import java.util.List;

/**
 * Created by frank on 8/14/16.
 */
public class ItemSearch {
    /**
     * Get menu items sorted by price
     * @param id menu id
     * @return
     * @throws CouldNotGetDataException
     */
    public static List<Item> getItemsOrderByPrice(long id) throws CouldNotGetDataException {
        List<Item> items = null;
        try {
            items = MenuSearch.search(MenuUtil.root(), id).getItems();
            Collections.sort(items, new ItemPriceComparator());
        } catch (MenuNotFoundException e) {
            throw new CouldNotGetDataException(e);
        }
        return items;
    }

    /**
     * Get all items of a menu given
     * @param id menu id
     * @return
     * @throws CouldNotGetDataException
     */
    public static List<Item> getItems(long id) throws CouldNotGetDataException {
        List<Item> items = null;
        try {
            items = MenuSearch.search(MenuUtil.root(), id).getItems();
        } catch (MenuNotFoundException e) {
            throw new CouldNotGetDataException(e);
        }
        return items;
    }
}
