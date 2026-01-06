public class DbSingleton {
    private static DbSingleton instance;
    private String url;
    private String username;
    private String password;
    private int maxConnections;
    private boolean connected;
    private DbSingleton() {
        this.url = "https://example.api";
        this.username = "admin";
        this.password = "secret";
        this.maxConnections = 10;
        this.connected = false;
    }
    public static DbSingleton getInstance() {
        if (instance == null) {
            instance = new DbSingleton();
        }
        return instance;
    }
    public void connect() {
        System.out.println("Connecting...");
        this.connected = true;
        System.out.println("Connected to " + this.url);
    }
}
