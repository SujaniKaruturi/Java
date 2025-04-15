package CodePractice;

public class StringFuntions {

	public static void main(String[] args)
	{
		
		String name = "India";
		int l = name.length();
		System.out.println(l);
		
		String name2= "      is a country ";
		System.out.println(name.concat(name2));  //adding two strings
		System.out.println(name.concat("   is capital of delhi"));
		
		System.out.println(name.toUpperCase());  //convert into upper case
		System.out.println(name.toLowerCase());	//convert into lower case
		
		System.out.println(name2.trim());		//Trim will remove the spaces before starting and after end of the string 
		 
		System.out.println("substring with 1 para is _" + name.substring(1));
		System.out.println("substring with 1 para is _" + name.substring(4));
		System.out.println("substring with 2 para is _" + name.substring(1, 4)); //i.e 1,4-1=3
		
		System.out.println("char at the given index _" + name.charAt(3));
		System.out.println("index of the char is _" + name.indexOf("d"));
		
		System.out.println("India contains ia " + name.contains("ia"));
		System.out.println("India contains oe " + name.contains("oe"));
		
		System.out.println("check 2 strings are equal " + name.equals("Sujani"));
		System.out.println("check 2 strings are equal " + name.equals("India"));
		
		System.out.println("last index of particular character" + name.lastIndexOf("i"));
		
		System.out.println("String is empty  " + name.isEmpty());
		String name3 = "";
		String name5 = " ";  //space
		System.out.println("String name3 is empty  " + name3.isEmpty());  //true
		System.out.println("String name4 is empty  " + name3.isEmpty());	//true
		
		
		String name6="Sujani";
		int i=name6.length(); //6
		//System.out.println(i);
		int j;
		for(j=0;j<i;j++) 
		{
			System.out.println(name6.charAt(j));
		
		}
		
		String p="GroTechMinds";
		System.out.println("substring with 2 para is " + p.substring(0, 3));
		System.out.println("substring with 2 para is " + p.substring(3, 7));
		System.out.println("substring with 2 para is " + p.substring(7, 12));
		
		String o="India is a country";	//space is considered as 1 index value
		String p1 =o.substring(0, 5);
		String p2 =o.substring(6, 8);
		String p3 =o.substring(9, 10);
		String p4 =o.substring(11, 18);
		String p5= p1.concat(p2);
		String p6= p3.concat(p4);
		String p7= p5.concat(p6);
		System.out.println("substring with 2 para is " + o.substring(0, 5));
		System.out.println("substring with 2 para is " + o.substring(6, 8));
		System.out.println("substring with 2 para is " + o.substring(9, 11));
		System.out.println("substring with 2 para is " + o.substring(11, 18));
		System.out.println("concat all strings " + p1.concat(p2));
		System.out.println("concat all strings " + p3.concat(p4));
		System.out.println("concat all strings " + p5.concat(p6));
		
		//other way just by joining strings
		System.out.println("joining all strings " + p1+p2+p3+p4);
		
		//other way is using print
		System.out.print("concat all strings using print " + p1.concat(p2));
		System.out.println(p3.concat(p4));
		
		String w="My name is god";
		System.out.println("substring with 2 para is " + w.substring(0,2));
		System.out.println("substring with 2 para is " + w.substring(3, 7));
		System.out.println("substring with 2 para is " + w.substring(8, 10));
		System.out.println("substring with 2 para is " + w.substring(11, 14));
		int u;
		for(u=0;u<5;u++) 
		{
			
		}
		
		
		
	}
	

}
