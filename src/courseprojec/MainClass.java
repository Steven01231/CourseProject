package courseprojec;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

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
            EventOrganizer eo = new EventOrganizer();
            
            
            
            
            
            boolean exit = false;
            do{
            	System.out.println(ANSI_BLUE + "[1. Log In] [2. Sign Up] [0. Exit] " + ANSI_RESET);
                int option = us.retrieveUserOption();
                
            switch(option){
            	case 0:
            		System.out.println("You have successfully exited the Website!");
                        exit = true;
            		break;
                        
                case 1:
                    String userName = us.retrieveAccountUserName();
                    String pass = us.retrieveAccountPassWord();
                    for(int i =0; i < account.accounts.size() -1; i++){
                       
                        if(account.accounts.get(i).getUserName().equals(userName) && account.accounts.get(i).getPassword().equals(pass)){
                        	System.out.print("Welcome to Lol Organizer" + " ");
                        	System.out.println(account.accounts.get(i).getFirstName() + " " + account.accounts.get(i).getLastName() + "!");
                        	System.out.println("<>---------------------<>");
                        	System.out.println("Select a number: [1. Display Courses] [2. Access Agenda]");
                        	int anotherOption = us.retrieveUserOption();
                        	switch(anotherOption){
                        	case  1:
                        		System.out.println("<>-------------------<>");
                        		for (int j = 0; j < account.accounts.get(i).myCourse.size(); j++) {
									
								
                        	    System.out.println(account.accounts.get(i).myCourse.get(j));
                        	    System.out.println("----------------------");
                        		}
                        		break;
                        	
                        	case 2:
                        		if(eo.listOfEvents.size() != 0) {
                        			for (int j = 0; j < eo.listOfEvents.size() ; j++) {
										System.out.println(eo.listOfEvents.get(j));
									}
                        		}
                        		else {
                        			System.out.println("There's no event in your agenda yet.");
                        		}
                        		System.out.println("<>-------------------<>");
                        		System.out.println("Enter a number you want to select: [1. Add an event] [2. Remove a finished event] [3. Modify an event]");
                        		int anotherAnotherOption = us.retrieveUserOption();
                        		switch(anotherAnotherOption) {
                        		case 1:
                        			String name = us.retrieveNameOfEvents();
                        			Category cat = us.retrieveCategory();
                        			SubCategory subCat = us.retrieveSubCategory();
                        			DueDate dueDate = us.retrieveLocalDate();
                        			eo.addEvents(new EventOrganizer(name, cat, subCat, dueDate));;
                        			break;
                        			
                        		case 2:
                        			
                        			break;
                        			
                        		case 0:
                        			break;
                        		}
                        		break;
                        	}

                        }
                        else {
                        	System.out.println("There is no account with that username!");
                        }
                    }
                    break;
                case 2:
                    Account newAccount = us.createAccountInfo();
                    account.accounts.add(newAccount);
                    account.addAccount(newAccount);
                    System.out.println("Account succesfully created!");
                    System.out.println("You're immediately directed to registration!");
                    System.out.println("<>-------------------<>");
                    System.out.println("List of Category(Courses): ");
                    
                    for (Map.Entry<HashMap, String> course : courses.courses.entrySet()) {
                        
                            // print all category

                            

                        }
                        
                    int numb = us.retrieveNumOfClass();
                    
                            
                    for (int i = 0; i < numb; i++) {
                    System.out.println("Which Course would you like to add to your list of courses?");
                    
                	String DesiredCourses = sc.nextLine();
                	if(courses.courses.containsValue(DesiredCourses)) {
            		courses.displayCourses(DesiredCourses);
                        
                        String key = us.retrieveKey();
                        courses.addCourse(key, DesiredCourses, newAccount);
                        System.out.println("<>---------------------<>");
                	}
                	else {
                		System.out.println("You have entered an invalid option. Please try again.");
                		
                		numb++;
                	}
                        
                    }
                    
                    System.out.println(ANSI_GREEN + "Schedule completed!" + ANSI_RESET);
                    System.out.println("Here is your schedule: ");
                    newAccount.displayCourses();
                       
                    option = 1;
                    break;
                default:
                	System.out.println("Invalid option");
                	break;
                        
                        
                	
            }
            
            }while(exit == false);
            
            
           
            

		
	}
	
	
}
