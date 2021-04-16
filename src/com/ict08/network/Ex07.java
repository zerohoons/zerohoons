package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * JSON 파싱
 */
public class Ex07 {
	public static void main(String[] args) {
		BufferedReader br = null;
	//url 정보 전부 읽어오기
	try {
		
	URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
	URLConnection uc = url.openConnection();
	br = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
	String msg = null;
	StringBuffer sb = new StringBuffer();
	while ((msg=br.readLine())!=null) {
		sb.append(msg+ "\n");
	}
	
	//JSON 파싱하기.
	//JSON 파서 찾기. - 필요한 자료의 위치까지 직접 get하면서 들어가야함.
	JSONParser j_parser = new JSONParser();
	JSONObject j_obj1 = (JSONObject) j_parser.parse(sb.toString()); //추출한 자료형에 맞춰서 JSONObject  만들기 
	JSONObject j_obj2 = (JSONObject) j_obj1.get("SeoulLibraryTime");
	JSONArray j_arr = (JSONArray) j_obj2.get("row");
	
	StringBuffer sb2 = new StringBuffer();
	for (int i = 0; i < j_arr.size(); i++) { //배열은 size!
		JSONObject j_obj3 = (JSONObject) j_arr.get(i);
		String name = (String) j_obj3.get("LBRRY_NAME");
		String num = (String) j_obj3.get("TEL_NO");
		if(num.isEmpty()) {
			num = "전화번호 없음";
		}
		String addr = (String) j_obj3.get("ADRES");
		
		sb2.append(name+ "\t"+ "\t"+ "\t");
		sb2.append(addr+ "\t"+ "\t");
		sb2.append(num+ "\n");
	}
	
	System.out.println(sb2.toString());
	
	} catch (Exception e) {
		System.out.println(e);
	}finally {
		try {
			br.close();
		} catch (Exception e2) {
	System.out.println(e2);
		}
	}
	}
}
