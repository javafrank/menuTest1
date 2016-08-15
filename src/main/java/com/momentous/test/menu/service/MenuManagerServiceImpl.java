package com.momentous.test.menu.service;

import com.momentous.test.menu.data.ItemSearch;
import com.momentous.test.menu.data.TestData;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;
import com.momentous.test.menu.util.MenuUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

import static com.momentous.test.menu.util.MethodUtil.call;
import static com.momentous.test.menu.util.MethodUtil.callVoid;

/**
 * Created by fcontreras on 12/08/16.
 */
@Service
public class MenuManagerServiceImpl implements MenuManagerService {
    @Override
    public List<Menu> getAllMenues() {
        return call(TestData::getMenues, "'getAllMenues()'");
    }

    @Override
    public Menu getMenu(long id) {
        return call(() -> TestData.getMenu(id), "'getMenu'");
    }

    @Override
    public List<Item> getItems(long menuId) {
        return call(() -> ItemSearch.getItems(menuId), "'getItems'");
    }

    @Override
    public List<Item> getItemsSortByPrice(long menuId) {
        return call(() -> ItemSearch.getItemsOrderByPrice(menuId), "'getItemsSortByPrice'");
    }

    @Override
    public BigDecimal sumPriceItems(Menu menu) {
        return call(() -> MenuUtil.sumPriceItems(menu), "'sumPriceItems'");
    }

    @Override
    public int enabledSubmenues(Menu menu) {
        return call(() -> MenuUtil.enabledSubmenues(menu, true), "'enabledSubmenues'");
    }

    @Override
    public void printNamesSubmenues(Menu menu) {
        callVoid(() -> {
            MenuUtil.printNamesSubmenues(menu);
            return null;
        }, "'printNamesSubmenues'");
    }
}
