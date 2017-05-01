public class Movie
{
    private String title;
    private int year;
    private String director;
    private String actor1;
    private String actor2;
    private String actor3;


    public Movie(String title, int year, String director, String actor1, String actor2, String actor3)
    {
        this.title = title;
        this.year = year;
        this.director = director;
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
        
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

       public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public String getActor1()
    {
        return actor1;
    }

    public void setActor1(String actor1)
    {
        this.actor1 = actor1;
    }

    public String getActor2()
    {
        return actor2;
    }

    public void setActor2(String actor2)
    {
        this.actor2 = actor2;
    }

    public String getActor3()
    {
        return actor3;
    }

    public void setActor3(String actor3)
    {
        this.actor3 = actor3;
    }

    public String toString()
    {
        return title + " " + year + " " + director + " " + actor1 + " " + actor2 + " " + actor3; 
    }
}