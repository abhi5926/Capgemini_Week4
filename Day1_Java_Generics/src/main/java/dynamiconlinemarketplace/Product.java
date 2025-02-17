package dynamiconlinemarketplace;


public class Product<T> {

    // Creating Attributes
    private String name;
    private double price;
    private T category;

    // Creating Constructor
    public Product(String name,double price,T category){
        this.name = name;
        this.price = price;
        this.category = category;
    }
    // Method to get product name
    public String getName(){
        return name;
    }
    // Method to return the Price of the Price of product
    public double getPrice(){
        return price;
    }
    // Method to Return the category of the Product
    public T getCategory(){
        return category;
    }
    @Override
    public String toString() {
        return "Productname=" + name + " price=" + price + "category=" + category.getClass().getSimpleName();
    }
}
