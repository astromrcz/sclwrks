import java.util.Scanner;
public class RunBloodData {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Blood Type");
        String input1 = sc.nextLine();
        System.out.println("Enter Rhesus Factor (+ or -): ");
        String input2 = sc.nextLine();
        if(input1.isEmpty() || input2.isEmpty()){
            System.out.println("O+ is added to the blood bank.");
        } else {
            BloodData bd = new BloodData(input1, input2);
            bd.display();
        }
    } 
}
class BloodData{
    static String bloodType;
    static String RhFactor;
    
    public BloodData(String bt, String rh){
        
        bloodType = "O";
        RhFactor = "+";

        bloodType = bt;
        RhFactor = rh;
    }
    public void display(){
        System.out.println(bloodType + RhFactor + " is added to the blood bank.");
    }
}


