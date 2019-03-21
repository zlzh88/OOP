package p2;

public class Account {
	private String name;
	private double balance; // 잔액
	
	// 생성자(Constructor) 생성과 동시에 값을 초기화(?)시킴 
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance; //음수,영이 들어온다면 자동으로 0으로 생성됨~
		}
	}
	/* 진짜 필요할까? 이체는 출금에 속하므로, 기록조회메소드(어렵다!ㅠ) 생성전까진 필요 ㄴㄴ
	public void transferAmount(String who, int amount) {
		if(amount > 0) {
			balance -= amount;
		}	
	}
	*/

	public void Withdrawal(int withdrawalAmount) {
		if(withdrawalAmount <= 0) {
			System.out.println("1원이상 인출하세요.");
		}
		if(withdrawalAmount > balance) {
			System.out.println("Withdrawal amount exceeded acount balance!");
		}else if(withdrawalAmount > 0) {
			balance -= withdrawalAmount;
			System.out.println("Success!");
		}
		
	}
	
		
	public void deposit(int depositAmount) {
		if(depositAmount > 0) {
			balance += depositAmount;
		}
	}
	
	public double getBalance() {
		return balance;
	}
		
	public void setName(String name) {
		this.name = name;
	}
		
	public String getName() {
		return name;
	}
}


