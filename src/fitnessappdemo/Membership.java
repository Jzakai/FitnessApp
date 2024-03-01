/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessappdemo;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author janaz
 */
public class Membership {
    private String name;
    public int age;
    public double weight;
    public double height;
    public String gender;
    private String membershipType;
    private int memberNo;
    private String branch;
    private int branchOp;
    //private payment pay;
    private Status State;
    private String choice;
    private String status;
    public int price;
    
    
    
    Scanner keyboard = new Scanner(System.in);
    
    public Membership(String name,Status State) { // sign up constructor
        this.State = State;
        this.name = name;
        
        setBranch();
        this.branch = branch;
        
        setmembershipChoice();
        setmemtype(choice);
        this.membershipType = membershipType;
        
        setAge();
        this.age= age;
        
        setHeight();
        this.height= height;
        
        setWeight();
        this.weight= weight;
        
        setGender();
        this.gender=gender;
        
        Random rand= new Random();
        this.memberNo = rand.nextInt(2000)+1000;
    }
   
    

    public Membership(String name, int memberNo, Status State) {//login constructor
        this.name = name;
        this.memberNo = memberNo;
        this.State=State;
        this.age=age;
        this.weight=weight;
        this.height=height;
        this.gender=gender;
                
    }
            
    public void setmembershipChoice() {
      System.out.println("Enter the letter corresponding " + "to membership type: ");
        System.out.println("A: one month for 299 SR ");
        System.out.println("B: Three months for 880 SR ");
        System.out.println("C: six months for 1400 SR ");
        System.out.println("D: one year for 2200 SR ");
        
        choice = keyboard.nextLine();
        
        
        //input validation
        while (!choice.equalsIgnoreCase("a") && !choice.equalsIgnoreCase("b" )&& !choice.equalsIgnoreCase("c")&&!choice.equalsIgnoreCase("d")){
        System.out.println("Invalid Entry ");
        System.out.println("Enter the type of membership: ");
        System.out.println("A: one month for 299 SR ");
        System.out.println("B: Three months for 880 SR ");
        System.out.println("C: six months for 1400 SR ");
        System.out.println("D: one year for 2200 SR ");
        choice = keyboard.nextLine();
        
        
    }   
        
    }

    public String getMembershipType() {
        return membershipType;
    }
    
    
    
    public void setBranch() {
        
        System.out.println("select branch: ");
                 System.out.println("(1) Al Hamra (2) Al Faysaliyah (3) Obhur: ");
                 branchOp= keyboard.nextInt();
                 
                 keyboard.nextLine();
                 while (branchOp!=1 && branchOp!=2 &&branchOp!=3) {
                    System.out.println("--Invalid Entry-- "); 
                    System.out.println("select branch: ");
                    System.out.println("(1) Al Hamra (2) Al Faysaliyah (3) Obhur: ");
                    branchOp= keyboard.nextInt();
                    keyboard.nextLine();
                 }
                 switch (branchOp){
                     case 1:
                         branch = "Al Hamra";
                         
                         break;
                     case 2:
                         branch = "Al Faysaliyah";
                         break;
                     case 3:
                         branch = "Obhur";
                         break;
                     default:
                        System.out.println("--Invalid Entry-- "); 
                 }
                 
                 
    }

    public String getBranch() {
        return branch;
    }
    
    
   
    public int getMemberNo() {
        return memberNo;
    }

    public String getName() {
        return name;
    }
    
    public void setAge(){
       System.out.print("Age: ");
        age = keyboard.nextInt();
        if (age < 0) {
            System.out.print("Please enter a valid age: ");
            age = keyboard.nextInt();
        }
        
    }
        
       public void setGender(){ 
        System.out.print("Gender (M/F): ");
        gender = keyboard.next();
        
        if (gender.equalsIgnoreCase("f"))
            gender = "female";
              
        else if(gender.equalsIgnoreCase("m"))
            gender = "male";
        
        while (!gender.equalsIgnoreCase("male")&& !gender.equalsIgnoreCase("female")) {
            System.out.println("--Invalid entry, try again--");
            System.out.print("Gender (M/F): ");
            gender = keyboard.next();
            
        
            if (gender.equalsIgnoreCase("f"))
                gender = "Female"  ;
            else if (gender.equalsIgnoreCase("m"))
                gender = "Male";
        }
        
       }
    
    
    public void setWeight(){
      System.out.print("Weight (in kg): ");
        weight = keyboard.nextDouble();
        if (weight < 0) {
            System.out.print("Please enter a valid weight: ");
            weight = keyboard.nextDouble();
        }
        
    }
    public void setHeight(){
       System.out.print("Height (in cm): ");
        height = keyboard.nextDouble();
        if (height < 0) {
            System.out.print("Please enter a valid height: ");
            height = keyboard.nextDouble();
        }
       
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getGender() {
        return gender;
    }
    
    
    public int getPrice(String choice){ //get price from membership choice
        
        switch (choice){
        case "a":
        case "A":
            price= 299;
            break;
        case "b":
        case "B":
            price= 880;
            break;
        case "C":
        case "c":
            
            price= 1400;
            break;
        case "D":
        case "d":
            price= 2200;
            break;
            
    }
       return price;    
    }
    
     public void setmemtype(String choice){
        switch (choice){
        case "a":
        case "A":
            membershipType = "one month";
        case "b":
        case "B":
            membershipType = "Three months";
        case "C":
        case "c":
            membershipType = "six months";
        case "d":
        case "D":
            membershipType =  "one year";
            
    }
         
    }
    


     public void changeState(){//use methods from aggregated class to change
        State.changestate();
        State.setDuration();
    }
    
    public String getState(){
      return State.toString();  
    }

 
   
    
    @Override
    public String toString() {//signup
        return "Membership information{" + "name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", gender=" + gender + ", membershipType=" + membershipType + ", memberNo=" + memberNo + ", branch=" + branch + ", State=" + getState() +  ", price=" + getPrice(choice) + "}" ;
    } 
    
    public String String() {
        return "Membership information{" + "name=" + name + ", age=" + age + ", weight=" + weight + ", height=" + height + ", gender=" + gender + ", memberNo=" + memberNo + ", State=" + getState() + "}" ;
    
    } 
     
   public String String2() {
      return "Membership information{" + "name=" + name + ", memberNo=" + memberNo + ", State=" + getState() + "}" ;
}
}