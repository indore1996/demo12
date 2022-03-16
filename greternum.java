package operator;
import java.util.Scanner;

public class greternum {

	public static void main(String[] args) {
		int a,b,temp;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the first number");
		a=sc.nextInt();
		System.out.println("Enter the second number");
		b= sc.nextInt();
		temp= a>b ? a:b;
		System.out.println("The largest number"+temp);
		

	}

}
