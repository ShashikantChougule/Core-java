package com.exe;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*FileInputStream fis=null;
		FileOutputStream fos=null;
		
		BufferedInputStream bis=new BufferedInputStream(System.in);
		try {
		fos=new FileOutputStream("MyFile.text");
		int s,x;
		while((s=bis.read())!=-1)
		{
			fos.write(s);
			fos.flush();
		}
		fis=new FileInputStream("MyFile.text");
		fos=new FileOutputStream("copy.text");
		do {
			x=fis.read();
			System.out.println(x);
			if(x!=-1)
				fos.write((char)x);
		}
		while(x!=-1);
		}*/
		//or
		//try with resource
		try (FileInputStream fis=new FileInputStream("MyFile.text");
				FileOutputStream fos=new FileOutputStream("MyFile.text");
				FileOutputStream fos1=new FileOutputStream("copy.text");
				BufferedInputStream bis=new BufferedInputStream(System.in);){
			
			int s,x;
			while((s=bis.read())!=-1)
			{
				fos.write(s);
				fos.flush();
			}
			System.out.println("writing a code of file finished");
			System.out.println("Reading code from the files");
			do {
				x=fis.read();
				System.out.println(x);
				if(x!=-1)
					fos.write((char)x);
			}
			while(x!=-1);
			
		}
		
		/*catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		}*/
		//or
		catch(IOException | ArrayIndexOutOfBoundsException | NullPointerException e) {
			e.printStackTrace();
		}
		/*finally {
			try {
				bis.close();
				fis.close();
				fos.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}*/
		}
	}


