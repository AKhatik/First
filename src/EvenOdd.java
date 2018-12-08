import java.util.Scanner;
public class EvenOdd {
	int n;
	void get() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:-");
		n =sc.nextInt();
	}
	void cal() {
		if(n%2==0)
			System.out.println("Number is Even");
		else
			System.out.println("number is odd");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenOdd e1 = new EvenOdd();
		e1.get();
		e1.cal();
	}
}