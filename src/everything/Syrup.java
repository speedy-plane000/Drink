package everything;

public class Syrup extends Ingredient {
    public Syrup(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return "Сироп " + mass + " мл";
    }
}