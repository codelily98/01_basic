package basic;

import java.text.*;

//Java의 기본 Package가 java.lang이기 떄문에 따로 import 선언을 해줄 필요가 없다.

public class Compute {

	public static void main(String[] args) {
		short a = 320;
		short b = 258;
		
		int sum, sub, mul = 0;
		double div = 0;
		
		sum = a + b;
		sub = a - b;
		mul = a * b;
		div = (double)a/b;	// double로 선언된 div에 대입된 a/b는 정수형 따라서 (double)로 자동형변환
		
		System.out.println(a + " + " + b + " = " + sum);
		System.out.println(a + " - " + b + " = " + sub);
		System.out.println(a + " * " + b + " = " + new DecimalFormat().format(mul));
		// new DecimalFormat().format()을 쓰기위해 import java.text.DecimalFormat을 선언해준다.
		System.out.println(a + " / " + b + " = " + String.format("%.2f", div));
		// String.format("%.자릿수자료형", 대상); 으로 원하는 자릿수까지 표시 가능

	}

}

/*
[문제] 변수를 이용하여 320, 258의 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오

[실행결과]
320 + 258 = 578
320 - 258 = 62
320 * 258 = 82560 → 82,560
320 / 258 = 1.2403100775193798 → 1.24 
*/