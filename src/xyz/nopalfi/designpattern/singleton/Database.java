package xyz.nopalfi.designpattern.singleton;

public class Database {

    private final String host;
    private final String username;
    private final String password;

    public Database(String host, String username, String password) {
        this.host = host;
        this.username = username;
        this.password = password;
    }

    public void sql(String sql) {

    }
}
