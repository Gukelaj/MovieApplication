public class User
{
    private String name;
    private String password;
    private int numberOfMovies = 0;

    public User(String name, String password, int numberOfMovies)
    {
        this.name = name;
        this.password = password;
        this.numberOfMovies = numberOfMovies;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }
    
    public int getNumberOfMovies()
    {
        return numberOfMovies;
    }

    public void setNumberOfMovies()
    {
        numberOfMovies++;
    }

    public void printNumberOfMovies()
    {
        System.out.println(numberOfMovies);
    }

    public String toString()
    {
        return name + " " + password;
    }
}