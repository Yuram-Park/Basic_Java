
public class Array {

	public static void main(String[] args) {
		// TODO 배열
		
		// 배열 선언 후 나중에 값 저장할 때
		int array[];
		array = new int[] {10, 20, 30}; // 반드시 new 사용
		
		
		// 배열복사
		int arr1[] = {1, 2, 3};
		int arr2[] = new int[5];
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);
		
		
		// for문 배열
		for(int a : arr1) {
			System.out.println(a);
		}
			
		// 최대값 구하기
		int max=0;
		int[] numbers = {1,5, 3, 8, 2};
		
		for(int num : numbers) {
			if( num > max)
				max = num;
		}
		System.out.println(max);
		
		
	}

}
