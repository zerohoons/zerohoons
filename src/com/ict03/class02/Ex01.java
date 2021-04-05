package com.ict03.class02;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		String msg = "";
		
		String msg10 = "ButteredReader";
		int k1 = msg10.indexOf("er");//ó������ ������ er ã��
		System.out.println(k1);
		k1 = msg10.indexOf("er",msg10.indexOf("er")+1);//�ι�° ������ er ã��
		System.out.println(k1);
		k1 = msg10.lastIndexOf("er");
		System.out.println(k1);
		
		boolean k2 = msg10.contains("e");
		System.out.println(k2);
		
//12. isEmpty() : boolean == ����ִ�? -> ��������� true
		String msg11 = "";
		String msg12 = "java";
		
		System.out.println(msg11.isEmpty()); //null ������ ���Ұ�
		System.out.println(msg12.isEmpty());

//13. length() : int
//	  ���ڿ��� ���̸� ���ڷ� ǥ��
		
		System.out.println(msg11.length());
		System.out.println(msg12.length());
		System.out.println();
		
/*14. replace(char oldChar, char newChar)
 * 	  replace(String target, String replacement)
 * 	  ���ڳ� ���ڿ��� �޾Ƽ� ġȯ => String 
 * 	  char -> char / String -> String. ��ȣ ��ȯ�� �Ұ���*/
		String msg13 = "���ѹα�";
		String msg14 = msg13.replace("���ѹα�","Korea");
		String msg15 = msg13.replace('��','��'); 
		System.out.println(msg13);
		System.out.println(msg14);
		System.out.println(msg15);

/* 15. split(String regex) : String[]
 *	-> �����ڸ� �޾Ƽ� �迭�� ������. (�迭ũ��� �ڵ�����)
 *	   split(String regex, int limit) : String[]
 *	-> �����ڸ� �޾� �迭�� ������. �� limit �� �迭 ũ��.*/

		String msg17 = "���, ����, ����, ������, ���ξ���";
		String [] res = msg17.split(","); // ���� ���� ������ �־���.
		
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		System.out.println();
		String [] res2 = msg17.split(",", 2);
// , �������� �ϵ� �ΰ��� ������ ������ ù , ���İ� ���� �ϳ���
		for (int i = 0; i < res2.length; i++) {
			System.out.print(res2[i] + " / ");
		}
		System.out.println();
		String [] res3 = msg17.split(",", 3);
		for (int i = 0; i < res3.length; i++) {
			System.out.print(res3[i] + " / ");
		}
		System.out.println();
		
// ����(,)�� �������� ���� ���� ������ �䱸���� �� -> �����Ѹ�ŭ�� ����.
		String[]res4 = msg17.split(",", 10);
		for (int i = 0; i < res4.length; i++) {
			System.out.print(res4[i]+ " / ");
		} System.out.println();

/* 16. substring(int beginIndex) : String
*	-> ������ġ�� �޾�, �ش� ���ڿ� ������ ���ڿ��� ����
*	   substring(int beginIndex, int endIndex)
*	   �ù���ġ�� �޾� �� ��ġ ������ �ش� ���ڿ� ����*/
		
		String msg18 = "����-�ٶ�-���ٻ�";
		System.out.println(msg18.substring(2));
		System.out.println(msg18.substring(2, 7)); // �� ��ġ�� "��" ���� �ȵ�. ���ڿ� ���̸� �Է��ϸ� ������ ����.
		System.out.println(msg18.substring(msg18.indexOf("-")+1,msg18.lastIndexOf("-")));
		
		String msg19 = "000301";
		//�¾ ���� ����
		String res7 = msg19.substring(0, 2);
		System.out.println();
		//�¾ �� ����
		String res8 = msg19.substring(2, 4);
		
		//Q) 010 - 7777 - 9999 -> 010 - XXXX - 9999 / 010 - 7777 - XXXX
		String quiz = "010-7777-9999";
		String[] anser = quiz.split("-");
		anser[1] = anser[1].replace(anser[1],"XXXX");
		for (int j = 0; j < anser.length; j++) {
			System.out.print(anser[j]);
		}
		System.out.println();
//		String anser3 = anser[0]+ "anser[2]"+ anser[2]);
		
/* 17/18. toLowercase / toUppercase
 * 		-> �ش� ���ڿ��� ��� ���ڸ� ���� ( �빮�� -> �ҹ��� / �ҹ��� -> �빮�� ) */
		
		String msg20 = "�ڹ�8 java8 JAVA8";
		String res9 = msg20.toLowerCase();
		String res10 = msg20.toUpperCase();
		
		System.out.println(res9);
		System.out.println(res10);
