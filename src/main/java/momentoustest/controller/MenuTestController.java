package momentoustest.controller;

import momentoustest.model.Menu;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by fcontreras on 11/08/16.
 */
@RestController
public class MenuTestController {
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/test")
    public Menu getMenu() {
        return new Menu(counter.incrementAndGet(), "Test");
    }
}
