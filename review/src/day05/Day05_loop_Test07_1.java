package day05;

public class Day05_loop_Test07_1 {

	public static void main(String[] args) {
		
		for(int i = 1 ; i < 100 ; i ++) {
			
			boolean unitOne = i % 10 == 3 || i % 10 == 6 || i % 10 == 9;
			
			boolean unitTen = i / 10 == 3 || i / 10 == 6 || i / 10 == 9;
			
			if(unitOne && unitTen) {
				System.out.println("짝짝");
			}
			else if(unitOne || unitTen) {
				System.out.println("짝");
			}
			else {
				System.out.println(i);
			}	
		}
	}
}
