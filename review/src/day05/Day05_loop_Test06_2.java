package day05;

public class Day05_loop_Test06_2 {

	public static void main(String[] args) {
		
		for(int i = 0 ; i < 100 ; i ++) {
			if(i / 10 == 5 || i % 10 == 5) {
				System.out.println(i);
			}
		}
	}
}
