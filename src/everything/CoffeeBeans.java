package everything;

public class CoffeeBeans extends Ingredient {
    public CoffeeBeans(int mass) {
        super(mass);
    }

    @Override
    public String getName() {
        return "Кофейное зерно " + mass + " мл";
    }
}
