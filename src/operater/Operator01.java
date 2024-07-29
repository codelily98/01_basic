package operater;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현금 입력 : ");
		int money = sc.nextInt();
		
		sc.close();
		
		int money_1000, money_100, money_10, money_1;
		
		money_1000 = money / 1000;
		money_100 = money / 100 % 10;
		money_10 = money / 10 % 10;
		money_1 = money % 10;
		
		System.out.println("천원 : " + money_1000 + "장");
		System.out.println("백원 : " + money_100 + "개");
		System.out.println("십원 : " + money_10 + "개");
		System.out.println("일원 : " + money_1 + "개");		
	}
}

/*
[문제] 동전 교환
현금을 입력하여 천, 백, 십, 일의 개수를 구하시오

[실행결과]
현금 입력 : 5723
천원 : 5장
백원 : 7개
십원 : 2개
일원 : 3개
*/