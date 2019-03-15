//correct card number is 4503
package atm;
public class Atmclass {
	private String balance;
	public Atmclass(String balance)
	{
		this.balance= balance;
	}
	
	public String getbalance() {
		return  balance;
	}
	public void setbalance(String balance) {
		this.balance= balance;
	}
	public void deposit (double amountd) {
		double b=Double.parseDouble(balance);
		b=b+amountd;
		balance=Double.toString(b);
	}
	
    public void withdraw (double amountw) {
		double b=Double.parseDouble(balance);

		if (amountw>b)
			System.out.println("Error! Amount is greater than balance.");
		else
		{
			b=b-amountw;	
			balance=Double.toString(b);
		}
		
	}

    //Test for logic code.
	public static void main(String[] args)
	{
		Atmclass Atm_system1=new Atmclass("10.5");
		Atm_system1.deposit(12.0);
        //Atm_system1.withdraw(5.0);
	    System.out.println("The Balance is " + Atm_system1.getbalance());
	
	}
	
}