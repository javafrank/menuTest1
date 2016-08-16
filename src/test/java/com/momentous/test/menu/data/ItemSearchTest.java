package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.CouldNotGetDataException;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.menu.Menu;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by frank on 8/15/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class ItemSearchTest {
    @Mock
    List<Item> items;

    @Mock
    Menu menu;

    private long id = 5;

    @Test
    public void testGetItemsOK() throws Exception {
        Assert.assertEquals(ItemSearch.getItems(1).isEmpty(), false);
    }

    @Test
    public void testGetItemsOK_2() throws Exception {
        int sizeExpected = 5;
        when(items.size()).thenReturn(sizeExpected);
        when(MenuSearch.search(menu, id).getItems()).thenReturn(items);
        assertEquals(ItemSearch.getItems(id).size(), sizeExpected);
    }

    @Test(expected=CouldNotGetDataException.class)
    public void testGetItemsNotFound() throws Exception {
        ItemSearch.getItems(-1);
    }
}
