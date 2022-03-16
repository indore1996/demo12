package demo;
import java.util.Scanner;

public class read {

	public static void main(String[] args) {
		int marks ;
		Scanner s= new Scanner(System.in);
		System.out.println("enetr your marks");	
		marks =s.nextInt();
		String result = marks >=40 ? "pass":"fail";
		System.out.println(result);

	}

}
