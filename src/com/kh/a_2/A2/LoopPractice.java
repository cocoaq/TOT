package com.kh.a_2.A2;

import java.util.Scanner;

public class LoopPractice {

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�Է��ϼ��� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num ; i++) {
			if(i%3 == 0) {
				System.out.println(i + "�� 3�� ����Դϴ�.");
			}else {
				System.out.println(i);
			}
		}
	}

}
