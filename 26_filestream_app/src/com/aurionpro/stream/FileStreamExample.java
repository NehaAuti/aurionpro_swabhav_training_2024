package com.aurionpro.stream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Path filePath = Paths.get("D:\\ADCB\\Aurionpro_Training\\26_filestream_app\\src\\com\\aurionpro\\stream\\test"); // Path to the file
//
//        try (Stream<String> lines = Files.lines(filePath)) {
//            lines.forEach(System.out::println);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}

        // Define the path to the file
        Path filePath = Paths.get("D:\\ADCB\\Aurionpro_Training\\26_filestream_app\\src\\com\\aurionpro\\stream\\test"); // Update with the correct file path

        // Read and print lines from the file using Streams and lambda expressions
        try (Stream<String> lines = Files.lines(filePath)) {
            lines.forEach(line -> System.out.println(line)); // Using lambda expression instead of method reference
        } catch (IOException e) {
            e.printStackTrace(); // Handle IO exceptions
        }
    }
}	