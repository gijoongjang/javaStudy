package designpattern.strategy.data;

import designpattern.strategy.IShopping;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private IShopping shopping;
    private List<Product> productList;

    public Cart(IShopping shopping) {
        this.shopping = shopping;
        productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public long getPrice() {
        return shopping.calculateProductPrice(productList);
    }
}
