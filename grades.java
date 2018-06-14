//********************
// Chloe' Bragg
// December 7, 2017
// Grade Comparison
//********************
import java.util.Scanner;

public class Grades
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int english, history, language, math, science;
        double rank = 0;
        
        System.out.print("English: \t");
        english = scan.nextInt();
        System.out.print("History: \t");
        history = scan.nextInt();
        System.out.print("Language: \t");
        language = scan.nextInt();
        System.out.print("Math: \t\t");
        math = scan.nextInt();
        System.out.print("Science: \t");
        science = scan.nextInt();
        
        if (english >= 75)
        {
            rank ++;
        }
        if (history >= 75)
        {
            rank ++;
        }
        if (language >= 75)
        {
            rank ++;
        }
        if (math >= 75)
        {
            rank ++;
        }
        if (science >= 75)
        {
            rank ++;
        }
        System.out.print("Your academic success is ranked " +
                        "out of 5. You are at a " + rank/5 * 100+ "%.");
    }
}
