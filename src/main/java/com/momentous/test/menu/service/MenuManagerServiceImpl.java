package com.momentous.test.menu.service;

import com.momentous.test.menu.model.Menu;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fcontreras on 12/08/16.
 */
@Service
public class MenuManagerServiceImpl implements MenuManagerService {
    public List getAllMenues() {
        List menues = new ArrayList();
        menues.add(new Menu(1, "menu 1"));
        return menues;
    }
}
