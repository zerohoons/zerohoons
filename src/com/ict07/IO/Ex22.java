package com.ict07.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// InputStreamReader / OutputStreamWriter �� �̿��ؼ� Ű����� ���� �޾� ����ϴ� �ڵ�.
public class Ex22 {
	public static void main(String[] args) {
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			//�޼��� ���
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			bw.write("���ϴ� ������ �Է��ϼ���.");
			
			bw.newLine();
			
			bw.flush(); // �޼��� ���!
			
			//�޼��� �Է�
			isr = new InputStreamReader(System.in);
			br = new BufferedReader(isr);
			String msg = br.readLine();
			
			//�Է¹��� ���� ���ڷ� �ٲٱ�
//			int k = Integer.parseInt(msg);

			//���� �޼��� ���
			System.out.println("���� �޼��� : " + msg);		
			
			
			
		} catch (Exception e) {
		}finally {
			try {
				
				br.close();
				isr.close();
				bw.close();
				osw.close();
				
			} catch (Exception e2) {
			}
		}
		
	}
}
