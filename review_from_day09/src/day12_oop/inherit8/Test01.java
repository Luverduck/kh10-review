package day12_oop.inherit8;

public class Test01 {

	public static void main(String[] args) {

		// 객체 생성
		Warrior a = new Warrior("전사");
		Magician b = new Magician("마법사");
		Elf c = new Elf("엘프");

		// 메소드 출력
		a.information();
		a.attack();
		a.move();

		b.information();
		b.attack();
		b.move();

		c.information();
		c.attack();
		c.move();
	}
}
