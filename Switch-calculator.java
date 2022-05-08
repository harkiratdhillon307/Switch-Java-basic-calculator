import java.util.*;

public class FirstClass {
	public static void main(String args[]) {

		System.out.println("Small Calculator\n");
		System.out.println("1.Addition");
		System.out.println("2.Subraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Devision\n");
		
		System.out.println("Choose Option:");

		Scanner sc = new Scanner(System.in);
		int button = sc.nextInt();
		String y = "\nEnter 1st Number:";
		String x = "Enter 2nd Number:";
		String z = "\nAnswer:";

		switch (button) {
		case 1 :
			System.out.println(y);
			int a = sc.nextInt();
			System.out.println(x);
			int b = sc.nextInt();
			System.out.println(z);
			System.out.println(a + b);
			break;
		case 2 :
			System.out.println(y);
			int c = sc.nextInt();
			System.out.println(x);
			int d = sc.nextInt();
			System.out.println(z);
			System.out.println(c - d);
			break;
		case 3 :
			System.out.println(y);
			int e = sc.nextInt();
			System.out.println(x);
			int f = sc.nextInt();
			System.out.println(z);
			System.out.println(e * f);
			break;
		case 4 :
			System.out.println(y);
			int g = sc.nextInt();
			System.out.println(x);
			int h = sc.nextInt();
			System.out.println(z);
			System.out.println(g / h);
			break;
		default :
			System.out.println("Invalid option");
		}

	}
}