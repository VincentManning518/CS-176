import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int sum = 0;
		System.out.print("Please input an integer: ");
		int n = in.nextInt();
		System.out.println();
		
		while(n > 0)
		{
		sum = sum + n % 10;
		n = n /10;
	}

		System.out.println("The sum of the digits is: " + sum);
}
}