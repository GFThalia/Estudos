package codecademy.IntermediateJava.genericsAndCollections;

import java.util.Scanner;

public class TakeOutSimulator {
    private Customer customer;
    private FoodMenu menu;
    private Scanner input;

    // Constructor
    public TakeOutSimulator(Customer customer, FoodMenu menu, Scanner input) {
        this.customer = customer;
        this.menu = menu;
        this.input = input;
    }

    // Method to prompt users for int input and perform some operation
    private <T> T getOutputOnIntInput(String userInputPrompt, IntUserInputRetriever<T> intUserInputRetriever) {
        while (true) {
            System.out.println(userInputPrompt);
            if (input.hasNextInt()) {
                int userInput = input.nextInt();
                try {
                    return intUserInputRetriever.produceOutputOnIntUserInput(userInput);
                } catch (IllegalArgumentException e) {
                    System.out.println(userInput + " is not a valid input. Try Again!");
                }
            } else {
                System.out.println("Input needs to be an `int` type.");
                input.next(); // Discard invalid input
            }
        }
    }

    // Method to check if simulation should continue
    public boolean shouldSimulate() {
        String userPrompt = "Enter 1 to CONTINUE simulation or 0 to EXIT program: ";
        IntUserInputRetriever<Boolean> userInputRetriever = selection -> {
            if (selection == 0) {
                return false;
            } else if (selection == 1) {
                Food lowestCostFood = menu.getLowestCostFood();
                if (lowestCostFood == null || lowestCostFood.getPrice() > customer.getMoney()) {
                    System.out.println("You don't have enough money to continue shopping :( - ending simulation...");
                    return false;
                }
                return true;
            } else {
                throw new IllegalArgumentException("Invalid selection. Enter 0 to exit or 1 to continue.");
            }
        };
        return getOutputOnIntInput(userPrompt, userInputRetriever);
    }

    // Method to get user's menu selection
    public Food getMenuSelection() {
        String userPrompt = "Today's Menu Options!\n" + menu.toString() + "\nChoose a menu item!: ";
        IntUserInputRetriever<Food> userInputRetriever = selection -> {
            Food selectedFood = menu.getFood(selection);
            if (selectedFood == null) {
                throw new IllegalArgumentException("Invalid selection. Please choose a valid menu item.");
            }
            return selectedFood;
        };
        return getOutputOnIntInput(userPrompt, userInputRetriever);
    }

    // Method to check if user is still ordering food
    public boolean isStillOrderingFood() {
        String userPrompt = "Enter 1 to CONTINUE shopping or 0 to CHECKOUT: ";
        IntUserInputRetriever<Boolean> userInputRetriever = selection -> {
            if (selection == 0) {
                return false;
            } else if (selection == 1) {
                return true;
            } else {
                throw new IllegalArgumentException("Invalid selection. Enter 0 to checkout or 1 to continue shopping.");
            }
        };
        return getOutputOnIntInput(userPrompt, userInputRetriever);
    }

    // Method to process customer's payment
    public void checkoutCustomer(ShoppingBag<Food> shoppingBag) {
        System.out.println("Processing payment...");
        double totalCost = shoppingBag.getTotalPrice();
        double remainingMoney = customer.getMoney() - totalCost;
        customer.setMoney(remainingMoney);
        System.out.println("Your remaining money: $" + remainingMoney);
        System.out.println("Thank you and enjoy your food!");
    }

    // Method for the take-out prompt
    public void takeOutPrompt() {
        System.out.println("Hello, welcome to my restaurant!");
        while (shouldSimulate()) {
            System.out.println("Welcome " + customer.getName() + "!");

            // Shopping bag and customer's money
            ShoppingBag<Food> shoppingBag = new ShoppingBag<>();
            double customerMoneyLeft = customer.getMoney();
            System.out.println("You have $" + customerMoneyLeft + " left to spend");

            // Prompt for menu selection
            Food selectedFood = getMenuSelection();

            // Check if customer has enough money to buy the selected food
            while (selectedFood.getPrice() > customerMoneyLeft) {
                System.out.println("Oops! Looks like you don't have enough for that. Choose another item or checkout.");
                selectedFood = getMenuSelection();
            }

            // Add selected food to the shopping bag and update remaining money
            shoppingBag.addItem(selectedFood);
            customerMoneyLeft -= selectedFood.getPrice();

            // Check if customer wants to continue ordering
            if (!isStillOrderingFood()) {
                checkoutCustomer(shoppingBag);
                break;
            }
        }
    }

    // Method to start the take-out simulation
    public void startTakeOutSimulator() {
        takeOutPrompt();
    }
}