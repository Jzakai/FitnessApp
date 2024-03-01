/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessappdemo;
import java.util.Scanner; //needed for scanning inputs
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author janaz
 */
public class Booking {
    private String name;
    private String sessionName = "";
    private String sessionTimeOptions = "";
    private String time = "";
    public Booking(String name){
        
        this.name = name;
        
        System.out.println("hi " + name + "!");
        System.out.println("Ready to take your fitness journey to the next level ?");
        System.out.println("Just a few clicks and you'll be all set to crush those fitness goals !");
        System.out.println("~•~•~•~•~•~•~~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~•~");
        
        menu(); //print sessions available
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Choose an option number:");
        int option = scanner.nextInt();
        
        time(option);
    }
    
   
    public static void menu(){
        System.out.println("available sessions:");
        System.out.println("  1-Cardio blast : a high energy class that combines aerobic exercises with strength training.");
        System.out.println("  2-Spin class : an indoor cycling class.");
        System.out.println("  3-Yoga : an ancient art of mental and physical practices.");
        System.out.println("  4-Bootcamp : an intense full body workout.");
        System.out.println("  5-HIIT: high intensity interval training class.");
        System.out.println("  6-Pilates: a low impact, full body workout.");
        System.out.println("  7-Zumba : Dance fitness class.");
        System.out.println("  8-Swimming : learn swimming techniques.");
    }
    
