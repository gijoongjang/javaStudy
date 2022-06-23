package designpattern.singleton;

public class SingletonPatternEx {

    private static SingletonPatternEx instance;

    private final String url = "jdbc:mysql://localhost:3308/test?serverTimezone=UTC";
    private final String id = "root";
    private final String pw = "1234";

    private SingletonPatternEx(){}
    public static SingletonPatternEx getInstance() {
        if(instance == null) {
            instance = new SingletonPatternEx();
        }

        return instance;
    }

    public String getUrl() {
        return url;
    }

    public String getId() {
        return id;
    }

    public String getPw() {
        return pw;
    }
}
