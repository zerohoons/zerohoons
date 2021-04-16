package com.ict08.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

/*
 * JSON �Ľ�
 */
public class Ex07 {
	public static void main(String[] args) {
		BufferedReader br = null;
	//url ���� ���� �о����
	try {
		
	URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
	URLConnection uc = url.openConnection();
	br = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
	String msg = null;
	StringBuffer sb = new StringBuffer();
	while ((msg=br.readLine())!=null) {
		sb.append(msg+ "\n");
	}
	
	//JSON �Ľ��ϱ�.
	//JSON �ļ� ã��. - �ʿ��� �ڷ��� ��ġ���� ���� get�ϸ鼭 ������.
	JSONParser j_parser = new JSONParser();
	JSONObject j_obj1 = (JSONObject) j_parser.parse(sb.toString()); //������ �ڷ����� ���缭 JSONObject  ����� 
	JSONObject j_obj2 = (JSONObject) j_obj1.get("SeoulLibraryTime");
	JSONArray j_arr = (JSONArray) j_obj2.get("row");
	
	StringBuffer sb2 = new StringBuffer();
	for (int i = 0; i < j_arr.size(); i++) { //�迭�� size!
		JSONObject j_obj3 = (JSONObject) j_arr.get(i);
		String name = (String) j_obj3.get("LBRRY_NAME");
		String num = (String) j_obj3.get("TEL_NO");
		if(num.isEmpty()) {
			num = "��ȭ��ȣ ����";
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
