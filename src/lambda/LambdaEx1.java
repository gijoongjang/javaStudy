package lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LambdaEx1 {

    public static class Apple {
        String color;
        int weigh;

        public Apple(String color, int weigh) {
            this.color = color;
            this.weigh = weigh;
        }

        public String getColor() {
            return color;
        }

        public int getWeigh() {
            return weigh;
        }

        public static boolean isGreenApple(Apple apple) {
            return "green".equals(apple.getColor());
        }

        public static boolean isHeavyApple(Apple apple) {
            return apple.getWeigh() > 150;
        }
    }

    public static List<Apple> filterGreenApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : result) {
            if("green".equals(apple.getColor())) {
                result.add(apple);
            }
        }

        return result;
    }

    public static List<Apple> filterHeavyApples(List<Apple> inventory) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : result) {
            if(apple.getWeigh() > 150) {
                result.add(apple);
            }
        }

        return result;
    }
    ////////////////////////////////////////////////////////////////////////////

    public interface Predicate<T> {
        boolean test(T t);
    }

    static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();
        for (Apple apple : inventory) {
            if(p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        List<Apple> apples = List.of(new Apple("red", 110), new Apple("green", 160));

        List<Apple> result1 = filterApples(apples, Apple::isGreenApple);
        List<Apple> result2 = filterApples(apples, Apple::isHeavyApple);

        System.out.println("isGreenAppleSize : " + result1.size());
        System.out.println("isHeavyApple : " + result2.size());
    }
}
