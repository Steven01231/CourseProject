package courseprojec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputManager {
	
	public final static int MAX_COURSE = 7;
    Scanner sc = new Scanner(System.in); 
    
    
    public Account createAccountInfo(){
        System.out.println("Please fill out the required fields to create an account.");
        System.out.print("First Name: ");
        String firstName = sc.next();
        
        System.out.print("Last name: ");
        String lastName = sc.next();
        
        System.out.println("Username: ");
        String userName = sc.next();
        
        System.out.println("Create a password: ");
        String password = sc.next();
        
        
        Account newAccount = new Account(firstName, lastName, userName, password);
        
        return newAccount;
    }
    
    public String retrieveAccountUserName(){
        System.out.println("Please fill out the required fields to log into your account.");
        System.out.print("Username: ");
        String userName = sc.next();
        return userName;
    }
    
    public String retrieveAccountPassWord(){ 
        System.out.print("Password: ");
        String password = sc.next();
        return password;
    }
    
    public int retrieveUserOption(){
    	int number = 0;
        System.out.println("Enter: ");
        try {
        number = sc.nextInt();
        }catch(InputMismatchException e) {System.out.println("You have entered an invalid choice. Please try again.");}
        return number;
    }
    public int retrieveNumberOfClasses() {
    	System.out.println("How many courses will you be taking this semester?");
    	int numb = sc.nextInt();
    	
    	if(numb > MAX_COURSE || numb < 0) {
    		System.out.println("You are not permitted to take more than 7 classes.");
    		return retrieveNumberOfClasses();
    	}
    	else
    	return numb;
    }
    
    public String retrieveDesiredCourses() {
    	System.out.println("Which Course would you like to add to your list of courses?");
    	String courses = sc.nextLine();
    	return courses;
    }
    
    public String retrieveCourseSubCatName(){
        System.out.println("In this list, which course would you like to add in your schedule?");
          Scanner sc1 = new Scanner(System.in); 
            String subCat = sc1.next();
            
        return subCat;
    }
    
    public int retrieveNumOfClass(){
        System.out.println("Number of classes:");
            int numbClass = sc.nextInt();
            return numbClass;
    }
    
    public Teacher retrieveTeacherName(){
        System.out.println("Which teacher would you like to add in your schedule?");
        Scanner sc2 = new Scanner(System.in);
        System.out.println("First name: ");
        String first = sc2.nextLine();
        System.out.println("Last name: ");
        String last = sc.next();
        Teacher teach = new Teacher(last, first);
        return teach;
    }
    
    public String retrieveKey(){
        System.out.println("[Code] of chosen course : ");
        String key = sc.next();
        
        return key;
    }
}
