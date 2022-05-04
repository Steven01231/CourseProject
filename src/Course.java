/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author 2153617
 */
public class Course implements Comparator<Course> {
	
	
    
     static Map<Course, String> courses = new LinkedHashMap();
     
     static Teacher te = new Teacher();
     
    
    private String course;
    private int numOfClassPerWeek;
    
    static Course computerSci1 = new Course("Introduction to Programming", Teacher.cs1, 3);
    static Course computerSci2 = new Course("Introduction to Programming", Teacher.cs2, 3);
    static Course computerSci3 = new Course("Introduction to Programming", Teacher.cs3, 3);
    static Course computerSci4 = new Course("Introduction to Programming", Teacher.cs4, 3);
    static Course computerSci5 = new Course("Introduction to Programming", Teacher.cs5, 3);
    static Course computerSci6 = new Course("Introduction to Programming", Teacher.cs6, 3);
    static Course computerSci7 = new Course("Introduction to Programming", Teacher.cs7, 3);
    
    static Course Math1 = new Course("Calculus I", Teacher.cal1, 3);
    static Course Math2 = new Course("Calculus I", Teacher.cal2, 3);
    static Course Math3 = new Course("Calculus I", Teacher.cal3, 3);
    static Course Math4 = new Course("Calculus I", Teacher.cal4, 3);
    static Course Math5 = new Course("Calculus I", Teacher.cal5, 3);
    static Course Math6 = new Course("Calculus I", Teacher.cal6, 3);
    static Course Math7 = new Course("Calculus I", Teacher.cal7, 3);
    
    static Course Math8 = new Course("Calculus II", Teacher.cal1, 3);
    static Course Math9 = new Course("Calculus II", Teacher.cal2, 3);
    static Course Math10 = new Course("Calculus II", Teacher.cal3, 3);
    static Course Math11 = new Course("Calculus II", Teacher.cal4, 3);
    static Course Math12 = new Course("Calculus II", Teacher.cal5, 3);
    static Course Math13 = new Course("Calculus II", Teacher.cal6, 3);
    static Course Math14 = new Course("Calculus II", Teacher.cal7, 3);
    
    static Course Math15 = new Course("Linear Algebra", Teacher.cal1, 3);
    static Course Math16 = new Course("Linear Algebra", Teacher.cal2, 3);
    static Course Math17 = new Course("Linear Algebra", Teacher.cal3, 3);
    static Course Math18 = new Course("Linear Algebra", Teacher.cal4, 3);
    static Course Math19 = new Course("Linear Algebra", Teacher.cal5, 3);
    static Course Math20 = new Course("Linear Algebra", Teacher.cal6, 3);
    static Course Math21 = new Course("Linear Algebra", Teacher.cal7, 3);
    
    static Course Chemistry1 = new Course("General Chemistry", Teacher.chem1, 3);
    static Course Chemistry2 = new Course("General Chemistry", Teacher.chem2, 3);
    static Course Chemistry3 = new Course("General Chemistry", Teacher.chem3, 3);
    static Course Chemistry4 = new Course("General Chemistry", Teacher.chem4, 3);
    static Course Chemistry5 = new Course("General Chemistry", Teacher.chem5, 3);
    static Course Chemistry6 = new Course("General Chemistry", Teacher.chem6, 3);
    static Course Chemistry7 = new Course("General Chemistry", Teacher.chem7, 3);
    
    static Course Chemistry8 = new Course("Chemistry of Solutions", Teacher.chem1, 3);
    static Course Chemistry9 = new Course("Chemistry of Solutions", Teacher.chem2, 3);
    static Course Chemistry10 = new Course("Chemistry of Solutions", Teacher.chem3, 3);
    static Course Chemistry11 = new Course("Chemistry of Solutions", Teacher.chem4, 3);
    static Course Chemistry12 = new Course("Chemistry of Solutions", Teacher.chem5, 3);
    static Course Chemistry13 = new Course("Chemistry of Solutions", Teacher.chem6, 3);
    static Course Chemistry14 = new Course("Chemistry of Solutions", Teacher.chem7, 3);
    
    static Course Chemistry15 = new Course("Organic Chemistry", Teacher.chem1, 3);
    static Course Chemistry16 = new Course("Organic Chemistry", Teacher.chem2, 3);
    static Course Chemistry17 = new Course("Organic Chemistry", Teacher.chem3, 3);
    static Course Chemistry18 = new Course("Organic Chemistry", Teacher.chem4, 3);
    static Course Chemistry19 = new Course("Organic Chemistry", Teacher.chem5, 3);
    static Course Chemistry20 = new Course("Organic Chemistry", Teacher.chem6, 3);
    static Course Chemistry21 = new Course("Organic Chemistry", Teacher.chem7, 3);
    
