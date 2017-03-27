package wooso_baboo;

abstract class Account2 {
	protected double balance;
	
	public abstract double getWithdrawableAccount();
	
	public double getAccount(){
		return balance;
		}
	
	public void debit(double x){
		double a;
		a=balance-x;
		
		if (a<0){
			
			System.out.println("Debit amount exceeded account balance.");
			
		}
		else if(a>=0){
			
			balance-=x;
			
		}else{
			System.out.println("Error!");
			
		}
		
	}
	
	public void credit(double a){
		balance+=a;
	}		
	public double getWithdrawableAccount(){
		if(balance>0){
			return balance;
		}else{
			return balance;
		}
	}
}


