package dynamiconlinemarketplace;

public class MarketPlace {
    // Creating generic method that extends Product class
    public <T extends Product<?>> void applyDiscount(T product , double percentage){
        double discount = product.getPrice() * (percentage / 100);
        double actualPrice = product.getPrice() - discount;
        System.out.println("The Actual Price of the Product is : "+actualPrice);
    }

}
