package designpattern.strategy;

import designpattern.strategy.data.Product;

import java.util.List;

public interface IShopping {
    long calculateProductPrice(List<Product> products);
    String getPaymentType();
}
