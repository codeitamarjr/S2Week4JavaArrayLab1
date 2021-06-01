import java.util.Scanner;

public class WritingArray {
    public static void revisionArray(){

        //(a) an array of floating - point numbers with ten elements
        float[] floatingArray= new float[10];
        //(b) an array of characters with eight elements
        char[] charactersArray = new char[8];
        //(c) an array of integers with 11 elements
        int[] integersArray = new int[11];
        //(d) an array of integers initialised to 123, 156, 77, -9, 78, 21
        int[] integerArrayInitialised = {123,156,77,-9,78,21};
        //(e) assign values to a 5 - element array of integers with values entered from the keyboard.
        Scanner keyboard = new Scanner(System.in);
        int[] assignArrayKeyboard = {keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt(),keyboard.nextInt()};
        for (int count = 0; count < assignArrayKeyboard.length ; count++){
        System.out.println(assignArrayKeyboard[count]);
        }
        //(f) assign values to a 6 - element array of Strings with strings entered from the keyboard.
        String[] stringArray = {keyboard.next(),keyboard.next(),keyboard.next()};
        for (int count = 0; count < stringArray.length ; count ++){
            System.out.println(stringArray[count]);
        }
    }
}
