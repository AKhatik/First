import java.util.Scanner;
public class Palindrom {
	int n,rem,rev=0,temp;
	void get() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number:-");
		n=s.nextInt();
	}
	void cal() {
		temp=n;
		while(n!=0) {
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(temp==rev)
			System.out.println("No. is palindrom");
		else
			System.out.println("No. is not palindrom");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrom p1=new Palindrom();
		p1.get();
		p1.cal();
	}
}