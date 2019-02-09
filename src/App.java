import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		System.out.println("Welcome to BMI calculator!");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your height (in cm): ");
		float h = input.nextFloat();
		
		System.out.println("Enter your weight (in kg): ");
		float w = input.nextFloat();
		
		Bmi bmi1 = new Bmi();
		bmi1.height = h;
		bmi1.weight = w;
		
		float myBmi = bmi1.calculateBmi();
		
		System.out.printf("Your BMI is %.1f\n", myBmi);
		bmi1.healthyWeight(myBmi);

	}

}
