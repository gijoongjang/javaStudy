package stream;

import java.util.List;

public class StreamEx3 {

    public static class Person {
        private int age;
        private boolean man;

        public Person(int age, boolean man) {
            this.age = age;
            this.man = man;
        }

        public int getAge() {
            return age;
        }

        public boolean isMan() {
            return man;
        }
    }
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 1, 3, 3, 2, 4, 6, 8);

        System.out.println("filtering");
        numbers.stream()
                .filter(i -> i % 2 == 0)
                .distinct()
                .forEach(System.out::println);

        System.out.println("slicing");
        numbers.stream()
                .filter(i -> i > 2)
                .limit(3)
                .forEach(System.out::println);

        List<Person> persons = List.of(new Person(22, true)
                                       , new Person(25, false)
                                        , new Person(28, true));

        System.out.println("age of first man");
        persons.stream()
                .filter(Person::isMan)
                .findAny()
                .ifPresent(m -> System.out.println(m.getAge()));
    }
}
