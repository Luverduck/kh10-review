package day05;

public class Day05_loop_Test07_2 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++) {
			if(i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
				if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					System.out.println("짝짝");
				}
				else {
					System.out.println("짝");
				}
			}
			else {
				if(i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
					System.out.println("짝");
				}
				else {
					System.out.println(i);
				}
			}
		}
	}
}
