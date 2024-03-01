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
public class Calculations {
    private Membership member;
    private int actLevel;
    private double bmr=0;
    private double protein;
    private double fat;
    private double carbs;
    private double dailyEnergy;
    double tdee;
     // Create a scanner object to get user inputs
    Scanner keyboard = new Scanner(System.in);
        
    public Calculations(Membership member, int number ) {
       this.member= member; 
       
       System.out.println("This calculator estimates your BMR, daily calories need, and your nutrient macros need.\n");
       System.out.println("•~•~•~•~•~~•~•~•~•~•~•~~•~•~•~•~");
       member.setAge();
       member.setHeight();
        
       member.setWeight();
        
        member.setGender();
        
        
         // Calculate BMR based on gender
        if (member.getGender().equalsIgnoreCase("male")) {
            bmr = 10 * member.getWeight() + 6.25 * member.getHeight() - 5 * member.getAge() + 5;
           
        } else if (member.getGender().equalsIgnoreCase("female")) {
            bmr = 10 * member.getWeight() + 6.25 * member.getHeight() - 5 * member.getAge() - 161;
            
        } 
        
        // Ask user about daily activity level
        System.out.println("\nHow would you describe your daily activity level?");
        System.out.println("(0) Sedentary (little or no exercise)");
        System.out.println("(1) Lightly active (light exercise/sports 1-3 days/week)");
        System.out.println("(2) Moderately active (moderate exercise/sports 3-5 days/week)");
        System.out.println("(3) Very active (hard exercise/sports 6-7 days a week)");
        System.out.println("(4) Extra active (very hard exercise/sports or physical job every day)");
        System.out.print("Enter your activity level (0-4): ");
        actLevel = keyboard.nextInt();
        
        while (actLevel!=0&&actLevel!=1&&actLevel!=2&&actLevel!=3&&actLevel!=4){
            System.out.println("\n--Invalid Entry, Try Again--");
            System.out.println("\nHow would you describe your daily activity level?");
            System.out.println("(0) Sedentary (little or no exercise)");
            System.out.println("(1) Lightly active (light exercise/sports 1-3 days/week)");
            System.out.println("(2) Moderately active (moderate exercise/sports 3-5 days/week)");
            System.out.println("(3) Very active (hard exercise/sports 6-7 days a week)");
            System.out.println("(4) Extra active (very hard exercise/sports or physical job every day)");
            System.out.print("Enter your activity level (0-4): ");
        actLevel = keyboard.nextInt();
        }
        // Calculate daily energy expenditure and nutrient needs
        dailyEnergy = TDEE(bmr, actLevel);
        protein = proteinNeed(member.getWeight());
        fat = fatNeed(member.getWeight());
        carbs = carbsNeed(dailyEnergy, fat, protein);
        
        // Display results
        System.out.println("•~•~•~•~•~~•~•~•~•~•~•~~•~•~•~•~");
         System.out.println("\nYour BMR is " + bmr + " calories per day.");
        System.out.println("\nHere are your estimated nutrient needs:");
        System.out.printf("   Daily calories need: %.2f calories\n", dailyEnergy);
        System.out.printf("   Protein need:        %.2f grams\n", protein);
        System.out.printf("   Fat need:            %.2f grams\n", fat);
        System.out.printf("   Carbs need:          %.2f grams\n\n", carbs);
    }
    
    

    public Calculations(Membership member) {
        
        this.member= member;
        
       
        
        // Declare variables
        
        // Print welcome message
        System.out.println("This calculator estimates your BMR, daily calories need, and your nutrient macros need.\n");
        System.out.println("•~•~•~•~•~~•~•~•~•~•~•~~•~•~•~•~");
        
        
        // Calculate BMR based on gender
        if (member.getGender().equalsIgnoreCase("male")) {
            bmr = 10 * member.getWeight() + 6.25 * member.getHeight() - 5 * member.getAge() + 5;
           
        } else if (member.getGender().equalsIgnoreCase("female")) {
            bmr = 10 * member.getWeight() + 6.25 * member.getHeight() - 5 * member.getAge() - 161;
            
        } 
        
        // Ask user about daily activity level
        System.out.println("\nHow would you describe your daily activity level?");
        System.out.println("(0) Sedentary (little or no exercise)");
        System.out.println("(1) Lightly active (light exercise/sports 1-3 days/week)");
        System.out.println("(2) Moderately active (moderate exercise/sports 3-5 days/week)");
        System.out.println("(3) Very active (hard exercise/sports 6-7 days a week)");
        System.out.println("(4) Extra active (very hard exercise/sports or physical job every day)");
        System.out.print("Enter your activity level (0-4): ");
        actLevel = keyboard.nextInt();
        
        while (actLevel!=0&&actLevel!=1&&actLevel!=2&&actLevel!=3&&actLevel!=4){
            System.out.println("\n--Invalid Entry, Try Again--");
            System.out.println("\nHow would you describe your daily activity level?");
            System.out.println("(0) Sedentary (little or no exercise)");
            System.out.println("(1) Lightly active (light exercise/sports 1-3 days/week)");
            System.out.println("(2) Moderately active (moderate exercise/sports 3-5 days/week)");
            System.out.println("(3) Very active (hard exercise/sports 6-7 days a week)");
            System.out.println("(4) Extra active (very hard exercise/sports or physical job every day)");
            System.out.print("Enter your activity level (0-4): ");
        actLevel = keyboard.nextInt();
        }
        // Calculate daily energy expenditure and nutrient needs
        dailyEnergy = TDEE(bmr, actLevel);
        protein = proteinNeed(member.getWeight());
        fat = fatNeed(member.getWeight());
        carbs = carbsNeed(dailyEnergy, fat, protein);
        
        // Display results
        System.out.println("•~•~•~•~•~~•~•~•~•~•~•~~•~•~•~•~");
         System.out.println("\nYour BMR is " + bmr + " calories per day.");
        System.out.println("\nHere are your estimated nutrient needs:");
        System.out.printf("   Daily calories need: %.2f calories\n", dailyEnergy);
        System.out.printf("   Protein need:        %.2f grams\n", protein);
        System.out.printf("   Fat need:            %.2f grams\n", fat);
        System.out.printf("   Carbs need:          %.2f grams\n\n", carbs);
    }
    
    // Calculate total daily energy expenditure
    public double TDEE(double bmr, int actLevel) {
        
        tdee = bmr;
        switch (actLevel) {
            case 0:
                tdee *= 1.2;
                break;
            case 1:
                tdee *= 1.375;
                break;
            case 2:
                tdee *= 1.55;
                break;
            case 3:
                tdee *= 1.725;
                break;
            case 4:
                tdee *= 1.9;
                break;
            default:
                System.out.println("Invalid activity level!");
                break;
        }
        return tdee;
    }

    // Calculate protein need
    public static double proteinNeed(double weight) {
        double protein = weight * 0.8;
        return protein;
    }

    // Calculate fat need
    public double fatNeed(double weight) {
        double fatCalories = tdee * 0.25;
        double fat = fatCalories / 9.0;
        return fat;
    }

    // Calculate carbs need
    public double carbsNeed(double dailyEnergy, double fat, double protein) {
        double carbcal = tdee * 0.55;
        double carbs = carbcal / 4;
        
        return carbs;
    }
}

