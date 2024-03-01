/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fitnessappdemo;
import java.util.*;
import java.io.*;

/**
 *
 * @author janaz
 */
public class FitnessAppDemo {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws IOException {
       
        
        Boolean NewMember= false;
        Boolean found = false;
        int memNo;
        String NoInFile;
        String fullName;
        Membership member;
        Status State;
        int choice;
        Booking book;
        Calculations Calc;
        boolean calc=false;
        boolean booking = false;
        
        ArrayList <Membership> memberships = new ArrayList <> (); // list of objects from membership class to access array since inistantiated in switch
        ArrayList <Booking> Bookings = new ArrayList <> ();
        ArrayList<Integer> membershipNumbers = new ArrayList<>();
        File file = new File ("Memberships2.txt");//open file for reading
        FileWriter appendfile = new FileWriter("Memberships2.txt",true);//open file for writting     
        Scanner r = new Scanner (file);
        PrintWriter w = new PrintWriter (appendfile); // to append to file
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Welcome to your FitnessApp!");
        System.out.println("--------------------------------------");
        
        while (r.hasNext()){ // save all file numbers in array list
                     NoInFile = r.nextLine();
                     membershipNumbers.add(Integer.parseInt(NoInFile));
                }
        do{
        System.out.println("Login or create a new account to begin");
        System.out.println("enter (1) to login, enter (2) to sign up: ");
        int option = keyboard.nextInt();
        keyboard.nextLine();
        while (option!=1 && option !=2){ // validation 
            System.out.println("--Invalid Entry--");
            System.out.println("enter (1) to login, enter (2) to sign up: ");
            option = keyboard.nextInt();
            keyboard.nextLine();
        }
        
        switch (option) {
            case 1: //log in
                 System.out.println("Enter memberrship number:");
                 memNo=keyboard.nextInt();
                 keyboard.nextLine();
                 
                    if (membershipNumbers.contains(memNo)) { // check if already registered
                        found = true;
                        System.out.println("Enter your name:");
                        fullName = keyboard.nextLine();
                        State = new Status();
                        member = new Membership( fullName, memNo ,State);
                        memberships.add(member);
                    }
                    break;
                 
            case 2:  //register
                NewMember= true;
                break;
            
        }// end switch 
        
        if (found ==false && NewMember== false) // when entered wrong membership number in case 1
                      System.out.println("Invalid membership number.");  
        else if (found ==false && NewMember== true){ // when successfully executed case 2
            System.out.println("Enter Full name:");
                 fullName = keyboard.nextLine();
                 State = new Status(); // send status with freeze = false
                 member = new Membership(fullName, State); //genererate membership number randomly, ask for choice of membership
                 memberships.add(member);// add member to arraylist of objects
                 memNo=member.getMemberNo();
                 w.println(memNo);// write membership number to file
                 w.close();
            System.out.println("here is your membership number: " + memberships.get(0).getMemberNo());
        }     
              
        
    }// end do
    
    while (found==false && NewMember==false ); //repeat if membership number not entered corretly in case 1
    
     
    System.out.println("");
    System.out.println("welcome " + memberships.get(0).getName() + "!");   
    do {
        
       System.out.println("\n What do you want to do?"); 
       System.out.println("(1) book a class"); 
       System.out.println("(2) Fitness measurements and calculations");
       System.out.println("(3) freeze account"); 
       System.out.println("(4) Print information"); 
       System.out.println("(5) exit");
       choice = keyboard.nextInt();
       
       switch (choice){
           case 1: {
               book = new Booking( memberships.get(0).getName());
               Bookings.add( book);
               booking = true;
               break;
           }    
           case 2:
               if (NewMember==true)
                Calc = new Calculations(memberships.get(0));
               
               else
                  Calc = new Calculations(memberships.get(0), memberships.get(0).getMemberNo()); 
               
               calc=true;
               break;
               
           case 3: 
               memberships.get(0).changeState();
               System.out.println(memberships.get(0).getState());
               break;
           
           case 4:
               if (NewMember==true && booking==true){
                    System.out.println(memberships.get(0));
                    System.out.println(Bookings.get(0));
               }
               else if (NewMember==true&& booking==false)
                   System.out.println(memberships.get(0).toString());
               
               else if (NewMember==false&& calc ==true&& booking ==true){
                   System.out.println(memberships.get(0).String());
                   System.out.println(Bookings.get(0));
               }  
               else if (NewMember==false&& calc ==false && booking ==false){
                   System.out.println(memberships.get(0).String2());
               }
               else if (NewMember==false&& calc ==true && booking ==false)
                   System.out.println(memberships.get(0).String());
                   
               break;
            case 5:
               
               break;   
           default:
             System.out.println("---Invalid entry. Try again---");  
       }
       
    }// end do
         
    while (choice!=5);
    
    
    }// end class
    }
