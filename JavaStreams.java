package Exercise.JavaStreams;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class JavaStreams {
    public static void main(String[] args) {
        try {
            List<String> list = Files.lines(Path.of("src/file.txt")).toList();
            list.stream().forEach(System.out::println);
        } catch (IOException exception) {
            System.out.println("Error");

        }
    }
}
