import java.util.*;
public class encapPractice {

    private String phone;
    private int batt;

    public void setType(String t){
        phone = t;
    }
    public void setBatt(int p){
        batt = p;
    }
    public String getType(){
        return phone;
    }
    public int getBatt(){
        return batt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        encapPractice p = new encapPractice();
        System.out.println("Enter Phone charger type (Type C or B): ");
        p.setType(sc.nextLine());
        System.out.println("Enter Battery Percent: ");
        p.setBatt(sc.nextInt());
        System.out.println("Your Phone's Charger type is: " + "Type " +p.getType());
        System.out.println("Your Phone's Battery % is: " + p.getBatt() + "%");
    }
}
