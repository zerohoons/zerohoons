package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

//��ü ����ȭ : ObjectOuputStream -> writeObject();
public class Ex23_Output {
	public static void main(String[] args) {
		// ����ȭ : Ư�� Ŭ����(Ex23_VO)�� ��ü�� ����� Ư�� ��ġ�� .ser �� ����� ����.
		//		  : ��ü���� ������ �ִ� ������ ����ȭ �Ǿ��ִ�. (������ ����� �� �� ����. ���� Ȯ���� Input�� ����)
		
		//Ư�� ��ġ ���ϸ� ����
		String pathname = "c:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"ict07.ser";
		File file = new File(pathname);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos); //Stream�� �տ� ���� ���� ��Ű�� ��� : ü�ι��
			
			//��ü ����ȭ�� �ϱ� ���� ��ü ����.
			
			Ex23_VO vo =new Ex23_VO("�Ѹ�", 28, 80.95, true);
			
			//��ü ����ȭ
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
