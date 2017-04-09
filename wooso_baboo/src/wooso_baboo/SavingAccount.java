package wooso_baboo;

public class SavingAccount extends Account {

	private double interest;
	private int time =0;
	private double firstMoney;
	
	SavingAccount(double b,double inter){
		firstMoney = b;
		balance=b;
		interest=inter;
	}
	@Override
	public double getAccount(){
		if(time<12){
			return firstMoney;
		}
		return balance;
		}
	
	@Override
	public void debit(double a){
		if(time>12){
			balance-=a;
		}
	}
	public double getwithdrawableAccount(){
		if(time<12){
			return 0.0;
		}else{
			return balance;
		}
	}
	
	public double passTime(int x){
		int i;
		if(time<12){
			System.out.println("아직 출금할 수 없습니다.");
			for(i=0;i<x;i++){	
				balance = balance+balance*interest;
				}
			time += x;
			return 0.0;
		}else{
			time += x;
			return balance;
		}
	}
}
