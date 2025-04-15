package assignments_B45;

import java.util.Arrays;

//In given string, remove all spaces involved using replaceAll function
public class Ass_B45_31_String_ReplaceAll_function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="My name is Sujani";	
		System.out.println("String before replacement is " + s);
		s.replaceAll(" ","f");	
		System.out.println("String after replacement,but stored in same variable 's' is not possible " + s);
		String s1= s.replaceAll(" ","f");	
		//As string is immutable ,replaced string need to be stored in new string variable.
		System.out.println("String after replacement is " + s1);
		
		String []a1= s.split(" ");
		System.out.println(Arrays.toString(a1));
		
		String []a2= s.split(" ",2);
		System.out.println(Arrays.toString(a2));
		
		String []a3= s.split(" ",3);
		System.out.println(Arrays.toString(a3));
		
		
		
		
		
		
		
	}

}
