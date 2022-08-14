package day12_oop.inherit3;
 
// 슈퍼 클래스
public class Browser {

	// 멤버 필드
	protected String url;	// 상속관계인 클래스에서만 호출할 수 있도록 protected로 설정
	
	// getter & setter
	public String getUrl() {
		return this.url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	// 메소드
	public void refresh() {
		System.out.println("새로고침 실행");
	}
	
	public void move() {
		System.out.println("페이지 이동 실행");
	}
}
