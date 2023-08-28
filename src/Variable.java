/*
 * 변수를 선언할 때 하나의 변수명은 하나의 자료형만 가능하다.
 * 변수명은 재사용가능하다.
 * int = 정수를 나타냄;
 * String = 문자를 나타냄;
	변수란 메모리(RAM)에 값을 기록하기 위한 공간
	변수의 선언 : 메모리 공간에 데이터를 저장할 수 있는 공간을 할당하는 것
	
	변수 선언 방법 : 
					1) 자료형 변수명;
					2) 자료형 변수명 = 값;
	
	
*/
public class Variable {
	public static void main(String[] args) {
		int age = 25;
		System.out.println("나이 : "+ age);
		
		int mouth = 8;
		int day = 28;
		System.out.println(mouth + "월" + day + "일");
		
		String data = "월";
		String data2 = "일";
		System.out.println(mouth + data + day + data2);
		
		// 자신의 이름과 월 일을 담은 변수를 만들어 봅시다.
		
		String name = "박창규";
		int mot = 5;
		int da = 25;
		System.out.println(name+mot+da);
		

		
		//	1. 자료형 변수명;
		int number1;
		number1 = 100;
		System.out.println("number1 = " + number1);
		number1 = 200;
		System.out.println("number1(재사용) = " + number1);
		
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");
		
		//	2. 자료형 변수명 = 변수값;
		int number2 = 300;
		System.out.println("number2 = " + number2);
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		String name1 = "JAVA";
		System.out.println("name1 = " + name1);
		name1 = "Hi Java";
		System.out.println("name1(재사용) = " + name1);
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		int a = 10;
		int b = 20;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(b / a);
		System.out.println(b % a);
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		//변수명 안에 숫자를 넣고 더하기 뺴기 곱하기 나누기 넣기
		
		int x = 4;
		int y = 2;
		//1. 더하기 (+)
		System.out.print("더하기(+) : ");
		System.out.println(x + y);
		//2. 빼기 (-)
		System.out.print("뺴기(-) : ");
		System.out.println(y - x);
		//3. 곱하기 (*)
		System.out.print("곱하기(*) : ");
		System.out.println(x * y);
		//4. 나누기 (/)
		System.out.print("나누기(/) : ");
		System.out.println(x / y);
		//5. 나머지 구하기 (%)
		System.out.print("나머지(%) : ");
		System.out.println(x % y);
		
		
	}

}
