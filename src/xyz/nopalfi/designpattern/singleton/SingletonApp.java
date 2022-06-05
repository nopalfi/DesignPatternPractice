package xyz.nopalfi.designpattern.singleton;

public class SingletonApp {

    public static void main(String[] args) {
        /*
          Take product: Take a product and delete it from database
         */
        TakeProduct takeProduct = new TakeProduct();

        takeProduct.take("0001","Tooth Paste");
        takeProduct.take("0002","Shampoo");
        takeProduct.take("0003","Instant Noodle");

        /*
        Store product: Insert a product to a database
         */
        StoreProduct storeProduct = new StoreProduct();

        storeProduct.store("0006", "Towel");
        storeProduct.store("0007", "Sugar");
        storeProduct.store("0008", "Broom");

    }


}
