package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Ex03 {
public static void main(String[] args) {
	BufferedReader br = null;
	try {
		URL url = new URL("https://www.naver.com");
		URLConnection con = url.openConnection(); //�� ���� ������ ��� ���� openConnection�� ���� ����.
		br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		System.out.println("���ڵ� : " + con.getContentEncoding());
		System.out.println("��  �� : " + con.getContentLength());
		System.out.println("����Ÿ�� : " + con.getContentType());
		
		//HTTP ����� �ٵ�� ��������.
		//����� HTTP �ٵ� �� ��û/ ���信 ���� ������ �����ϰ� �ִ�.
		//�ٵ�� html�ڵ�, �̹���, css, javascript�� �����ϰ� �ִ�.
		
		Map<String, List<String>> list = con.getHeaderFields();
		for(String k : list.keySet()) {
			System.out.println(list.get(k));
		}
	} catch (Exception e) {
	}finally {
		try {
			br.close();
		} catch (Exception e2) {
		}
	}
}
}
