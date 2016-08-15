package com.momentous.test.menu.service;

import com.momentous.test.menu.data.ItemSearch;
import com.momentous.test.menu.data.TestData;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;
import com.momentous.test.menu.util.MenuUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by fcontreras on 12/08/16.
 */
@Service
public class MenuManagerServiceImpl implements MenuManagerService {
    @Override
    public List<Menu> getAllMenues() {
        return TestData.getMenues();
    }

    @Override
    public Menu getMenu(long id) {
        return TestData.getMenu(id);
    }

    @Override
    public List<Item> getItems(long menuId) {
        return ItemSearch.getItems(menuId);
    }

    @Override
    public List<Item> getItemsSortByPrice(long menuId) {
        return ItemSearch.getItemsOrderByPrice(menuId);
    }

    @Override
    public BigDecimal sumPriceItems(Menu menu) {
        return MenuUtil.sumPriceItems(menu);
    }

    @Override
    public int enabledSubmenues(Menu menu) {
        return MenuUtil.enabledSubmenues(menu, true);
    }

    @Override
    public void printNamesSubmenues(Menu menu) {
        MenuUtil.printNamesSubmenues(menu);
    }
}
