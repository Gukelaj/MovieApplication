public class Movie
{
    private String name;
    private int year;
    private String director;
    private String actor;

    public Movie(String name, int year, String director, String actor)
    {
        this.name = name;
        this.year = year;
        this.director = director;
        this.actor = actor;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDirector()
    {
        return director;
    }

    public void setDirector(String director)
    {
        this.director = director;
    }

    public int getYear()
    {
        return year;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public String getActor()
    {
        return actor;
    }

    public void setActor(String actor)
    {
        this.actor = actor;
    }
}