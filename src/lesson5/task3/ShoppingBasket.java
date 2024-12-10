package lesson5.task3;

import java.util.HashMap;

class ShoppingBasket {
    private HashMap<String, Integer> basket = new HashMap<>();

    public void addProduct(String product, Integer quantity) {
        if (product == null || quantity < 0)
            return;
        if (basket.containsKey(product)) {
            basket.put(product, basket.get(product) + quantity);
        } else {
            basket.put(product, quantity);
        }
    }

    public void removeProduct(String product) {
        if (product != null && basket.size() > 0)
            basket.remove(product);
    }

    public void updateQuantity(String product, Integer quantity) {
        if (product != null && quantity >= 0)
            basket.put(product, quantity);
    }

    public int checkProduct(String product) {
        return product != null && basket.containsKey(product) ? basket.get(product).intValue() : 0;
    }

    public void showBasket() {
        if (basket == null || basket.size() == 0)
            return;
        System.out.println(basket);
    }
}
