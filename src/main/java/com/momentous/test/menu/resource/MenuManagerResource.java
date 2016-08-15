package com.momentous.test.menu.resource;

import com.momentous.test.menu.data.TestData;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;
import com.momentous.test.menu.service.MenuManagerService;
import com.momentous.test.menu.util.MenuUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by fcontreras on 11/08/16.
 */
@RestController
public class MenuManagerResource {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private MenuManagerService menuManagerService;

    @RequestMapping("/test")
    public Menu getMenu() {
        return new Menu(counter.incrementAndGet(), "Test", true);
    }

    @RequestMapping("/menues")
    public List getAllMenues() {
        return menuManagerService.getAllMenues();
    }

    @RequestMapping("/menu/{id}")
    public Menu getMenu(@PathVariable("id") long id) {
        return menuManagerService.getMenu(id);
    }

    @RequestMapping("/menu/{id}/items")
    public List<Item> getItems(@PathVariable("id") long id) {
        return menuManagerService.getItems(id);
    }

    @RequestMapping("/menu/{id}/items/sort/price")
    public List<Item> getItemsSortByPrice(@PathVariable("id") long id) {
        return menuManagerService.getItemsSortByPrice(id);
    }
}
