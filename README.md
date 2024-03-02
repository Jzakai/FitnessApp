# Gym Management and Fitness Tracking System 
# Problem Statement
The fitness industry plays an essential role in the lives of individuals who prioritize a healthy lifestyle. However, many gyms and fitness centers are still lacking in terms of leveraging technology to enhance their operations. While some applications exist, they often lack fundamental facilities necessary to automate the registration process and provide an enhanced gym experience to their members.

# Proposed Solution
We propose the development of a comprehensive Gym Management and Fitness Tracking System that will act as a blueprint for gym applications. This proposed system aims to address the limitations of existing applications by providing a wide range of functionalities to improve the overall gym experience for members.

# Key Features:
## 3.1 Easy-to-use Calculation Services: 
The application will offer calculation services to help members keep track of their gym progress. This includes features such as body measurements and calorie counting. By providing these tools, members can monitor their progress and make informed decisions about their fitness journey.

## 3.2 Automated Membership Registration: 
Members will be able to sign up, provide necessary personal information, select their membership type, and make payments securely within the application.

## 3.3 Class Booking:
 Members will have the convenience of viewing class and booking slots. This feature will simplify class management, reduce overcrowding, and ensure a better user experience for members.

## 3.4 Membership Status Control:
Members can control their membership status via the application through the option to freeze the account and renew the membership.


# Program description:
The program will entail the following classes in the way they are described below and illustrated in Figure 1:

Figure 1: UML Class Diagram

# 4.1. Public Class FitnessAppDemo:
This class contains the main class which drives the whole program. The class is responsible for presenting the main menu options for the program in a loop until the user intends to log out and creating instances of the other classes.
The class would execute in the following sequence:
	1. Display welcome message
	2. Ask user if already registered as a member
		○ Get membership number that was randomly generated or name
		○ Check from record file if the number exists
		○ If not, program exits and asks to try again or register as new member
		○ Add member by directing to the Membership Class
    ○ If member exists check if active by the Deactivate method in Membership Class
  3. Direct to menu with the following options that direct to their respected classes: Calculation, booking, Freeze, Renew and Logout

# 4.2 Public Class Membership:
This method performs the operations regarding the member’s membership. 
The class will take from the user their name, age, and preferred type of membership which will be displayed via calling the specific methods in the membership class. 
Each member registered will be appended to an external txt file to track their information
The class will provide the member with the bill for the subscription and connect with the Payment class to proceed with payment.
The class also contains methods for membership renewal and deactivation which can be provoked once the members selects those options from the Main menu.
	
# 4.3 Public Class Calculations:
This class calculates users' Basal Metabolic Rate (BMR), daily calories needed , and nutrient needs (protein, fat and carbs daily need ) based on their age, height, weight, gender and activity level . 
It uses a scanner to get users' inputs and includes 4 methods: 
TDEE (to calculate the total daily energy expenditure based on the BMR and activity level).
proteinNeed (to calculate the protein needs based on weight).
fatNeed (to calculate the fat needs based on weight).
carbsNeed (to calculate the carbohydrate needs based on TDEE , fat needs, and protein needs).

# 4.4 Public Class Booking:
This class is responsible for booking personal training (PT) and class sessions. The class would get the number of hours for the PT session that the member wants,  display the menu of available classes with time slots, and book the preferred sessions.


# Code
Click on the file below to view the full source code:
	FitnessApp Code snippets.pdf

#Code output 


