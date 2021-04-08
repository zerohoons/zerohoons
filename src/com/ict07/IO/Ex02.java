package com.ict07.IO;

import java.io.File;
import java.text.SimpleDateFormat;

public class Ex02 {
	public static void main(String[] args) {
		// File Ŭ������ ����ϱ� ���� Ư�� ��ġ�� ����
		String pathname_1 = "F:\\programming\\Study_YH\\util\\01";  // �ü���� windows �϶� 
		String pathname_2 ="F:/programing/Study_YH/util/01";     // �ü���� Linux, Unix �϶� 
		
		// �ü���� ������� ����ϴ� ���
		String pathname_3 = "F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"01";

		//������¥ ���ϱ�
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm");
		
		File file = new File(pathname_3);
		String[] arr = file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pathname_3, k);
			// System.out.println(file2);
			
			// ��ǻ�Ϳ� ����Ǵ� ������ ���丮�� ���Ϲۿ� ����.
			
			if(file2.isDirectory()) {
				System.out.println("���丮 : "+ file2 + "\rũ�Ⱑ �������� ����. \r �ֱ� ������ : " + sdf.format(file2.lastModified()));
			} else {
			System.out.println("���� : " + file2 + "\rũ��� " + (int)(file2.length()/1024)+"KB"+ "\r�ֱ� ������ : " +sdf.format(file2.lastModified())); 
			}
			
		}
	}
}
