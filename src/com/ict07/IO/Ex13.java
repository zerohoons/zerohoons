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
		/*	DataOutputStream 과 DataInputStream
		 *  기본자료형을 주고 받을 때 사용.
		 *  FileInputStream과 FileOutputStream과의 다른 점은
		 *  이진(0,1)데이터로 입출력을 하는 점. (타 시스템과 입/출력할때 유리하다.)
		 *  다만, 이진데이터를 이용하기 때문에, 입출력 순서가 달라선 안된다.
		 * 	BufferedInputStream / BufferedOutputStream을 활용할 수 있다. */
		
		String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict03.txt";
		
		File file = new File(pathname);
		
		//쓰는 법
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		DataOutputStream dos = null;
		
		//읽는 법
		FileInputStream fis = null;
		BufferedInputStream bis = null; //버퍼는 중간에 있어야함!
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			dos = new DataOutputStream(bos);
			
			//쓰기 메소드 : writeXXX (XXX : 기본 자료형)
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
			
			//읽는 메소드
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
