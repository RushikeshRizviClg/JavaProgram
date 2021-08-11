//EXPERIMENT NO.7:
//Aim: Write a program to create a class Account to perform the operation of insert,deposit and withdrawal of single employee and make a use of object. 

class Account
{
	int acc_no;
	String name;
	float amount;
	void Insert(int a ,String n ,float amt)
	{
		acc_no=a;
		name=n;
		amount=amt;
	}
	void deposit(float amt)
	{
		amount=amount+amt;
		System.out.println(amt+"deposited");
	}
	void withdraw(float amt)
	{
		if(amount<amt)
		{
			System.out.println("Insufficient balance");
		}
		else
		{
			amount=amount-amt;
			System.out.println(amt+"withdraw");
		}
	}
	void checkBalance()
	{
	System.out.println("Balance is "+amount);
	}
	void display()
	{
	System.out.println(acc_no+" "+name+" "+amount);
	}
}
class TestAccount
{
	public static void main(String[] args)
	{
	Account a1=new Account();
	a1.Insert(832345,"Ankit",1000);
	a1.display();
	a1.checkBalance();
	a1.deposit(40000);
	a1.checkBalance();
	a1.withdraw(15000);
	a1.checkBalance();
	}
}
