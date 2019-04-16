package lab;

public class Account {

	
	long accountNumber=0,nid;
	String name;
	double balance=0.00;
	
	Account(long accountNumber,String name,long nid,double balance){
		
		this.accountNumber=accountNumber;
		this.name=name;
		this.nid=nid;
		this.balance=balance;
	}
	
	public double deposit(long amount) {
		
		balance=balance+amount;
		return balance;
	}
	
public double withdraw(long amount) {
		
		balance=balance-amount;
		return balance;
	}
}
