package operater;

import java.util.Scanner;

public class Operator02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		
		sc.close();
		
		String result = "";		
		
		result = score >= 80 && score <= 100 ? "합격" : "불합격";
		
		System.out.println(result);	
	}
}

/*
[문제] 점수를 입력하여 합격인지 불합격인지 판별하는 프로그램
점수가 80~100 사이면 합격으로 한다.
*/