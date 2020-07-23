package com.kh.a_2;

import java.util.Scanner;

public class A1 {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("num : ");
		num = sc.nextInt();

		if(num < 1) {
			System.out.println("마이너스입니다.");
		}else {
			if((num==4)||(num==5)) {
				System.out.println(num + "입니다.");
			}else {
				if((num%2) == 0 ) {
					System.out.println("짝수입니다");
				}else {
					System.out.println("홀수입니다.");
				}
			}
		}

		if((0 < num) && (num < 10)){
			System.out.println("한자리입니다.");
		}else if(num < 100) {
			System.out.println("두자리입니다.");
		}else if(num < 1000) {
			System.out.println("세자리입니다.");
		}else{
			System.out.println("그 외입니다.");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);

		String name;

		System.out.print("동물 이름 : ");
		name = sc.nextLine();

		switch (name) {
		case "사자": System.out.println("동물의 왕"); break;
		case "호랑이":case "고양이": System.out.println("포유류");break;
		case "개구리": System.out.println("양서류");break;
		case "고슴도치": System.out.println("가시맨");break;
		case "고릴라": System.out.println("초식동물");break;
		case "모기":break;

		default: System.out.println("미지의 동물");
		break;
		}

	}
	public void test3() {

		int result = 0;

		for(int i = 0; i <= 100; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
				result += i;
			}

		}

		for(int i = 0; i <= 10; i++) {
			result -= 10;
		}
		System.out.println(" ");
		System.out.println(result);
	}
	public void test4() {
		int sum;

		int dan = 2;
		while (dan <= 19) {

			int su = 1;
			while (su <= 19) {
				sum = dan * su;
				if(dan == 4) {

				}else {
					if(sum == 22) {
						System.out.println(dan + " * " + su + " = 이십이");
					}else if(sum == 63) {
						System.out.println(dan + " * " + su + " = 육십삼");
					}else if(sum == 133) {
						System.out.println(dan + " * " + su + " = 백삼십삼");
					}else {
						System.out.println(dan + " * " + su + " = " + sum);
					}
				}
				su++;
			}
			dan++;
		}
	}

	public static void main(String[] args) {
		A1 a = new A1();

		a.test1();
		a.test2();
		a.test3();
		a.test4();
	}

}
