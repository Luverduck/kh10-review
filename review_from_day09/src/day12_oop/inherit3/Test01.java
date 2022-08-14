package day12_oop.inherit3;

public class Test01 {

	public static void main(String[] args) {
		
		// 객체 생성
		Chrome a = new Chrome();
		Edge b = new Edge();
		Whale c = new Whale();
		
		// 상속받은 메소드 출력
		// url에 대한 setter 메소드 (슈퍼 클래스로부터 상속받은)
		a.setUrl("https://www.google.com");
		b.setUrl("https://www.microsoft.com");
		c.setUrl("https://www.naver.com");
		
		// refresh(), move() (슈퍼 클래스로부터 상속받은)
		a.refresh();
		a.move();
		
		a.refresh();
		a.move();
		
		a.refresh();
		a.move();
		
		// 고유 메소드
		a.develop();		// Chrome의 개발자 도구
		a.chromeStore();	// Chrome의 크롬 스토어
		
		b.fullScreen();		// Edge의 전체화면
		
		c.papago();			// Whale의 파파고
		c.naverSearch();	// Whale의 네이버 검색
		
		
	}
}
