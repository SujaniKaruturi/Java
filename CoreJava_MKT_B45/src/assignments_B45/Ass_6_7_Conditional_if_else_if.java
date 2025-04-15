package assignments_B45;

import java.util.Scanner;

public class Ass_6_7_Conditional_if_else_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the gender F or M");
		String gender2=s.next();
		System.out.println("Enter the age");
		int age = s.nextInt();
		

		if(!(gender2=="M"))
		{
			System.out.println("Free tickets for Women");
		}
		else
		{
			if(gender2 == "M")
			{
				if (age<=2 )
				{
				System.out.println("Free Ticket");
				}
				else if(age>2 && age <=12 )
				{
					System.out.println("Half ticket");
				}
				else if(age>13 && age <=60)
				{
					System.out.println("Full Ticket -Adults");
				}
				else
				{
					System.out.println("Half Ticket -Senior Citizens");
				}
			}
		
		}
	}
}

		
	


