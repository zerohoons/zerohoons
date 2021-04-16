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
 * XML Parsing (�Ľ�) : �����͸� �����ؼ� ���ϴ� �����͸� �����ϴ� ��
 * XML Parser(�ļ�) : Parsing�� �ϴ� ���α׷�.*/
public class Ex06 {
	public static void main(String[] args) {
		BufferedReader br = null;
		
		//�Ľ��ϱ�. 3�ܰ迡 ����� ����ȴ�. : �Ʒ� ���� �о���� ���� ����.
				//1. �������� ������ ��ť��Ʈ ��ü ����
				DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
				
				//factory�� �̿��ؼ� ��ť��Ʈ ���� ����
				DocumentBuilder builder = null;
				
				//�Ľ��ϱ� ���� ���� �����
				Document document = null;
				
				String pathname = "C:"+File.separator+"Study_YH"+File.separator+"util"+File.separator+"�Ľ�1.txt";
				File file = new File(pathname);
				FileWriter fw = null;
				BufferedWriter bw =null;
		
		try {
			//url ���� ���� �о����
			
			URL url = new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection uc = url.openConnection();
			br = new BufferedReader(new InputStreamReader(uc.getInputStream(),"utf-8"));
			String msg = null;
			StringBuffer sb = new StringBuffer();
			while ((msg=br.readLine())!=null) {
				sb.append(msg+ "\n");
			}
//			System.out.println(sb.toString());
			//StringBuffer �� ����� ���� �б�.
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			//�Ľ��ϱ�.
			//1. ��ť��Ʈ ��ü ����
			builder = factory.newDocumentBuilder();
			document = builder.parse(is); //����� ������ �ؼ��ϰ� �����ϱ�.
			
			//�±׿� �Ӽ�, �ؽ�Ʈ ���ϱ�.
			//1) local �ױ� �����ϱ�. (�������ϰ�� �迭�� ����ȴ�.)
			NodeList local = document.getElementsByTagName("local"); //�±׳��� ���ϱ�.
			
			//2) for���� �̿��� local ������ŭ �ݺ�����. -> �罺���
			//�ݺ� ��, �����ؼ� ������ ��� �����ϱ�.
			StringBuffer sb2 = new StringBuffer();
			
			for (int i = 0; i < local.getLength(); i++) {
				//�±׿� �ִ� ���ڸ� ��������.: (local.item(i).getFirstChild().getNodeValue()+ ",		");
				sb2.append(local.item(i).getFirstChild().getNodeValue()+ ",	");
				//�±��� �Ӽ� ���� :(((Element)(local.item(i))).getAttribute("")+",		");
				sb2.append(((Element)(local.item(i))).getAttribute("ta")+",	");
				sb2.append(((Element)(local.item(i))).getAttribute("desc")+"\n");
				
			}
			
			//����ϱ�
			System.out.println(sb2.toString());
			
			//���Ϸ� �����ϱ�.
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
