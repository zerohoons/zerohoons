package com.ict07.IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex15 {
	public static void main(String[] args) {
		//����Stream - ��� �߽�. ��� ó���� 2 byte�� ó��
		//��� 		 - �� ���� ��� ���� ������ �������ϵ�.
		//�ֻ���Ŭ����- Reader (�Է�) / Writhe(���)
		
		//FileOutputStream (����Ʈ) : 1byte ó��, write(int b), write(byte[] b)
		//FileWriter (����)			: 2byte ó��, write(int b), write(char[] b), wirte(String str)
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"
						+File.separator+"ict05.txt";
		
		File file = new File(pathname);
		FileWriter fw = null;
		try {
			fw = new FileWriter(file);
			
			//�ѱ��ھ���
			fw.write(97);
			fw.write(65);
			fw.write(13);
			
			//int�̹Ƿ� char�� ��ü ����
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write('��');
			fw.write('��');
			fw.write('J');
			fw.write('A');
			fw.write('V');
			fw.write('A');
			fw.write(13);
			
			//�迭 �Է��ϱ�
			char[] c = {'k','o','r','e','a',13,'��','��','��','��',13};
			fw.write(c);
			
			fw.write("�ѱ�ICT���簳�߿�\n");
			fw.write("1������\n");
			fw.write("�ڹټ���\n");
			
			fw.flush();
			
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
