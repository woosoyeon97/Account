package wooso_baboo;

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args){
			
		double b1;
		double b2;
		double d1,d2=0;
		
		Account account1 = new Account();
		Account account2 = new Account();
		
		System.out.printf("Account balance1:");//account1�� �Ա��� ����
		Scanner input1=new Scanner(System.in);
		b1 = input1.nextDouble();
		account1.Credit(b1);
		
		
		System.out.printf("Account balance2:");//account2�� �Ա��� ����
		Scanner input2=new Scanner(System.in);
		b2 = input2.nextDouble();
		account2.Credit(b2);
		
		
		System.out.printf("Enter withdrawal amount for account1: $");//account1�� ��ݳ����� ����
		Scanner input3=new Scanner(System.in);
		d1 =input3.nextDouble();
		System.out.printf("subtracting $ %f from account balance\n", d1);
		account1.Debit(d1);//account1������ �ܾ� ��� �� ��� ���
		System.out.printf("account1 balance:$ %f\n",account1.getAccount());//account1�� �ܾ� ���
	
		
		
		System.out.printf("Enter withdrawal amount for account2: $");//account2�� ��ݳ����� ����
		Scanner input4=new Scanner(System.in);
		d2 =input4.nextDouble();
		System.out.printf("subtracting $ %f from account balance\n", d2);
		account2.Debit(d2);//account2������ �ܾװ�� �� ��� ���
		System.out.printf("account2 balance:$ %f\n",account2.getAccount());//account1�� �ܾ� ���
		
	}
	
}

		

