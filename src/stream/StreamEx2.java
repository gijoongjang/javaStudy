package stream;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {

    public static void main(String[] args) {
        File[] files = {new File("Ex1.java"), new File("Ex1.txt"),
                new File("Ex2.java"), new File("Ex2.png"), new File("Ex1")
        };

        Stream<File> stream = Stream.of(files);

        // Stream<File> -> Stream<String>으로 변환
        Stream<String> fileNameStream = stream.map(File::getName);
        fileNameStream.forEach(System.out::println);

        stream = Stream.of(files);

        stream.map(File::getName)
                .filter(x -> x.indexOf('.') != -1)  // 확장자 없는것 제외
                .map(x -> x.split("\\.")[1])  // 확장자만 뽑아낸다
                .map(String::toUpperCase)           // 대문자로 변환
                .distinct()                         // 중복제거
                .forEach(System.out::println);
    }
}
