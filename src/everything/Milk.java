package everything;

public class Milk extends Ingredient {
    public Milk(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return "Молоко " + mass + " мл";
    }
}