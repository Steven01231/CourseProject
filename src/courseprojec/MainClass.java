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
        do {
            System.out.println(ANSI_BLUE + "[1. Log In] [2. Sign Up] [0. Exit] " + ANSI_RESET);
            int option = us.retrieveUserOption();

            switch (option) {
                //logging out
                case 0:

                    System.out.println(ANSI_GREEN + "You have successfully exited the Website!" + ANSI_RESET);
                    exit = true;
                    break;
                //log in
                case 1:
                    String userName = us.retrieveAccountUserName();
                    String pass = us.retrieveAccountPassWord();
                    for (int i = 0; i < account.accounts.size() - 1; i++) {

                        if (account.accounts.get(i).getUserName().equals(userName) && account.accounts.get(i).getPassword().equals(pass)) {
                            System.out.print("Welcome to Lol Organizer" + " ");
                            System.out.println(account.accounts.get(i).getFirstName() + " " + account.accounts.get(i).getLastName() + "!");
                            System.out.println("<>---------------------<>");
                            int anotherOption;
                            do {
                            	System.out.println("Select a number: [1. Display Courses] [2. Access Agenda]");
                                anotherOption = us.retrieveUserOption();

                            switch (anotherOption) {
                                case 1:
                                    System.out.println("<>-------------------<>");
                                    for (int j = 0; j < account.accounts.get(i).myCourse.size(); j++) {

                                        System.out.println(account.accounts.get(i).myCourse.get(j));
                                        System.out.println("----------------------");
                                    }
                                    break;

                                case 2:
                                    if (eo.listOfEvents.size() != 0) {
                                        for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                            System.out.println(eo.listOfEvents.get(j));
                                        }
                                    } else {
                                        System.out.println("There's no event in your agenda yet.");
                                    }
                                    System.out.println("<>-------------------<>");
                                    System.out.println("Enter a number you want to select: [1. Add an event] [2. Remove a finished event] [3. Modify an event] [4. Sort Current Events]");
                                    int anotherAnotherOption = us.retrieveUserOption();
                                    switch (anotherAnotherOption) {
                                        case 1:
                                            String name = us.retrieveNameOfEvents();
                                            System.out.println("Categories available for your events: ");
                                            for (int n = 0; n < account.accounts.get(i).categories.size(); n++) {
                                                System.out.println(account.accounts.get(i).categories.get(n).getNameCategory() + " / ");
                                            }
                                            System.out.println("Would you like to add a category?");
                                            System.out.println("[1] Yes [2] No");
                                            int addcat = us.retrieveUserOption();

                                            switch (addcat) {
                                                //add category
                                                case 1:
                                                    String catname = us.addNewCat();
                                                    account.accounts.get(i).categories.add(new Category(catname));
                                                    System.out.println(ANSI_GREEN + "Category successfully added!" + ANSI_RESET);
                                                    break;
                                                case 2:
                                                    break;
                                            }
                                            Category cat = us.retrieveCategory();

                                            if (account.accounts.get(i).subCats.size() != 0) {
                                                System.out.println("SubCategories available for your events: ");
                                                for (int a = 0; a < account.accounts.get(i).subCats.size(); a++) {
                                                    System.out.println( account.accounts.get(i).subCats.get(a) + " / ");
                                                }
                                            } else {
                                                System.out.println("No subCategories have been created yet.");
                                                String subcatname = us.addNewSubCat();
                                                account.accounts.get(i).subCats.add(new SubCategory(subcatname));
                                                System.out.println(ANSI_GREEN + "SubCategory successfully added!" + ANSI_RESET);
                                            }

                                            SubCategory subCat = us.retrieveSubCategory();
                                            System.out.println("Date of the event (DD/MM/YYYY) : ");
                                            DueDate dueDate = us.retrieveLocalDate();
                                            eo.addEvents(new EventOrganizer(name, cat, subCat, dueDate));
                                            ;
                                            break;

                                        case 2:
                                            if (eo.listOfEvents.size() != 0) {
                                                System.out.println(ANSI_BLUE + "List of current events: " + ANSI_RESET);
                                                for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                    System.out.println(eo.listOfEvents.get(j));
                                                }
                                            } else {
                                                System.out.println("There's no event in your agenda yet.");
                                            }
                                            System.out.println("What is the name of the event you want to remove?");
                                            String eventName = us.retrieveDeletedEventName();

                                            for (int z = 0; z < eo.listOfEvents.size(); z++) {
                                                if (eo.listOfEvents.get(z).getName().equalsIgnoreCase(eventName)) {
                                                    eo.listOfEvents.remove(z);
                                                    System.out.println(ANSI_GREEN + "Event successfully removed!" + ANSI_RESET);
                                                }
                                            }

                                            if (eo.listOfEvents.size() != 0) {
                                                System.out.println(ANSI_BLUE + "List of current events: " + ANSI_RESET);
                                                for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                    System.out.println(eo.listOfEvents.get(j));
                                                }
                                            } else {
                                                System.out.println("There's no event in your agenda yet.");
                                            }

                                            break;

                                        case 3:
                                            System.out.println("HEKLLO0");
                                            if (eo.listOfEvents.size() != 0) {
                                                System.out.println(ANSI_BLUE + "List of current events: " + ANSI_RESET);
                                                for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                    System.out.println(eo.listOfEvents.get(j));
                                                }
                                            } else {
                                                System.out.println("There's no event in your agenda yet.");
                                            }
                                            System.out.println("Which event would you like to modify?");
                                            String deletedEventName = us.retrieveDeletedEventName();
                                            for (int k = 0; k < eo.listOfEvents.size(); k++) {

                                                if (eo.listOfEvents.get(k).getName().equals(deletedEventName)) {
                                                    System.out.println("What would you like to modify: [1] Name of Event [2] Category [3] SubCategory [4] Date");
                                                    int option22 = us.retrieveUserOption();
                                                    switch (option22) {
                                                        case 1:

                                                            String newName = us.retrieveNameOfEvents();
                                                            eo.listOfEvents.get(k).setName(newName);
                                                            System.out.println("Edited event: " + eo.listOfEvents.get(k));
                                                            break;
                                                        case 2:
                                                            Category newCat = us.retrieveCategory();
                                                            eo.listOfEvents.get(k).setCat(newCat);
                                                            System.out.println("Edited event: " + eo.listOfEvents.get(k));
                                                            break;
                                                        case 3:
                                                            SubCategory newSub = us.retrieveSubCategory();
                                                            eo.listOfEvents.get(k).setSubCat(newSub);
                                                            System.out.println("Edited event: " + eo.listOfEvents.get(k));

                                                            break;
                                                        case 4:
                                                            DueDate newDate = us.retrieveLocalDate();
                                                            eo.listOfEvents.get(k).setDuedate(newDate);
                                                            System.out.println("Edited event: " + eo.listOfEvents.get(k));

                                                            break;
                                                    }
                                                }
                                            }
                                            break;

                                        case 4:
                                            System.out.println("How would you like to sort your events by? [1. Name] [2. Category] [3. SubCategory] [4. Date]");

                                            int option23 = us.retrieveUserOption();

                                            switch (option23) {
                                                case 1:
                                                    Collections.sort(eo.listOfEvents, new EventNameComparato());
                                                    for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                        System.out.println(eo.listOfEvents.get(j));
                                                    }
                                                    break;
                                                case 2:
                                                    Collections.sort(eo.listOfEvents, new CategoryComparator());
                                                    for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                        System.out.println(eo.listOfEvents.get(j));
                                                    }
                                                    break;
                                                case 3:
                                                    Collections.sort(eo.listOfEvents, new SubCategoryComparator());
                                                    for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                        System.out.println(eo.listOfEvents.get(j));
                                                    }
                                                    break;
                                                case 4:
                                                    Collections.sort(eo.listOfEvents, new dueDateComparator());
                                                    for (int j = 0; j < eo.listOfEvents.size(); j++) {
                                                        System.out.println(eo.listOfEvents.get(j));
                                                    }
                                                    break;

                                            }
                                            break;

                                        case 0:
                                            break;
                                    }
                                    break;
                            }
                            }while(anotherOption !=0);

                        } 
                        else {
                            System.out.println("There is no account with that username!");
                        }
                    }
                    break;

                //signing up
                case 2:
                    //registration
                    Account newAccount = us.createAccountInfo();
                    account.accounts.add(newAccount);
                    account.addAccount(newAccount);
                    System.out.println(ANSI_GREEN + "Account succesfully created!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "You're immediately directed to registration!" + ANSI_RESET);
                    System.out.println("<>-------------------<>");

                    int numb = us.retrieveNumberOfClasses();

                    for (int i = 0; i < numb; i++) {
                        System.out.println(ANSI_BLUE + "Which Course would you like to add to your list of courses?" + ANSI_RESET);
                        System.out.println(ANSI_CYAN + "List of Category(Courses): " + ANSI_RESET);

                        Set set2 = Course.courses.entrySet();
                        Iterator iterator2 = set2.iterator();
                        while (iterator2.hasNext()) {
                            Map.Entry mentry2 = (Map.Entry) iterator2.next();
                            System.out.print(mentry2.getValue() + " / ");

                        }
                        System.out.println();
                        String DesiredCourses = sc.nextLine();
                        if (courses.courses.containsValue(DesiredCourses)) {
                            courses.displayCourses(DesiredCourses);
                            String key = us.retrieveKey();
                            if (courses.checkKey(key, DesiredCourses) == true) {
                                System.out.println(ANSI_RED + "Are you sure you want to add this course? " + ANSI_RESET);
                                System.out.println(ANSI_RED + "[1]YES [2] NO" + ANSI_RESET);
                                int optionbesure = us.retrieveUserOption();
                                switch (optionbesure) {
                                    case 1:
                                        courses.addCourse(key, DesiredCourses, newAccount);
                                        break;
                                    case 2:
                                        System.out.println(ANSI_RED + "This course will not be added to your schedule" + ANSI_RESET);
                                        i--;
                                }
                            } else {
                                System.out.println(ANSI_RED + "INVALID KEY" + ANSI_RESET);
                                i--;
                            }

                            System.out.println("<>---------------------<>");
                        } else {
                            System.out.println(ANSI_RED + "You have entered an invalid option. Please try again." + ANSI_RESET);

                            numb++;
                        }

                    }

                    System.out.println(ANSI_GREEN + "Schedule completed!" + ANSI_RESET);
                    System.out.println(ANSI_CYAN + "Here is your schedule: " + ANSI_RESET);
                    newAccount.displayCourses();
                    System.out.println("<>---------------------<>");

                    //end of schedule
                    System.out.println("To access your account again, you may log in.");
                    break;
                //default
                default:
                    System.out.println("Invalid option");
                    break;
            }

        } while (exit == false);

    }

}
