//************************
// Chloe' Bragg
// January 10th 2018
// Grades runner program
//************************
public class GradesClass
{
    private int math, science, history, english, language;
    private double rank;
    public GradesClass()
    {
        math = 0;
        science = 0;
        history = 0;
        english = 0;
        language = 0;
        rank = 0.0;
    }
    
    public void setMath(int score)
    {
        math = score;    
    }
    public int getMath()
    {
        return math;
    }
    
    public void setScience(int score)
    {
        science = score;
    }
    public int getScience()
    {
        return science;
    }
    
    public void setHistory(int score)
    {
        history = score;
    }
    public int getHistory()
    {
        return history;
    }
    
    public void setEnglish(int score)
    {
        english = score;
    }
    public int getEnglish()
    {
        return english;
    }
    
    public void setLanguage(int score)
    {
        language = score;
    }
    public int getLanguage()
    {
        return language;
    }
    
    public void setRank()
    {
        if (english > 75)
        {
            rank ++;
        }
        if (history > 75)
        {
            rank ++;
        }
        if (language > 75)
        {
            rank ++;
        }
        if (math > 75)
        {
            rank ++;
        }
        if (science > 75)
        {
            rank ++;
        }
    }
    public double getRank()
    {
        
        return rank / 5.0;
    }
}
