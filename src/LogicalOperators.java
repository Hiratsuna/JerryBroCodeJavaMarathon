import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {

        // logical operators = used to connect two or more expressions
        //
        //  && = (and) both conditions must be true
        //  || = (or) either condition must be true
        //  ! = (not) reverses boolean value of the condition

        // &&
        //        int temp = 15;
        //        if(temp>30) {
        //            System.out.println("It is hot oqutside");
        //        }
        //        else if(temp >= 20 && temp <= 30) {
        //            System.out.println("It is warm outside");
        //        }
        //        else {
        //            System.out.println("It is cold outside");
        //        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game! Press q or Q to quit");
        String response = scanner.next();
        // ||
        //        if(response.equals("q") || response.equals("Q")) {
        //            System.out.println("You quit the game");
        //        }
        //        else {
        //            System.out.println("YOU are still playing the game *pew pew*");
        //        };

        // !
        if(!response.equals("q") && !response.equals("Q")) {
            System.out.println("YOU are still playing the game *pew pew*");
        }
        else {
            System.out.println("You quit the game");
        };
    }
}
