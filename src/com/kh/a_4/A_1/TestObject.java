package com.kh.a_4.A_1;

import java.util.Scanner;

public class TestObject {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름은 : ");
		String name = sc.nextLine();
		
		System.out.print("나이는 : ");
		int age = sc.nextInt();
		
		System.out.print("성별은  : ");
		char gender = sc.next().charAt(0);
		
		sc.nextLine();
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		Student s = new Student(name, age, gender, phone);
		
		System.out.println(s.getInfomation());
		
		
	}

}