/* 19. toString() : String
 *	-> String�� toString : ���ڿ� ��ü�� ��ȯ
 *	-> Object�� toString : ��� ��ü���� ��밡��. ��ü�� ������ ������ ���ڿ��� ������ �� ���. (�������̵����� �̿�) */
		
		String msg21 = "java8 JAVA8 �ڹ�8";
		String res11 = msg21.toString();
		System.out.println(msg21);
		System.out.println(res11);
/* 20. trim() : String
 * 	-> �ش� ���ڿ� ��, �ڿ� �ִ� ������ ����. �߰��� ���ž���.*/
		
		String msg22 = "                 java �ڹ�      JAVA         ";
		System.out.print(msg22);
		System.out.println(" : "+msg22.length());
		System.out.print(msg22.trim());
		System.out.println(" : "+msg22.trim().length());
/* 21. valueOf(�����ڷ���) : static String
 *	-> � �ڷ����̵��� String ���� �����Ų��. */
		boolean p1 = true;
		char p2 = 'd';
		int p3 = 100;
		long p4 = 10l;
		float p5 = 100.0f;
		double p6 = 100.0;
		
		//���� �ڷ����� +1
		
		//System.out.println(p1+1); ���� -> boolean�� ���� �Ұ�.
		System.out.print("boolean" + "/ "); //char + ���� = ����
		System.out.print(p2+1 + " / "); //char + ���� = ����
		System.out.print(p3+1 + " / ");
		System.out.print(p4+1 + " / ");
		System.out.print(p5+1 + " / ");
		System.out.println(p6+1 + " / ");
		System.out.print(String.valueOf(p1)+1 + " / "); 
		System.out.print(String.valueOf(p2)+1 + " / "); 
		System.out.print(String.valueOf(p3)+1 + " / ");
		System.out.print(String.valueOf(p4)+1 + " / ");
		System.out.print(String.valueOf(p5)+1 + " / ");
		System.out.println(String.valueOf(p6)+1 + " / ");
		
/*  Wrapper Class : valueOf�� �ݴ뿪��. (���� �ڷ����� �� �ٸ� �ڷ������� ����.)
 * 	-> Boolean, Integer, Double (Byte, Short, Long, Float, Character�� ����� ��)
 * 	-> �� �ڷ����� ���¸� ���� ���ڿ��� ��¥ �ڷ������� �����Ű�� Ŭ����.
 * 	-> ���� �ǹ̴� �⺻�ڷ����� ��ü�� ���� �� ����ϴ� Ŭ����. 
 * 	-> �⺻ �ڷ��� -> ��ü������ �ڵ� ���� : ����ڽ�
 * 	-> ��ü�� -> �⺻ �ڷ������� �ڵ� ���� : �����ڽ� */ 

//  1) boolean ������ String�� Boolean(Ŭ����) ������ ����.
//		-> Boolean.parseBoolean("true" / "false")�� �̿��� boolean���� ����
//		-> �̶� String ���� true �� false�� ������ ���̶��, ���� false������ ����.
		msg = "true";
		/*	boolean ���� �ƴϱ⿡ ������ �߻�
		 *  if(msg){
		 *  	break;
		 *  }
		 */
		
		//boolean a1 = Boolean.parseBoolean(msg); //parseBoolean �� static �޼ҵ��̱� ������ Ŭ���� ���� �ʿ����.
		
		if( Boolean.parseBoolean(msg)) {
			System.out.println("���漺��");
		}
		
//	2) int ������ String�� int������ ���� : Integer.parseInt(String s)
		
		msg = "100";
		int a2 = Integer.parseInt(msg);
		System.out.println(msg + 1);
		System.out.println(a2 + 1);
		
//	3) double ������ String �� double�� ���� : Double.parseDouble(string s)
		
		msg = "100.00";
		double a3 = Double.parseDouble(msg);
		System.out.println(msg + 1);
		System.out.println(a3 + 1);
		
//	4) char ������ String�� char ������ ������ �� �ִ� �޼ҵ�� ������������.
// 		-> Character Ŭ������ ������.
//		-> ���ڿ����� charAt(��ġ��)�� �̿��ϸ� ������ �����ϴ�.
		
		msg = "c";
		char a4 = msg.charAt(0); //char�� �ٲ� ���� ��ġ�� �Է�
		
		System.err.println(msg + 10);
		System.err.println(a4 + 10);

		//Q) �ֹι�ȣ ���ڸ��� �޾��� �� ���̸� ������.
		Scanner sc = new Scanner(System.in);
		String jumin = sc.next();
		String gender = "1";
		
		//���� ���ڸ�
		String year = jumin.substring(0,2);
		
		//19�� 20�� ���̱�.
		
		if(gender == "1" || gender.equals("2")) {
			year = "19" + year;
		}else if(gender == "3" || gender.equals("4"))  {
			year = "20" + year;
		}
		
		//���� ���ϱ�.
		
		int age = Calendar.getInstance().get(Calendar.YEAR) - Integer.parseInt(year) + 1;
		System.out.println(age);

		
	}
}
