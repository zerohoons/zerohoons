package com.ict07.IO;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

//��ü ����ȭ : ObjectOuputStream -> writeObject();
public class Ex24_Output {
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
			
			Ex24_VO vo =new Ex24_VO("�Ѹ�", 28, 80.95, true);
			Ex24_VO vo1 =new Ex24_VO("��浿", 56, 77.43, true);
			Ex24_VO vo2 =new Ex24_VO("�����", 15, 27.56, true);
			Ex24_VO vo3 =new Ex24_VO("������", 34, 54.38, true);
			Ex24_VO vo4 =new Ex24_VO("��ġ", 24, 90.2, false);
			Ex24_VO vo5 =new Ex24_VO("����", 2, 8.7, true);
			
			//��ü�� �迭�̳� �÷��ǿ� ���� �� �ִ�.
			//�Ʒ��� ������ ��ȣȭ : encoding �̶�� �θ�.
			
			ArrayList<Ex24_VO> list = new ArrayList<Ex24_VO>();
			list.add(vo);
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			
			//��ü ����ȭ
			oos.writeObject(list);
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
