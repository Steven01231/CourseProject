import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainClass {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";
	
	public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			UserInputManager us = new UserInputManager();
            Account account = new Account();
            
            Course courses = new Course();
            
            
            
            System.out.println(ANSI_BLUE + "[1. Log In] [2. Sign Up] [0. Exit] " + ANSI_RESET);
            int option = us.retrieveUserOption();
            
            
            switch(option){
            	case 0:
            		System.out.println("You have successfully exited the Website!");
            		break;
                case 1:
                    String userName = us.retrieveAccountUserName();
                    us.retrieveAccountPassWord();
                    break;
                case 2:
                    Account newAccount = us.createAccountInfo();
                    account.accounts.add(newAccount);
                    account.addAccount(newAccount);
                    System.out.println("Account succesfully created!");
                    
                    
                    System.out.println("Which Course would you like to add to your list of courses?");
                	String DesiredCourses = sc.nextLine();
            		courses.displayCourses(DesiredCourses);
                    //code to choose courses by category and subcat
                    //add to the array when chosen
                    break;
                default:
                	System.out.println("Invalid option");
                	break;
                	
            }
            
           
            

		
	}
	
	
}
