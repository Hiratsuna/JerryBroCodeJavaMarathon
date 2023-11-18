import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {
        
        // checks items in collections 1 by 1 

        // String [] animals = { "cat" , "dog" , "rat" , "frog" };

        ArrayList<String> animals = new ArrayList<String>();
        animals.add("cat");
        animals.add("dog");
        animals.add("rat");
        animals.add("frog");



        for(String i : animals) {     // for(data type i : array name)    
            System.out.println(i);    // for-EACH = for i : --- Each = :
        }
        
        // each index OF animals
        // EACH IS REPRESENTED BY :

    }
}
