
public class TempProg4 {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		int d=40;
		System.out.println("Before swapping:");
		System.out.println("The value of a,b,c,d = "+a+","+b+","+c+","+d);
		//logic
		System.out.println();
		a=a+b+c+d; // a=10+20+30+40=100
		b=a-b-c-d; // b=100-20-30-40=10
		c=a-b-c-d; // c=100-10-30-40=20
		d=a-b-c-d; // d=100-10-20-40=30
		a=a-b-c-d; // a=100-10-20-30=40
		System.out.println("After swapping: ");
		System.out.println("The value of a,b,c,d = "+a+","+b+","+c+","+d);
	}
}
