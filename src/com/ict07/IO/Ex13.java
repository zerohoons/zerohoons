package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex13 {
	public static void main(String[] args) {
		/*	DataOutputStream �� DataInputStream
		 *  �⺻�ڷ����� �ְ� ���� �� ���.
		 *  FileInputStream�� FileOutputStream���� �ٸ� ����
		 *  ����(0,1)�����ͷ� ������� �ϴ� ��. (Ÿ �ý��۰� ��/����Ҷ� �����ϴ�.)
		 *  �ٸ�, ���������͸� �̿��ϱ� ������, ����� ������ �޶� �ȵȴ�.
		 * 	BufferedInputStream / BufferedOutputStream�� Ȱ���� �� �ִ�. */
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict03.txt";
		
		File file = new File(pathname);
		
		//���� ��
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		//�д� ��
		FileInputStream fis = null;
		BufferedInputStream bis = null; //���۴� �߰��� �־����!
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//���� �޼ҵ� : writeXXX (XXX : �⺻ �ڷ���)
			dos.writeLong(0);
			dos.writeBoolean(true);
			dos.writeFloat(3.14f);
			dos.writeInt(256);
			dos.writeDouble(236.41);
			dos.writeChar('A');
			dos.flush();
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			dis = new DataInputStream(bis);
			
			//�д� �޼ҵ�
			System.out.println(dis.readLong());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readFloat());
			System.out.println(dis.readInt());
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
		} catch (Exception e) {
		}finally {
			try {
				dis.close();
				bis.close();
				fis.close();
		
				dos.close();
				bos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
