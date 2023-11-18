public class OverloadedMethods {
    public static void main(String[] args) {
        
        // overloaded methods are methods that share the same name, but diff parameters
        // method name + parameters = method SIGNATURE

        double x = add(1.0,2.0, 3.0, 4.0);
        
        // int x = add (1, 2 ,3)  // -- example 

        // 1, 2 , 3 , 4  is represented by a , b , d , d 
        // the end result will display whichever below overloaded method that MATCHES the data types called in main scope, 
        // as well as the number of parameters they contain

        System.out.println(x);


    }

     static int add(int a, int b) {
        System.out.println("this is o. method #1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println(" o. method #2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println(" o. method #3");
        return a + b + c + d;
    }

    // doubles 

    static double add(double a, double b) {
        System.out.println("this is o. method #4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println(" o. method #5");
        return a + b + c;
    }

    static double add(double a, double b, double c, double d) {
        System.out.println(" o. method #6");
        return a + b + c + d;
    }
}
