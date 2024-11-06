import java.util.*;
public class MovieTime {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Queue <String> movies = new LinkedList<>();
        Queue <String> snacks = new LinkedList<>();
        System.out.println("Enter movie 1 of 3: ");
        movies.offer(sc.nextLine());
        System.out.println("Enter movie 2 of 3: ");
        movies.offer(sc.nextLine());
        System.out.println("Enter movie 3 of 3: ");
        movies.offer(sc.nextLine());
        System.out.println("Enter snack 1 of 3: ");
        snacks.offer(sc.nextLine());
        System.out.println("Enter snack 2 of 3: ");
        snacks.offer(sc.nextLine());
        System.out.println("Enter snack 3 of 3: ");
        snacks.offer(sc.nextLine());

        System.out.println("Movies to watch are: " + movies);
        System.out.println("Snacks available are: " + snacks);
        System.out.println("Press S each time you finish a snack.");
        String input = sc.nextLine();
        snacks.poll();
        System.out.println(snacks);

        if(input.equalsIgnoreCase("s")){
            for(int i = 0; i <= 3; i++){
                input = sc.next();
                snacks.poll();
                System.out.println(snacks);
                if(snacks.isEmpty()){
                    System.out.println("No more Snacks.");
                    break;
                }
                 }sc.close();
        }
    } 
}
