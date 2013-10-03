public class Account {
		
private String name, owner;
private double balance ;


private Account(){
		name = "name";
		owner = "owner";
		balance = 0;
}


private Account(String s, String t, double b){
	s = name;
	t = owner;
	b = balance;
}


public void deposit(double b){
	balance = b + balance;
	}


public void withdraw(double b){
		balance = balance - b;
}


public void close(){
		balance = 0;
		owner = "";
}

String getAccountName(){
		return name;
}


String getOwner(){
		return owner;
}


double getBalance(){
		return balance;
}


void setName(String s){
		name = s;
		System.out.println("name = s");
}


void setOwner(String s){
		owner = s;
		System.out.println("owner = s");
}

public String toString(){
	return "Owner: " + owner+ "  name: " +name+"  balance:  " + balance;
}





public static void main (String args[]){
	Account demo =  new Account();
	Account newdemo = new Account("ss","", 0.0);

	System.out.println(demo.toString());
	System.out.println(newdemo.toString());
	demo.deposit(25);
	System.out.println(demo.getOwner());
	System.out.println(demo.getBalance());
	demo.withdraw(10);
	System.out.println(demo.getOwner());
	System.out.println(demo.getBalance());
	demo.close();
	System.out.println(demo.getOwner());
	System.out.println(demo.getBalance());
	demo.setName("cool");
	demo.setOwner("sweet");
	System.out.println(demo.toString());
	
	
	

	
}

}
