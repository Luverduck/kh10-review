package day11_oop.keyword7;

public class Account {

	// 멤버 필드
	private String name;
	private static double basicRate;
	private double plusRate;
	private long balance;
	
	// getter & setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPlusRate() {
		return plusRate;
	}

	public void setPlusRate(double plusRate) {
		if(plusRate < 0) {
			return;
		}
		this.plusRate = plusRate;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		if(balance < 0) {
			return;
		}
		this.balance = balance;
	}
	
	// 생성자 (static은 인스턴스 생성시마다 초기화할 필요가 없다)
	Account(String name, double plusRate, long balance){
		this.setName(name);
		this.setPlusRate(plusRate);
		this.setBalance(balance);
	}
	
	// static에 대한 getter & setter : static은 getter & setter도 static이다
	public static double getBasicRate() {
		return basicRate;
	}
	
	public static void setBasicRate(double basicRate) {
		if(basicRate < 0) {
			return;
		}
		Account.basicRate = basicRate;
	}
	
	// static 전용 초기화 구문
	static {
		setBasicRate(1.2);
	}
	
	// 출력 메소드
	public void print() {
		System.out.println("이름 : " + this.name);
		System.out.println("기본이율 : " + Account.basicRate);
		System.out.println("우대이율 : " + this.plusRate);
		System.out.println("잔액 : " + this.balance);
		System.out.println();
	}
}
