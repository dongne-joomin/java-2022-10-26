package com.kor.java.proj;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("== 프로그램 시작 ==");
		Scanner sc = new Scanner(System.in);
		// Scanner : 입력값을 받음 
		// System.in : 키보드의 입력값
		System.out.printf("명령어를 입력 : ");
		String command;
		
		command = sc.nextLine(); // 줄전체를 입력받아 출력
		System.out.printf("입력된 명령어 : %s\n ", command);
		command = sc.next(); // null값까지 받아 출력
		System.out.printf("입력된 명령어 : %s\n ", command);
		command = sc.next();
		System.out.printf("입력된 명령어 : %s\n ", command);
		
		sc.close();
		System.out.println("== 프로그램 끝 ==");
	}
}
 