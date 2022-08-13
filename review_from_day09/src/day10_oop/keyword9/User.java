package day10_oop.keyword9;

public class User {

	// 멤버 필드
	private final String id;
	private String pw;
	private String nickname;
	
	// getter & setter : id에 final이 적용되었으므로 getter & setter를 입력할 필요가 없다
	public String getPw() {
		return this.pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getNickname() {
		return this.nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
	// 생성자
	User(String id, String pw, String nickname){
		this.id = id;	// 객체 생성시 1회 한정 아이디 초기화
		this.setPw(pw);
		this.setNickname(nickname);
	}
	
	// 출력 메소드
	public void print() {
		System.out.println("ID : " + this.id);
		System.out.println("닉네임 : " + this.nickname);
	}
}
