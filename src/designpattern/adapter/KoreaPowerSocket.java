package designpattern.adapter;

public class KoreaPowerSocket implements PowerSocket220V {

    @Override
    public void connect(String description) {
        System.out.println(description);
    }
}
