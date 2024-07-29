package basic;

public class Variable2 {
	int a;	// class에서는 a가 선언 된 적이 없기 때문에 a를 사용할 수 있다. (전역변수 = filed variable)
	static int b;
	static String c;	// class 타입의 초기 값은 무조건 null로 잡힌다.
	/* c = "apple";	error 발생*/	// 모든 명령어는 함수안에 들어가야한다.
	
	public static void main(String[] args) {
		int a = 10;		// 모든 변수값은 초기화를 시켜 줘야한다. (지역변수 = local variable)
		
		//c = "apple";	// 모든 전역 변수는 new를 써야하지만 String 타입은 new가 없어도 된다.
		// 해당 생성을 리터럴 생성이라고 한다.
		c = new String("apple");	// 이 방법과 위의 리터럴 생성의 메모리 저장 위치가 다르다.
		
		System.out.println(a);
		//int a = 1; main에서 이미 선언 된 a라는 지역 변수는 중복 사용할 수 없다.
		System.out.println("필드 b = " + b); // static으로 선언 된 전역 변수는 main에서 활용 가능
		System.out.println("필드 a = " + a); // main에서 a가 지역변수로 선언 되었기 때문에 10 출력
		System.out.println("필드 a = " + new Variable2().a); // 초기화 된 전역변수 0 출력
		// static으로 선언되지 않은 전역 변수를 활용하기 위해서는 new 클래스명().변수;로 호출한다.
		System.out.println("필드 c = " + c);	

	}

}