import java.util.Scanner;

public class Enforcement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a;
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b;
        b= scanner.nextDouble();
        System.out.println("Enter c: ");
        double c;
        c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(quadraticEquation.getRoot());
    }
}
