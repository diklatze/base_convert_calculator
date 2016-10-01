package numberconvertor_better;

import java.util.Scanner;

public class CheckInput {

	static int checkInput() {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter an integer that you would like calculate: ");	
		
		int number;
		
		while (true) {
			if (input.hasNextInt()) {
				number = input.nextInt();
				if (number > 0)
					break;
				else
					input.nextLine();
					System.out.print("please enter a positive integer that you would like calculate: ");
					continue;
			}
			
			input.nextLine();
			System.out.println("wrong input!!!");
			System.out.print("please enter an integer that you would like calculate: ");
		}
		
		input.close();
		return number;
	}		

}
		
		
		


