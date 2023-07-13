package bankProject;

import java.util.Scanner;

public class Bank1 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Your Name and Customer Id to access your bank account");
		String name=s.nextLine();
		String CustomerId=s.nextLine();
		BankAccount obj1=new BankAccount(name,CustomerId);
		obj1.menu();
	}
}

	class BankAccount 
	{
		double bal;
		double PrevTrans;
		String CustomerName;
		String CustomerId;
		
		BankAccount(String CustomerName,String CustomerId)
		{
			this.CustomerName=CustomerName;
			this.CustomerId=CustomerId;
		}
		
		void deposit(double amount)
		{
			if(amount != 0)
			{
				bal+=amount;
				PrevTrans=amount;
			}
		}
		
		void withdraw(double amt)
		{
			if(amt !=0 && bal>= amt)
			{
				bal-=amt;
				PrevTrans=-amt;
			}
			else if(bal<amt)
			{
				System.out.println("Bank Balance Insufficient");
			}
		}
		
		void getPreviousTrans()
		{
			if(PrevTrans>0)
			{
				System.out.println("Deposited :"+PrevTrans);
			}
			else if(PrevTrans<0)
			{
				System.out.println("Withdrawn :"+ Math.abs(PrevTrans));
			}
			else
			{
				System.out.println("No Transaction occured");
			}
		}
		
		void menu()
		{
			char option;
			 Scanner sc=new Scanner(System.in);
			 System.out.println("Welcome"+ CustomerName);
			 System.out.println("Your ID"+ CustomerId);
			 System.out.println("\n");
			 System.out.println("a) Check Balance");
			 System.out.println("b) Deposit Amount");
			 System.out.println("c) Withdraw Amount");
			 System.out.println("d) Previous Transaction");
			 System.out.println("e) Exit"); 
			 
			 do
			 {
				 System.out.println("******************");
				 System.out.println("Choose an option");
				 option = sc.next().charAt(0);
				 System.out.println("\n");
				 
				 switch (option)
				 {
				 case 'a':
					 System.out.println("........................");
					 System.out.println("Balance="+ bal);
					 System.out.println("........................");
					 System.out.println("\n");
					 break;
					 
				 case 'b':
					 System.out.println("........................");
					 System.out.println("Enter a amount to Deposit:");
					 System.out.println("........................");
					 double amt=sc.nextDouble();
					 deposit(amt);
					 System.out.println("\n");
					 break;
					 
				 case 'c':
					 System.out.println("........................");
					 System.out.println("Enter a amount to Withdraw :");
					 System.out.println("........................");
					 double amtW=sc.nextDouble();
					 withdraw(amtW);
					 System.out.println("\n");
					 break;
					 
			     case 'd':
			    	 System.out.println(".............");
			    	 System.out.println("Previous Transaction");
			    	 getPreviousTrans();
			    	 System.out.println(".............");
			    	 System.out.println("\n");
			    	 break;
			     case 'e':
			    	 System.out.println(".............");
			    	 break;
			     default:
			    	 System.out.println("Choose a correct Option ");
			    	 break;
			     }
			     
			     }
			     while (option!='e');
			     System.out.println("Thank you for using the Bank Services");
			    	
			     }
			 }
			 
		     
			    	 
			

			

	


