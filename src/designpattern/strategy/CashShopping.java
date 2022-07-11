package designpattern.strategy;

import designpattern.strategy.data.Product;
import designpattern.strategy.data.PurchaseType;

import java.util.List;

public class CashShopping implements IShopping {

    @Override
    public long calculateProductPrice(List<Product> products) {
        long total = 0;
        for(Product p : products) {
            if(p.getPurchaseType() == PurchaseType.DELIVERY) {
                total += p.getPrice() * 0.8;
                total += 3000;
                continue;
            }

            total += p.getPrice() * 0.8;
        }

        return total;
    }

    @Override
    public String getPaymentType() {
        return "현금";
    }
}
