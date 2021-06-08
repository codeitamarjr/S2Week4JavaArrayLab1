import java.util.Scanner;

public class VowelCount {
    public static void vowel(){
        Scanner keyboard = new Scanner(System.in);
        String vowel;
        int[] vowelsArray = new int[10];

        do {
            System.out.print("Input a character:");
            vowel = keyboard.next();
            switch (vowel) {
                case "a":
                    vowelsArray[0]++;
                    break;
                case "A":
                    vowelsArray[1]++;
                    break;
                case "e":
                    vowelsArray[2]++;
                    break;
                case "E":
                    vowelsArray[3]++;
                    break;
                case "i":
                    vowelsArray[4]++;
                    break;
                case "I":
                    vowelsArray[5]++;
                    break;
                case "o":
                    vowelsArray[6]++;
                    break;
                case "O":
                    vowelsArray[7]++;
                    break;
                case "u":
                    vowelsArray[8]++;
                    break;
                case "U":
                    vowelsArray[9]++;
                    break;
            }
        }
        while ( !vowel.contentEquals("X") && !vowel.contentEquals("x"));
        //to compare if the content of
        //vowel is equals to x or X to exit the do loop.

        System.out.println("Vowel Counts: a="+vowelsArray[0]+" e="+vowelsArray[2]+" i="+vowelsArray[4]+" o="+vowelsArray[6]+" u="+vowelsArray[8]+" A="+vowelsArray[1]+" E="+vowelsArray[3]+" I="+vowelsArray[5]+" O="+vowelsArray[7]+" U="+vowelsArray[9]);
    }
}
