import java.util.Scanner;


public class additionFunction 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		addTwoNums obj = new addTwoNums();
		int sum = obj.addNums(num1, num2);
		System.out.println("The sum of given two numbers is: " + sum);
	}
}

class addTwoNums
{
	int addNums(int a, int b)
	{
		return a + b;
	}
}