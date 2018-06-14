//***********************
// Chloe' Bragg
// December 7, 2017
// Baseball Calculations
//***********************
import java.util.Scanner;

public class Baseball
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int singles, doubles, triples, homeRuns, totalHits, atBats, totalBases, runsBattedIn, runsScored, runsProduced;
        double battingAverage, sluggingPercentage;
        
        System.out.print("Singles: \t\t");
        singles = scan.nextInt();
        System.out.print("Doubles: \t\t");
        doubles = scan.nextInt();
        System.out.print("Triples: \t\t");
        triples = scan.nextInt();
        System.out.print("Home Runs: \t\t");
        homeRuns = scan.nextInt();
        System.out.print("At-Bats: \t\t");
        atBats = scan.nextInt();
        System.out.print("Runs Batted In: \t");
        runsBattedIn = scan.nextInt();
        System.out.print("Runs Scored: \t\t");
        runsScored = scan.nextInt();
        
        totalHits = (singles + doubles + triples + homeRuns);
        battingAverage = ((double) totalHits / atBats);
        totalBases = (1 * singles) + (2 * doubles) + (3 * triples) + (4 * homeRuns);
        sluggingPercentage = ((double) totalBases / atBats);
        runsProduced = (runsBattedIn + runsScored);
        
        System.out.println("");
        System.out.println("Total Hits: \t\t" + totalHits);
        System.out.println("Batting Average: \t" + battingAverage);
        System.out.println("Total Bases: \t\t" + totalBases);
        System.out.println("Slugging Percentage: \t" + sluggingPercentage);
        System.out.println("Runs Produced: \t\t" + runsProduced);
       
       int rank1 = 0;
       
        if (battingAverage >= 0.345)
            rank1 ++;
        if (sluggingPercentage >= 0.475)
            rank1 ++;
        if (runsProduced >= 38)
            rank1 ++;
        System.out.println("Your baseball success is ranked out of 3. You are at a " + rank1 + ".");
    }
}
