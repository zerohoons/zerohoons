package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex16 {
	public static void main(String[] args) {
		//BufferedWrite : �ӵ������ ���� ���Ǹ�, �� �ٲٱ� �޼ҵ尡 �����Ѵ�.
		
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"
						+File.separator+"ict05.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = new BufferedWriter(fw);
		
		try {
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			//�ѱ��ھ���
			bw.write(97);
			bw.write(65);
			bw.newLine(); //�ٺ��� �޼ҵ�
			
			//int�̹Ƿ� char�� ��ü ����
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine(); //�ٺ��� �޼ҵ�
			bw.write('��');
			bw.write('��');
			bw.newLine(); //�ٺ��� �޼ҵ�
			bw.write('J');
			bw.write('A');
			bw.write('V');
			bw.write('A');
			bw.newLine(); //�ٺ��� �޼ҵ�
			
			//�迭 �Է��ϱ�
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			bw.write(c);
			bw.newLine(); //�ٺ��� �޼ҵ�
			
			bw.write("�ѱ�ICT���簳�߿�\n");
			bw.newLine(); //�ٺ��� �޼ҵ�
			bw.write("1������\n");
			bw.newLine(); //�ٺ��� �޼ҵ�
			fw.write("�ڹټ���\n");
			bw.newLine(); //�ٺ��� �޼ҵ�
			
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
