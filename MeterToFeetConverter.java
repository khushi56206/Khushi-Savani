import java.util.Scanner;

public class MeterToFeetConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
       
            System.out.print("Enter distance in meters: ");
            double meters = sc.nextDouble();

         
            double feet = meters * 3.28084;

           
            System.out.printf("Distance in feet: %.2f\n", feet);

        } catch (Exception e) {
            System.out.println("Invalid input! Please enter a numeric value.");
        } finally {
            sc.close();
        }
    }
}