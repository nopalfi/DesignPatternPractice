package xyz.nopalfi.designpattern.singleton;

public class TakeProduct {

    private String productId;

    private String productName;

    public void take(String productId, String productName) {
        /*
          Those codes below will create connection object everytime a class access it
          But what we really want is to 'reuse' connection object so it will not create
          a seperate connection object everytime a class want to create a connection
         */

//        Database database = new Database("localhost", "root", "root");
//        database.sql("DELETE FROM PRODUCTS WHERE ProductId = '"+productId+"'");
        DatabaseHelper.getConnection().sql("DELETE FROM PRODUCTS WHERE ProductId = '"+productId+"'");

    }
}
