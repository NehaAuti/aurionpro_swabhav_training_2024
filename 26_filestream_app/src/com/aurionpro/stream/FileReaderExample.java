package com.aurionpro.stream;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) {
		String filePath = "D:\\ADCB\\Aurionpro_Training\\26_filestream_app\\src\\com\\aurionpro\\stream\\test"; // Path to the file

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}