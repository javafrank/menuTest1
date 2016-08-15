package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.MenuNotFoundException;
import com.momentous.test.menu.model.menu.Menu;

/**
 * Created by frank on 8/14/16.
 */
public class MenuSearch {
    public static Menu search(Menu menu, long id) throws MenuNotFoundException {
        if (menu.getId() == id) {
            return menu;
        } else if (menu.getMenues() != null && !menu.getMenues().isEmpty()) {
            for (Menu submenu :
                    menu.getMenues()) {
                if (submenu.getId() == id) {
                    return submenu;
                }
            }
        }
        throw new MenuNotFoundException();
    }
}
