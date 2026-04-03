package everything;

import java.util.*;

public abstract class Action implements Element {
    private List<Element> children = new ArrayList<>();
    private Action parent;

    public void add(Element el) {
        children.add(el);
        if (el instanceof Action) {
            ((Action) el).parent = this;
        }
    }

    public Action goUp() {
        if (parent != null) {
            return parent;
        }
        System.out.println("Вы уже в корне");
        return this;
    }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        System.out.println(getName());

        for (Element child : children) {
            child.print(level + 1);
        }
    }
}