public class DataTypes {
    public static void main(String[] args) {
        /*
        * primitive
        boolean - 1 bit - primitive - true or false
        byte - 1 byte - primitive - -128 to 127
        short - 2 bytes - primitive - -32,768 to 32 767
        int - 4 bytes - primitive - -2 billion to 2 billion
        long - 8 bytes - primitive - -9 quintillion to 9 quintillion

        float - 4 bytes - primitive - 5 to 7 digits fractional numbers 3.1412314f (ex.)
        double - 8 bytes - primitive - fractional up to 15 digits
        char - 2 bytes - primitive - single character
        String - varies - reference - sequence of characters
        *  reference /are user defined/

        int x;  //declaration
        x = 123;  // assignment
        */

        int y = 123; // initialization
        System.out.println("My number is: "+y);

        long x = 1231231241234454646L;
        double u = 12312.56;
        float a = 123.56f;
        char symbol = '@';
        String name = "Jerry";

        System.out.println(symbol);
        System.out.println("Hello I am "+ name);



    }
}
