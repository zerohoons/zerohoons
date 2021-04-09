package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Ex26_Input {
	public static void main(String[] args) {
		String pathname =  "C:"+File.separator + "Study_YH"+File.separator+"util"+File.separator+"ict08.ser";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			Ex26_VO vo = (Ex26_VO) ois.readObject();
			System.out.println(vo.getName());
			System.out.println(vo.getAge());
			System.out.println(vo.getWeight());
			System.out.println(vo.isGender());
			
		} catch (Exception e) {
		}finally {
			try {
				
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
			
	}
}
