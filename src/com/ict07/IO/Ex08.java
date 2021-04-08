package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex08 {
	public static void main(String[] args) {
		/*	�ӵ� ����� ���� BufferedInputStream�� ����Ѵ�. : BufferedInputStream(InputStream in)
		 * 	ȥ�ڼ��� ����� �� ���� �ݵ�� InputStream�� �޾Ƽ� ���.
		 */
		
		String pathname = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			
//			//�ѱ��ھ� �о���� : read() -> ���ڷ� ������ ������ -> ����ȯ �ʼ�!
//			int k = bis.read();
//			System.out.println(k + " : "+(char)(k));
			
			//�ѱ��ھ� ��� �б� : �׸�, �Ҹ�, ������, ������ ���� �� ������ ���!
			//��, ��� �ƴ� ���ڴ� ���� �� ����. -> ���ڿ��� ���� �ʴ� ���.
			
//			int k = 0;
//			while(true) {
//				k = bis.read();
//				if(k==-1)break;
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
//			
//			�� ����� ����ϸ�,
//			int k = 0;
//			while((k=bis.read()) != -1) { //bis�� �о��� ��, -1�� �ƴϸ� true -> ���� / -1�� �Ǵ� ���� false -> ����.
//				System.out.println(k + " : " +(char)(k));
//				System.out.print((char)(k));
//			}
////			
		//�迭�� �̿��ϴ� ���
			/*byte[] b = new byte[(int)(file.length())]; //�迭�� ũ�� ���� -> ���� ���̴� �뷮! byte stream�� 1����Ʈ ����!
			bis.read(b);
			for (byte c : b) {
				System.out.println(c+" : "+(char)(c));
			}*/
			
		//String�� �̿��ϴ� ��� -> ���� �̿��� ���ڵ� ����.
		//-> byte[] ���ڷ� �޴� �����ڸ� �̿��ؼ� ����
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally{ 
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
