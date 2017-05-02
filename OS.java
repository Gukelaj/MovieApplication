import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class OS
{
    Admin admin = new Admin("admin", "1234");
    ArrayList<User> users = new ArrayList<User>();
    File f = new File("User.txt");
    File f1 = new File("Movies.txt");
    
    

    public void search()
    {
        try 
        {
            
            ArrayList<Movie> movies = new ArrayList<Movie>();
            Scanner input = new Scanner(System.in);

            Scanner scan = new Scanner(f1);

            while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next())); 
            }

            System.out.println("What do you want to search for?");
            String result = input.nextLine();

            for(int i = 0; i < movies.size(); i++)
            {
                if(movies.get(i).toString().contains(result))
                {
                    System.out.println(i + " " + movies.get(i));
                }               
            }
        }
        catch(Exception e) 
        {
            
        }
    }

    public void update()
    {
        try
        {
        
            ArrayList<Movie> movies = new ArrayList<Movie>();    
        
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(f1);

           
            search();

             while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next())); 
            }

            System.out.println("what number do you want to update? ");
            int number = input.nextInt();

            
            System.out.println("1. title ");
            System.out.println("2. year ");
            System.out.println("3. director ");
            System.out.println("4. actor1 ");
            System.out.println("5. actor2 ");
            System.out.println("6. actor3 ");
            String option = System.console().readLine();

            if (option.equals ("1"))
            {
                System.out.print("title: ");
                String title = input.next();
                movies.get(number).setTitle(title);

            
                PrintStream file = new PrintStream(f1);
                for(int i = 0; i < movies.size(); i++)
                { 
                    
                    file.print(movies.get(i).getTitle() + " " + movies.get(i).getYear()
                    + " " + movies.get(i).getDirector() + " " + movies.get(i).getActor1()
                    + " " + movies.get(i).getActor2()
                    + " " + movies.get(i).getActor3());
                    
                    if(i != movies.size() -1)
                    {
                        file.println();
                    }
                    
                }

            }
     
        }
        catch(Exception e) 
        {
            
        }
    }

    public void startMenu()
    {       
        boolean running = true;
        while(running)
        {
            System.out.println("Movie DB");
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Quit");
            String login = System.console().readLine();
            System.out.println("==========");

                        
            if(login.equals ("1"))
            {
                login(); 
            }

            else if(login.equals ("2"))
            {
                signUp();
            }
            // SKAL SLETTES 
            else if(login.equals ("4"))
            {
                update();
            }
            
            else if(login.equals ("5"))
            {
                createMovie();
            }
            
            else if(login.equals ("3"))
            {
                running = false;
            }

            else if(login.equals ("6"))
            {
                search();
            }
        }
    }
    
    public void login()
    {
        System.out.println("Enter Username:");
        String user = System.console().readLine();
        System.out.println("==========");


        
        // Enter title
        for(int i = 0; i < users.size(); i++)
        {
            if(user.equals (users.get(i).getName()))
            {
                        
                // Enter password
                for(int y = 0; y < 3; y++) 
                {
                    System.out.println("Enter Password:");
                    String password = System.console().readLine();
                    System.out.println("==========");

                    if(password.equals (users.get(i).getPassword()))
                    {
                        runMenu(users.get(i));
                        break;
                    } 
                }
                break;
            }
        }
    }

    public void signUp()
    {
        try
        {
            Scanner input = new Scanner(System.in);
            // File f = new File("User.txt");
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine())
            {
                users.add(new User(scan.next(), scan.next()));   
            }
            // ArrayList<User> users = new ArrayList<User>();

            System.out.println("Enter your Username:");
            String title = System.console().readLine();
            System.out.println("Enter your Password:");
            String password = System.console().readLine();

            PrintStream file = new PrintStream(f);
            users.add(new User(title, password));
                    
            for(int i = 0; i < users.size(); i++)
            {
                file.print(users.get(i).getName() + " " + users.get(i).getPassword());
                        
                if(i != users.size() -1)
                {
                    file.println();
                }
            } 
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }   
    }

    public void runMenu(User user)
    {
        boolean menu = true;

        while(menu)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Search for movies");
            System.out.println("2. Quit");
            System.out.println("Press (1/2/3/4)");

            String input = System.console().readLine();
                        
            // Search for movie
            if(input.equals("1")) 
            {
                search();
            }
                                
            // Quit
            else if(input.equals("2")) 
            {
                System.out.println("Thanks for using Movie DB"); 
                System.out.println("==========");
                menu = false;
            }
                                
            // Error option
            else
            {
                System.out.println("Invalid option");                
            }                      
        }
    }
    public void createMovie()
   {
       try 
        {
            ArrayList<Movie> movies = new ArrayList<Movie>();
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(f1);
       
            while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next()
                , scan.next(),scan.next()));
            }
            System.out.println("Enter Movie Title");
            String title = System.console().readLine();

            System.out.println("Enter movie Year");
            String year = System.console().readLine();
            int year1 = Integer.parseInt(year);

            System.out.println("Enter director");
            String director = System.console().readLine();

            System.out.println("Enter first actor");
            String actor1 = System.console().readLine();

            System.out.println("Enter second actor");
            String actor2 = System.console().readLine();

            System.out.println("Enter third actor");
            String actor3 = System.console().readLine();

            PrintStream file = new PrintStream(f1);
            movies.add(new Movie(title, year1, director, actor1, actor2, actor3));

            for(int i = 0; i < movies.size(); i++)
            {
                file.print(movies.get(i).getTitle()+ " " + movies.get(i).getYear() + " " + movies.get(i).getDirector() 
                + " " +  movies.get(i).getActor1() + " " + movies.get(i).getActor2() + " " + movies.get(i).getActor3());

                if (i !=movies.size()-1)
                {
                    file.println();   
                }
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}