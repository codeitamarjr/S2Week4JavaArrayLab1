import java.util.Scanner;

public class StudentMarks {
    public static void averageMarks(){
        int[] students = new int[25];
        int mark = 0;
        double sumMarks = 0;
        Scanner keyboard = new Scanner(System.in);

        for(int count = 0 ; count < students.length ;){
            System.out.println("Input the student mark #"+(count+1));
            mark = keyboard.nextInt();
            if(mark < 0 || mark > 100){
                System.out.println("Invalid input");
            } else {
                students[count] = mark;
                sumMarks += students[count];
                count++;
            }
        }

        double averageMarks = ((Double)sumMarks/students.length);
        System.out.println("The average mark is "+averageMarks);

        int studentsPass = 0;
        int studentsFail = 0;
        for(int count = 0; count < students.length ; count++){
            if (students[count]>40){
                studentsPass++;
            } else {
                studentsFail++;
            }
        }
        System.out.println("The number of passes = "+studentsPass+" and the number of fails = "+studentsFail);

        int studentsAboveAverage = 0;
        int studentsBelowAverage = 0;
        for(int count = 0; count < students.length ; count++){
            if(students[count]>averageMarks){
                studentsAboveAverage++;
            } else {
                studentsBelowAverage++;
            }
        }
        System.out.println("The number greater than the average="+studentsAboveAverage+" and the number less the average is "+studentsBelowAverage);
    }
}
