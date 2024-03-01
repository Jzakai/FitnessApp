/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessappdemo;
import java.util.Scanner;

/**
 *
 * @author janaz
 */
public class Status {
    private boolean freeze;
    private int duration;
    Scanner keyboard =new Scanner (System.in);

    public Status() { //constructor
        freeze = false;
        
    }

    public void changestate() { //changes status
        freeze =!freeze;
    }

    public boolean isFreeze() { //returns status
        return freeze;
    }

 
    @Override
    public String toString() {
        if (isFreeze() == false)
            return "active" ;
        else
            return "your account is not active " + "for " + getDuration() + " days";
    }

    public void setDuration() {
        do{
        System.out.println("choose duration:");
        System.out.println("(7)  days");
        System.out.println("(14) days");
        duration = keyboard.nextInt();
        switch (duration){
            case 7:
                duration = 7;
                break;
            case 14:
                duration =14;
                break;
            default:
                System.out.println("--Invalid entry, try again--");
        }//end switch
        }while(duration!=7 && duration!=14);
    }

    public int getDuration() {
        return duration;
    }
    

    
}

    