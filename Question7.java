
public class Question7 {

	public static void main(String[] args) {
		// write a java program to exchange the value of two variables of integer type X and Y 
		// using third temporary variable Z
		int x=10;
		int y=20;
		System.out.println("Previously x = "+x+" y = "+y);
		int temp_var=x;
		x=y;
		y=temp_var;
		System.out.println("After swapping ");
		System.out.println("x = "+x+" y = "+y);
		

	}

}
