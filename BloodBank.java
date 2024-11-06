import java.util.*;
public class BloodBank {
    private String bloodType;
    private String rhFactor;
    public void setBloodType(String bt){
        bloodType = bt;
    }
    public void setRhFactor(String rh){
        rhFactor = rh;
    }
    public String getBloodType(){
        return bloodType;
    }
    public String getRhFactor(){
        return rhFactor;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BloodBank b = new BloodBank();
        System.out.println("Enter Blood Type of Patient: ");
        b.setBloodType(sc.nextLine());
        System.out.println("Enter Rhesus Factor of Patient:  (+ or -)");
        b.setRhFactor(sc.nextLine());

        System.out.println("Enter Blood Type of Patient: " + b.getBloodType());
        System.out.println("Enter Rhesus Factor of Patient: " + b.getRhFactor());
        System.out.println(b.getBloodType() + b.getRhFactor() + " is Added to the blood bank.");
        sc.close();
    }
}


