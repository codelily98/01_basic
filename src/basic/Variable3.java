package basic;

import java.util.Random;

public class Variable3 {
	public static void main(String[] args) {
		double a = Math.random();
		System.out.println(a);
		
		double b = new Random().nextDouble();
		System.out.println(b);
		// int c = a에서 2자리만 출력
		int c = (int)(a * 100);
		System.out.println(c);	// 0 ~ 99 출력
		// x ~ y 사이의 난수를 발생 시키고 싶다. (int)(Math.random() * (y - x + 1) + x)
		// x = 65, y = 90 일 때 65에서 90사이의 난수 발생 프로그램을 작성하시오.
		char d = (char)(Math.random() * (90 - 65 + 1) + 65);
		System.out.println(d);
		
	}
}

/*
 * [문제 1]
 * 12.7과 78.5 중에서 작은 값을 구하시오
 * 
 * 
package basic;

public class Variable3 {
	public static void main(String[] args) {
		double a = 12.7;
		double b = 78.5;
		
		double small = Math.min(a, b);
		
		System.out.println("작은 값 = " + small);
	}
}
 * 
 * [출력 결과]
 * 작은 값 : 12.7
 
 * [문제 2]
 * 2의 5제곱
 * Math.pow(a, b);
 * System.out.println("2^5 = " + power);
 * 
 * [문제 3]
 * 컴퓨터가 불규칙하게 발생하는 수 = 난수 ( 0 <= 난수 < 1)
 * double a = Math.random(); 와 같은 역활을 하는 다른 클래스를 이용하여 난수 생성
 * 
package basic;

import java.util.Random;

public class Variable3 {
	public static void main(String[] args) {
		double b = new Random().nextDouble();
		System.out.println(b);
	}
}
 * [출력 결과]
 * 0.4661580993519151
 */