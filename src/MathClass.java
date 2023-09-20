import java.util.Scanner;

public class MathClass {
    public static void main(String[] args) {
        /*
            double x = 4.21;
            double y = 10;

            double z = Math.max(x, y);
            double j = Math.abs(y);     (absolute)
            double k = Math.sqrt(y);    (square root)
            double p = Math.round(x);
            double u = Math.ceil(x);    (round to higher)
            double t = Math.floor(x);   (round to lower)

            System.out.println(z);
            System.out.println(j);
            System.out.println(k);
            System.out.println(p);
            System.out.println(u);
            System.out.println(t);
        */

        double x;
        double y;
        double z;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y+y));

        System.out.println("The hypotenuse is : "+z);

        scanner.close();

    }
}
