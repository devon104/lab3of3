/**
 * Created by iyasuwatts on 10/17/17.
 */
import  java.util.Scanner;


public class Main {

    public static void main(String[] args ){
        Scanner greeting = new Scanner(System.in);
        System.out.println("What is your name?");

        String usersName = greeting.next();

        switch(usersName){
            case "Alice":
                System.out.println("Hey Alice! You're my friend.");
                break;
            case "Bob":
                System.out.println("Hey Bob! You're my friend.");
                break;
            default:
                System.out.println("I don't know you. You can't come in.");
                break;
        }
    }
}
