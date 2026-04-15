import java.util.Scanner;

public class CramersRuleSolver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
   
            System.out.print("Enter a: ");
            double a = sc.nextDouble();

            System.out.print("Enter b: ");
            double b = sc.nextDouble();

            System.out.print("Enter c: ");
            double c = sc.nextDouble();

            System.out.print("Enter d: ");
            double d = sc.nextDouble();

            System.out.print("Enter e: ");
            double e = sc.nextDouble();

            System.out.print("Enter f: ");
            double f = sc.nextDouble();

  
            double D = a * d - b * c;
            double Dx = e * d - b * f;
            double Dy = a * f - e * c;

            
            if (D == 0) {
                System.out.println("The system has no unique solution (D = 0).");
            } else {
                double x = Dx / D;
                double y = Dy / D;

                System.out.println("Solution:");
                System.out.println("x = " + x);
                System.out.println("y = " + y);
            }

        } catch (Exception ex) {
            System.out.println("Invalid input! Please enter numeric values.");
        } finally {
            sc.close();
        }
    }
}