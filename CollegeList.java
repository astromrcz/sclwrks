import java.util.*;
public class CollegeList{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String input;
    System.out.println("Press E for Employee, F for Faculty, or S for Student: ");
    Faculty e = new Faculty(); // naka inheritance na sa person so pwedeng itawag nalang is itong dalawa na nag inherit from person
    Student s = new Student();
    input = sc.nextLine();
        if(input.equalsIgnoreCase("e")){
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Please Enter after every input. ");
            e.setName(sc.nextLine());
            e.setContactNum(sc.nextLine());
            e.setSalary(sc.nextDouble());
            sc.nextLine();
            e.setDepartment(sc.nextLine());
            System.out.println("---------------------------------");
            System.out.println("Name: " + e.getName());
            System.out.println("Contact Number: " + e.getContactNum());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Department: " + e.getDepartment());
        }else if(input.equalsIgnoreCase("f")){
            System.out.println("Type employee's name, contact number, salary, and department.");
            System.out.println("Please Enter after every input. ");
            e.setName(sc.nextLine());
            sc.nextLine();
            e.setContactNum(sc.nextLine());
            e.setSalary(sc.nextDouble());
            
            e.setDepartment(sc.nextLine());

            System.out.println("Press (Y) if Regular Press (N) if not");
            input = sc.next();
            if(input.equalsIgnoreCase("y")){
            System.out.println("---------------------------------");
            System.out.println("Name: " + e.getName());
            System.out.println("Contact Number: " + e.getContactNum());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Status: " + e.isRegular());
            }else if(input.equalsIgnoreCase("n")){
            System.out.println("---------------------------------");
            System.out.println("Name: " + e.getName());
            System.out.println("Contact Number: " + e.getContactNum());
            System.out.println("Salary: " + e.getSalary());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Status: is not Regular");
            }
            else{
                System.out.println("Invalid Input.");
            }
        }else if(input.equalsIgnoreCase("s")){
            System.out.println("Type Student's Name, Contact Number, Program, and Year Level.");
            System.out.println("Please Enter after every input. ");
            s.setName(sc.nextLine());
            s.setContactNum(sc.nextLine());
            s.setProgram(sc.nextLine());
            s.setYearLevel(sc.nextInt());
            sc.nextLine();
            System.out.println("---------------------------------");
            System.out.println("Name: " + s.getName());
            System.out.println("Contact Number: " + s.getContactNum());
            System.out.println("Program: " + s.getProgram());
            System.out.println("Year Level: " + s.getYearLevel());
        }else{
            System.out.println("Please choose a correct option");
        }
    }
}
class Person{
    private String name;
    private String contactNum;
    public void setName(String n){
        name = n; //always kung ano yung dineclare sa labas ng setter/getter ay dapat yun yung ilalagay sa unahan
    }
    public String getName(){
        return name;
    }
    public void setContactNum(String c){// kung ano mababato sa setter (c) yun yung ibabato sa global variable na contactNum
        contactNum = c;
    }
    public String getContactNum(){
        return contactNum;
    }
}
class Student extends Person{
    private String program;
    private int yearLevel;
    public void setProgram(String p){
        program = p;
    }
    public String getProgram(){
        return program;
    }
    public void setYearLevel(int y){
        yearLevel = y;
    }
    public int getYearLevel(){
        return yearLevel;
    }
}
class Employee extends Person{
    private double salary;
    private String department;
    public void setSalary(double s){
        salary = s;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String d){
        department = d;
    }
    public String getDepartment(){
        return department;
    }
}
class Faculty extends Employee{
    private boolean State = true;
    public boolean isRegular(){ // if regular
       return State; 
    }
}






/*  switch(input){

    case "e":
    break;
    case "f":
    break;
    case "s":
    break;
    

}



*/