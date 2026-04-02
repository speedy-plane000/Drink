package everything;

public class Ice extends Ingredient {
    public Ice(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return "Лёд " + mass + " мл";
    }
}