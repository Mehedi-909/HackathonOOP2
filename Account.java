package lab;

public class Account {

	
	long accountNumber=0,nid;
	String name,password;
	double balance=0.00;
	
	Account(long accountNumber,String name,long nid,double balance,String pass){
		
		this.accountNumber=accountNumber;
		this.name=name;
		this.nid=nid;
		this.balance=balance;
		this.password=pass;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAccNumber(long num) {
		this.accountNumber=num;
	}
	
	public long getAccNumber() {
		return accountNumber;
	}
	
	public double deposit(long amount) {
		
		balance=balance+amount;
		return balance;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	public void setPassword(String pass) {
		this.password=pass;
	}
	
	public double withdraw(long amount) {
		
		balance=balance-amount;
		return balance;
	}
	
	public double getBalance() {
		return balance;
	}
}
