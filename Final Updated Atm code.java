import java.lang.*;
import java.util.Scanner;
public class Main 
{
	static long bal_ =100;
	public static void main(String[] args) 
	{
		System.out.println("_ ^^^^^*** A T M ***^^^^^_\n ");
		System.out.println("Welcome To The ATM");
	    long card=123456789;
	    int pin=7641;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter Your Card Number");
	    long card_no=sc.nextLong();
	    System.out.println("Enter Your Pin NUmber");
	    int pin_no=sc.nextInt();
	    if(pin_no==pin && card_no==card)
	    {
	    	System.out.println("Information Updated Successfully : Please Proceed Ahead\n ");
	    	System.out.println("Your Account Type:-");
	    	System.out.println("1. From Current");
	    	System.out.println("2. From Savings");
	    	System.out.println("Enter Your Choice From Above:-");
	    	int choice=sc.nextInt();
	    	System.out.println(" ");
	    	System.out.println("Select Transaction:-");
	    	System.out.println("1 Cash Withdrawl");
	    	System.out.println("2 Balance Enquiry");
	    	System.out.println("3 Deposit");
	    	System.out.println("Enter Your Choice From Above:-");
	    	int choice_=sc.nextInt();
	    	switch(choice_)
	    	{
	    		case 1: System.out.println(" ");
	    		System.out.println("Enter The Amount To Be Withdrawn:-");
	    		long wd=sc.nextLong();
	    		if(wd<bal_)
	    		{
	    			System.out.println("Withdrawn Is Successfull");
	    			bal_=bal_-wd;
	    			System.out.println("Your Current Balance Is " +bal_);
	    		}
	    		else
	    		{
	    			System.out.println("It Seems That The Withdrawn Amount Exceeds The Balance Amount\n");
	    			System.out.println("Deposit Sufficient Amount So That You Can Have A Transaction\n");
	    			System.out.println("Press 0 To Deposit Sufficient Amount\n");
	    			long depo_=sc.nextLong();
	    			System.out.println("Enter Amount To Deposit");
	    			long depo__=sc.nextLong();
	    			depo_=bal_+depo__;
	    			System.out.println("Your Deposited Amount Is: " +depo__);
	    			System.out.println("To Withdraw Amount Press 0");
	    			long wd_=sc.nextLong();
	    			long wd__;
	    			wd__=depo_ - wd;
	    			System.out.println("Your Withdrawn Amount Is:" +wd);
	    			System.out.println("Your Balance Amount Is:" +wd__);
	    			System.out.println("!!! Transaction Successfull !!!");
	    			System.out.println("^^^** Thank You **^^^");
	    		}
	    		break;
	    		case 2: System.out.println("To Check Your Account Balance Press 0");
	    		long acb=sc.nextLong();
	    		System.out.println("Your Account Balance Is:" +bal_);
	    		System.out.println("***^^ Thank You ^^***");
	    		break;
	    		case 3: System.out.println("Enter Amount To Deposit");
	    		long amt=sc.nextLong();
	    		long depo___=amt+0;
	    		System.out.println("Your Deposited Amount Is:" +depo___);
	    		System.out.println("To Check Your Updated Balance Press 0");
	    		long upd=sc.nextLong();
	    		long bal___=bal_ + depo___;
	    		System.out.println("Your Updated Balance Is:" +bal___);
	    		System.out.println(" ");
	    		System.out.println("Which Operation Do You Want To Perform:-");
	    		System.out.println("1 Withdraw Money");
	    		System.out.println("2 Exit");
	    		System.out.println("Enter Your Choice From Above");
	    		int choice__=sc.nextInt();
	    		switch(choice__)
	    		{
	    			case 1: System.out.println("Enter Amount To Be Withdrawn");
	    			long w1=sc.nextLong();
	    			long w2=bal___ -w1;
	    			System.out.println("Your Final Updated Account Balance Is:" +w2);
	    			break;
	    			case 2: System.out.println("***^^ Thank You ^^***");
	    			break;
	    			default: System.out.println("Invalid Input");
	    		}
	    		
	    		break;
	    		default : System.out.println("Invalid Input : Please Try Again"); 
	    	}
	      }
	    else
	    {
	    	System.out.println("Card No OR Pin No Is Incorrect : Please Try Again");
	    }
	  }
}