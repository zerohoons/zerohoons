package com.ict03.class02;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02 {
	public static void main(String[] args) {
		//��¥ ���� Ŭ���� : ���� ����ϰ� �ִ� ��ǻ�� ����.
		/* Date Ŭ����
		 * Calendar Ŭ���� */
		
		//Date Ŭ����
		Date date = new Date();
		System.out.println(date); //KST == Korea Standard Time
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd hh:mm:ss EEE"); //������ ������ ����
		System.out.println(dateFormat.format(date)); //�Է�
		
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yy.M.d hh:mm:ss EEE"); //������ ������ ����
		System.out.println(dateFormat2.format(date)); //�Է�
		
		//��, ��, ��, ��, ��, ��, ���� ���� ���ϱ�
		
		System.out.println(date.getYear()+ 1900 + "�⵵"); //Calendar.get((Calendar.Year) == ���翬�� - 1900���� ������.
		System.out.println(date.getMonth()+ 1 + "��"); // 0 - 11 ������ ����
		System.out.println(date.getDate() + "��"); 
		System.out.println(date.getHours()+ "��"); 
		System.out.println(date.getMinutes()+ "��"); 
		System.out.println(date.getDay()); // ���� ( 0 == �Ͽ��� ~ 6 == �����) 
		
		System.out.println("========================================================================");
		
		/*Calendar Ŭ����
		 * ���� ��¥�� �ð��� ���� ���� new ���� ������� �ʰ� ��ü�� ����
		 * YY,MM,DD,hh,mm,ss�� ���� �� Calendar.get(Calendar.���)�� ���.*/
		
		System.out.println(Calendar.getInstance().get(Calendar.YEAR)+"�⵵");
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR)+"�⵵");
		System.out.println(now.get(Calendar.MONTH)+1+"��"); //Month�� 0-11 ���� ����
		System.out.println(now.get(Calendar.DATE)+"��");
		System.out.println(now.get(Calendar.DAY_OF_WEEK)+"����");
		
		//�ð� ; 12�ð��� 24�ð���
		System.out.println(now.get(Calendar.HOUR)+ "��"); //12�ð���
		System.out.println(now.get(Calendar.HOUR_OF_DAY)+ "��"); //24�ð���
		
		//AM/PM ���ϱ�
		int res = now.get(Calendar.AM_PM);
		if(res==0) {
			System.out.println("AM " + now.get(Calendar.HOUR));
		} else if (res==1) {
			System.out.println("PM " + now.get(Calendar.HOUR));
		}
		
		//���� (1~7 ��~��) Date�� ��� 0~6�̴�.
		
		int res2 = now.get(Calendar.DAY_OF_WEEK);
		switch(res2) {
		case 1: System.out.println("�Ͽ���"); break;
		case 2: System.out.println("������"); break;
		case 3: System.out.println("ȭ����"); break;
		case 4: System.out.println("������"); break;
		case 5: System.out.println("�����"); break;
		case 6: System.out.println("�ݿ���"); break;
		case 7: System.out.println("�����"); break;
		}
		
	}
}
