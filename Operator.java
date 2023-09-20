
public class Operator {

	public static void main(String[] args) {
		// TODO Operator(연산자)
		
		
		// byte 부호연산 -> int 타입으로 변환(long 타입 제외 모두 int 타입으로 변환됨)
		byte a = 100;
		int result = -a;
		
		
		// ++ 증감연산
		int x = 1, y = 1;
		int result1 = ++x + 10; // 12
		int result2 = y++ + 10; // 11
		
		// int 타입으로 변환 후 저장
		int int1 = 10, int2 = 4;
		double result3 = int1 / int2 ; // 2
		
		// float 형 비교
		// 0.1 == 0.1f -> false, 0.1f 는 0.1의 근사갑으로 표현되므로
		
		// 삼항 연산자
		// 조건식 ? true일때 값 : false일 때 값
		char grade = 92 > 90 ? 'A': 'B';
		

	}

}
