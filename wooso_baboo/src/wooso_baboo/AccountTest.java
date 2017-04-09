package wooso_baboo;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args){
		Account account1=new checkingAccount(100,50,0.01,0.07);
		Account account2=new SavingAccount(100,0.05);
		
		Scanner input=new Scanner(System.in);
		double amount;
		
		System.out.printf("Account1 balance:$ %.2f\t현재출금가능금액: %.2f\n",account1.getAccount(),account1.getwithdrawableAccount());//account1의 입금을 받음
		System.out.println("Enter withdrawal amount for Account1: ");
		amount=input.nextDouble();
		account1.debit(amount);
		System.out.printf("Account1 balance:$ %.2f\t현재출금가능금액: %.2f\n",account1.getAccount(),account1.getwithdrawableAccount());
		if(((checkingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(1);
		System.out.printf("Account1 balance:$ %.2f\t현재출금가능금액: %.2f\n",account1.getAccount(),account1.getwithdrawableAccount());
		if(((checkingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		}
		account1.passTime(5);
		System.out.printf("Account1 balance:$ %.2f\t현재출금가능금액: %.2f\n",account1.getAccount(),account1.getwithdrawableAccount());
		if(((checkingAccount)account1).isBankrupted()==false){
			System.out.println("account1 went Bankrupt!");
		}
		
		//SavingAccount
		System.out.println();;
		System.out.printf("Account2 balance:$ %.2f\t현재출금가능금액: %.2f\n",account2.getAccount(),account2.getwithdrawableAccount());
		System.out.println("6 Month later");
		account2.passTime(6);
		System.out.printf("Account2 balance:$ %.2f\t현재출금가능금액: %.2f\n",account2.getAccount(),account2.getwithdrawableAccount());
		account2.debit(50);
		
		System.out.println("next 6 Month later");
		account2.passTime(6);
		System.out.printf("Account2 balance:$ %.2f\t현재출금가능금액: %.2f\n",account2.getAccount(),account2.getwithdrawableAccount());
		
		System.out.println("next 1 Month later!");
		account2.passTime(1);
		System.out.printf("Account2 balance:$ %.2f\t현재출금가능금액: %.2f\n",account2.getAccount(),account2.getwithdrawableAccount());
		account2.debit(50);
		System.out.printf("Account2 balance:$ %.2f\t현재출금가능금액: %.2f\n",account2.getAccount(),account2.getwithdrawableAccount());
		
	
	}
	
}

		

