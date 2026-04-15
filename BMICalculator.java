import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightPounds = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightInches = input.nextDouble();
   double weightKg = weightPounds * 0.45359237;
        double heightMeters = heightInches * 0.0254;

 
        double bmi = weightKg / (heightMeters * heightMeters);


        System.out.printf("Your BMI is: %.2f\n", bmi);

        input.close();
    }
}
