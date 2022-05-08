package courseprojec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author 2153617
 */
public class Account {
    
    
    ArrayList<Account> accounts = new ArrayList();
    ArrayList<Course> myCourse = new ArrayList();
    
    
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private int numbOfClass  = 0;

    public Account(String firstName, String lastName, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.myCourse = new ArrayList();
        
    }


    public Account() {
		
	}


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void addAccount(Account newAccount) {
    	accounts.add(newAccount);
    }

    
    public void displayCourses() {
    	for (int i = 0; i < myCourse.size() ; i++) {
			System.out.println(myCourse.get(i));
		}
    }
}
