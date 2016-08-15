package com.momentous.test.menu.service;

import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by fcontreras on 12/08/16.
 */
public interface MenuManagerService {
    List<Menu> getAllMenues();
    Menu getMenu(long id);
    List<Item> getItems(long menuId);
    List<Item> getItemsSortByPrice(long menuId);
    BigDecimal sumPriceItems(Menu menu);
    int enabledSubmenues(Menu menu);
    void printNamesSubmenues(Menu menu);
}
