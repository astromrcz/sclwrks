import java.util.*;

public class queueExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<String> teams = new LinkedList<>();
        teams.offer("T1");
        teams.offer("G2");
        teams.offer("BLG");
        teams.offer("GENG");
        System.out.println("Esport Teams in WORLDS 2024");
        System.out.println(teams);

        System.out.println("Which team would you like to eliminate");
        String elim = sc.next();
        System.out.println("Team you chose to be Eliminated is: " + elim);

        if (teams.isEmpty()) {
            System.out.println("The menu is empty!");
        } else {
            System.out.println("Items in your Besket: " + teams.peek());

            boolean found = false;
            int size = teams.size();
            for (int i = 0; i < size; i++) {
                String item = teams.poll();
                if (item.equals(elim)) {                
                    found = true;
                    System.out.println(elim + " Has Been Eliminated.");
                    System.out.println("");
                    System.out.println("Remaining Teams are: ");
                    while (!teams.isEmpty()) {
                        System.out.println(teams.peek());
                        teams.poll();
                    }
                    break;
                } else {
                    teams.offer(item);
                }
            }
            if (!found) {
                System.out.println("Sorry, that is Eliminated or Doesn't Exist.");
            }
        }
    }
}
