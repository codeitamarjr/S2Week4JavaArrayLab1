import java.util.Scanner;

public class CountingLetters {
    static void counting(){
        Scanner keyboard = new Scanner(System.in);
        int[] wordArray = new int[26]; // Create an Array of 26 objects for each letter of the alphabet(A=0-Z=25)

        for( int i=0; i<10;i++) { //Start a loop of 10 words
            System.out.println("Input the word #"+(i+1));
            String wordInput = keyboard.next(); //store the input wordInput
            wordInput = wordInput.toUpperCase(); //Transform the wordInput to Upper case
            for(int count=0;count < wordInput.length() ; count ++){ //Start a loop of the length of the wordInput
                for(int letterCount=65;letterCount<=90;letterCount++){ //Loop all letters of the alphabet: char 65=A,66=B,67=C, 68=D... until 90=Z
                    if (wordInput.charAt(count) == (char)letterCount) //If the letter address count(0) of the word is equals to to the char 65(A)
                        wordArray[letterCount-65]++; //Add 1 into the Array address 0(A), move to the next char 66(B) and so on...
                }
            }
        }


        for(int i=0; i < 26 ;i++){
            int lineI = i+65;
            char line = (char)lineI;
            System.out.print(line); //print out all the chars from 65 until 90(A-Z)
            System.out.print(wordArray[i]+" "); //print each address of the Array(0-25) which represents all letters of the alphabet
        }
    }
}
