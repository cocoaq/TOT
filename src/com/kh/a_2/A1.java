package com.kh.a_2;

import java.util.Scanner;

public class A1 {

	public void test1() {
		Scanner sc = new Scanner(System.in);
		int num = 0;

		System.out.print("num : ");
		num = sc.nextInt();

		if(num < 1) {
			System.out.println("���̳ʽ��Դϴ�.");
		}else {
			if((num==4)||(num==5)) {
				System.out.println(num + "�Դϴ�.");
			}else {
				if((num%2) == 0 ) {
					System.out.println("¦���Դϴ�");
				}else {
					System.out.println("Ȧ���Դϴ�.");
				}
			}
		}

		if((0 < num) && (num < 10)){
			System.out.println("���ڸ��Դϴ�.");
		}else if(num < 100) {
			System.out.println("���ڸ��Դϴ�.");
		}else if(num < 1000) {
			System.out.println("���ڸ��Դϴ�.");
		}else{
			System.out.println("�� ���Դϴ�.");
		}
	}
	public void test2() {
		Scanner sc = new Scanner(System.in);

		String name;

		System.out.print("���� �̸� : ");
		name = sc.nextLine();

		switch (name) {
		case "����": System.out.println("������ ��"); break;
		case "ȣ����":case "�����": System.out.println("������");break;
		case "������": System.out.println("�缭��");break;
		case "����ġ": System.out.println("���ø�");break;
		case "����": System.out.println("�ʽĵ���");break;
		case "���":break;

		default: System.out.println("������ ����");
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
						System.out.println(dan + " * " + su + " = �̽���");
					}else if(sum == 63) {
						System.out.println(dan + " * " + su + " = ���ʻ�");
					}else if(sum == 133) {
						System.out.println(dan + " * " + su + " = ���ʻ�");
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
