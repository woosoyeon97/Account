package wooso_baboo;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args){
			
		checkingAccount	account1 = new checkingAccount(100.0,0.07,0.01);
		checkingAccount account2 = new checkingAccount(100.0,0.07,0.01);
		
		Scanner input=new Scanner(System.in);
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음
		
		
		System.out.printf("Enter deposit amount for Account1:$ ");
		Scanner input1=new Scanner(System.in);
		double a = input1.nextDouble();
		account1.credit(a);
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음

		System.out.printf("Enter withdrawal amount for Account2:$");
		Scanner input2=new Scanner(System.in);
		double b=input2.nextDouble();
		account2.debit(b);
		
		System.out.printf("Account balance1:$ %f\n",account1.getAccount());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.getAccount());//account1의 입금을 받음

		System.out.println("next month!");
		
				
		System.out.printf("Account balance1:$ %f\n",account1.nextMonth());//account1의 입금을 받음
		System.out.printf("Account balance1:$ %f\n",account2.nextMonth());//account1의 입금을 받음

	
	}
	
}

		

