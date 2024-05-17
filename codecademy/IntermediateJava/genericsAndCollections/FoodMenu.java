package codecademy.IntermediateJava.genericsAndCollections;

import java.util.ArrayList;
import java.util.List;

public class FoodMenu {
    private List<Food> menu;

    // Constructor to initialize the menu with some Food objects
    public FoodMenu() {
        menu = new ArrayList<>();
        menu.add(new Food("Enjoy Tacos", "Yummy steak tacos", 15));
        menu.add(new Food("Enjoy Dumplings", "Delicious steamed dumplings", 10));
        menu.add(new Food("Ramen", "Hot pork ramen", 12));
    }

    // Override toString() to display the menu with item numbers
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < menu.size(); i++) {
            sb.append(i + 1).append(". ").append(menu.get(i)).append("\n");
        }
        return sb.toString();
    }

    // Method to get a Food object by index
    public Food getFood(int index) {
        try {
            return menu.get(index - 1); // Adjusting index to 0-based
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    // Method to get the lowest cost food item
    public Food getLowestCostFood() {
        if (menu.isEmpty()) {
            return null;
        }

        Food lowestCostFood = menu.get(0);
        for (Food food : menu) {
            if (food.getPrice() < lowestCostFood.getPrice()) {
                lowestCostFood = food;
            }
        }
        return lowestCostFood;
    }
}
