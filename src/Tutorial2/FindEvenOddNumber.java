package Tutorial2;

import java.util.Scanner;

public class FindEvenOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter number :");
		Scanner sc =new Scanner(System.in);
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println(n+" is even number");
		}
		else
		{
			System.out.println(n+" is odd number");
		}
		

	}

}
