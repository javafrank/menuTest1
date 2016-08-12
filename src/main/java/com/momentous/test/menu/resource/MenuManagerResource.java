package com.momentous.test.menu.resource;

import com.momentous.test.menu.model.Menu;
import com.momentous.test.menu.service.MenuManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by fcontreras on 11/08/16.
 */
@RestController
public class MenuManagerResource {
    private final AtomicLong counter = new AtomicLong();

    @Autowired
    private MenuManagerService gatewayService;

    @RequestMapping("/test")
    public Menu getMenu() {
        return new Menu(counter.incrementAndGet(), "Test");
    }

    @RequestMapping("/menues")
    public List getAllMenues() {
        return gatewayService.getAllMenues();
    }
}
