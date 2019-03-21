package p2;

public class ClassActivity02 {

	public static void main(String[] args) {
		Account kakao = new Account("KAKAOBANK", 100);
		Account nh = new Account("NHBANK", 100);
		
		System.out.printf("%s balance : %.2f\n",
			kakao.getName(), kakao.getBalance());
		System.out.printf("%s balance : %.2f\n\n",
			nh.getName(), nh.getBalance());
		kakao.Withdrawal(200);
		kakao.Withdrawal(50);
		System.out.println(kakao.getBalance());
	}

}
