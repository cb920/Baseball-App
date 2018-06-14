//***************************************
// Chloe' Bragg
// January 10th 2018
// Baseball Calculations runner program
//***************************************
public class BaseballClass
{
    private int singles, doubles, triples, homeRuns, totalHits, atBats,
                totalBases, runsBattedIn, runsScored, runsProduced;
    private double battingAverage, sluggingPercentage, rank1;
    
    public BaseballClass()
    {
        singles = 0;
        doubles = 0;
        triples = 0;
        homeRuns = 0;
        totalHits = 0;
        atBats = 0;
        totalBases = 0;
        runsBattedIn = 0;
        runsScored = 0;
        runsProduced = 0;
        battingAverage = 0;
        sluggingPercentage = 0;
        rank1 = 0.0;
    }
    
    public void setSingles(int num)
    {
        singles = num;
    }
    public int getSingles()
    {
        return singles;
    }
    
    public void setDoubles(int num)
    {
        doubles = num;
    }
    public int getDoubles()
    {
        return doubles;
    }
    
    public void setTriples(int num)
    {
        triples = num;
    }
    public int getTriples()
    {
        return triples;
    }
    
    public void setHomeRuns(int num)
    {
        homeRuns = num;
    }
    public int getHomeRuns()
    {
        return homeRuns;
    }
    
    public void setTotalHits(int num)
    {
        totalHits = num;
    }
    public int getTotalHits()
    {
        totalHits = (singles + doubles + triples + homeRuns);
        return totalHits;
    }
    
    public void setAtBats(int num)
    {
        atBats = num;
    }
    public int getAtBats()
    {
        return atBats;
    }
    
    public void setTotalBases(int num)
    {
        totalBases = num;
    }
    public int getTotalBases()
    {
        totalBases = (1 * singles) + (2 * doubles) + (3 * triples) + (4 * homeRuns);
        return totalBases;
    }
    
    public void setRunsBattedIn(int num)
    {
        runsBattedIn = num;
    }
    public int getRunsBattedIn()
    {
        return runsBattedIn;
    }
    
    public void setRunsScored(int num)
    {
        runsScored = num;
    }
    public int getRunsScored()
    {
        return runsScored;
    }
    
    public void setRunsProduced(int num)
    {
        runsProduced = num;
    }
    public int getRunsProduced()
    {
        runsProduced = (runsBattedIn + runsScored);
        return runsProduced;
    }
    
    public void setBattingAverage(double num)
    {
        battingAverage = num;
    }
    public double getBattingAverage()
    {
        battingAverage = ((double) totalHits / atBats);
        return battingAverage;
    }
    
    public void setSluggingPercentage(double num)
    {
        sluggingPercentage = num;
    }
    public double getSluggingPercentage()
    {
        sluggingPercentage = ((double) totalBases / atBats);
        return sluggingPercentage;
    }
    
    public void setRank1()
    {
        if (battingAverage >= 0.345)
            rank1 ++;
        if (sluggingPercentage >= 0.475)
            rank1 ++;
        if (runsProduced >= 38)
            rank1 ++;
    }
    public double getRank1()
    {
        return rank1 / 3.0;
    }
}