    public void time (int option) {
        Scanner scanner = new Scanner(System.in);
        
        
        switch (option) {
            case 1:
                sessionName = "Cardio blast";
                sessionTimeOptions = "(1) 8:00 AM, (2) 12:00 PM, (3) 5:00 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption1 = scanner.nextInt();
                
                if(timeOption1 == 1) {
                    time = "8:00 am";
                }
                else if (timeOption1 == 2) {
                    time = "12:00 pm";
                }
                else if(timeOption1 == 3) {
                    time = "5:00 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption2 = scanner.nextInt();
                    
                    if(timeOption2 == 1) {
                        time = "8:00 am";
                    }
                    else if (timeOption2 == 2) {
                        time = "12:00 pm";
                    }
                    else if(timeOption2 == 3) {
                        time = "5:00 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 2:
                sessionName = "Spin class";
                sessionTimeOptions = "(1) 9:00 AM, (2) 1:00 PM, (3) 6:00 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption3 = scanner.nextInt();
                
                if(timeOption3 == 1) {
                    time = "9:00 am";
                }
                else if (timeOption3 == 2) {
                    time = "1:00 pm";
                }
                else if(timeOption3 == 3) {
                    time = "6:00 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption4 = scanner.nextInt();
                    
                    if(timeOption4 == 1) {
                        time = "9:00 am";
                    }
                    else if (timeOption4 == 2) {
                        time = "1:00 pm";
                    }
                    else if(timeOption4 == 3) {
                        time = "6:00 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 3:
                sessionName = "Yoga";
                sessionTimeOptions = "(1) 10:00 AM, (2) 2:00 PM, (3) 7:00 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption5 = scanner.nextInt();
                
                if(timeOption5 == 1) {
                    time = "10:00 am";
                }
                else if (timeOption5 == 2) {
                    time = "2:00 pm";
                }
                else if(timeOption5 == 3) {
                    time = "7:00 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption6 = scanner.nextInt();
                    
                    if(timeOption6 == 1) {
                        time = "10:00 am";
                    }
                    else if (timeOption6 == 2) {
                        time = "2:00 pm";
                    }
                    else if(timeOption6 == 3) {
                        time = "7:00 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 4:
                sessionName = "Bootcamp";
                sessionTimeOptions = "(1) 11:00 AM, (2) 3:00 PM, (3) 8:00 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption7 = scanner.nextInt();
                
                if(timeOption7 == 1) {
                    time = "11:00 am";
                }
                else if (timeOption7 == 2) {
                    time = "3:00 pm";
                }
                else if(timeOption7 == 3) {
                    time = "8:00 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption8 = scanner.nextInt();
                    
                    if(timeOption8 == 1) {
                        time = "11:00 am";
                    }
                    else if (timeOption8 == 2) {
                        time = "3:00 pm";
                    }
                    else if(timeOption8 == 3) {
                        time = "8:00 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 5:
                sessionName = "HIIT";
                sessionTimeOptions = "(1) 8:30 AM, (2) 12:30 PM, (3) 5:30 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption9 = scanner.nextInt();
                
                if(timeOption9 == 1) {
                    time = "8:30 am";
                }
                else if (timeOption9 == 2) {
                    time = "12:30 pm";
                }
                else if(timeOption9 == 3) {
                    time = "5:30 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption10 = scanner.nextInt();
                    
                    if(timeOption10 == 1) {
                        time = "8:30 am";
                    }
                    else if (timeOption10 == 2) {
                        time = "12:30 pm";
                    }
                    else if(timeOption10 == 3) {
                        time = "5:30 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 6:
                sessionName = "Pilates";
                sessionTimeOptions = "(1) 9:30 AM, (2) 1:30 PM, (3) 6:30 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption11 = scanner.nextInt();
                
                if(timeOption11 == 1) {
                    time = "9:30 am";
                }
                else if (timeOption11 == 2) {
                    time = "1:30 pm";
                }
                else if(timeOption11 == 3) {
                    time = "6:30 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption12 = scanner.nextInt();
                    
                    if(timeOption12 == 1) {
                        time = "9:30 am";
                    }
                    else if (timeOption12 == 2) {
                        time = "1:30 pm";
                    }
                    else if(timeOption12 == 3) {
                        time = "6:30 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 7:
                sessionName = "Zumba";
                sessionTimeOptions = "(1) 10:30 AM, (2) 2:30 PM, (3) 7:30 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption13 = scanner.nextInt();
                
                if(timeOption13 == 1) {
                    time = "10:30 am";
                }
                else if (timeOption13 == 2) {
                    time = "2:30 pm";
                }
                else if(timeOption13 == 3) {
                    time = "7:30 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption14 = scanner.nextInt();
                    
                    if(timeOption14 == 1) {
                        time = "10:30 am";
                    }
                    else if (timeOption14 == 2) {
                        time = "2:30 pm";
                    }
                    else if(timeOption14 == 3) {
                        time = "7:30 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            case 8:
                sessionName = "Swimming";
                sessionTimeOptions = "(1) 11:30 AM, (2) 3:30 PM, (3) 8:30 PM";
                System.out.print("Choose a time option for the session (" + sessionTimeOptions + "): ");
                int timeOption15 = scanner.nextInt();
                
                if(timeOption15 == 1) {
                    time = "11:30 am";
                }
                else if (timeOption15 == 2) {
                    time = "3:30 pm";
                }
                else if(timeOption15 == 3) {
                    time = "8:30 pm";
                }
                else {
                    System.out.println("Invalid time option, try again:");
                    int timeOption16 = scanner.nextInt();
                    
                    if(timeOption16 == 1) {
                        time = "11:30 am";
                    }
                    else if (timeOption16 == 2) {
                        time = "3:30 pm";
                    }
                    else if(timeOption16 == 3) {
                        time = "8:30 pm";
                    }
                    else {
                        System.out.println("Invalid time option, please try again later.");
                        return;
                    }
                }
                break;
                
            default:
                System.out.println("Invalid session number .");
        
                
        }
        System.out.println(" _____________________________________________________");
        
 
        System.out.println("|  You have booked " + sessionName + " at " + time + " successfully!  |\n");
    
        System.out.println(" _____________________________________________________");
}//end switch

    @Override
    public String toString() {
        return "Booking{"+ "sessionName=" + sessionName + ", time=" + time + '}';
    }
    
}//end class
