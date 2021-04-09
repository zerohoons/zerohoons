package com.ict07.IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Ex25_Input {
	public static void main(String[] args) {
		//파일 위치 입력
		String pathname = "C:"+File.separator + "Study_YH"+File.separator+"util"+File.separator+"성적.ser";
		File file = new File(pathname);
		
		//역직렬화 출력문 입력
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			ArrayList<Ex25_VO> list = (ArrayList<Ex25_VO>) ois.readObject();

//			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
//			for (Ex25_VO k : list) {
//				
//				System.out.print(k.getName()+"\t");
//				System.out.print(k.getKor()+"\t");
//				System.out.print(k.getEng()+"\t");
//				System.out.print(k.getMath()+"\t");
//				System.out.print(k.getSum()+"\t");
//				System.out.print(k.getAvg()+"\t");
//				System.out.println(k.getHak());
//			}

			//정렬하는 법.
			//Collection을 배열로 변경해서 정렬
			Ex25_VO[] arr = (Ex25_VO[]) list.toArray(new Ex25_VO[0]); //toArray 안쪽에 배열을 잡아줘야한다. 0으로!
			Ex25_VO tmp = new Ex25_VO(); //임시저장할곳
			for (int i = 0; i < arr.length; i++) {
				for (int j = i+1; j < arr.length; j++) {
					if(arr[i].getSum()<=arr[j].getSum()) {
						tmp = arr[i];
						arr[i] = arr[j];
						arr[j] = tmp;
					}
				}
			}
			System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t학점");
			for (Ex25_VO k : arr) {
				
				System.out.print(k.getName()+"\t");
				System.out.print(k.getKor()+"\t");
				System.out.print(k.getEng()+"\t");
				System.out.print(k.getMath()+"\t");
				System.out.print(k.getSum()+"\t");
				System.out.print(k.getAvg()+"\t");
				System.out.println(k.getHak());
			}
			
			
		} catch (Exception e) {
		}finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
	}
}
