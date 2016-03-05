public class Module1 {
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		/* 
		 * The purpose of this program is to challenge my ability to write extendible code. I wil
		 * also tie the program into practice with version control. This program will simply take an 
		 * integer as input and spell out its name. The number will include 0-99. This program will be 
		 * extended later to include 999,999,999,999.
		 */
		
		int j = Integer.parseInt(args[0]);
		
		//Extending this method to include numbers would be entirely to tedious
		/*
		 * Instead I will be writing this program to identify whole numbers via brute force implementation.
		 */
		if( isLessThanTwenty( j ) ) // If the inputted integer is less than twenty a simple switch statement will be used
		{
			System.out.println( j );
			switch( j )
			{
				case 1: System.out.println("one");
				break;
				
				case 2: System.out.println("two");
				break;
				
				case 3: System.out.println("three");
				break;
				
				case 4: System.out.println("four");
				break;
				
				case 5: System.out.println("five");
				break;
				
				case 6: System.out.println("six");
				break;
				
				case 7: System.out.println("seven");
				break;
				
				case 8: System.out.println("eight");
				break;
				
				case 9: System.out.println("nine");
				break;
				
				case 10: System.out.println("ten");
				break;
				
				case 11: System.out.println("eleven");
				break;
				
				case 12: System.out.println("twelve");
				break;
				
				case 13: System.out.println("thirteen");
				break;
				
				case 14: System.out.println("fourteen");
				break;
				
				case 15: System.out.println("fifteen");
				break;
				
				case 16: System.out.println("sixteen");
				break;
				
				case 17: System.out.println("seventeen");
				break;
				
				case 18: System.out.println("eighteen");
				break;
				
				case 19: System.out.println("nineteen");
				break;
				
				default:
						System.out.println("The number you inputed must be greater than 20");
				break;
			}
		}

	}
	
	private static boolean isLessThanTwenty(int i)
	{
		
		return i < 20;
		
	}

}

