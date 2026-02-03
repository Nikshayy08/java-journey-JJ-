import java.util.Scanner;
public class WeightConversion {
    public static void main(String[] args){
        // Weight conversion program

        Scanner scanner=new Scanner(System.in);

        // Declare variables

        double weight;
        double newWeight;
        int choice;
        
        System.out.println("------Weight Conversion Program------");
        System.out.println("1 : Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        // Prompt for user choice
        System.out.println("Choose an option");
        choice=scanner.nextInt();

        //Option 1: convert lbs to kgs
        if(choice==1){
            System.out.println("Enter the weight in lbs: ");
            weight=scanner.nextDouble();
            newWeight=weight*0.453592;
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        }

        //Option 2: convert kgs to lbs
        else if(choice == 2){
            System.out.println("Enter the weight in kgs: ");
            weight=scanner.nextDouble();
            newWeight=weight*2.202462;
            System.out.printf("The weight in lbs is : %.2f ",newWeight);
        }

        // else print not a valid choice
        else{
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
