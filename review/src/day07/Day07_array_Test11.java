package day07;

public class Day07_array_Test11 {

	public static void main(String[] args) {
		
		// 뒤집기 전 배열
		int[] array = new int[] {30, 10, 20, 50, 40};
		
		// 뒤집기 전 배열 출력 (확인용)
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		
		System.out.println();
		
		// 배열 뒤집기
		int backup;
		for(int i = 0 ; i < array.length / 2 ; i ++) {
			backup = array[i];
			array[i] = array[(array.length - 1) - i];
			array[(array.length - 1) - i] = backup;
		}
		
		// 뒤집기 후 배열 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
