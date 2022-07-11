package designpattern.strategy;

import designpattern.strategy.data.Product;
import designpattern.strategy.data.PurchaseType;

import java.util.List;

public class CardShopping implements IShopping {

    @Override
    public long calculateProductPrice(List<Product> products) {
        long total = 0;
        for(Product p : products) {
            if(p.getPurchaseType() == PurchaseType.DELIVERY) {
                total += p.getPrice() * 0.9;
                total += 3000;
                continue;
            }

            total += p.getPrice() * 0.9;
        }

        return total;
    }

    @Override
    public String getPaymentType() {
        return "카드";
    }
}
