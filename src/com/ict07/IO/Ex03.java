package com.ict07.IO;

import java.io.File;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) {
		
	//�۾��� Ư�� ��ġ ����.
	String pathname ="F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+
			"util"+File.separator+"01"+File.separator+"io_Test.txt";
	
	File file = new File(pathname);
	
	try {
		File file1 = new File(pathname);
		boolean b1 = file1.createNewFile();
		if(b1) {
			System.out.println("���� ����");
		}else {
			System.out.println("���� ���� ����");
		}
	
	pathname ="F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+
			"util"+File.separator+"01"+File.separator+"io_Test.txt";
	
	File file2 = new File(pathname);
	boolean b2 = file2.mkdirs();
	if(b2) {
		System.out.println("���丮 ����");
	}else {
		System.out.println("���丮 ���� ����");
	}
	
	//���丮 ����
	File file3 = new File(pathname);
	boolean b3 = file2.delete();
	if(b3) {
		System.out.println("���丮 ����");
	}else {
		System.out.println("���丮 ���� ����");
	}
	
	//���ϻ���
	
	pathname ="F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+
			"util"+File.separator+"01"+File.separator+"1234.txt";
	File file4 = new File(pathname);
	boolean b4 = file4.delete();
	if(b4) {
		System.out.println("���� ����");
	}else {
		System.out.println("���� ���� ����");
	}

	System.out.println();

	//���ǥ�� ( �� �����ϰ� ǥ�õȴ�. )
	pathname ="F:"+File.separator+"programing"+File.separator+"Study_YH"+File.separator+
			"util"+File.separator+"01";
	File file5 = new File(pathname);
		
	System.out.println(file5.getAbsolutePath());
	System.out.println(file5.getCanonicalPath());
	System.out.println(file5.getPath());	
	
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	//���丮 ����
	}
}

