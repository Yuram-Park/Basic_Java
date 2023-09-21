import java.util.Random;

public class IfForWhlie {

	public static void main(String[] args) {
		// TODO if문, switch문

		// 랜덤수 1~10
		int rnd = (int) (Math.random() * 10) + 1;
		// ( Math.random() * max )+ min
		Random random = new Random();
		int rnd2 = random.nextInt(10 - 1 + 1) + 1;
		// random.nextInt(max-1+1)+min

		// switch문
		int num = 1;
		switch (num) {
		case 1:
			System.out.println("1입니다.");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		default:
			System.out.println("다른 수입니다.");
			break;
		}

		// 바깥쪽 for 반복문 종료
		Outter: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					break Outter;
				}
			}
		}

		// continue 문
		for (int i = 0; i < 10; i++) {
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
