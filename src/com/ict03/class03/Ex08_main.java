package com.ict03.class03;

public class Ex08_main {
	public static void main(String[] args) {
		//�Ϲ����� ��ü ����
		Ex06_MP3 mp3 = new Ex06_MP3();
		mp3.call();
		System.out.println("���� �� : " + mp3.s_sms);
		mp3.sms(); //�޼ҵ� ����
		System.out.println("���� �� : " + mp3.s_sms);
		
		//�Ϲ����� ��ü����
		Ex07_Dca dca = new Ex07_Dca();
		dca.call();
		System.out.println("���� �� : " + dca.s_sms);
		dca.sms(); //�޼ҵ� ����
		System.out.println("���� �� : " + dca.s_sms);
		
		//��Ӱ��迡���� �θ�Ŭ������ ������ ������ �� �ִ�.
		//��. �ڽ�Ŭ������ �޼ҵ�� ����� �� ����.
		Ex05 p1 = new Ex06_MP3(); //�׷��� ������ ��ü ������ ������ ���� �Ѵ�.
		//-> Ex05 Ŭ������ p1�̶�� ���������� ����� �� ����� Ex06�� ���ؼ� �����.
		
		p1.call();
		p1.sms();
		System.out.println(p1.s_sms);
		
		//p1.sound(); �� �� ���, p1�� Ex06�� ���� �޼ҵ��� sound�� ������ �� ����.
	}
}
