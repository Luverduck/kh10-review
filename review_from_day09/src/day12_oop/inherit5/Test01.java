package day12_oop.inherit5;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		MP3 a = new MP3("MP3파일", 1L*1024L*1024L, 180);
		AVI b = new AVI("AVI파일", 100L*1024*1024);
		PPT c = new PPT("PPT파일", 5L*1024L*1024L, 25);
		
		// 기능 출력
		a.execute();
		a.forward();
		a.rewind();
		
		b.execute();
		b.forward();
		b.rewind();
		
		c.execute();
		c.information();
	}
}
