package com.kh.a_1.A3;

import java.util.Scanner;

public class OperatorPractice {
	public void score() {
	int sco1 = 0;
	int sco2 = 0;
	String score = "";
	
	Scanner sc = new Scanner(System.in);
	
	System.out.print("�����ذ� �ó����� ���� ���� : ");
	sco1 = sc.nextInt();
	System.out.print("������ ���� ���� : ");
	sco2 = sc.nextInt();
	
	System.out.println(
	((sco1 >= 40) && (sco2 >= 40))? ((((sco1+sco2)/2)>=60)? "�հ�":"���հ�"): "���հ�" );
	}

}
