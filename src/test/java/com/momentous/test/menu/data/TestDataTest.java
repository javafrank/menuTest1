package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.CouldNotGetDataException;
import com.momentous.test.menu.exception.MenuNotFoundException;
import com.momentous.test.menu.model.menu.Menu;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by frank on 8/15/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class TestDataTest {
    @Mock Menu menu;

    @Test
    public void getMenuesTest_OK() {
        assertNotNull(TestData.getMenues());
        assertEquals(TestData.getMenues().isEmpty(), false);
    }

    @Test
    public void getMenuTest_OK() throws MenuNotFoundException, CouldNotGetDataException {
        long id = 2;
        when(menu.getId()).thenReturn(id);
        assertEquals(TestData.getMenu(id).getId(), id);
    }

    @Test(expected = CouldNotGetDataException.class)
    public void getMenuTest_MenuNotFound() throws CouldNotGetDataException {
        TestData.getMenu(-1);
    }
}
