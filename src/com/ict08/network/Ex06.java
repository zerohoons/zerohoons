package com.ict08.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*
 * XML Parsing (파싱) : 데이터를 분해해서 원하는 데이터를 추출하는 것
 * XML Parser(파서) : Parsing을 하는 프로그램.*/
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		//파싱하기. 3단계에 나누어서 진행된다. : 아래 정보 읽어오기 이후 진행.
				//1. 페이지에 접근할 도큐먼트 객체 생성
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				
				//factory를 이용해서 도큐먼트 빌더 생성
				DocumentBuilder builder = null;
				
				//파싱하기 위한 문서 만들기
				Document document = null;
				
				String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"파싱1.txt";
				File file = new File(pathname);
				FileWriter fw = null;
				BufferedWriter bw =null;
		
		try {
			//url 정보 전부 읽어오기
			
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection uc = url.openConnection();
			br = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine())!=null) {
				sb.append(msg+ "\n");
			}
//			System.out.println(sb.toString());
			//StringBuffer 에 저장된 내용 읽기.
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			//파싱하기.
			//1. 도큐먼트 객체 생성
			builder = factory.newDocumentBuilder();
			document = builder.parse(is); //저장된 내용을 해석하고 분해하기.
			
			//태그와 속성, 텍스트 구하기.
			//1) local 테그 추출하기. (여러개일경우 배열에 저장된다.)
			NodeList local = document.getElementsByTagName("local"); //태그네임 구하기.
			
			//2) for문을 이용해 local 갯수만큼 반복하자. -> 사스방식
			//반복 전, 추출해서 저장할 장소 마련하기.
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < local.getLength(); i++) {
				//태그에 있는 글자를 추출하자.: (local.item(i).getFirstChild().getNodeValue()+ ",		");
				sb2.append(local.item(i).getFirstChild().getNodeValue()+ ",	");
				//태그의 속성 추출 :(((Element)(local.item(i))).getAttribute("")+",		");
				sb2.append(((Element)(local.item(i))).getAttribute("ta")+",	");
				sb2.append(((Element)(local.item(i))).getAttribute("desc")+"\n");
				
			}
			
			//출력하기
			System.out.println(sb2.toString());
			
			//파일로 저장하기.
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb2.toString());
			bw.flush();
			
		} catch (Exception e) {
		}finally {
			try {
				bw.close();
				fw.close();
				br.close();
				
			} catch (Exception e2) {
			}
		}
	}
}
