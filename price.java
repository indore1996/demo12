package operator;
import java.util.Scanner;

public class price {

	public static void main(String[] args) {
		float discount;
		Scanner s= new Scanner(System.in);
		System.out.println("enter product name");
		String st= s.nextLine();
		System.out.println("enetr product price");
		float r= s.nextFloat();
		if (r>2000);
		{
			discount =((r*10)/100);
		}
		
			discount =((r*7)/100);
		
		System.out.println("the discount is"+discount);

	}

}
