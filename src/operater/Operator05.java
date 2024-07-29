package operater;

public class Operator05 {
	public static void main(String[] args) {
		boolean a = 25 > 36;
		System.out.println("a = " + a);

		String b = "apple";					// apple 대입이 아닌 주소 값을 b에 대입
		String c = "apple";					// b에 대입된 같은 주소 값이 입력 됨 b와 c의 주소 값은 같음
		String d = new String("apple");		/* new 연산자를 사용하여 String Class 안의 d에 
											   b와 c와는 다른 apple 주소를 대입*/
		
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		
		System.out.println("b == c = " + (b == c ? "같다" : "다르다"));	 // 주소 비교 : 같다
		System.out.println("b == d = " + (b == d ? "같다" : "다르다")); // 주소 비교 : 다르다
		
		System.out.println("b.equals(c) : " + (b.equals(c) ? "같다" : "다르다")); // 문자 비교 : 같다
		System.out.println("b.equals(d) : " + (b.equals(d) ? "같다" : "다르다")); // 문자 비교 : 같다
		System.out.println("!b.equals(d) : " + (!b.equals(d) ? "같다" : "다르다")); // 부정 : 다르다
	}
}
