package designpattern.adapter;

public class JapanPowerSocket implements PowerSocket110V {

    @Override
    public void on(String descrition) {
        System.out.println(descrition);
    }
}
