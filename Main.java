import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 1. Develop a program that takes the weight (in kilograms) and height (in meters)
            as input and calculates the BMI, then prints it.
            • Input: Weight (kg) = 70, Height (m) = 1.75
            • Expected Output: BMI = 22.86 */

        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter your weight");
        double weight = myObj.nextDouble();

        System.out.println("Enter your height");
        double height = myObj.nextDouble();

        //double BMI = weight/Math.pow(height,2);
        double BMI = weight/(height*height);
        System.out.println("Your BMI = " + BMI);


        /* 2. Write a program that takes the obtained marks and total marks as input and
            calculates the percentage, then prints it.
            • Input: Obtained Marks = 85, Total Marks = 100
            • Expected Output: Percentage = 85.0% */

        System.out.println("Enter your obtained marks: ");
        double obtained_mark = myObj.nextDouble();

        System.out.println("Enter the total marks: ");
        double total_marks = myObj.nextDouble();

        double percentage = (obtained_mark/total_marks) * 100;
        System.out.println("percentage = " + percentage + "%");


        /* 3. Create a program that takes an amount in one currency and an exchange rate
        as input, then converts and prints the amount in another currency.
        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        • Expected Output: Amount in EUR = 85.0 */

        System.out.println("Enter the amount of USD money: ");
        double UScurrency = myObj.nextDouble();

        System.out.println("Enter the exchange rate (USD to EUR): ");
        double exchangeRate = myObj.nextDouble();

        System.out.println("Amount in EUR = " + (UScurrency * exchangeRate) );


        /* 4. Create a program that takes a string as input, calculates its length, and then
        reverses the string using the StringBuilder class, finally printing both the length and
        reversed string.
        • Input: "Hello, World!"
        • Expected Output: Length of the string: 13 And Reversed string: "!dlroW
        ,olleH" */

        System.out.println("Enter a sentence: ");
        String input1 = myObj.nextLine();
        String input = myObj.nextLine();

        StringBuilder res = new StringBuilder();
        res.append(input);
        res.reverse();

        System.out.println("Length of the string: " + input.length() + " And Reversed string: " + "\"" + res + "\"");


        /*5. Develop a program that takes a sentence as input and extracts a substring from
        it, then prints the extracted substring.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index
        = 10, End Index = 20
        • Expected Output: "brown fox" */

        System.out.println("Enter a sentence: ");
        String sentence = myObj.nextLine();

        System.out.println(sentence.substring(10,20));


        /* 6. Write a program that takes a sentence and a keyword as input, then check if
        the keyword is present in the sentence and prints the result.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword =
        "jumps"
        • Expected Output: Keyword "jumps" is present in the sentence. */

        System.out.println("Enter a Sentence: ");
        String sentence1 = myObj.nextLine();

        System.out.println("Enter a keyword: ");
        String word = myObj.nextLine();

        boolean isContain = sentence1.contains(word);

        System.out.println("Keyword " +"\"" + word + "\"" + " is present in the sentence."); // I don't know how to do this properly without the if-statement


        /* 7. Develop a program that takes a sentence and a word to replace as input, then
        replace all occurrences of the word with another word and prints the modified
        sentence.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to
        Replace = "fox", Replacement Word = "cat"
        • Expected Output: "The quick brown cat jumps over the lazy dog" */

        System.out.println("Enter a sentence: ");
        String sentence2 = myObj.nextLine();

        System.out.println("Enter a word to place: ");
        String input_word = myObj.nextLine();

        System.out.println("Enter a replacement word: ");
        String replaced_word = myObj.nextLine();

        System.out.println(sentence2.replaceAll(input_word, replaced_word));


        /* 8. Write a program that takes two strings as input and check if they are equal,
        ignoring the case, then prints whether they are equal or not.
        • Input: String 1 = "Hello", String 2 = "hello"
        • Expected Output: Strings are equal (ignoring case). */

        System.out.println("enter two strings: ");
        String wrd1 = myObj.nextLine();
        String wrd2 = myObj.nextLine();

        boolean strngEqual = wrd1.equalsIgnoreCase(wrd2);

        if (strngEqual == true) {         // this too I don't know how to do it without using if-statement
            System.out.println("Strings are equal (ignoring case)");
        }








        }
    }
