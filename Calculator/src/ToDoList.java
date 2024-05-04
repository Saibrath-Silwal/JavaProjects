import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.ArrayList;

public class ToDoList{
    public static void main(String[] args){
        ArrayList<String> ToDoList = new ArrayList<String>(); // Create an empty ArrayList

        Scanner scan = new Scanner(System.in);
        int input;
       do {
           //making a menu
           System.out.println("What would you like to do?");
           System.out.println("1: Add a new task");
           System.out.println("2: view all the task");
           System.out.println("3: mark the task as completed");
           System.out.println("4: delete the task");
           System.out.println("5: exit");

           input = scan.nextInt();
           scan.nextLine();

           switch(input){
               case 1:
                   System.out.println("Enter the task");
                   String task = scan.nextLine();
                   ToDoList.add(task);
                   break;
               case 2:
                   System.out.println(ToDoList);
                   break;
               case 3:

           }
       }while(input != 5);
        scan.close();
    }
}
