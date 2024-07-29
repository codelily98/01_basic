package basic;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	// 키보드를 통해서 입력할 수 있는 클래스 생성
		System.out.print("정수형 데이터 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("실수형 데이터 입력 : ");
		double b = sc.nextDouble();
		
		sc.close();
		
		System.out.println("정수형 데이터는 " + a + "이고, 실수형 데이터는 " + b + "입니다.");
		System.out.println(a + " + " + b + " = " + (a + b));
	}

}
