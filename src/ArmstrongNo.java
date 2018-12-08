import java.util.Scanner;
public class ArmstrongNo {
	int n,sum=0,rem;
	void get() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the number:-");
		n=s1.nextInt();
	}
	void cal() {
		int temp=n;
		while(n!=0) {
			rem=n%10;
			n=n/10;
			sum=sum+rem*rem*rem;
		}
		if(temp==sum) 
			System.out.println("No.is Armstrong");
			else
			System.out.println("No.is Not Armstrong");
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNo a1 = new ArmstrongNo();
		a1.get();
		a1.cal();
	}
}
