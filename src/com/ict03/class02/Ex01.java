package com.ict03.class02;

import java.util.Calendar;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		// String Ŭ����
		String str1 = "abc";

		char[] data = { 'a', 'b', 'c' };
		String str2 = new String(data); //�迭�� �״�� String ������ ���� �� ����

		byte[] data2 = { 97, 98, 99 };
		String str3 = new String(data2);

		String str4 = new String("abc");
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

		System.out.println("=== �ֿ� �޼ҵ� ===");
		String msg = "�ѱ� ICT ���� ���߿� 1������";
		// 1. charAt(int index) : char
		// ��ġ���� �޾Ƽ� �� ��ġ�� �����ϴ� ���ڸ� ��ȯ�Ѵ�.
		// �̶� ��ġ��(index�� 0�����̴�.)
		char c1 = msg.charAt(7); // ��
		System.out.println(c1);

		// ����) ���� ���ڵ� �߿� �ҹ��ڸ� �빮�ڷ� �����Ͻÿ�
		// ��Ʈ) a�� 97, A�� 65 �̴�. (���̴� 32)
		msg = "���� I Love You 123";
		// ���ڿ��� ���̸� ������ : length() : int
		System.out.println(msg.length());
			for (int i = 0; i < msg.length(); i++) {
				char c2 = msg.charAt(i);
				if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char) (c2 - 32);
				}
				System.out.print(c2);
			}
		System.out.println();

				// 2. concat(String str) : String
				// ������ ���ڿ��� �� ���ڿ� ���� �����մϴ�.
				String msg1 = "���ѹα�";
				String msg2 = "KOREA";
				String msg3 = msg1.concat(msg2);
				System.out.println(msg3);
				System.out.println(msg1 + msg2);

				// 3. contains(String s) : boolean
				// ���� ���ڿ��� �ش繮�ڿ��� �����ϸ� true, �������� ������ false
				msg = "���� I Love You 123";
				// boolean b1 = msg.contains("You");
				boolean b1 = msg.contains("YOU");
				if (b1) {
					System.out.println("���ԵǾ� �ִ�.");
				} else {
					System.out.println("���ԵǾ� ���� �ʴ�.");
				}

				// 4. equals(Object anObject) : boolean
				// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��� ����)
				// 5. equalsIgnoreCase(String anotherString) ; boolean
				// ���� ���ڿ��� ���� ���ڿ��� ������ true, �ٸ��� false (��ҹ��� ��������)
				// ** ����) ���ڿ��̳� ��ü�� ���Ҷ� '==' �� ����ϸ� ������ ����? �ƴ϶� �ּҰ� ����?
				// ���ڿ����� '==' ����ϸ� �ȵ�, equals �Ǵ� equalsIgnoreCase�� ����ؾ� �ȴ�.

				String s1 = "Korea";
				String s2 = "KOREA";
				String s3 = new String("Korea");
				String s4 = new String("Korea");

				System.out.println(s1 == s2); // false
				System.out.println(s2 == s3); // false
				System.out.println(s3 == s4); // false
				System.out.println();
				System.out.println(s1.equalsIgnoreCase(s2));
				System.out.println(s1.equalsIgnoreCase(s3));
				System.out.println(s1.equalsIgnoreCase(s4));
				System.out.println();

				s1 = "seoul";
				s2 = "seoul";
				System.out.println(s1 == s2); // �ּҰ� ����?
				System.out.println(s1.equalsIgnoreCase(s2)); // ������ ����?

				// 6. format(String format, Object... args) : static String
				// ������ �����ϰ� ���Ŀ� �°� ����
				// %s �� ���ڿ�, %d�� ����, %f �Ǽ�(�ݿø� �ȴ�.)
				String msg4 = "�ѱ� ICT ���� ���߿�";
				int s5 = 14;
				double s6 = 89.167;
				String msg5 = msg4.format("%s�� ���۳⵵�� %d�� �̰� ��������� %.2f�̴�.", msg4, s5, s6);
				System.out.println(msg5);

				// 7. getBytes() : byte[]
				// �ش� ���ڿ��� byte[]�� �����Ų��.
				// ���� ��/��� ��Ʈ���Ҷ� ����Ѵ�. (������ ��ҹ��ڿ� ���ڸ� ����)
				String msg6 = "java";
				byte[] b = msg6.getBytes();
				for (int i = 0; i < b.length; i++) {
					System.out.println((char) (b[i]) + ":" + b[i]);
				}

				// �ݴ�� �ش� byte �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
				String msg7 = new String(b);
				System.out.println(msg7);

				// 8. toCharArray() : char[]
				// �ش� ���ڿ��� char[]�� �����Ų��.
				// ���� ��/��� ��Ʈ���Ҷ� ����Ѵ�. (�� ���� ��� ���� ����)
				String msg8 = "�ڹ�8 java8 �������� 123 ";
				char[] c = msg8.toCharArray();
				for (int i = 0; i < c.length; i++) {
					System.out.println(c[i]);
				}

				// �ݴ�� �ش� char �迭�� ���ڿ��� ������� �ִ�.(String �������̿�)
				String msg9 = new String(c);
				System.out.println(msg9);

				// 9. indexOf(int ch) : int
				// ���ڸ� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
				// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.

				// 10. indexOf(int ch, int fromIndex) :int
				// ���ڿ� ������ġ�� �޾Ƽ� �ش� ������ ��ġ���� ǥ��
				// ã�� ���ڰ� ������ -1�̴�.

				// 11. indexOf(String str) : int
				// ���ڿ��� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
				// ������ġ�� ó������, ã�� ���ڰ� ������ -1�̴�.

				// 10. indexOf(String str, int fromIndex) :int
				// ���ڿ��� ������ġ�� �޾Ƽ� �ش� ���ڿ��� ��ġ���� ǥ��
				// ã�� ���ڰ� ������ -1�̴�.

				String msg10 = "BufferedReader";
				// 'e'�� ã�ƶ�
				int k1 = msg10.indexOf('e'); // 4
				System.out.println(k1);

				// �ι�° 'e'�� ã�ƶ� :
				// ù��° 'e'�� 4�̹Ƿ� 5���� ã�ƾ� �ȴ�.
				// k1 = msg10.indexOf('e', 5);
				k1 = msg10.indexOf('e', msg10.indexOf('e') + 1);
				System.out.println(k1);

				// ����° 'e'�� ã�ƶ� :
				// �ι�° 'e'�� 6�̹Ƿ� 7���� ã�ƾ� �ȴ�.
				k1 = msg10.indexOf('e', msg10.indexOf('e', msg10.indexOf('e')+1)+1);
				System.out.println(k1);
				
				// ���� ���� ã��('A')
				k1 = msg10.indexOf('A');
				System.out.println(k1);     //-1
				
				b1 = msg10.contains("A");
				System.out.println(b1);   // false
				
				// char���� String���� ã��
				k1 = msg10.indexOf("er");
				System.out.println(k1); 
				
				// �ι�° "er" ã�� 
				k1 = msg10.indexOf("er",msg10.indexOf("er")+1);
				System.out.println(k1);
				
				// 11. lastIndexOf(int ch) : int
				//     lastIndexOf(String str) : int
				//     ã�� ������ ���ڳ� ���ڿ��� ��ġ�� ǥ��
				k1 = msg10.lastIndexOf('e');
				System.out.println(k1);
				
				k1 = msg10.lastIndexOf("er");
				System.out.println(k1);
		
	
		k1 = msg10.indexOf("er");//ó������ ������ er ã��
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
