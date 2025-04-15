package assignments_B45;

public class Ass_B45_91_Assert_Keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		assert(a>=18):"Person cannot vote"; 	
		//to enable assertion in java,click on RunAs-->Run Configurations-->Arguments-->Type "-ea" under VM Arguments and apply.
		//Then only we can see java.lang.AssertionError: in console. Else we cannot view this exception in console

	}

}
