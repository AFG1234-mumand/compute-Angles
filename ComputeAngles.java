
import java.util.Scanner;

public class ComputeAngles {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter X1");
        double X1 = input.nextDouble();
        System.out.println("Enter Y1");
        double Y1 = input.nextDouble();
        System.out.println("Enter X2");
        double X2 = input.nextDouble();
        System.out.println("Enter Y2");
        double Y2 = input.nextDouble();
        System.out.println("Enter X3");
        double X3 = input.nextDouble();
        System.out.println("Enter Y3");
        double Y3 = input.nextDouble();

        double a, b, c;
        a = Math.sqrt(Math.pow(X2 - X3, 2) + Math.pow(Y2 - Y3, 2));
        System.out.println("the result of a is " + a);
        b = Math.sqrt(Math.pow(X1 - X3, 2) + Math.pow(Y1 - Y3, 2));
        System.out.println("the result of b is " + b);
        c = Math.sqrt(Math.pow(X1 - X2, 2) + Math.pow(Y1 - Y2, 2));
        System.out.println("the result of c is " + c);

        double A, B, C;
        A = Math.toDegrees(Math.acos((c * c + b * b - a * a) / (2 * b * c)));
        B = Math.toDegrees(Math.acos((c * c + a * a - b * b) / (2 * a * c)));
        C = Math.toDegrees(Math.acos((a * a + b * b - c * c) / (2 * a * b)));
        
        System.out.println("the angle A is " + A);
        System.out.println("the angle B is " + B);
        System.out.println("the angle C is " + C);

    }

}
