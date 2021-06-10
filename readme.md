##Revision of Array

###2 Write statements to the following:
(a) an array of floating-point numbers with ten elements

(b) an array of characters with eight elements

(c) an array of integers with 11 elements

(d) an array of integers initialised to 123,156,77,-9,78,21

(e) assign values to a 5-element array of integers with values entered from the keyboard.

(f) assign values to a 6-element array of Strings with strings entered from the keyboard.

Solution:WritingArray

### 3Write a program to
(a) input 15 numbers from the keyboard and

(b) display them as follows:

(i) each number on a separate line

(ii) on one line, each number separated by a space

(iii) as in (i) but in the reverse order to which they were input.

Use an array and a for-loop to input the numbers, a for-loop for (a), (i), (ii) and (iii)

Solution:NumbersOutput

### 4 (a) Write a program that prompts a teacher for the percentage marks for a class of 25
students. When all 25 marks are entered the program displays the average mark, the number
of passes and fails and the number greater than the average and the number less or equal to
the average. Assume the pass mark is 40. Allow only valid percentage marks to be entered.
        Example:
Enter the mark for student 1: 56 <——input

Enter the mark for student 2: 111 <——	invalid	input

Enter the mark for student 2: 11 <——input

Enter the mark for student 3: -45 <——	invalid	input

Enter the mark for student 3: 45 <——input

        Enter the grade for student 25: 77 <——input
The average mark is 51.61 output

The number of passes = 21 and the number of fails = 4

The number greater than the average=14 and the number less the average is 11

Solution:StudentMarks

### 5. The following two arrays represent the fixed and variable costs involved in producing each
of eight items:

double fixed[] = { 11.31, 12.12, 13.67, 11.91, 12.30, 11.80, 11.00, 12.00 };

double variable[] = { 1.12, 1.13, 3.14, 1.35, 2.20, 1.28, 1.00, 2.10 } ;

Write a program to input an item number in the range 1 to 8 along with the number of items
produced. The program should then display the cost of producing that number of units.

Java Problem Worksheet Arrays

                Example 1:

Input an item number (1-8): 2 <——input

Input the number of items (>0): 10 <——input

The cost of producing 10 of item 2 is 23.42 <——output

(note:23.42=10*1.13+12.12)

                Example 2:

Input an item number (1-8): -6 <——invalid	input

Input an item number (1-8): 6 <——	valid	input

Input the number of items (>0): 0 <——invalid	input

Input the number of items (>0): -5 <——invalid	input

Input the number of items (>0): 5 <——valid	input

The cost of producing 5 of item 6 is 18.20 <——output

(note:18.20=5*1.28+11.80)

Solution:FixedVariableCosts 

### 6. Write a program that inputs a single character from the keyboard until the
character 'x' or 'X' is input.
The program then displays a count of each upper-case and lower-case vowel input.
(Note: A vowel is one of the following: a e i o u A E I O U)

Example:

Input a character:B <——input

Input a character:A

Input a character:a

Input a character:O

Input a character:P

Input a character:U

Input a character:i

Input a character:A

Input a character:I

Input a character:E

Input a character:a

Input a character:E

Input a character:U

Input a character:x

Vowel Counts: a=2 e=0 i=1 o=0 u=0 A=2 E=2 I=1 O=1 U=2 <——output

Use an array to store the count for each of the 10 vowels.

Solution:VowelCount

### 7. Write a program to inputs ten words from the keyboard and displays the number of times each letter of the alphabet occurs. Ignore the difference between upper and lower case letters.

### 8.Write a program to
(i) initialise an array with any ten values

(ii) display the array

(iii)Input a character from the keyboard. The character must be either ‘L’,’l’,’R’
or ‘r’.

(iv)Shift the elements of the array left or right depending on the character input
in (iii) above.
e.g. left-shift:

(v) display the shifted array
                Example:
The array 1,8,9,4,22,33,48,72,18,19,20

shifted left is 8,9,4,22,33,48,72,18,19,20,1

shifted right is 20, 1,8,9,4,22,33,48,72,18,19

Solution:ArrayShift