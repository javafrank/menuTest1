package com.momentous.test.menu.util;

import com.momentous.test.menu.data.TestData;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by frank on 8/14/16.
 */
public class MenuUtil {
    /**
     * Return the root menu object of this test
     * @return
     */
    public static Menu root() {
        return TestData.getMenues().get(0);
    }

    /**
     * Returns the sum of prices of all items of menu and submenues
     * @param menu
     * @return
     */
    public static BigDecimal sumPriceItems(Menu menu) {
        BigDecimal price = BigDecimal.valueOf(0.0);
        price.add(sumPriceItems(menu.getItems(), price));
        List<Menu> menues = menu.getMenues();
        if (menues != null && !menues.isEmpty()) {
            for (Menu submenu :
                    menues) {
                price = price.add(sumPriceItems(submenu.getItems(), price));
            }
        }
        return price;
    }

    /**
     * Returns the sum of prices of items and add to price parameter
     * @param items
     * @param price
     * @return
     */
    private static BigDecimal sumPriceItems(List<Item> items, BigDecimal price) {
        if (items != null && !items.isEmpty()) {
            for (Item item :
                    items) {
                price = price.add(item.getPrice());
            }
        }
        return price;
    }

    /**
     * Rerturns the num of submenues enabled of a menu given
     * @param menu
     * @param b
     * @return
     */
    public static int enabledSubmenues(Menu menu, boolean b) {
        int count = 0;
        List<Menu> submenues = menu.getMenues();
        if (submenues != null && !submenues.isEmpty()) {
            for (Menu submenu :
                    submenues) {
                if (submenu.isEnabled() == b) count++;
            }
        }
        return count;
    }

    /**
     * Prints the names of all submenues of a menu given
     * @param menu
     */
    public static void printNamesSubmenues(Menu menu) {
        List<Menu> menues = menu.getMenues();
        if (menues != null && !menues.isEmpty()) {
            for (Menu submenu :
                    menues) {
                System.out.println(String.format("Menú %d: %s", submenu.getId(), submenu.getDescription()));
            }
        }
    }
}
