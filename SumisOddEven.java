import java.util.Scanner;
public class EvenOdd {
	public static void main( String[] args ){
		int num1,num2,sum;
		Scanner input = new Scanner(System.in);
		num1=input.nextInt();
		num2=input.nextInt();
		sum=num1+num2;
		if (sum%2==0){
		    System.out.println("EVEN");
		}
		else{
		    System.out.println("ODD");
		}
	}
}
