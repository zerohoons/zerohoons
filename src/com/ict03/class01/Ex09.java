package com.ict03.class01;

public class Ex09 {
	private String name; //private�ϱ� Ŭ���� ������ ��������
	private int sum;
	private double avg;
	private String hak;
	
	//��� �޼ҵ尡 void �̴�.
	//�̸��ޱ� -> stter Ȱ��
	//�������ϱ� -> 
	public void p_sum(int kor, int eng, int math) {
		sum = kor + eng + math;
	}
	//��ձ��ϱ�
	public void p_avg() {
		avg = ((int)((double)(sum / 3.0)*10))/10;
	}
	//�������ϱ�
		public void p_hak() {
			if(avg>=90) {
				hak = "A";
			}else if(avg>=80) {
				hak = "B";
			}else if(avg>=70) {
				hak = "C";
			}else {
				hak = "F";
			}
		}
	//but ������ ������ ���⼭ �Ұ���!
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	private int rank = 1;
}
