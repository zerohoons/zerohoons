package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* ����ڿ��� ���� ���� �����, res�� ���ο� ���Ϸ� �����ϴ� ���α׷�
 * ������ҿ� ���ϸ��� ���� -> ���� ��ҿ� ���ϸ��� ���� -> ����.
 */
public class Ex19 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//��� ��ġ �ޱ�.
		System.out.println("������ ��ҿ� ���ϸ� :");
		String pathname = sc.next();
		//���ϸ�ޱ�
		System.out.println("�ٿ����� ��ҿ� ���ϸ� :");
		String pathname2 = sc.next();
		
		File file1 = new File(pathname);
		File file2 = new File(pathname2);
		
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			//�б�
			fr = new FileReader(file1);
			br = new BufferedReader(fr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while((msg = br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			
			//����
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			String str = sb.toString();
			str = str.replace("���ѹα�", "��������");
			
//			bw.write(sb.toString());
			bw.write(str); //�����鼭 ġȯ�ϱ�
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
