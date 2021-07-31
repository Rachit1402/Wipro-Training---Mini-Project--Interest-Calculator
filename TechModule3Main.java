import java.util.*;

public class TechModule3Main {

	public static void main(String[] args) {
		
		
		int noOfDays = 0;
		int choice = 0;
		@SuppressWarnings("resource")
		Scanner Scan = new Scanner(System.in);
		do {
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			System.out.println("Enter your option (1..4) : ");
			
			choice =Scan.nextInt();
			
			switch(choice){
				case 1:
					SBAccount sbaccount = new SBAccount();
					System.out.println("Enter the Average amount in your account : ");
					sbaccount.setamount(Scan.nextDouble());
					System.out.println("Interest gained : Rs "+ sbaccount.calculateInterest());
					break;
				case 2:
					FDAccount fdaccount = new FDAccount();
					System.out.println("Enter the FD Amount : ");
					fdaccount.setamount(Scan.nextDouble());
					
					System.out.println("Enter the number of days : ");
					fdaccount.setnoOfDays(Scan.nextInt());
					
					while (noOfDays < 0)
					{
						System.out.println("Invalid number of days. Please enter non - negative values");
						System.out.println("Enter the number of days : ");
						noOfDays = Scan.nextInt();
					}

					System.out.println("Enter your age : ");
					fdaccount.setageOfACHolder(Scan.nextInt());
					int ageOfACHolder = Scan.nextInt();
					
					while (ageOfACHolder < 0)
					{
						System.out.println("Invalid age. Please enter non - negative values");
						System.out.println("Enter the age : ");
						ageOfACHolder = Scan.nextInt();
					}
					fdaccount.setageOfACHolder(ageOfACHolder);
					System.out.println("Interest gained is : Rs "+fdaccount.calculateInterest());
					break;
				case 3:
					RDAccount rdaccount = new RDAccount();
					System.out.println("Enter the RD amount : ");
					rdaccount.amount(Scan.nextDouble());
					System.out.println("Enter the number of months : ");
					int noOFMonths = Scan.nextInt();
					while(noOFMonths < 0)
					{
						System.out.println("Invalid month. please enter non - negative values");
						System.out.println("Enter the number of months : ");
						noOFMonths = Scan.nextInt();
					}
					rdaccount.setnoOFMonths(noOFMonths);
					System.out.println("Enter the age : ");
					int ageOfHolder = Scan.nextInt();
					while(ageOfHolder < 0)
					{
						System.out.println("Invalid age. Please enter a non - negative values : ");
						System.out.println("Enter the age of the account Holder  :");
						ageOfHolder = Scan.nextInt();
					}
					rdaccount.setageOfHolder(ageOfHolder);
					System.out.println("Interest gained is : Rs "+rdaccount.calculateInterest());
					System.out.println();
					break;
				}
		}while(!(choice == 4));
	}
}