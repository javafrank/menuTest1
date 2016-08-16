package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.MenuNotFoundException;
import com.momentous.test.menu.model.menu.Menu;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by frank on 8/15/16.
 */
    @RunWith(MockitoJUnitRunner.class)
public class MenuSearchTest {
    @Mock Menu menu;
    @Mock Menu submenu;

    List<Menu> submenues;
    long id = 5;

    @Before
    public void setUp() {
        when(menu.getId()).thenReturn(id);
        when(submenu.getId()).thenReturn(id+1);
        submenues = new ArrayList<>();
        submenues.add(submenu);
        when(menu.getMenues()).thenReturn(submenues);
    }

    @Test
    public void testMenuSearchOK() throws MenuNotFoundException {
        long id = 3;
        when(menu.getId()).thenReturn(id);
        assertEquals(MenuSearch.search(menu, id), menu);
    }

    @Test
    public void testMenuSearchOK_2() throws MenuNotFoundException {
        assertEquals(MenuSearch.search(menu, id+1).getId(), menu.getMenues().get(0).getId());
    }

    @Test(expected=MenuNotFoundException.class)
    public void testMenuSearchNotFound() throws MenuNotFoundException {
        MenuSearch.search(menu, 9);
    }
}
