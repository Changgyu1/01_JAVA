/*

 public static void main(String[] args)
 public : 접근제한자 (public, protected, private, default)
 	public : 모든 곳에서 접근 가능
 	protected : 같은 패키지 안에서 가능 + 상속 클래스에서만 접근 가능
 	private : 클래스 내에서만 접근 가능
 	dafault : 같은 패키지 안에서 가능
 	
 	public 쓰는 이유 : main은 프로그램에서 기본이기 때문에 public을 사용하여 
 	모든 클래스에 접근 가능한 메소드임을 선헌하고 시작하는것
 	
 	메소드 : 어떤 특정 작업을 수행하기 위한 명령문의 집합
 	
 	static / heap : 변수와 메소드를 메모리에 할당할 때, 저장되는 영역
 	static : 프로그림이 실행이 될때 저장됨.(Garbage Coolector)가 정리하지 못함
 	heap : 메소드에서 실행될 때 저장됨 GC(Garbag Collecto) 정리가능
 	main에서 static을 사용하는 이유는 프로그램의 기본이 되어야하는 함수가 정리되면 안되기 때문에 
 	static 영역에 메미로리 할당을 시켜주는것.
 	
 	void : 반환이 없다는 의미 (return이 없음) 
 	 메인이 죽으면 다음 단계가 없이 프로그램 전체가 종료되므로,
 	 return을 가질 수 없음.
 	 
 	main: 자바가 시작하는 문법 규칙 class의 메인을 나타냄.
 	
 	String[] args : 
 		String 문자열 , [] 배열을 뜻하고. args라는 이름의 문자열 배열을 사용한다.
 		메인 함수에서 String[] args 생략할 수 없는 이유는 프로그램이 시작되는 부분이기 때문에
 		외부에서 값을 받을 수 있어야하기 때문
 		
 		System.out.print();   :    괄호 안 내용을 단순히 출력
 		System.out.println(); :    줄바꿈 문자 포함돼서 출력 후 한 줄 띄워짐
 */


public class HellowWorld {
	public static void main(String[] args) {
		System.out.println("Hellow World");
		System.out.println("반갑습니다.");
		System.out.println("ㅇㅅㅇ");
		
		
		System.out.print("줄바꿈 없는 프린트!");
		System.out.print("진짜로 줄을 안바꿉니다.");
		
		System.out.println();
		System.out.print("박창규");
		System.out.print("     ");
		System.out.print("송의재");
		System.out.print("     ");
		System.out.print("주서경");
		
		System.out.println();
		System.out.println();
		System.out.print("점심 맛있게 드셨나요?");
		
		
		
	}
}
