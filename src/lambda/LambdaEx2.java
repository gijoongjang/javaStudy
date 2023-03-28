package lambda;

import java.util.ArrayList;
import java.util.List;

public class LambdaEx2 {

    public interface ApplePredicate {
        boolean test(LambdaEx1.Apple apple);
    }

    public static class AppleHeavyWeightPredicate implements ApplePredicate {
        @Override
        public boolean test(LambdaEx1.Apple apple) {
            return apple.getWeigh() > 150;
        }
    }

    public static class AppleGreenColorPredicate implements ApplePredicate {
        @Override
        public boolean test(LambdaEx1.Apple apple) {
            return "green".equals(apple.getColor());
        }
    }

    public static class AppleRedAndHeavyPredicate implements ApplePredicate {
        @Override
        public boolean test(LambdaEx1.Apple apple) {
            return "red".equals(apple.getColor())
                    && apple.getWeigh() > 150;
        }
    }

    static List<LambdaEx1.Apple> filterApples(List<LambdaEx1.Apple> inventory, AppleRedAndHeavyPredicate p) {
        List<LambdaEx1.Apple> result = new ArrayList<>();
        for (LambdaEx1.Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<LambdaEx1.Apple> apples = List.of(new LambdaEx1.Apple("red", 110)
                                                , new LambdaEx1.Apple("green", 160)
                                                , new LambdaEx1.Apple("red", 160)
                                                , new LambdaEx1.Apple("red", 180));

        List<LambdaEx1.Apple> result = filterApples(apples, new AppleRedAndHeavyPredicate());

        result.stream()
                .map(apple -> "color : " + apple.getColor() + ", " + "weigh : " + apple.getWeigh())
                .forEach(System.out::println);
    }
}
