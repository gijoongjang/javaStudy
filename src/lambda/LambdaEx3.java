package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx3 {

    interface ApplePredicate {
        boolean test(LambdaEx1.Apple apple);
    }

    static List<LambdaEx1.Apple> filterApples(List<LambdaEx1.Apple> inventory, ApplePredicate p) {
        List<LambdaEx1.Apple> result = new ArrayList<>();
        for (LambdaEx1.Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static String isEquals(List<LambdaEx1.Apple> result1, List<LambdaEx1.Apple> result2) {
        return result1.equals(result2) ? "같다" : "다르다";
    }

    public static void main(String[] args) {
        List<LambdaEx1.Apple> apples = List.of(new LambdaEx1.Apple("red", 110)
                                                , new LambdaEx1.Apple("green", 160)
                                                , new LambdaEx1.Apple("red", 160)
                                                , new LambdaEx1.Apple("red", 180));

        //익명 클래스
        List<LambdaEx1.Apple> result1 = filterApples(apples, new ApplePredicate() {
            public boolean test(LambdaEx1.Apple apple) {
                return "red".equals(apple.getColor());
            }
        });

        //람다 표현
        List<LambdaEx1.Apple> result2 =
                filterApples(apples, (LambdaEx1.Apple apple) -> "red".equals(apple.getColor()));

        System.out.println(isEquals(result1, result2));
    }
}
