package designpattern.adapter;

public class Adapter implements PowerSocket220V {

    private PowerSocket110V powerSocket110V;
    public Adapter(PowerSocket110V powerSocket110V) {
        this.powerSocket110V = powerSocket110V;
    }

    @Override
    public void connect(String description) {
        powerSocket110V.on(description);
    }
}
