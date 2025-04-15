package assignments_B45;

import java.util.Scanner;

public class Ass_b45_56_Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s1.nextInt();
		switch(age)
		{
		case 18: 
			System.out.println("Teen Ager");
			break;
		case 1:
			System.out.println("Just born");
		case 3:
			System.out.println("Toodler");
		case 5:
			System.out.println("School Child");
			break;		//Case 1,3 -stops here as break is only seen in case 5
		case 25:
			System.out.println("Mid Age");
			break;
		case 35:
			System.out.println("Adult");
			break;
		case 55:
			System.out.println("Old age");
			break;
		default: 
			System.out.println("age Entered is not matching to any case");
			
	}
}
	
}
