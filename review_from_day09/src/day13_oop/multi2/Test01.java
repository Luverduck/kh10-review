package day13_oop.multi2;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Drone a = new Drone();
		Airplane b = new Airplane();
		Train c = new Train();
		Bus d = new Bus();
		Kickboard e = new Kickboard();
		
		// 출력
		a.on();
		a.off();
		a.move();
		a.fly();
		
		b.move();
		b.fly();
		b.reservation();
		
		c.move();
		c.reservation();
		
		d.move();
		
		e.on();
		e.off();
		e.move();
	}
}
