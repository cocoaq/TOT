package com.kh.a_2.A2;

import java.util.Scanner;

public class LoopPractice {

	public void start() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num ; i++) {
			if(i%3 == 0) {
				System.out.println(i + "는 3의 배수입니다.");
			}else {
				System.out.println(i);
			}
		}
	}

}