    static Course humanities1 = new Course("World Views",Teacher.hum1, 2);
    static Course humanities2 = new Course("World Views", Teacher.hum2, 2);
    static Course humanities3 = new Course("World Views", Teacher.hum3, 2);
    static Course humanities4 = new Course("World Views", Teacher.hum4, 2);
    static Course humanities5 = new Course("World Views", Teacher.hum5, 1);
    static Course humanities6 = new Course("World Views", Teacher.hum6, 1);
    static Course humanities7 = new Course("World Views", Teacher.hum7, 1);
    
    static Course humanities8 = new Course("Knowledge", Teacher.hum1, 2);
    static Course humanities9 = new Course("Knowledge", Teacher.hum2, 2);
    static Course humanities10 = new Course("Knowledge", Teacher.hum3, 2);
    static Course humanities11 = new Course("Knowledge", Teacher.hum4, 2);
    static Course humanities12 = new Course("Knowledge", Teacher.hum5, 2);
    static Course humanities13 = new Course("Knowledge", Teacher.hum6, 2);
    static Course humanities14 = new Course("Knowledge", Teacher.hum7, 2);
    
    static Course english1 = new Course("English", Teacher.eng1, 2);
    static Course english2 = new Course("English", Teacher.eng2, 2);
    static Course english3 = new Course("English", Teacher.eng3, 2);
    static Course english4 = new Course("English", Teacher.eng4, 2);
    static Course english5 = new Course("English", Teacher.eng5, 2);
    static Course english6 = new Course("English", Teacher.eng6, 2);
    static Course english7 = new Course("English", Teacher.eng7, 2);
    
    static Course french1 = new Course("French", Teacher.fr1, 1);
    static Course french2 = new Course("French", Teacher.fr2, 1);
    static Course french3 = new Course("French", Teacher.fr3, 1);
    static Course french4 = new Course("French", Teacher.fr4, 1);
    static Course french5 = new Course("French", Teacher.fr5, 1);
    static Course french6 = new Course("French", Teacher.fr6, 1);
    static Course french7 = new Course("French", Teacher.fr7, 1);
    
    static Course pe1 = new Course("Physical Education", Teacher.gym1, 1);
    static Course pe2 = new Course("Physical Education", Teacher.gym2, 1);
    static Course pe3 = new Course("Physical Education", Teacher.gym3, 1);
    static Course pe4 = new Course("Physical Education", Teacher.gym4, 1);
    static Course pe5 = new Course("Physical Education", Teacher.gym5, 1);
    static Course pe6 = new Course("Physical Education", Teacher.gym6, 1);
    static Course pe7 = new Course("Physical Education", Teacher.gym7, 1);
    
    static Course physics1 = new Course("Mechanics", Teacher.phys1, 3);
    static Course physics2 = new Course("Mechanics", Teacher.phys2, 3);
    static Course physics3 = new Course("Mechanics", Teacher.phys3, 3);
    static Course physics4 = new Course("Mechanics", Teacher.phys4, 3);
    static Course physics5 = new Course("Mechanics", Teacher.phys5, 3);
    static Course physics6 = new Course("Mechanics", Teacher.phys6, 3);
    static Course physics7 = new Course("Mechanics", Teacher.phys7, 3);
    
    static Course physics8 = new Course("Waves and Optics", Teacher.phys1, 3);
    static Course physics9 = new Course("Waves and Optics", Teacher.phys2, 3);
    static Course physics10 = new Course("Waves and Optics", Teacher.phys3, 3);
    static Course physics11 = new Course("Waves and Optics", Teacher.phys4, 3);
    static Course physics12 = new Course("Waves and Optics", Teacher.phys5, 3);
    static Course physics13 = new Course("Waves and Optics", Teacher.phys6, 3);
    static Course physics14 = new Course("Waves and Optics", Teacher.phys7, 3);
    
    static Course physics15 = new Course("Electricity and Magnetism", Teacher.phys1, 3);
    static Course physics16 = new Course("Electricity and Magnetism", Teacher.phys2, 3);
    static Course physics17 = new Course("Electricity and Magnetism", Teacher.phys3, 3);
    static Course physics18 = new Course("Electricity and Magnetism", Teacher.phys4, 3);
    static Course physics19 = new Course("Electricity and Magnetism", Teacher.phys5, 3);
    static Course physics20 = new Course("Electricity and Magnetium", Teacher.phys6, 3);
    static Course physics21 = new Course("Electricity and Magnetism", Teacher.phys7, 3);
    
