import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		while(true) { 
		System.out.print("\nCalculator program : \n1. Addition\n2. Subtraction\n3. Multiplication\n4. Division \n5. Exit\nSelect an option : ");
		int c=sc.nextInt();
		System.out.print("Enter a value : ");
		int a = sc.nextInt();
		System.out.print("Enter a value : ");
		int b = sc.nextInt();
		switch(c) {
		case 1:
			System.out.println("\nThe output is : "+sum(a,b));
			break;
		case 2:
			System.out.println("\nThe output is : "+subtract(a,b));
			break;
		case 3:
			System.out.println("\nThe output is : "+multiply(a,b));
			break;
		case 4:
			System.out.println("\nThe output is : "+divide(a,b));
			break;
		case 5:
			System.exit(0);
			break;
		default:
			System.out.println("Enter a valid input....");;
			break;
		}}
	}
	public static int sum(int a,int b) {
		return a+b;
	}
	public static int subtract(int a,int b) {
		return a-b;
	}
	public static int multiply(int a,int b) {
		return a*b;
	}
	public static int divide(int a,int b) {
		return a/b;
	}
}
