package everything;

import java.util.*;

public class Main {
    static void main() {
        Scanner scan = new Scanner(System.in);
        List<Drink> drinks = new ArrayList<>();
        boolean flag = true, creating;
        int num, index;

        while (flag) {
            System.out.println("Выберите действие");
            System.out.println("1 - Создать напиток");
            System.out.println("2 - Вывести напитки");
            System.out.println("3 - Удалить напиток");
            System.out.println("4 - Изменить напиток");
            System.out.println("5 - Завершить программу");

            num = scan.nextInt();
            switch (num) {
                case 1:
                    scan.nextLine();
                    System.out.println("Введите имя напитка");
                    String name = scan.nextLine();

                    Action root = chooseAction();
                    Action current = root;

                    creating = true;
                    while (creating) {
                        System.out.println("Текущий узел: " + current.getName());
                        System.out.println("1 - Добавить действие");
                        System.out.println("2 - Добавить ингредиент");
                        System.out.println("3 - Подняться");
                        System.out.println("4 - Завершить");

                        num = scan.nextInt();
                        switch (num) {
                            case 1:
                                Action action = chooseAction();
                                current.add(action);
                                current = action;
                                break;
                            case 2:
                                Ingredient ing = chooseIngredient();
                                current.add(ing);
                                break;
                            case 3:
                                current = current.goUp();
                                break;
                            case 4:
                                drinks.add(new Drink(name, root));
                                creating = false;
                                break;
                        }
                    }
                    break;

                case 2:
                    System.out.println("Все напитки");
                    for (int i = 0; i < drinks.size(); i++) {
                        System.out.println(i + 1 + " " + drinks.get(i).getName());
                        drinks.get(i).getRoot().print(0);
                        System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Введите номер напитка");
                    for (int i = 0; i < drinks.size(); i++) {
                        System.out.println(i + 1 + " " + drinks.get(i).getName());
                    }

                    index = scan.nextInt();
                    if (index > 0 && index <= drinks.size()) {
                        drinks.remove(index - 1);
                    }
                    break;
                case 4:
                    System.out.println("Выберите напиток");
                    for (int i = 0; i < drinks.size(); i++) {
                        System.out.println(i + 1 + " " + drinks.get(i).getName());
                    }

                    index = scan.nextInt();
                    if (index < 1 || index > drinks.size()) {
                        System.out.println("Неверный номер");
                        break;
                    }

                    scan.nextLine();
                    System.out.println("Введите новое имя");
                    String newName = scan.nextLine();

                    drinks.get(index - 1).setName(newName);
                    System.out.println("Имя изменено");
                    break;
                case 5:
                    flag = false;
                    break;
            }
        }
    }

    public static Action chooseAction() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите действие:");
        System.out.println("1 - Добавить");
        System.out.println("2 - Перемешать");
        System.out.println("3 - Вскипятить");
        System.out.println("4 - Пролить");
        System.out.println("5 - Перемолоть");
        System.out.println("6 - Взбить");

        int num = scan.nextInt();
        switch (num) {
            case 1:
                return new Add();
            case 2:
                return new Stir();
            case 3:
                return new Boil();
            case 4:
                return new Pour();
            case 5:
                return new Grind();
            case 6:
                return new Whip();
            default:
                return new Add();
        }
    }

    public static Ingredient chooseIngredient() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Выберите ингредиент");
        System.out.println("1 - Вода");
        System.out.println("2 - Сироп");
        System.out.println("3 - Кофейное зерно");
        System.out.println("4 - Молоко");
        System.out.println("5 - Лёд");
        int num = scan.nextInt();

        System.out.println("Введите количество мл:");
        int ml = scan.nextInt();

        switch (num) {
            case 1:
                return new Water(ml);
            case 2:
                return new Syrup(ml);
            case 3:
                return new CoffeeBeans(ml);
            case 4:
                return new Milk(ml);
            case 5:
                return new Ice(ml);
            default:
                return new Water(ml);
        }
    }
}