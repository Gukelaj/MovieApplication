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

            Scanner scan = new Scanner(f1).useDelimiter("\\s*,\\s*");

            while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next())); 
            }

            System.out.print("What do you want to search for?: ");
            String result = input.nextLine();
            System.out.println("============================== ");

            for(int i = 0; i < movies.size(); i++)
            {
                if(movies.get(i).toString().toLowerCase().contains(result.toLowerCase()))
                {
                    System.out.println(i + " " + movies.get(i).getTitle());
                }               
            }
            System.out.println("============================== ");
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
            Scanner scan = new Scanner(f1).useDelimiter("\\s*,\\s*");

           
            search();

             while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next())); 
            }

            boolean edit = true;

            
            System.out.print("What number do you want to update?: ");
            int number = input.nextInt();
            System.out.println("============================== ");
    
            while(edit)
            {
                System.out.println("");
                System.out.println("########################################");
                System.out.println("Title:      " + movies.get(number).getTitle());
                System.out.println("Year:       " + movies.get(number).getYear());
                System.out.println("Director:   " + movies.get(number).getDirector());
                System.out.println("Actors: ");
                System.out.println("            " + movies.get(number).getActor1());
                System.out.println("            " + movies.get(number).getActor2());
                System.out.println("            " + movies.get(number).getActor3());
                System.out.println("########################################"); 
                System.out.println(""); 
                
                System.out.println("1. Title ");
                System.out.println("2. Year ");
                System.out.println("3. Director ");
                System.out.println("4. Actor1 ");
                System.out.println("5. Actor2 ");
                System.out.println("6. Actor3 ");
                System.out.println("7. Cancel ");
                System.out.print("Press (1/2/3/4/5/6/7): ");
                String option = System.console().readLine();
                System.out.println("============================== ");

                if (option.equals ("1"))
                {
                    System.out.print("Title: ");
                    String title = System.console().readLine();
                    // String title = input.next();
                    System.out.println("============================== ");
                    movies.get(number).setTitle(title);
                    System.out.println(movies.get(number).getTitle());

                
                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i++)
                    { 
                        
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                        
                    }
                }

                else if(option.equals("2"))
                {
                    System.out.print("Year: ");
                    String year = System.console().readLine();
                    int year1 = Integer.parseInt(year);
                    // int year = input.nextInt();
                    System.out.println("============================== ");
                    movies.get(number).setYear(year1);

                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i++)
                    {
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                    }
                }

                else if(option.equals("3"))
                {
                    System.out.print("Director: ");
                    String director = System.console().readLine();
                    // String director = input.next();
                    System.out.println("============================== ");
                    movies.get(number).setDirector(director);

                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i++)
                    {
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                    }
                }

                else if(option.equals("4"))
                {
                    System.out.println("Actor 1: ");
                    String actor1 = System.console().readLine();
                    // String actor1 = input.next();
                    System.out.println("============================== ");
                    movies.get(number).setActor1(actor1);

                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i++)
                    {
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                    }
                }

                else if (option.equals("5"))
                {
                    System.out.println("Actor 2: ");
                    String actor2 = System.console().readLine();
                    // String actor2 = input.next();
                    System.out.println("============================== ");
                    movies.get(number).setActor2(actor2);

                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i ++)
                    {
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                    }
                }
                
                else if (option.equals("6"))
                {
                    System.out.println("Actor 3: ");
                    String actor3 = System.console().readLine();
                    // String actor3 = input.next();
                    System.out.println("============================== ");
                    movies.get(number).setActor3(actor3);

                    PrintStream file = new PrintStream(f1);
                    for(int i = 0; i < movies.size(); i++)
                    {
                        file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                        + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                        + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());
                        
                        if(i != movies.size() -1)
                        {
                            file.println();
                        }
                    }
                } 

                else if (option.equals("7"))
                {
                    edit = false;
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
            System.out.print("Press (1/2/3): ");
            String login = System.console().readLine();
            System.out.println("============================== ");

                        
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
             else if(login.equals ("7"))
            {
                // play();
            }
        }
    }
    
    public void login()
    {
        try
        {
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(f);
            while(scan.hasNextLine())
            {
                users.add(new User(scan.next(), scan.next(), scan.nextInt()));   
            }
        } 
        catch(Exception e)
        {
            System.out.println(e);
        }  
        System.out.print("Enter Username: ");
        String user = System.console().readLine();
        
        // Enter title
        for(int i = 0; i < users.size(); i++)
        {
            if(user.equals (admin.getName()))
            {
                for(int x = 0; x < 3; x++) 
                {
                    System.out.print("Enter Password: ");
                    String password = System.console().readLine();
                    System.out.println("============================== ");

                    if(password.equals (admin.getPassword()))
                    {
                        runAdminMenu();
                        break;
                    } 
                }
                break;
            }

            else if(user.equals (users.get(i).getName()))
            {
                        
                // Enter password
                for(int y = 0; y < 3; y++) 
                {
                    System.out.print("Enter Password: ");
                    String password = System.console().readLine();
                    System.out.println("============================== ");

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
                users.add(new User(scan.next(), scan.next(), scan.nextInt()));   
            }
            // ArrayList<User> users = new ArrayList<User>();

            System.out.print("Enter your Username: ");
            String title = System.console().readLine();
            System.out.print("Enter your Password: ");
            String password = System.console().readLine();
            System.out.println("============================== ");

            PrintStream file = new PrintStream(f);
            users.add(new User(title, password, 0));
                    
            for(int i = 0; i < users.size(); i++)
            {
                file.print(users.get(i).getName() + " " + users.get(i).getPassword() + " " + users.get(i).getNumberOfMovies());
                        
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
            System.out.println("2. Play movie");
            System.out.println("3. Quit");
            System.out.print("Press (1/2/3): ");
            String input = System.console().readLine();
            System.out.println("============================== ");
                        
            // Search for movie
            if(input.equals("1")) 
            {
                search();
            }
            
            else if(input.equals("2")) 
            {
                play();
                user.setNumberOfMovies();
                user.printNumberOfMovies();
                try
                {
                    PrintStream file1 = new PrintStream(f);
                    
                    for(int i = 0; i < users.size(); i++)
                    {
                        file1.print(users.get(i).getName() + " " + users.get(i).getPassword()
                        + " " + users.get(i).getNumberOfMovies());
                        
                        if(i != users.size() -1)
                        {
                            file1.println();
                        }
                    } 
                }
                catch(Exception e)
                {

                }
            }
                                
            // Quit
            else if(input.equals("3")) 
            {
                System.out.println("Thanks for using Movie DB"); 
                System.out.println("============================== ");
                menu = false;
            }
                                
            // Error option
            else
            {
                System.out.println("Invalid option");                
            }                      
        }
    }
    
    public void runAdminMenu()
    {
        boolean menu = true;

        while(menu)
        {
            System.out.println("What would you like to do?");
            System.out.println("1. Create movie");
            System.out.println("2. Update movie");
            System.out.println("3. Quit");
            System.out.print("Press (1/2/3): ");
            String input = System.console().readLine();
            System.out.println("============================== ");
                        
            // Create movie
            if(input.equals("1")) 
            {
                createMovie();
            }
            
            else if(input.equals("2")) 
            {
                update();
            }
                                
            // Quit
            else if(input.equals("3")) 
            {
                System.out.println("Thanks for using Movie DB"); 
                System.out.println("============================== ");
                menu = false;
            }
                                
            // Error option
            else
            {
                System.out.println("Invalid option");                
            }                      
        }
    }

    public void play()
    {
        try
        {
            ArrayList<Movie> movies = new ArrayList<Movie>();
            Scanner input = new Scanner(System.in);

            Scanner scan = new Scanner(f1).useDelimiter("\\s*,\\s*");
            search();

            while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next(), scan.next(), scan.next())); 
            }

            System.out.print("Choose a movie: ");
            int number = input.nextInt();
            
            System.out.println("");
            System.out.println("########################################");
            System.out.println("Title:      " + movies.get(number).getTitle());
            System.out.println("Year:       " + movies.get(number).getYear());
            System.out.println("Director:   " + movies.get(number).getDirector());
            System.out.println("Actors: ");
            System.out.println("            " + movies.get(number).getActor1());
            System.out.println("            " + movies.get(number).getActor2());
            System.out.println("            " + movies.get(number).getActor3());
            System.out.println("########################################"); 
            System.out.println(""); 
        }
        catch(Exception e)
        {

        }
    }

    public void createMovie()
    {
       try 
        {
            ArrayList<Movie> movies = new ArrayList<Movie>();
            Scanner input = new Scanner(System.in);
            Scanner scan = new Scanner(f1);
            scan.useDelimiter("\\s*,\\s*");
       
            while(scan.hasNextLine())
            {
                movies.add(new Movie(scan.next(), scan.nextInt(), scan.next(), scan.next()
                , scan.next(), scan.next()));
            }
            System.out.print("Enter Movie Title: ");
            String title = System.console().readLine();

            System.out.print("Enter movie Year: ");
            String year = System.console().readLine();
            int year1 = Integer.parseInt(year);

            System.out.print("Enter director: ");
            String director = System.console().readLine();

            System.out.print("Enter first actor: ");
            String actor1 = System.console().readLine();

            System.out.print("Enter second actor: ");
            String actor2 = System.console().readLine();

            System.out.print("Enter third actor: ");  
            String actor3 = System.console().readLine();
            System.out.println("============================== ");

            PrintStream file = new PrintStream(f1);
            movies.add(new Movie(title, year1, director, actor1, actor2, actor3));

            for(int i = 0; i < movies.size(); i++)
            {
                file.print(", " + movies.get(i).getTitle() + " , " + movies.get(i).getYear()
                + " , " + movies.get(i).getDirector() + " , " + movies.get(i).getActor1()
                + " , " + movies.get(i).getActor2() + " , " + movies.get(i).getActor3());

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