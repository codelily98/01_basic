package basic;

public class Variable {

	public static void main(String[] args) {
		boolean a = 25 > 36;	// 우측의 값을 a에 대입해라
		System.out.println(a);
		
		char b = 'A';
		System.out.println(b);
		
		char c = 65;
		System.out.println(c);
		
		//byte d = 300; byte의 -128 ~ 127의 범위를 벗어난 Error 
		
		int e = 65;
		System.out.println(e);
		
		int f = 'A';
		System.out.println(f);
		
		long g = 25L;		// long형으로 저장 시 L(대소문자 구분 x)를 붙인다. (기본형이 int)
		System.out.println(g);
		
		float h = 43.8F;	// float형으로 저장 시 F(대소문자 구분 x)를 붙인다. (기본형이 double)
		System.out.println(h);
		
		float i = (float)43.8;	// float형으로 Casting(강제형변환)
		System.out.println(i);
		
	}

}
