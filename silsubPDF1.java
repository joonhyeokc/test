package com.kh.arrayPractice1.sample;

import java.util.Scanner;

public class silsubPDF1 {

	public void example1() {

		int[] iarr = new int[10];

		for(int i = 0; i < iarr.length; i++) {
			iarr[i] += i+1;
			System.out.println(iarr[i]);
		}

	}

	public void example2() {
		String[] sarr = new String[5];

		sarr[0] = "딸기";
		sarr[1] = "바나나";
		sarr[2] = "복숭아";
		sarr[3] = "키위";
		sarr[4] = "사과";
		System.out.println(sarr[1]);

	}

	public void example3() {

		Scanner sc = new Scanner(System.in);

		int count = 0;

		System.out.print("문자열을 입력 하세요. : ");
		String str = sc.nextLine();
		System.out.print("문자를 입력하세요. : ");
		char ch = sc.next().charAt(0);
		char[] sarr = new char[str.length()];
		for(int i = 0; i < str.length(); i++) {
			sarr[i] = str.charAt(i);
			if(sarr[i] == ch) {
				count++;
			}
		}
		System.out.println("입력하신 문자열 : " + str + " 에서 찾으시는 문자 " + ch + " 는 " +count + "개 입니다.");



	}

	public void example4() {
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록 번호를 입력하세요 : ");
		String ju = sc.nextLine();
		char[] carr = new char[ju.length()];
		String str = "";

		char[] sarr = new char[ju.length()];
		for(int i = 0; i < ju.length(); i++) {
			sarr[i] = ju.charAt(i);
		}
		carr = sarr.clone();
		for(int i = 7; i < ju.length(); i++) {
			carr[i] = '*';
		}
		for(int i = 0; i < ju.length(); i++) {
			if(i == 5) {
				str += carr[i] + "-";
			}else {
				str += carr[i];
			}
		}
		System.out.println("주민등록번호 : " + str);
	}

	public void example5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수인 양의 정수를 입력하세요 . : ");
		int num = sc.nextInt();
		String str = "";
		int sum = 0;
		int[] iarr = new int[num];
		int temp = (num/2)+2;
		if(num % 2 != 0 && num > 0) {

			for(int i = 0; i < num; i++) {
				if(i < (num/2)) {
				iarr[i] = (i+1);
				}
				else {
					iarr[i] = (temp-=1);
				}
			}
		}else {
			System.out.println("홀수인 양의 정수를 입력하세요.");
			return;
		}
		for(int i = 0; i < num; i++) {
			if(i != num-1) {
				str += iarr[i] + ", ";
			}else {
				str += iarr[i];
			}
		}
		System.out.println(str);
	}
}
