
public class FDAccount extends Account{
	private int noOfDays;
	private int ageOfACHolder;
	
	@SuppressWarnings("unused")
	@Override
	public double calculateInterest() {
		double interestRate = 0;
		double interest =0;
		if(amount<10000000)
		{
			if(ageOfACHolder < 65)
				{
				if(noOfDays>=7 && noOfDays<=14)
				{
					interestRate = 4.50;
				}
				else if(noOfDays>=15 && noOfDays<=29)
				{
					interestRate = 4.75;
				}
				else if(noOfDays>=30 && noOfDays<=45)
				{
					interestRate = 5.50;
				}
				else if(noOfDays>=46 && noOfDays<=60)
				{
					interestRate = 7.00;
				}
				else if(noOfDays>=61 && noOfDays<=184)
				{
					interestRate = 7.50;
				}
				else if(noOfDays>=185 && noOfDays<=365)
				{
					interestRate = 8.00;
				}
			}
			if(ageOfACHolder>=65)
			{
				if(noOfDays>=7 && noOfDays<=14)
				{
					interestRate = 5.00;
				}
				else if(noOfDays>=15 && noOfDays<=29)
				{
					interestRate = 5.25;
				}
				else if(noOfDays>=30 && noOfDays<=45)
				{
					interestRate = 5.50;
				}
				else if(noOfDays>=46 && noOfDays<=60)
				{
					interestRate = 7.50;
				}
				else if(noOfDays>=61 && noOfDays<=184)
				{
					interestRate = 8.00;
				}
				else if(noOfDays>=185 && noOfDays<=365)
				{
					interestRate = 8.50;
				}
			}
			
		}
		else
		{
			if(noOfDays>=7 && noOfDays <=14)
			{
				interestRate = 6.50;
			}
			else if(noOfDays>=15 && noOfDays <=29)
			{
				interestRate = 6.75;
			}
			else if(noOfDays>=30 && noOfDays <=44)
			{
				interestRate = 6.75;
			}
			else if(noOfDays>=45 && noOfDays <=60)
			{
				interestRate = 8.00;
			}
			else if(noOfDays>=61 && noOfDays <=184)
			{
				interestRate = 8.50;
			}
			else if(noOfDays>=185 && noOfDays <=365)
			{
				interestRate = 10.0;
			}
		}
		interest = amount* interestRate/100;
		return interest;
	}
	public int getnoOfDays()
	{
		return noOfDays;
	}
	public void setnoOfDays(int noOfDays)
	{
		this.noOfDays = noOfDays;
	}
	public int getageOfACHolder()
	{
		return ageOfACHolder;
	}
	public void setageOfACHolder(int ageOfACHolder)
	{
		this.ageOfACHolder = ageOfACHolder;
	}
	public double getinterestRate()
	{
		return interestRate;
	}
	public void setinterestRate(double interestRate)
	{
		this.interestRate = interestRate;
	}
	public double getamount()
	{
		return amount;
	}
	public void setamount(double amount) {
		this.amount = amount;
		
	}
}
