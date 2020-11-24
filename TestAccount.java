package Exercise;
import java. util.Scanner;

public class TestAccount {
	
	
	private static  double OpeningBalance = 0;

	public static void main(String[] args) {
		
		Account peter = new Account();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Choose from the following:");
		System.out.println("1.Add Account \n 2.Remove Account \n 3.Access Account \n 4.View Accounts \n 0.Exit");
		
		int choose = input.nextInt();
		
		if(choose == 1) {
			System.out.println("Enter your account name");
			String AccountName = input.nextLine();
			System.out.println("Account Name is: "+ AccountName);
			
			System.out.println("Enter your Account number");
			int AccountNumber = input.nextInt();
			System.out.println("Account Number is: "+ AccountNumber);
			
			System.out.println("Enter your Opening Balance");
			double OpeningBalance = input.nextInt();
			System.out.println("Account Number is: "+ OpeningBalance);
		}else 
			if(choose ==2) {
				System.out.println("Enter your Account number");
				int AccountNumber = input.nextInt();
				if(OpeningBalance < 0) {
					System.out.println("Warning!! Balance too low");
				}else {
					System.out.println("Your account balance is:"+ OpeningBalance);
				}
				
			}else
				if(choose == 3) {
					System.out.println("Enter your Account number");
					int AccountNumber = input.nextInt();
					
					System.out.println("Choose from the options below");
					System.out.println("1. View balance \n 2. Make deposit \n 3. Make withdraw \n 4. View Statement \n 5. Exit");
					int choose2 = input.nextInt();
					
					if(choose2 == 1) {
						System.out.println("Your balance is:"+ OpeningBalance);
					}else
						if(choose2 == 2) {
							System.out.println("Enter the amount to deposit");
							double deposit = input.nextDouble();
							
							OpeningBalance+=deposit;
							System.out.println("Your new balance after deposit is: "+OpeningBalance);
						}else 
							if(choose2 == 3) {
								System.out.println("Enter the amount to withdrwa");
								double withdraw = input.nextDouble();
								
								OpeningBalance-=withdraw;
								System.out.println("Your new balance after withdraw is: "+OpeningBalance);
								
							}else
								if(choose2 ==4) {
									System.out.println("Your previous transactions are:" );
								}else
									
									if(choose2 == 5) {
										System.out.println("Choose from the following:");
										System.out.println("1.Add Account \n 2.Remove Account \n 3.Access Account \n 4.View Accounts \n 0.Exit");
										
										choose = input.nextInt();
									}
					
				} else {
					System.out.println("Wrong AccountNumber");
				}
		 
	}

}
