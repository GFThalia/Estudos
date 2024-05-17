package codecademy.IntermediateJava.genericsAndCollections;

import java.util.HashMap;
import java.util.Map;

public class ShoppingBag<T extends PricedItem<Integer>> {
    private Map<T, Integer> shoppingBag;

    public ShoppingBag() {
        this.shoppingBag = new HashMap<>();
    }

    public void addItem(T item) {
        shoppingBag.put(item, shoppingBag.getOrDefault(item, 0) + 1);
    }

    public int getTotalPrice() {
        int totalPrice = 0;
        for (Map.Entry<T, Integer> entry : shoppingBag.entrySet()) {
            T item = entry.getKey();
            int quantity = entry.getValue();
            totalPrice += item.getPrice() * quantity;
        }
        return totalPrice;
    }
}
