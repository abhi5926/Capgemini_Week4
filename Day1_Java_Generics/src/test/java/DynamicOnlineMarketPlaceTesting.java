import dynamiconlinemarketplace.*;
import org.junit.jupiter.api.Test;

public class DynamicOnlineMarketPlaceTesting {
    @Test
    void dynamicOnlineMerketplaceTesting(){
        // Creating Object of Different Product Category
        Product<BookCategory>  book = new Product<>("Learn Java",300,new BookCategory());
        Product<ClothingCategory> cloth = new Product<>("Shirt",700,new ClothingCategory());
        Product<PenCategory> pen = new Product<>("Cello Pen",10,new PenCategory());

        // Creating The object of the class DynamicOnlineMarketPlace
        MarketPlace ob = new MarketPlace();


        // Display the Details
        System.out.println("Book Details :");
        System.out.println(book);
        ob.applyDiscount(book,12);
        System.out.println("Cloth Details :");
        System.out.println(cloth);
        ob.applyDiscount(cloth,13);
        System.out.println("Pen Details :");
        System.out.println(pen);
        ob.applyDiscount(pen,23);
    }
}
