package everything;

public abstract class Ingredient implements Element {
    protected int mass;

    public Ingredient(int mass) {
        setMass(mass);
    }

    public void setMass(int mass) { this.mass = mass; }

    @Override
    public void print(int level) {
        for (int i = 0; i < level; i++) {
            System.out.print("  ");
        }

        System.out.println(getName());
    }
}