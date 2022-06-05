package xyz.nopalfi.designpattern.singleton;

public class StoreProduct {

    private String productId;

    private String productName;

    public void store(String productId, String productName) {
        /*
          Those codes below will create connection object everytime a class access it
          But what we really want is to 'reuse' connection object so it will not create
          a seperate connection object everytime a class want to create a connection
         */
//        Database database = new Database("localhost", "root", "root");
//        database.sql("INSERT INTO PRODUCTS ('ProductId','ProductName') VALUES ('"+productId+"','"+productName+"')");

        DatabaseHelper.getConnection().sql("INSERT INTO PRODUCTS ('ProductId','ProductName') VALUES ('"+productId+"','"+productName+"')");
    }

}
