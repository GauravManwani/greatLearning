package balancedBrackets;

public class Client {

	public static void main(String[] args) {
		BalancedBrackets balancedBrackets=new BalancedBrackets();
		boolean value=balancedBrackets.isBalanced("[{}])");
		
		if(value) {
			System.out.println("This is Balanced String");
		}else {
			System.out.println("Not Balanced String");
		}
	}
}
