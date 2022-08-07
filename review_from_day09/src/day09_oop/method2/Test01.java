package day09_oop.method2;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Player a = new Player();
		a.setting("진종오", "사격", "하계", 4, 2, 1);
		
		Player b = new Player();
		b.setting("김수녕", "양궁", "하계", 4, 1, 1);
		
		Player c = new Player();
		c.setting("전이경", "쇼트트랙", "동계", 4, 0, 1);
		
		// 출력
		a.print();
		b.print();
		c.print();
	}
}
