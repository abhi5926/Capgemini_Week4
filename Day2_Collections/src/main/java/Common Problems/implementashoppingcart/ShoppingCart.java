package implementashoppingcart;
import java.util.*;

public class ShoppingCart {

        // HashMap to store product prices
        private static Map<String, Double> productPrices = new HashMap<>();

        // LinkedHashMap to maintain order of items added
        private static LinkedHashMap<String, Integer> cartItems = new LinkedHashMap<>();

        // TreeMap to display items sorted by price
        private static TreeMap<Double, List<String>> sortedByPrice = new TreeMap<>();

        public static void main(String[] args) {
            // Initialize product prices
            productPrices.put("Apple", 1.0);
            productPrices.put("Banana", 0.5);
            productPrices.put("Orange", 0.75);
            productPrices.put("Milk", 1.5);
            productPrices.put("Bread", 2.0);

            // Adding items to the cart
            addItemToCart("Apple", 3);
            addItemToCart("Banana", 5);
            addItemToCart("Orange", 2);
            addItemToCart("Milk", 1);

            // Display cart items in the order they were added
            System.out.println("Items in the cart (ordered by addition):");
            displayCartItems();

            // Display items sorted by price
            System.out.println("\nItems sorted by price:");
            displayItemsSortedByPrice();
        }

        // Method to add items to the shopping cart
        public static void addItemToCart(String product, int quantity) {
            if (productPrices.containsKey(product)) {
                cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
                double price = productPrices.get(product);

                // Adding items to TreeMap to maintain sorting by price
                sortedByPrice.putIfAbsent(price, new ArrayList<>());
                for (int i = 0; i < quantity; i++) {
                    sortedByPrice.get(price).add(product);
                }
            } else {
                System.out.println("Product not found: " + product);
            }
        }

        // Method to display items in the order they were added
        public static void displayCartItems() {
            for (Map.Entry<String, Integer> entry : cartItems.entrySet()) {
                System.out.println(entry.getKey() + " - Quantity: " + entry.getValue() + ", Price: $" + productPrices.get(entry.getKey()));
            }
        }

        // Method to display items sorted by price
        public static void displayItemsSortedByPrice() {
            for (Map.Entry<Double, List<String>> entry : sortedByPrice.entrySet()) {
                for (String item : entry.getValue()) {
                    System.out.println(item + " - Price: $" + entry.getKey());
                }
            }
        }
    }

