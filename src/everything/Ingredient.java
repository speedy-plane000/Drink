package everything;

public abstract class Ingredient implements Element {
    protected int mass;

    public Ingredient(int mass) {
        setMass(mass);
    }

    public void setMass(int mass) { this.mass = mass; }
}