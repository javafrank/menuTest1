package momentoustest.model;

/**
 * Created by fcontreras on 11/08/16.
 */
public class Menu {
    private final long id;
    private final String name;

    public Menu(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
