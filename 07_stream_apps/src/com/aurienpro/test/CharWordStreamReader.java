package com.aurienpro.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CharWordStreamReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileInputStream fileInputStream  = new FileInputStream("D:\\ADCB\\Aurionpro_Training\\07_stream_apps\\src\\com\\aurienpro\\test\\file1");
			int ch;
			int charCount = 0;
			try {
				while((ch=fileInputStream.read())!=-1) {
					System.out.print((char)ch);
					charCount++;
				}
				System.out.println("Total No of Character:/t" +charCount);
				
		}catch(IOException e)
			 {  e.printStackTrace();
			 
			 }
		}catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}

