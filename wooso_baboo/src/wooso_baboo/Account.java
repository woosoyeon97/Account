package wooso_baboo;

public class Account{

		protected double balance;
		
		
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
}

	
		
