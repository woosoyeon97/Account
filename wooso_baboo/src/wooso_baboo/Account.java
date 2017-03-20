package wooso_baboo;

public class Account{

		
		private double debit;
		private double credit;
		private double balance;
		
		
		public double getAccount(){
			return balance;
			}
		
		public void Debit(double x){
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
		
		public void Credit(double b){
			balance+=b;
		}
		
}

	
		
