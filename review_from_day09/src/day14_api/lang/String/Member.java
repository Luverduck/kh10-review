package day14_api.lang.String;

import java.util.Objects;

// 허용 아이디와 비밀번호(인스턴스) 갯수를 늘리기 위한 클래스
public class Member {

	// 멤버 필드
	private String id;
	private String pw;
	
	// getter & setter
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getPw() {
		return this.pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	// 생성자
	public Member(String id, String pw) {
		this.setId(id);
		this.setPw(pw);
	}
	
	// 메소드
	
	// equals 재정의 (인스턴스끼리 비교할 때 '같다'의 기준을 재정의한다)
	@Override
	public int hashCode() {
		return Objects.hash(id, pw);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return Objects.equals(id, other.id) && Objects.equals(pw, other.pw);
	}
}
