import java.util.*;

public class Restaurant{
   public static void main(String[]args){
        Queue <String>menu = new LinkedList<>();
        Queue <String> order = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        menu.offer("Tapsilog");
        menu.offer("Hotsilog");
        menu.offer("Tosilog");
        menu.offer("Bacsilog");

        while(true){
        System.out.println("Restaurant");
        System.out.println("1. Order");
        System.out.println("2. Show Order");
        System.out.println("3. Exit");
        int choice = sc.nextInt(); 
        
        switch(choice){
            case 1:
            System.out.println("Menu for today: ");
            System.out.println(menu);
            System.out.println("What would you like to order: ");
            String input = sc.next();
            order.offer(input);
            break;

            case 2:
            System.out.println("Your Order is: " + order);
            System.out.println("Processing your Request..");
            order.poll();
            System.out.println("Thank you for Ordering!");
            
            case 3:
            return;
        }
        }
    }
    }