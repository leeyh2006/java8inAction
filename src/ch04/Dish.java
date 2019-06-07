package ch04;

/**
 * Name:Dish
 * Desc :
 * Developer :82108
 * Date : 2019-06-07
 * Time : 오후 7:44
 */
public class Dish {
    private final int calories;
    private final String name;
    private final boolean vegetarian;
    private final Type type;

    public Dish(int calories, String name, boolean vegetarian, Type type) {
        this.calories = calories;
        this.name = name;
        this.vegetarian = vegetarian;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public Type getType() {
        return type;
    }

    public int getCalories() {
        return calories;
    }

    public enum Type{
        MEAT,FISH,OTHER
    }

}
