import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// TODO 변수(variable type)
		
		// 이스케이프 문자 "\"
		System.out.println("나는 \"자바\"를 좋아합니다.");
		
		// \t :탭만큼 띄우기, \n: 한줄 내림
		System.out.println("번호\t이름\t나");
		System.out.println("홍길동\n신돌");
		
		// float(7자리), double(15자리)
		double a1 = 3.14;
		float a2 = 3.14F;
		
		// boolean
		boolean a3 = true; 
		
		// 자동 타입 변환
		int x = 1;
		int y = 2;
		double result = (double) x / y;
		double result2 = x / (double) y;
		
		
		//문자열(String)을 기본 타입으로 강제 타입 변환
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		//기본 타입을 문자열로 강제 변환
		String value4 = String.valueOf(10);
		
		
		// printf() 메소드
		System.out.printf("전화번호 : %1$d-%2$d-%3$d", 123, 555, 5678);
		// %: 시작, 1$: 순번, s:문자열, d : 정수,f: 실수
		// %6d : 6자리 문자열, 왼쪽 빈자리 공백
		// %-6d: 6자리 문자열, 오른쪽 빈자리 공백 
		
		System.out.println("");
		
		// Scanner 클래스
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		System.out.println(input);
		
		
		
	}

}
