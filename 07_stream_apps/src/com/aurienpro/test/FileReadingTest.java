package com.aurienpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class FileReadingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream = new FileInputStream("D:\\ADCB\\Aurionpro_Training\\07_stream_apps\\src\\com\\aurienpro\\test\\file1");

		int ch;
			while ((ch=fileInputStream.read())!=-1)
			{
				System.out.print((char)ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
}

