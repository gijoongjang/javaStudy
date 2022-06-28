package designpattern.adapter;

public class Main {

    public static void main(String[] args) {
        KoreaPowerSocket koSocket = new KoreaPowerSocket();
        koSocket.connect("Connect Using 220V");

        JapanPowerSocket jpSocet = new JapanPowerSocket();
        jpSocet.on("Connect Using 110V");

        //220V Adapter
        Adapter adapter = new Adapter(jpSocet);
        adapter.connect("Connect Using Adapter");
    }
}
