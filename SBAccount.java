
public class SBAccount extends Account{
	@Override
	public double calculateInterest() {
		
		String accountType = "Normal";
		if(accountType.equalsIgnoreCase("Normal"))
		{
			setinterestRate(4);
		}
		else {
			setinterestRate(6);
		}
		
		double interestRate = getinterestRate();
		double amount = getamount();
		double interest = amount * interestRate/100;
		return interest;
	}
	public double getamount()
	{
		return amount;
	}
	public void setamount(double amount)
	{
		this.amount = amount;
	}
	public double getinterestRate()
	{
		return interestRate;
	}
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate; 
	}
}
