package com.ict07.IO;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Ex21 {
	public static void main(String[] args) {
		/*	����Ʈ - ���� ���� : ü�ι��
		 * 	��� : OutputStreamWriter : OutputStream -> Writer
		 * 		   OutputStream -> OutputStreamWriter -> Writer -> BufferedWriter	 */
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		try {
			osw = new OutputStreamWriter(System.out); //����ͷ� ���
			bw = new BufferedWriter(osw);
			bw.write("Wellcome");
			bw.newLine(); //�� �ٲٱ�
			bw.write("JAVA World");
			
			bw.flush(); //��� �ʼ� flush();
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
	}
}
