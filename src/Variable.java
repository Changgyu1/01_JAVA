/*
 * ������ ������ �� �ϳ��� �������� �ϳ��� �ڷ����� �����ϴ�.
 * �������� ���밡���ϴ�.
 * int = ������ ��Ÿ��;
 * String = ���ڸ� ��Ÿ��;
	������ �޸�(RAM)�� ���� ����ϱ� ���� ����
	������ ���� : �޸� ������ �����͸� ������ �� �ִ� ������ �Ҵ��ϴ� ��
	
	���� ���� ��� : 
					1) �ڷ��� ������;
					2) �ڷ��� ������ = ��;
	
	
*/
public class Variable {
	public static void main(String[] args) {
		int age = 25;
		System.out.println("���� : "+ age);
		
		int mouth = 8;
		int day = 28;
		System.out.println(mouth + "��" + day + "��");
		
		String data = "��";
		String data2 = "��";
		System.out.println(mouth + data + day + data2);
		
		// �ڽ��� �̸��� �� ���� ���� ������ ����� ���ô�.
		
		String name = "��â��";
		int mot = 5;
		int da = 25;
		System.out.println(name+mot+da);
		

		
		//	1. �ڷ��� ������;
		int number1;
		number1 = 100;
		System.out.println("number1 = " + number1);
		number1 = 200;
		System.out.println("number1(����) = " + number1);
		
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("");
		
		//	2. �ڷ��� ������ = ������;
		int number2 = 300;
		System.out.println("number2 = " + number2);
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("");
		
		String name1 = "JAVA";
		System.out.println("name1 = " + name1);
		name1 = "Hi Java";
		System.out.println("name1(����) = " + name1);
		
		
	}

}
