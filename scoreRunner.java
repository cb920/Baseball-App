//*****************************************************
// Chloe' Bragg
// January 10th 2018
// Runner Program (comparison of baseball and grades)
//*****************************************************
import java.util.Scanner;

public class ScoreRunner
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        GradesClass person1 = new GradesClass();
        BaseballClass person1B = new BaseballClass();
        
        System.out.print("Math: \t\t");
        person1.setMath(scan.nextInt());
        System.out.print("Science: \t");
        person1.setScience(scan.nextInt());
        System.out.print("History: \t");
        person1.setHistory(scan.nextInt());
        System.out.print("English: \t");
        person1.setEnglish(scan.nextInt());
        System.out.print("Language: \t");
        person1.setLanguage(scan.nextInt());
        System.out.print("Singles: \t");
        person1B.setSingles(scan.nextInt());
        System.out.print("Doubles: \t");
        person1B.setDoubles(scan.nextInt());
        System.out.print("Triples: \t");
        person1B.setTriples(scan.nextInt());
        System.out.print("Home Runs: \t");
        person1B.setHomeRuns(scan.nextInt());
        System.out.print("Total Hits: \t");
        System.out.println(person1B.getTotalHits());
        System.out.print("At Bats: \t");
        person1B.setAtBats(scan.nextInt());
        System.out.print("Total Bases: \t");
        System.out.println(person1B.getTotalBases()); 
        System.out.print("Runs Batted In: ");
        person1B.setRunsBattedIn(scan.nextInt());
        System.out.print("Runs Scored: \t");
        person1B.setRunsScored(scan.nextInt());
        System.out.print("Runs Produced: \t");
        System.out.println(person1B.getRunsProduced());
        System.out.print("Batting Average: \t");
        System.out.println(person1B.getBattingAverage());
        System.out.print("Slugging Percentage: \t");
        System.out.println(person1B.getSluggingPercentage());
        
        person1.setRank();
        person1B.setRank1();
        
        
        if (person1.getRank() > person1B.getRank1())
            {
            System.out.println("\nPercent Success: \nBaseball: " + 
                                person1B.getRank1() + "\nGrades: " + 
                                person1.getRank());
            System.out.println( "According to your success rank: " +
                                "Your grades are better than your " +
                                "baseball statistics.");
            }
        else if (person1.getRank() < person1B.getRank1())
            {
            System.out.println("Percent Success: \nBaseball: " + 
                                person1B.getRank1() + "\nGrades: " + 
                                person1.getRank());
            System.out.println("According to your success rank: " + 
                                Your grades need to be improved.");
            }
        else
            {
            System.out.println("Percent Success: \nBaseball: " + 
                                person1B.getRank1() + "\nGrades: " + 
                                person1.getRank());
            System.out.println("According to your success rank: Your " +
                                "athletic success and academic success " +
                                "are equal.");
            }
    }
}
