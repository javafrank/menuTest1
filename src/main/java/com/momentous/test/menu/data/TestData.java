package com.momentous.test.menu.data;

import com.momentous.test.menu.exception.CouldNotGetDataException;
import com.momentous.test.menu.model.item.Item;
import com.momentous.test.menu.model.item.Schedule;
import com.momentous.test.menu.util.DateTimeUtil;
import com.momentous.test.menu.exception.MenuNotFoundException;
import com.momentous.test.menu.model.item.Rank;
import com.momentous.test.menu.model.menu.Menu;
import com.momentous.test.menu.util.CurrencyUtil;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/**
 * Created by frank on 8/14/16.
 */
public class TestData {
    /**
     * Get all menu structure of this test
     * @return
     */
    public static List<Menu> getMenues() {
        final AtomicLong itemCounter = new AtomicLong();
        final AtomicLong menuCounter = new AtomicLong();

        Item arroz = new Item.Builder().id(itemCounter.getAndIncrement())
                .name("Arroz")
                .description("Arroz Desc")
                .currency(CurrencyUtil.get())
                .price(BigDecimal.valueOf(15.0))
                .rank(Rank.ONE_STAR).build();

        Item pollo = new Item.Builder().id(itemCounter.getAndIncrement())
                .name("Pollo")
                .description("Pollo Desc")
                .currency(CurrencyUtil.get())
                .price(BigDecimal.valueOf(12.0))
                .rank(Rank.FOUR_STAR).build();

        Schedule schedule = new Schedule.Builder().days(DateTimeUtil.weekDays())
                .dateFrom(LocalDate.of(2016, 1, 1))
                .dateTo(LocalDate.of(2017, 1, 1))
                .from(LocalTime.of(8, 0))
                .to(LocalTime.of(17, 0)).build();

        arroz.setSchedule(schedule);
        pollo.setSchedule(schedule);

        Menu menu = new Menu(menuCounter.getAndIncrement(), "Todos los Menues", true);
        Menu menuDia = new Menu(menuCounter.getAndIncrement(), "Menu del dia", true);
        Menu menuNoche = new Menu(menuCounter.getAndIncrement(), "Menu de la noche", true);
        menuDia.addItem(arroz);
        menuDia.addItem(pollo);

        menu.addMenu(menuDia);
        menu.addMenu(menuNoche);

        List<Menu> menues = new ArrayList<>();
        menues.add(menu);
        return menues;
    }

    /**
     * Get a menu when of id given
     * @param id id of menu
     * @return
     * @throws CouldNotGetDataException
     */
    public static Menu getMenu(long id) throws CouldNotGetDataException {
        List<Menu> menues = getMenues();
        try {
            return MenuSearch.search(menues.get(0), id);
        } catch (MenuNotFoundException e) {
            throw new CouldNotGetDataException(e);
        }
    }
}
