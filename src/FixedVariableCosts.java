import java.util.Scanner;

public class FixedVariableCosts {
    public static void coasts(){

        double fixed[] = { 11.31, 12.12, 13.67, 11.91, 12.30, 11.80, 11.00, 12.00 };
        double variable[] = { 1.12, 1.13, 3.14, 1.35, 2.20, 1.28, 1.00, 2.10 } ;

        System.out.println("Input an item number (1-8):");
        Scanner keyboard = new Scanner(System.in);
        int item = keyboard.nextInt();
        while (item<=0){
            System.out.println("invalid input");
            item = keyboard.nextInt();
        }
        System.out.println("Input the number of items (>0):");
        int numberOfItems = keyboard.nextInt();
        while (numberOfItems<=0){
            System.out.println("invalid input");
            numberOfItems = keyboard.nextInt();
        }

        double coastOfProducing = numberOfItems*variable[(item-1)]+fixed[(item-1)];

        System.out.println("The cost of producing "+numberOfItems+" of item "+item+" is "+coastOfProducing);

    }
}
