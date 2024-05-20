package codecademy.IntermediateJava.nestedClasses;

import java.util.Scanner;

class ShopItems {
    int totalCount;

    // Nested class NonVegan
    class NonVegan {
        int iceCreamCount;
        int shakeCount;
        int totalCount;

        public void increaseCount(int type, int count) {
            if (type == 1) {
                iceCreamCount += count;
            } else if (type == 2) {
                shakeCount += count;
            }
            this.totalCount += count;
            ShopItems.this.totalCount += count;
        }
    }

    // Nested class Vegan
    class Vegan {
        int smoothieCount;
        int slushieCount;
        int totalCount;

        public void increaseCount(int type, int count) {
            if (type == 3) {
                smoothieCount += count;
            } else if (type == 4) {
                slushieCount += count;
            }
            this.totalCount += count;
            ShopItems.this.totalCount += count;
        }
    }
}

public class IceCreamShop {

    public static void main(String[] args) {
        ShopItems shopItems = new ShopItems();
        ShopItems.NonVegan nonVegan = shopItems.new NonVegan();
        ShopItems.Vegan vegan = shopItems.new Vegan();
        
        Scanner input = new Scanner(System.in);
        int orderType = 0;
        int itemCount = 0;

        System.out.println("Hello! Welcome to the ice cream shop. We are ready to take your order.");
        System.out.println("For ice-cream type 1, for shakes type 2, for smoothies type 3, and for slushies type 4.");
        System.out.println("If you are done ordering type 0.");

        while (true) {
            System.out.println("Type a number for the next item in your order:");
            orderType = input.nextInt();
            
            if (orderType == 0) {
                break;
            }

            System.out.println("How many items of this type would you like to order?");
            itemCount = input.nextInt();

            if (orderType == 1 || orderType == 2) {
                nonVegan.increaseCount(orderType, itemCount);
            } else if (orderType == 3 || orderType == 4) {
                vegan.increaseCount(orderType, itemCount);
            } else {
                System.out.println("Invalid type, please try again.");
                continue;
            }

            System.out.println("Adding " + itemCount + " of the item to your order!");
        }

        input.close();

        System.out.println("Thank you for your order! Today we have sold " + shopItems.totalCount + " orders of sweetness!");
        System.out.println(nonVegan.totalCount + " items have been ice cream and shakes.");
        System.out.println(vegan.totalCount + " items have been smoothies and slushies.");
    }
}