package day07;

public class Day07_array_Test12 {

	public static void main(String[] args) {
		
		// 배열의 생성
		int[] array = new int[] {30, 10, 20, 50, 40};
		
		//정렬 전 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		// 선택 정렬
		for(int j = 0 ; j < array.length ; j ++) {
			for(int i = j ; i < array.length ; i ++) {
				int minIndex = j;		// minIndex를 설정
				int backup = array[minIndex];	// 배열의 minIndex에 저장된 값을 백업
				if(array[minIndex] > array[i]) {
					minIndex = i;		//만약 minIndex의 값보다 i번째 배열의 값이 작다면 minIndex를 i로 바꾼다 (최소값 위치 찾기)
				}
				backup = array[j];		//데이터 교체 (swap)
				array[j] = array[minIndex];
				array[minIndex] = backup;
			}
		}
		
		// 정렬 후 출력
		for(int i = 0 ; i < array.length ; i ++) {
			System.out.print(array[i] + " ");
		}
	}
}
