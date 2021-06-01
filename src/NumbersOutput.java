import java.util.Scanner;

public class NumbersOutput {
    public static void output(){
        int[] numbersArray = new int[15];
        Scanner keyboard = new Scanner(System.in);
        for (int count = 0; count < numbersArray.length; count++){
            System.out.println("Input the number #"+(count+1));
            numbersArray[count] = keyboard.nextInt();
        }

        for(int count = 0; count < numbersArray.length ; count++){
            System.out.println(numbersArray[count]);
        }

        for(int count = 0; count < numbersArray.length ; count++){
            System.out.print(numbersArray[count]+" ");
        }

        System.out.println("\nReverse\n");

        for(int count = (numbersArray.length-1); count >= 0; count--){
            System.out.print(numbersArray[count]+" ");
        }
    }
}
