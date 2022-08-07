package day10_oop.constructor2;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Player a = new Player("마리오", "전사", 50);
		Player b = new Player("루이지", "마법사");		// 레벨을 입력하지 않으면 자동으로 1이 되도록
		Player c = new Player("피오나", "마법사", 1);	// 레벨을 직접 1로 설정하는 것도 가능
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
