import java.io.*;
import java.util.*;
class account
{
	private String acname;
	private String acno;
	protected int balance;
	public account()
	{
		acname="";
		acno="";
		balance=0;
	}
	public account(String p,String q,int r)
	{
		acno=p;
		acname=q;
		balance=r;
	}
	public void account_read()
	{
		Scanner su=new Scanner(System.in);
		System.out.println("Enter account no : ");
		acno=su.next();
		System.out.println("Enter account holder name : ");
		acname=su.next();
	    System.out.println("Enter balance : ");
		balance=su.nextInt();
	}
	public void account_info()
	{
		System.out.println("a/c No : "+acno+"\n a/c holder name :"+acname+"\n Balance :"+balance);
	}
}

class savings extends account
{
	private int amount;
	public savings()
	{
		super();
	}
	public savings(String r,String nm,int b)
	{
		super(r,nm,b);
	}
	public void savings_read()
	{
		Scanner sb=new Scanner(System.in);
	    System.out.println("Enter amount : ");
		amount=sb.nextInt();
	}
	public void withdraw()
	{
		savings_read();
		if(balance-amount<1000)
			System.out.println("unsufficient balance");
		else
		{
			balance-=amount;
			System.out.println("balance : "+balance);
		}	
	}
	public void deposite()
	{
		savings_read();
		if(amount<100)
			System.out.println("not possible");
		else
		{
			balance+=amount;
			System.out.println("balance : "+balance);
		}
	}
	public static void main (String[] args) {
		savings s1=new savings();
		s1.account_read();
		s1.account_info();
		s1.deposite();
		s1.withdraw();
		savings s2=new savings("1001","ram",10000);
		s2.account_info();
		s2.deposite();
		s2.withdraw();
}
}


