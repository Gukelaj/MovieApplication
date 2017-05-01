import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class OS
{
    ArrayList<User> users = new ArrayList<User>();
    File f = new File("User.txt");
    

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

            else if(login.equals ("3"))
            {
                running = false;
            }
        }
    }
    public void login()
    {
        System.out.println("Enter Username:");
        String user = System.console().readLine();
        System.out.println("==========");


        
        // Enter Name
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
            // ArrayList<User> users = new ArrayList<User>();

            System.out.println("Enter your Name:");
            String name = System.console().readLine();
            System.out.println("Enter your Password:");
            String password = System.console().readLine();

            PrintStream file = new PrintStream(f);
            users.add(new User(name, password));
                    
            for(int i = 0; i < users.size(); i++)
            {
                file.print(users.get(i).getName() + " " + users.get(i).getPassword());
                        
                if(i != users.size() -1)
                {
                    file.println();
                }
            } 
        } catch(Exception e)
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
                // Search
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
}