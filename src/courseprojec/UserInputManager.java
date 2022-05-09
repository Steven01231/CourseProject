package courseprojec;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputManager {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";
    public final static int MAX_COURSE = 7;
    Scanner sc = new Scanner(System.in);

    public Account createAccountInfo() {
        System.out.println(ANSI_BLUE + "Please fill out the required fields to create an account." + ANSI_RESET);
        System.out.print(ANSI_CYAN + "First Name: " + ANSI_RESET);
        String firstName = sc.next();

        System.out.print(ANSI_CYAN + "Last name: " + ANSI_RESET);
        String lastName = sc.next();

        System.out.print(ANSI_CYAN + "Username: " + ANSI_RESET);
        String userName = sc.next();

        System.out.print(ANSI_CYAN + "Create a password: " + ANSI_RESET);
        String password = sc.next();

        Account newAccount = new Account(firstName, lastName, userName, password);

        return newAccount;
    }

    public String retrieveAccountUserName() {
        System.out.println(ANSI_BLUE + "Please fill out the required fields to log into your account." + ANSI_RESET);
        System.out.print(ANSI_CYAN + "Username: " + ANSI_RESET);
        String userName = sc.next();
        return userName;
    }

    public String retrieveAccountPassWord() {
        System.out.print(ANSI_CYAN + "Password: " + ANSI_RESET);
        String password = sc.next();
        return password;
    }

    public int retrieveUserOption() {
        int number = 0;
        System.out.print(ANSI_CYAN + "Enter: " + ANSI_RESET);
        try {
            number = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(ANSI_RED + "You have entered an invalid choice. Please try again." + ANSI_RESET);
        }
        return number;
    }

    public int retrieveNumberOfClasses() {
        System.out.println(ANSI_BLUE + "How many courses will you be taking this semester?" + ANSI_RESET);
        int numb = sc.nextInt();

        if (numb > MAX_COURSE || numb < 0) {
            System.out.println(ANSI_RED + "You are not permitted to take more than 7 classes." + ANSI_RESET);
            return retrieveNumberOfClasses();
        } else {
            return numb;
        }
    }

    public String retrieveDesiredCourses() {
        System.out.println(ANSI_BLUE + "Which Course would you like to add to your list of courses?" + ANSI_RESET);
        String courses = sc.nextLine();
        return courses;
    }

    public String retrieveCourseSubCatName() {
        System.out.println(ANSI_BLUE + "In this list, which course would you like to add in your schedule?" + ANSI_RESET);
        Scanner sc1 = new Scanner(System.in);
        String subCat = sc1.next();

        return subCat;
    }

    public int retrieveNumOfClass() {
        System.out.println(ANSI_BLUE + "How many classes would you like to take this semester?" + ANSI_RESET);
        System.out.println(ANSI_CYAN + "Enter number: " + ANSI_RESET);
        int numbClass = sc.nextInt();
        return numbClass;
    }

    public String retrieveKey() {
        System.out.print(ANSI_CYAN + "[Code] of chosen course : " + ANSI_RESET);
        String key = sc.next();

        return key;
    }

    public String retrieveNameOfEvents() {
        System.out.println("What name would you like to put for your event?(10 words maximum)");
        Scanner sc7 = new Scanner(System.in);
        String name = sc7.nextLine();
        return name;
    }

    public Category retrieveCategory() {
        System.out.println("Which category would you like to assign to your event?");
        Scanner sc8 = new Scanner(System.in);
        String nameCat = sc8.nextLine();

        return new Category(nameCat);
    }

    public SubCategory retrieveSubCategory() {
        System.out.println("Which SubCategory would you like to assign to your event?");
        Scanner sc9 = new Scanner(System.in);
        String nameSubCat = sc9.nextLine();

        return new SubCategory(nameSubCat);
    }

    public DueDate retrieveLocalDate() {
        Scanner sc3 = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day = sc3.nextInt();
        System.out.print("Enter a month: ");
        int month = sc3.nextInt();
        System.out.print("Enter a year: ");
        int year = sc3.nextInt();
        return new DueDate(day, month, year);
    }
    
    public String addNewCat(){
        System.out.println("What would you like to name your category?");
        System.out.print("Enter: ");
        String cat = sc.next();
        return cat;
    }
    
    public String addNewSubCat(){
        System.out.println("What would you like to name your Subcategory?");
        System.out.print("Enter: ");
        String subCat = sc.next();
        return subCat;
    }
    
    public String retrieveDeletedEventName(){
        System.out.println("Enter Event Name: ");
        Scanner sc9 = new Scanner(System.in);
        String name = sc9.next();
        
        return name;
        
    }
}
