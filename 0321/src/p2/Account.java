package p2;

public class Account {
	private String name;
	private double balance; // �ܾ�
	
	// ������(Constructor) ������ ���ÿ� ���� �ʱ�ȭ(?)��Ŵ 
	public Account(String name, double balance) {
		this.name = name;
		
		if(balance > 0.0) {
			this.balance = balance; //����,���� ���´ٸ� �ڵ����� 0���� ������~
		}
	}
	/* ��¥ �ʿ��ұ�? ��ü�� ��ݿ� ���ϹǷ�, �����ȸ�޼ҵ�(��ƴ�!��) ���������� �ʿ� ����
	public void transferAmount(String who, int amount) {
		if(amount > 0) {
			balance -= amount;
		}	
	}
	*/

	public void Withdrawal(int withdrawalAmount) {
		if(withdrawalAmount <= 0) {
			System.out.println("1���̻� �����ϼ���.");
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


