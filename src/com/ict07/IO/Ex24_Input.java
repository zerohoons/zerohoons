package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

//객체 역직렬화 : ObjectInputStream : readObject()
public class Ex24_Input {
	public static void main(String[] args) {
		//객체 역직렬화 : 직렬화된 파일이나 정보를 원래 내용으로 복원하는 역할을 함.
		String pathname = "c:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict07.ser";
		File file = new File(pathname);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			//역직렬은 직렬화 단계를 거꾸로 함.
			
			//배열이나 컬렉션으로 담긴 객체를 불러오는 과정
			//부호화 : encoding 과정을 역행하며, 이를 복호화 : decoding 이라 부른다.
			ArrayList<Ex24_VO> list = (ArrayList<Ex24_VO>) ois.readObject();
			
			//for문이나 Iterator를 사용
			System.out.println("이름\t나이\t체중\t성별");
			for (Ex24_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				boolean b = k.isGender();
				if(b) {
					System.out.println("남성");
				}else {
					System.out.println("여성");
				}
			}
			
		} catch (Exception e) {
		}finally {
			try {
				
				ois.close();
				bis.close();
				fis.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
