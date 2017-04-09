package wooso_baboo;

public class checkingAccount extends Account {
	
	private double interest;
	private double loan_interest;
	private double credit_limit;
	
	checkingAccount(double a,double b,double c,double d){
		credit_limit = b;
		balance = a;
		loan_interest=d;
		interest = c;
	}
	
	@Override
	public void debit(double a){
		balance-=a;
		if(a>credit_limit+balance){
			System.out.printf("Minus\n");
			
			
		}else{
			System.out.printf("Plus\n");
		}
	}
	public boolean isBankrupted(){
		if(balance+credit_limit<0){
			return false;
		}else{
			return true;
		}
	}
	public double getwithdrawableAccount(){
		if(balance+credit_limit <0){
			return 0.0;
		}
		return balance+credit_limit;
	}
	@Override
	public double EstimateValue(int month){
		int x=month;
		int i;
		for(i=0;i<x;i++){
			if(balance<0){			
				balance = balance+balance*loan_interest;
			}else{
				balance = balance+balance*interest;
			}
		}
		return balance;
	}
	public String toString(int month){
		return String.format("checkingAccount_Balance: "+ credit_limit );
	}
	public double passTime(int x){
		int i;
		for(i=0;i<x;i++){
			if(balance<0){			
				balance = balance+balance*loan_interest;
			}else{
				balance = balance+balance*interest;
			}
		}
		return balance;
	}
	
}
