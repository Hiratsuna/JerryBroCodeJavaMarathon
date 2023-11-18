import java.util.ArrayList;

public class ArrayLists {
    public static void main(String[] args) {

        // declaring the variable you'd be working with in the Array List
        // is done by writing the data type <inside>  >>> <brackets like this>

        ArrayList<String> food = new ArrayList<String>();

        food.add("sushi");
        food.add("burger");
        food.add("broccoli");

        food.set(0, "carrots");   // declare/replace index
        food.remove(1);                   // remove index
        food.clear();                           // clear 


        for(int i = 0; i < food.size(); i++) {
            System.out.println(food.get(i));
        }

    }
}

