package com.kh.a_1.A4;

import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		String name;
		boolean gender;
		int esco;
		double msco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		name = sc.nextLine();
		System.out.print("�����ΰ�?(true/false)");
		gender = sc.nextBoolean();
		System.out.print("���� ����(����) : ");
		esco = sc.nextInt();
		System.out.print("���� ����(�Ǽ�) : ");
		msco = sc.nextDouble();
		
		System.out.println("�̸� : " + name + ( 
				(gender == true)?" ���� ���� : " + esco : " ���� ���� : " + msco));
	}

}
