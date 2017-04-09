package wooso_baboo;

import java.util.Scanner;

public class AccountTest2 {

	public static void main(String[] args){
			
		Account account1 = new checkingAccount2(100.50,0.01,0.07);
		Account account2 = new SavingAccount(100.0,0.05);
		
		Scanner input=new Scanner(System.in);
		double amount;
		
		System.out.printf("Account balance1:$ %.2f\t 현재출금가능액: $ %.2f\n",account1.getAccount(),account1.getWithdrawableAccount());//account1의 입금을 받음
		
		System.out.printf("Enter withdrawal amount for Account1:$ ");
		amount= input.nextDouble();
		account1.debit(amount);
		
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음

		System.out.printf("Enter withdrawal amount for Account2:$");
		Scanner input2=new Scanner(System.in);
		double b=input2.nextDouble();
		account2.debit(b);
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음

		System.out.println("next month!");
		
		account1.nextMonth();
		account2.nextMonth();
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음

	
	}
	
}

		


