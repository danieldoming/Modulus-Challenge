import java.util.Scanner;

public class modulusChallenge
	{
		public static void main(String [] args){
			leapYearChallenge();
			fizzBuzzChallenge();
		}
		private static void leapYearChallenge()
			{
				Scanner userInput = new Scanner(System.in);
				
				System.out.println("Please enter a year");
				int year = userInput.nextInt();
				if((year % 100 == 0) && (year % 400 != 0)){
					System.out.println("not a leap year");
				}
				else if(year % 4 == 0) {
					System.out.println("This is a leap year");
				}		
				else{
					System.out.println("This is not a leap year");
				}
				
			}
		private static void fizzBuzzChallenge()
			{
				for(int i = 1; i<=100; i++){
					
					if((i%3 == 0) && (i%5 == 0)){
						System.out.println("FizzBuzz");
					}
					else if(i%3 == 0){
						System.out.println("Fizz");
					}
					else if (i%5 == 0){
						System.out.println("Buzz");
					}
					else{
						System.out.println(i);
					}
					
				}
				
			}

	
	}

	
	
