package operater;

public class Operator04 {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		boolean result;
		
		result = ((num1 += 10) < 10 && (num2 += 10) > 10);
		
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + "\n" + "num2 = " + num2);
		System.out.println();
		// 조건식에서 하나의 조건에서 결과가 도출 됐을 때 후행의 수식을 실행하지 않는다.
		result = ((num1 += 10) > 10 || (num2 += 10) < 10);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + "\n" + "num2 = " + num2);
		// 마찬가지로 num1 += 10 == 20으로 앞의 > 10의 조건을 만족하여 뒤의 num2의 식을 실행하지 않아 num2 == 0 가 된다.
	}
}
