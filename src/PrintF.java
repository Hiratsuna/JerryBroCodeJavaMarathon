public class PrintF {
    public static void main(String[] args) {
        
        // printf = optional method to control, format & display text to the console window
        //          two arguements = format string + (object/variable/value)
        //          % [flags] [precision] [width] [conversion-character]
        // % = format specifier

        // System.out.printf("%d this is a FORMAT string ", 69);

        //          two arguements = format string("this is a FORMAT sting") + (object/variable/value---123)
        // %d <- 'd' represents decimal & is called a conversion character


        // [conversion-character]
        // boolean myBoolean = true;  // %b
        // char myChar = '$';         // %c  
        // String myString = "Jerry"; // %s
        // int myInt = 50;            // %d 
        double myDouble = 1000;       // %f 


        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [width]
        // minimum nr of characters to be written as output
        // declare it before the [conversion-character] -> %'3's -> minimum 3 symbols 
        /// System.out.printf("Hello %2s", myString); 
        // if the string declared is shorter than the min, it will add them as PADDING chars BEFORE the value
        // if the number is negative like %'-3's, it will add the PADDING AFTER the value

        // [precision]
        ///System.out.printf(" u have %.3f money ", myDouble);
        // precision can be manipulated by adding '.'+ 'number of digits' we wanna limit it to displaying 
        // .. manipulating it's precision xD

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        /// - : left-justify
        /// + : output a '+' or '-' sign for a numeric value
        /// 0 : numeric values are zero-PADDED
        /// , : comma grouping separator if numbers > 1000
        System.out.printf("changing the money amt to negative %+0,420f", myDouble);  
        // % '+' display positive number, '0', ',' grouping separator, add padding, '420' times

    }
    
}
