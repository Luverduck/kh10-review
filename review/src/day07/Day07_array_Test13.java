package day07;

public class Day07_array_Test13 {

	public static void main(String[] args) {
		
		// 배열의 생성 
		int[] array = new int[] {30, 10, 20, 50, 40};
				
		// 정렬 전 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 버블 정렬
		for(int times = 0 ; times < array.length - 1 ; times ++) {
			for(int nowIndex = 0 ; nowIndex < (array.length - 1) - times ; nowIndex ++) {
				int backup;
				if(array[nowIndex] > array[nowIndex + 1]) {
					backup = array[nowIndex];
					array[nowIndex] = array[nowIndex + 1];
					array[nowIndex + 1] = backup;
				}
			}
		}
		
		//정렬 후 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