    public Course() {
    	courses.put(computerSci1, "Computer Science");
    	courses.put(computerSci2, "Computer Science" );
    	courses.put(computerSci3, "Computer Science" );
    	courses.put(computerSci4, "Computer Science" );
    	courses.put(computerSci5, "Computer Science" );
    	courses.put(computerSci6, "Computer Science" );
    	courses.put(computerSci7, "Computer Science" );
    	
    	courses.put(Math1, "Math");
    	courses.put(Math2, "Math");
    	courses.put(Math3, "Math");
    	courses.put(Math4, "Math");
    	courses.put(Math5, "Math");
    	courses.put(Math6, "Math");
    	courses.put(Math7, "Math");
    	
    	courses.put(Math8, "Math");
    	courses.put(Math9, "Math");
    	courses.put(Math10, "Math");
    	courses.put(Math11, "Math");
    	courses.put(Math12, "Math");
    	courses.put(Math13, "Math");
    	courses.put(Math14, "Math");
    	
    	courses.put(Math15, "Math");
    	courses.put(Math16, "Math");
    	courses.put(Math17, "Math");
    	courses.put(Math18, "Math");
    	courses.put(Math19, "Math");
    	courses.put(Math20, "Math");
    	courses.put(Math21, "Math");
    	
    	courses.put(Chemistry1, "Chemistry");
    	courses.put(Chemistry2, "Chemistry");
    	courses.put(Chemistry3, "Chemistry");
    	courses.put(Chemistry4, "Chemistry");
    	courses.put(Chemistry5, "Chemistry");
    	courses.put(Chemistry6, "Chemistry");
    	courses.put(Chemistry7, "Chemistry");
    	
    	courses.put(Chemistry8, "Chemistry");
    	courses.put(Chemistry9, "Chemistry");
    	courses.put(Chemistry10, "Chemistry");
    	courses.put(Chemistry11, "Chemistry");
    	courses.put(Chemistry12, "Chemistry");
    	courses.put(Chemistry13, "Chemistry");
    	courses.put(Chemistry14, "Chemistry");
    	
    	courses.put(Chemistry15, "Chemistry");
    	courses.put(Chemistry16, "Chemistry");
    	courses.put(Chemistry17, "Chemistry");
    	courses.put(Chemistry18, "Chemistry");
    	courses.put(Chemistry19, "Chemistry");
    	courses.put(Chemistry20, "Chemistry");
    	courses.put(Chemistry21, "Chemistry");
    	
    	courses.put(humanities1, "Humanities");
    	courses.put(humanities2, "Humanities");
    	courses.put(humanities3, "Humanities");
    	courses.put(humanities4, "Humanities");
    	courses.put(humanities5, "Humanities");
    	courses.put(humanities6, "Humanities");
    	courses.put(humanities7, "Humanities");
    	courses.put(humanities8, "Humanities");
    	courses.put(humanities9, "Humanities");
    	courses.put(humanities10, "Humanities");
    	courses.put(humanities11, "Humanities");
    	courses.put(humanities12, "Humanities");
    	courses.put(humanities13, "Humanities");
    	courses.put(humanities14, "Humanities");
    	
    	courses.put(english1, "English");
    	courses.put(english2, "English");
    	courses.put(english3, "English");
    	courses.put(english4, "English");
    	courses.put(english5, "English");
    	courses.put(english6, "English");
    	courses.put(english7, "English");
    	
    	courses.put(french1, "French");
    	courses.put(french2, "French");
    	courses.put(french3, "French");
    	courses.put(french4, "French");
    	courses.put(french5, "French");
    	courses.put(french6, "French");
    	courses.put(french7, "French");
    	
    	courses.put(pe1, "Physical Education");
    	courses.put(pe2, "Physical Education");
    	courses.put(pe3, "Physical Education");
    	courses.put(pe4, "Physical Education");
    	courses.put(pe5, "Physical Education");
    	courses.put(pe6, "Physical Education");
    	courses.put(pe7, "Physical Education");
    	
    	courses.put(physics1, "Physics");
    	courses.put(physics2, "Physics");
    	courses.put(physics3, "Physics");
    	courses.put(physics4, "Physics");
    	courses.put(physics5, "Physics");
    	courses.put(physics6, "Physics");
    	courses.put(physics7, "Physics");
    	
    	courses.put(physics8, "Physics");
    	courses.put(physics9, "Physics");
    	courses.put(physics10, "Physics");
    	courses.put(physics11, "Physics");
    	courses.put(physics12, "Physics");
    	courses.put(physics13, "Physics");
    	courses.put(physics14, "Physics");
    	
    	courses.put(physics15, "Physics");
    	courses.put(physics16, "Physics");
    	courses.put(physics17, "Physics");
    	courses.put(physics18, "Physics");
    	courses.put(physics19, "Physics");
    	courses.put(physics20, "Physics");
    	courses.put(physics21, "Physics");
    	
    	    }
    
    
    public Course(String course, Teacher teacher,  int numOfClassPerWeek) {
        this.course = course;
        this.numOfClassPerWeek = numOfClassPerWeek;
    }
    
    
  
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getNumOfClassPerWeek() {
        return numOfClassPerWeek;
    }

    public void setNumOfClassPerWeek(int numOfClassPerWeek) {
        this.numOfClassPerWeek = numOfClassPerWeek;
    }
    
	public void displayCourses() {
		int size = 0;
		for(Map.Entry<Course, String> course: courses.entrySet()) {
			System.out.print(course + " ");
			te.displayTeacher(size);
			size++;
    	}
		
	}

	@Override
	public String toString() {
		return this.course + " " + this.numOfClassPerWeek ;
	}

	@Override
    public int compare(Course o1, Course o2) {
        return o1.course.compareTo(o2.course);
    }
}
