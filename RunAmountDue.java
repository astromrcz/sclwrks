import java.util.Scanner;
    public class RunAmountDue{
        public static void main(String[]args){
            Scanner sc = new Scanner(System.in);
            double price, discount;
            int quantity;
            AmountDue due = new AmountDue();
            try{
                System.out.println("Press any of the following then enter values separated by spaces:");
                System.out.println("1 - Price Only\n2 - Price and quantity\n3 - Price, quantity, and discount amount");
                int option = sc.nextInt();

                switch (option){

                    case 1:
                    price = sc.nextDouble();
                    System.out.println("Amount due is: "+ due.computeAmountDue(price));
                    sc.nextLine();
                    break;

                    case 2:
                    price = sc.nextDouble();
                    quantity = sc.nextInt();
                    System.out.println("Amount due is: " + due.computeAmountDue(price, quantity));
                    sc.nextLine();
                    break;

                    case 3:
                    price = sc.nextDouble();
                    quantity = sc.nextInt();
                    discount = sc.nextDouble();
                    System.out.println("Amount due is: "+due.computeAmountDue(price, quantity, discount));
                    sc.nextLine();
                    break;

                    default:
                    System.out.println("Invalid input.");
                    System.out.println("Program stopped.");
                    sc.close();
                    break;
                }

            } catch(Exception e){
                System.out.println("Invalid input.");
                System.out.println("Program stopped.");
            }
        }
    }
    class AmountDue {

        public final static double tax = 0.12;
        
        public double computeAmountDue(double price) {
    
            return (price * tax) + price;
        }
        public double computeAmountDue(double price, int quantity) {
    
            return (price * quantity) + price * tax;
        }
        public double computeAmountDue(double price, int quantity, double discount) {
    
            return (price * quantity - discount) + price * tax;
        }
    
    }