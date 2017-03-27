package wooso_baboo;

public class checkingAccount extends Account {
	
	private double interest;
	private double loan_interest;
	private double credit_limit;
	
	
	checkingAccount(double a,double b,double c){
		credit_limit = a;
		balance+= a;
		b = loan_interest;
		c = credit_limit;
		
	}
	@Override
	public void debit(double a){
		balance-=a;
		if(balance<credit_limit){
			System.out.printf("Minus\n");
			
		}else{
			System.out.printf("Plus\n");
		}
	}
	
	
	public double nextMonth(){
		if(balance<0){
			balance = balance+balance*loan_interest;

		}else{
			balance = balance+balance*interest;

		}
		return balance;
	}
}
