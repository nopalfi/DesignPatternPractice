package xyz.nopalfi.designpattern.singleton;

public class DatabaseHelper {

    /*
    Create a static instance, so it will be able to access the class
    without intantiate a new object
     */
    private static Database database;

    /*
    If database has not created yet, then create a new connection
    if not, then return the existing connection
     */
    public static Database getConnection() {
        if (database == null) {
            database = new Database("localhost", "root", "root");
        }
        return database;
    }
}
