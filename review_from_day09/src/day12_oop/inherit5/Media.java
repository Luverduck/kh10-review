package day12_oop.inherit5;

public class Media extends File {
	
	// 멤버 필드
	
	// 생성자
	Media(String fileName) {
		super(fileName);
	}

	// 메소드
	public void forward() {
		System.out.println("빨리감기");
	}
	
	public void rewind() {
		System.out.println("되감기");
	}
}
