package com.aurienpro.test;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;
public class CopyStreamFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileInputStream fileInputStream  = new FileInputStream("D:\\ADCB\\Aurionpro_Training\\07_stream_apps\\src\\com\\aurienpro\\test\\file1");
			int ch;
			FileOutputStream fileOutputStream  = new FileOutputStream("D:\\ADCB\\Aurionpro_Training\\07_stream_apps\\src\\com\\aurienpro\\test\\file2");
			
				while((ch=fileInputStream.read())!=-1)
				{
				 fileOutputStream.write(ch);
				}
				System.out.println("File copied sucessfully");

	
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	catch(IOException e)
	 {  e.printStackTrace();
	 
	 }

}
}
