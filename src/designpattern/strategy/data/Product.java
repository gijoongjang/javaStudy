package designpattern.strategy.data;

public class Product {

    private int no;
    private String name;
    private long price;
    private PurchaseType purchaseType;

    public Product(int no, String name, long price, PurchaseType purchaseType) {
        this.no = no;
        this.name = name;
        this.price = price;
        this.purchaseType = purchaseType;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }
}
