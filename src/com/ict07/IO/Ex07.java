package com.ict07.IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		/*	1. FileInputStream : ������ ������� 1byte�� ������ �б⸦ �� �� �ִ� Stream
		 *	1) ������ - FileOutputStream(File file), FileOutputStream(String name)
		 * 	   File file, String name �� Ư����ġ + ���� �̸�.
		 *	2) �޼ҵ�
		 *	- read() : int -> ����� ���ڷ� ����. char������ ����ȯ�� �ؾ����� ���ڰ� �ȴ�.
		 *			 : �� �̻� ���� �� ���� �� -1�� ���´�. ������ ������ ���ڴ� ���� �� ����.
		 *	- read(byte[] b) : int -> �迭�� ���� ���ڿ� ���� -> �迭�� ũ�⸸ŭ ���ڸ� ���� �� �ִ�.
		 *						=> byte[] b�� ũ�⸸ŭ ���� ���ڵ��� ����ȴ�.
		 *
		 *	- close : open�� ��Ʈ�� �ݱ�.(��� �� �ݱ�), ���� finally���� ó��
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
			
//			//�ѱ��ھ� �о���� : read() -> ���ڷ� ������ ������ -> ����ȯ �ʼ�!
//			int k = fis.read();
//			System.out.println(k + " : "+(char)(k));
			
			//�ѱ��ھ� ��� �б� : �׸�, �Ҹ�, ������, ������ ���� �� ������ ���!
			//��, ��� �ƴ� ���ڴ� ���� �� ����. -> ���ڿ��� ���� �ʴ� ���.
			
//			int k = 0;
//			while(true) {
//				k = fis.read();
//				if(k==-1)break;
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
//			�� ����� ����ϸ�,
//			int k = 0;
//			while((k=fis.read()) != -1) { //fis�� �о��� ��, -1�� �ƴϸ� true -> ���� / -1�� �Ǵ� ���� false -> ����.
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
		//�迭�� �̿��ϴ� ���
			/*byte[] b = new byte[(int)(file.length())]; //�迭�� ũ�� ���� -> ���� ���̴� �뷮! byte stream�� 1����Ʈ ����!
			fis.read(b);
			for (byte c : b) {
				System.out.println(c+" : "+(char)(c));
			}*/
			
		//String�� �̿��ϴ� ��� -> ���� �̿��� ���ڵ� ����.
		//-> byte[] ���ڷ� �޴� �����ڸ� �̿��ؼ� ����
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ 
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
