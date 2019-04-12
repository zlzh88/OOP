package Activity4;

public class AutoPolicyTest {
	public static void main(String[] args) {
		AutoPolicy p1 = new AutoPolicy(123, "Cupper", "���ֽ�");
		AutoPolicy p2 = new AutoPolicy(2435, "mini", "������");
		
		policyInNoFaultState(p1);
		policyInNoFaultState(p2);
		
	}
	
	public static void policyInNoFaultState(AutoPolicy policy) {
		System.out.println("The auto policy");
		System.out.printf("Account # : %d; Car : %s; %nState %s %s a no-fault state%n%n",
							policy.getAccountNumber(), policy.getMakeAndModel(),
							policy.getState(),
							(policy.isNoFaultState() ? "is" : "is not"));
	}
}
