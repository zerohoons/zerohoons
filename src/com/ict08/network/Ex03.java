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
		URLConnection con = url.openConnection(); //더 많은 정보를 얻기 위해 openConnection을 통해 연결.
		br = new BufferedReader(new InputStreamReader(con.getInputStream(),"utf-8"));
		System.out.println("인코딩 : " + con.getContentEncoding());
		System.out.println("길  이 : " + con.getContentLength());
		System.out.println("문서타입 : " + con.getContentType());
		
		//HTTP 헤더와 바디로 나눠진다.
		//헤더는 HTTP 바디 및 요청/ 응답에 대한 정보를 포함하고 있다.
		//바디는 html코드, 이미지, css, javascript를 포함하고 있다.
		
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
