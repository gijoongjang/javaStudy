package stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {

    public static void main(String[] args) {
        Stream<Student> stream = Stream.of(
                new Student("test1", 1, 300),
                new Student("test2", 2, 100),
                new Student("test3", 2, 200),
                new Student("test4", 1, 200),
                new Student("test5", 3, 250),
                new Student("test6", 3, 160)
        );

//        stream.sorted().forEach(System.out::println); //기본 정렬

        //반별로 정렬 후 점수별 내림차순 정렬
        stream.sorted(Comparator.comparing(Student::getBan)
                .thenComparing(Comparator.naturalOrder()))
                .forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {
    String name;
    int ban;
    int totalScore;

    Student(String name, int ban, int totalScore) {
        this.name = name;
        this.ban = ban;
        this.totalScore = totalScore;
    }

    public int getBan() {
        return ban;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s", name, ban, totalScore);
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
