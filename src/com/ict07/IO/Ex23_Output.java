package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//객체 직렬화 : ObjectOuputStream -> writeObject();
public class Ex23_Output {
	public static void main(String[] args) {
		// 직렬화 : 특정 클래스(Ex23_VO)를 객체로 만들어 특정 위치에 .ser 로 만들어 저장.
		//		  : 객체들이 가지고 있는 내용이 직렬화 되어있다. (정보를 제대로 볼 수 없다. 정보 확인은 Input을 통해)
		
		//특정 위치 파일명 지정
		String pathname = "c:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict07.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos); //Stream을 앞에 값과 연결 시키는 방식 : 체인방식
			
			//객체 직렬화를 하기 위한 객체 설정.
			
			Ex23_VO vo =new Ex23_VO("둘리", 28, 80.95, true);
			
			//객체 직렬화
			oos.writeObject(vo);
			oos.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			
			} catch (Exception e2) {
			}
		}
	}
}
