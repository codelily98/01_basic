package operater;

public class Operator03 {
	public static void main(String[] args) {
		int a = 5;
		a += 2;
		a *= 3;
		a++;
		
		int b = a++;
		int c = ++a - b--;
			
		System.out.println("a의 값 = " + a);
		System.out.println("b의 값 = " + b);
		System.out.println("c의 값 = " + c);
		
		System.out.println("a++의 값 = "+ a++);	// 후행 연산자이기 때문에 위의 a의 값이 출력 되고 나서 ++가 된다.
		System.out.println("a = " + a);			// 위의 후행 연산자로 증가 된 ++ 값이 출력 된다 24->25
	}	
}
