package everything;

public class Water extends Ingredient {
    public Water(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return "Вода " + mass + " мл";
    }
}