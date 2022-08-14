package day12_oop.inherit6;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Galaxy22s a = new Galaxy22s("블랙");
		GalaxyFold3 b = new GalaxyFold3("그린");
		IPhone12 c = new IPhone12("퍼시픽블루");
		IPhone13 d = new IPhone13("시에라블루");
		
		// 출력
		a.call();
		a.sms();
		a.samsungPay();
		a.bixby();
		
		b.call();
		b.sms();
		b.samsungPay();
		b.iris();
		
		c.call();
		c.sms();
		c.itunes();
		c.siri();
		
		d.call();
		d.sms();
		d.faceTime();
		d.siri();
	}
}
