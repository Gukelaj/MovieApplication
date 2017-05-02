public class User
{
    private String name;
    private String password;
    private int movieWatched = 0;

    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    public String getName()
    {
        return name;
    }

    public String getPassword()
    {
        return password;
    }

    public String toString()
    {
        return name + " " + password;
    }
}