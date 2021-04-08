package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Ex14 {
	public static void main(String[] args) {
	// PrintStream : ��� �⺻ �ڷ����� ����� �� �ִ�.
	//			-> ȭ�鿡 ����Ϸ��� System.out�� Ȱ��
	//			-> ���Ͽ� ����Ϸ��� FileOutputStream�� BufferedOutputStream�� Ȱ��
		
	String pathname = "C:"+File.separator+"Study_YH"+File.separator+ "util"+File.separator+"ict04.txt";
	
	File file = new File(pathname);
	
	FileOutputStream fos = null;
	BufferedOutputStream bos =null;
	PrintStream ps;
	
	try {
		fos = new FileOutputStream(file);
		bos = new BufferedOutputStream(fos);
		ps = new PrintStream(bos);
		
		//ȭ�鿡 ���
		System.out.println(24.1);
		System.out.println(20);
		System.out.println('C');
		System.out.println(true);
		System.out.println("���ѹα�");

		//���Ͽ� ���
		ps.println(24); // ps = System.out �� �ǹ̸� ���� �ִ�.
		ps.println(20); // ps = System.out �� �ǹ̸� ���� �ִ�.
		ps.println('C'); // ps = System.out �� �ǹ̸� ���� �ִ�.
		ps.println(true); // ps = System.out �� �ǹ̸� ���� �ִ�.
		ps.println("���ѹα�"); // ps = System.out �� �ǹ̸� ���� �ִ�.
		

		
	} catch (Exception e) {
	}finally {
		try {
			bos.close();
			fos.close();
		} catch (Exception e2) {
		}
	}
	}
}
