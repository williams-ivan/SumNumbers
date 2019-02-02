import java.util.Scanner; //to use the Scanner class

public class SumNums {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); //Scanner object for getting the input
		System.out.print("Enter amount: ");
		int num = in.nextInt(), sum = 0; //nextInt for reading an integer
		for(int i = 0; i < num; i++){ //a for loop that runs as many times as the value of num
			System.out.print("Enter value (" + (i + 1) + "): ");
			int tmp = in.nextInt();
			sum += (tmp > 0) ? tmp : 0; //the conditional operator for calculating the sum elegantly
		}
		System.out.println("The sum is " + sum);
		in.close(); //closes the Scanner object
	}
}