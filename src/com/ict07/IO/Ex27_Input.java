package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex27_Input {
	public static void main(String[] args) {
		String path = "C:" + File.separator + "Study_YH"+File.separator+"util"+File.separator + "ict09.ser";
		File file = new File(path);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex27_VO> list = (ArrayList<Ex27_VO>) ois.readObject();
			
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			for (Ex27_VO k : list) {
				//총점, 평균, 학점 구하기
				k.setSum(k.getEng()+k.getKor()+k.getMath());
				k.setAvg(((double)((k.getSum()*10)/3)/10.0));
				if (k.getSum() >= 90) {
					k.setRank("A");
				}else if(k.getSum()>=80) {
					k.setRank("B");
				}else if (k.getSum()>=70) {
					k.setRank("C");
				}else {
					k.setRank("D");
				}
				System.out.print(k.getName()+"\t");
				System.out.print(k.getKor()+"\t");
				System.out.print(k.getEng()+"\t");
				System.out.print(k.getMath()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getRank());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
