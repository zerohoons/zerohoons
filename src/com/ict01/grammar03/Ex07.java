package com.ict01.grammar03;
import java.util.Scanner;
class Ex07 {
	public static void main(String[] args){
	
		//Scanner Ŭ���� �˾�s����
		//Ŭ���� �ȿ��� constructor(������),  method(�޼ҵ�), Field(�ʵ�)
		//java.lang�� �ҼӵǾ� �ִ� Ŭ������ ����� ����������, �̿��� Ŭ������ �Ҽ��� ǥ���ؾ��Ѵ�.
		//�Ҽ��� ǥ���� �� ���� ���� �ٷ� import �̴�. => import.����ϰ��� �ϴ� Ŭ������ �Ҽ�;
	
		Scanner scan = new Scanner(System.in);  //Ű���忡 �Էµ� ������ scan�� ����ȴ�.

		System.out.print("����� �̸� : ");
		
		//����� ������ �������� ��� (������ ������ String���� ����� ��)
		String name = scan.next();  // �⺻�� String������, �տ� �ڷ��� ������, next �ڿ� ���ϴ� �ڷ����� �������ν� �� �ڷ������� ���� �� ����.
						//next�� ��� �Է� ��, ���⸦ �ϸ� �ȵ�.
		
		System.out.print("�������� : "); // ��ó�� int ���� = scan.nextInt �� �� ��� �Է¹��� ���� int�� ��
		int kor = scan.nextInt();

		System.out.print("�������� : ");
		int eng = scan.nextInt();

		System.out.print("�������� : ");
		int math = scan.nextInt();

		int sum = kor+eng+math;
		System.out.println("���� : " + sum);
		
		//���� ������ double��
		System.out.print("����� Ű : ");
		double hei = scan.nextDouble();
		System.out.println(hei);
		
		//���� ������ boolean����
		System.out.print("����� �����Դϱ�? : (true/false) ");
		boolean gender = scan.nextBoolean();
		System.out.println(gender);
		String str = gender ? "�����Դϴ�." : "�����Դϴ�.";
		System.out.println(str);

	}
}