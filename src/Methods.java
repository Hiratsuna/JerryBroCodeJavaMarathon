public class Methods {
    public static void main(String[] args) {   // main = method
        
        // method = block of code that is executed when it is called upon

        // String name = "Jerry";
        // int age = 25;

        // sup(name, age);   // can pass more than 1x parameter in a method
        
        int x = 3;
        int y = 2;

       /// int z = add(x, y);

      ///  System.out.println(z);
    
        System.out.println(add(x,y));

    // the method needs to be preceeded with 'static', so it can be called inside the main BECAUSE IT IS CALLED IN A **STATIC** METHOD ABOVE
    // method outside of the 'main' method vvv
    // static void sup(String name, int age) {      // passing down the parameters is done by calling the data type and name as an arguement
    //     System.out.println("sup "+name+" "+age);

    }

    static int add( int x, int y) {

        int z = x + y - 1 ;
       // System.out.println(z);
        return z;
       
       
    }                //void is typed only if you are RETURNING something
}
