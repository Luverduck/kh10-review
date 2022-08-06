package day06;

import java.util.Random;

public class Day06_random_Test09 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		int itemLV = 0;
		int count = 0;
		while(true) {
			int range = r.nextInt(100) + 1;
			if(range <= 25) {
				itemLV ++;
				count ++;
			}
			else if(range <= 50) {
				itemLV --;
				count ++;
				if(itemLV <= 0) {
					itemLV = 0;
				}
			}
			else {
				itemLV += 0;
				count ++;
			}
			
			if(itemLV >= 15) {
				break;
			}
		}
		
		System.out.println("아이템 15강 강화 성공");
		System.out.println("소요된 강화 횟수 : " + count);
	}
}
