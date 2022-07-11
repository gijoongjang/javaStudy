package designpattern.strategy;

import designpattern.strategy.data.Cart;
import designpattern.strategy.data.Product;
import designpattern.strategy.data.PurchaseType;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("결제 방식을 선택해주세요.");
        System.out.println("1.현금, 2.카드");

        String type = s.nextLine();

        IShopping shopping;
        if(type.equals("1")) {
            shopping = new CashShopping();
        } else if(type.equals("2")){
            shopping = new CardShopping();
        } else {
            System.out.println("결제 방식을 다시 선택해주세요.");
            return;
        }

        Cart cart = new Cart(shopping);

        cart.addProduct(new Product(1, "Computer", 1000000, PurchaseType.DELIVERY));
        cart.addProduct(new Product(2, "Phone", 900000, PurchaseType.DELIVERY));
        cart.addProduct(new Product(3, "TV", 4000000, PurchaseType.SPOT));

//        String paymentType = type.equals("1") ? "현금" : "카드";

        System.out.println("결제 방식 : " + shopping.getPaymentType() + "\n결제 금액 : " + cart.getPrice());
    }
}
