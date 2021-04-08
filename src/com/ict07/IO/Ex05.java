package com.ict07.IO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05 {
	public static void main(String[] args) {
		//1.FileOutputStream : ������ ������� 1byte�� ������ ���⸦ �� �� �ִ� Stream.
		/*	������ - FileOutputStream(File file), FileOutputStream(File file, boolean append)
		 * 			 FileOutputStream(String name, boolean append), FileOutputStream(String name)
		 * 			 File file, String name -> Ư����ġ + �����̸�.
		 * 			 boolean append -> false or ���� ��, ����� / true�� �̾��.
		 * 	�ֿ�޼ҵ� 
		 * 	write(int b) -> �ѱ��� ���� ����. (��, �����ڳ� ����, �Ϻ��� Ư�����ڸ�)
		 * 	write(byte[] b) -> ���� ���ڸ� byte[]�� �־ ���� ����
		 * 	flush()	-> write �� �ݵ�� ��������. (�Ϲ� �޼ҵ��� return ���� ����)
		 * 	close() -> open�� ��Ʈ�� �ݱ�(��� �� �ݱ�), ���� finally�� ó��*/
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"
							+File.separator+"util"+File.separator+"ict01.txt"; 
		File file = new File(pathname);
		FileOutputStream fos = null;
		try {
			//���� ������ ������ ������ϰ� ������ �����Ѵ�.
			fos = new FileOutputStream(file);
			
			//���� ������ ������ �̾�� �ϰ�, ������ �����Ѵ�.
//			fos = new FileOutputStream(file,true);
		
			//�ѱ��ھ��� 
			fos.write(65);
			fos.write(97);
			//�ڹٿ��� �� ������ 13�̴�. ( 13 = Carriage Return -> CR -> \r)
			//�ٸ� ����߿����� \r\n(Line feed = 10)�� ���� ����ϴ� ��쵵 �ִ�.
			fos.write(13);
			
			// int���� �ֱ� ������ char�� �̿� ����.
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			//�迭�� �̿��ؼ� �������� ����
			byte[] b = {'b','o','y','s',13,'g','i','r','l','s',13};
			
			fos.write(b);
			
			//String�� �̿��ϸ� ���� �̿��� ���ڵ� �����ϴ�.
			String str = "Hello\r�ȳ�\r����";
			byte[] b2 = str.getBytes();
			fos.write(b2);
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fos != null)fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
