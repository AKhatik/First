import java.util.Scanner;
public class Fibonacci {
	int a=0,b=1,c,n;
	void get() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Range=>");
		n=sc.nextInt();
	}
	void cal() {
		for(int i=1;i<=n;++i) {
			System.out.println(a);
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci f1=new Fibonacci();
		f1.get();
		f1.cal();
	}
}
