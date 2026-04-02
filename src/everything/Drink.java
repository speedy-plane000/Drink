package everything;

public class Drink {
    private String name;
    private Action root;

    Drink(String name, Action root) {
        setName(name);
        setRoot(root);
    }

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setRoot(Action root) { this.root = root; }

    public Action getRoot() { return root; }
}
