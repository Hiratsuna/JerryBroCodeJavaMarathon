import java.util.ArrayList;

public class TwoDimArrayLists {
    public static void main(String[] args) {

        // ArrayList with <ArrayList> type within & then the type of the inside ArrayList<String>
        ArrayList<ArrayList<String>> randomList = new ArrayList<>();  
        
        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("coconut");
        bakeryList.add("donuts");
        bakeryList.add("garlic");

        ArrayList<String> todoList = new ArrayList();
        todoList.add("jump");
        todoList.add("pump");
        todoList.add("sleep");

        ArrayList<String> readList = new ArrayList();
        readList.add("lists");
        readList.add("twod");

        //Adding the lists inside the 2D list (randomList)
        randomList.add(bakeryList);
        randomList.add(todoList);
        randomList.add(readList);

        //System.out.println(randomList);

        // If you wanna retrieve them as indexes
        // System.out.println(randomList.get(1));  //---this gets the todoList out of the randomList
        // System.out.println(randomList.get(1).get(1)); // add another .get(index) to fetch the index of the list within the list

    }
}
