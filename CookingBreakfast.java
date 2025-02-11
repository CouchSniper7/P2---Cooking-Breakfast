// Joseph Simonin
// COP-2800-98672 Java Programming
// Proffessor Seely
// Assignmnet: P2 - Cooking Breakfast
// Date created: 2/11/2025
// Description: This program will prompt the user to enter choices for the following questions: coffee(Cream, Dairy, Sugar), bacon(Strips, Canadian, traditional, or Vegan),
// eggs(scrambled, sunny-side-up, or fried,  over easy, over medium, or over hard), and toast(white or wheat) using nested if statements and output the customers order back
// to them. The program then compares a predetermined "healthy" breakfast to the customers order and outputs if the breakfast was healthy or not. 

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CookingBreakfast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner
// Name, Course, Assignment, Date and time
        System.out.println("Joseph Simonin");
        System.out.println("Course: COP-2800-98672");
        System.out.println("Assignment: P2 - Cooking Breakfast");
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("M/d/yyy h:mm:ss a");
        System.out.println("Date and Time: " + now.format(formatter));

// Variables for Coffee
        String wantCoffee = "no";
        String coffeeCream = "no";
        String creamType = "";
        String coffeeSugar = "no";
        String sugarType = "";
// Variables for Bacon
        String wantBacon = "no";
        String baconStyle = "";
        String baconType = "";
// Variables for Eggs
        String wantEgg = "no";
        String eggStyle = "";
        String eggFried = "";
// Variables for Toast
        String wantToast = "no";
        String toastGrain = "";


// Greetings message
        System.out.println("\nWelcome to the Breakfast Cafe! Let's take your order.\n");

// Coffee selection
        System.out.print("Would you like Coffee with your breakfast? Yes/No ");
        if (input.nextLine().equalsIgnoreCase("Yes")) {// Disregards case sensitivity from user input
            wantCoffee = "Yes";
            System.out.print("Would you like cream with your Coffee? Yes/No ");
            if (input.nextLine().equalsIgnoreCase("Yes")) {
                coffeeCream = "Yes";
                System.out.print("What kind of cream would you like? Regular/Non-Dairy ");
                creamType = input.nextLine();
            }
            System.out.print("Would you like sugar with your Coffee? Yes/No ");
            if (input.nextLine().equalsIgnoreCase("Yes")) {
                coffeeSugar = "Yes";
                System.out.print("What kind of sugar would you like? Regular/Sugar-Substitute ");
                sugarType = input.nextLine();
            }
        }
 // Bacon Selection
        System.out.println("Would you like Bacon with your breakfast? Yes/No ");
        if (input.nextLine().equalsIgnoreCase("Yes")) {
            wantBacon = "Yes";
            System.out.print("What kind of bacon do you prefer? Strips/Canadian ");
            baconStyle = input.nextLine();
            System.out.print("What kind of meat would you like? Traditional/Vegan ");
            baconType = input.nextLine();
        }

// Egg Selection
        System.out.println("Would you like Eggs with your breakfast? Yes/No ");
        if (input.nextLine().equalsIgnoreCase("Yes")) {
            wantEgg = "Yes";
            System.out.print("How would you like your eggs cooked? Scrambled/Sunny-Side-Up/Fried ");
            eggStyle = input.nextLine();
            if (eggStyle.equalsIgnoreCase("Fried")) {
                System.out.print("How would you like th egg to be fried? Over-Easy/Over-Medium/Over-Hard ");
                eggFried = input.nextLine();
            }           
        }

// Toast Selection
        System.out.println("Would you like Toast with your breakfast? Yes/No ");
        if (input.nextLine().equalsIgnoreCase("Yes")) {
        wantToast = "Yes";
        System.out.print("What kind of toast would you like? Wheat/White ");
        toastGrain = input.nextLine();
        }

// Display Customers Order
        System.out.println("\nCUSTOMER ORER");
        System.out.println("Coffee: " + (wantCoffee.equals("Yes") ? "Yes, Cream: " + coffeeCream + ", " + creamType + ", Sugar: " + coffeeSugar + ", " + sugarType : "No"));
        System.out.println("Bacon: " + (wantBacon.equals("Yes") ? "Yes, " + baconStyle + ", " + baconType : "No"));
        System.out.println("Eggs: " + (wantEgg.equals("Yes") ? "Yes, " + eggStyle + ", " + eggFried : "No"));
        System.out.println("Toast: " + (wantToast.equals("Yes") ? "Yes, " + toastGrain : "No"));

// Determine if it was a healthy breakfast and output to customer
        boolean healthyBreakfast = !wantCoffee.equals("Yes") || (creamType.isEmpty() || sugarType.isEmpty()) || (creamType.equals("Non-Dairy") &&
        sugarType.equals("Sugar-Substitute")) && (!wantBacon.equals("Yes") || baconType.equals("Vegan")) && (!wantToast.equals("Yes") || toastGrain.equals("Wheat"));
        System.out.println("\n" + (healthyBreakfast ? "This is a healthy breakfast." : "Consider taking a walk after your meal."));
        input.close();
    }
}
