
@SuppressWarnings("unused")
public class RDAccount extends Account{
	private int noOFMonths;
	private double monthlyAmount;
	private int ageOfHolder;
	@Override
	public double calculateInterest()
	{
		double interestRate = 0;
		double interest = 0;
		if(ageOfHolder<60)
		{
			if(noOFMonths<6)
			{
				interestRate = 7.50;
			}
			else if(noOFMonths >=6 && noOFMonths < 9)
			{
				interestRate = 7.75;
			}
			else if(noOFMonths >=9 && noOFMonths < 12)
			{
				interestRate = 8.00;
			}
			else if(noOFMonths >= 12 && noOFMonths < 15)
			{
				interestRate = 8.25;
			}
			else if(noOFMonths >= 15 && noOFMonths < 18)
			{
				interestRate = 8.50;
			}
			else if(noOFMonths >= 18 && noOFMonths < 21)
			{
				interestRate = 8.75;
			}
		}
		else
		{
			interestRate += 0.5;
		}
		interest = amount * interestRate/100;
		return interest;
	}
	
	public int getnoOFMonths()
	{
		return noOFMonths;
	}
	public void setnoOFMonths(int noOFMonths)
	{
		this.noOFMonths = noOFMonths;
	}
	public double getmonthlyAmount()
	{
		return monthlyAmount;
	}
	public void monthlyAmount(int monthlyAmount)
	{
		this.monthlyAmount = monthlyAmount;
	}
	public int getageOfHolder()
	{
		return ageOfHolder;
	}
	public void setageOfHolder(int ageOfHolder)
	{
		this.ageOfHolder = ageOfHolder;
	}
	public double getinterestRate()
	{
		return interestRate;
	}
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}

	public double getamount(){
		return amount;
	}

	public void amount(double amount) {
		this.amount = amount;
	}
	
}
