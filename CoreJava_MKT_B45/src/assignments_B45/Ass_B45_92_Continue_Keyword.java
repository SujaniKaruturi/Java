package assignments_B45;

public class Ass_B45_92_Continue_Keyword {

	static int age=18;   //global variable colour will blue
	public static void main(String[] args) {
		
		for(int i=1;i<6;i++) 
		{ 
		if(i==3) 
		{ 
		continue;  //---->continue will skip the iteration for this particular condition  
		}
		System.out.println("i value " +i);   //local variable colour will grey
		
		} 
		System.out.println("skipped iteration 3"); 
	}
}