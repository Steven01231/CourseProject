package courseprojec;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author 2153617
 */
public class Course extends Teacher implements Comparator<Course> {

    static Map<HashMap, String> courses = new LinkedHashMap();

    static HashMap<String, Course> csCourses = new LinkedHashMap();
    static HashMap<String, Course> mathCourses = new LinkedHashMap();
    static HashMap<String, Course> chemCourses = new LinkedHashMap();
    static HashMap<String, Course> humCourses = new LinkedHashMap();
    static HashMap<String, Course> engCourses = new LinkedHashMap();
    static HashMap<String, Course> frenchCourses = new LinkedHashMap();
    static HashMap<String, Course> peCourses = new LinkedHashMap();
    static HashMap<String, Course> physicsCourses = new LinkedHashMap();

    static Teacher te = new Teacher();
    private String teacher;
    private String course;
    private int numOfClassPerWeek;
    static Course computerSci1 = new Course("Introduction to Programming", "Ramanathan Sakku", 3);
    static Course computerSci2 = new Course("Introduction to Programming", "Emanul John", 3);
    static Course computerSci3 = new Course("Introduction to Programming", "Desislav Vivien", 3);
    static Course computerSci4 = new Course("Introduction to Programming", "Ramazan Maria", 3);
    static Course computerSci5 = new Course("Introduction to Programming", "Indra Rina", 3);
    static Course computerSci6 = new Course("Introduction to Programming", "Zaire Jeremiel", 3);
    static Course computerSci7 = new Course("Introduction to Programming", "Goodwin Moncho", 3);

    static Course computerSci8 = new Course("Data Structures", "Ramanathan Sakku", 3);
    static Course computerSci9 = new Course("Data Structures", "Emanul John", 3);
    static Course computerSci10 = new Course("Data Structures", "Desislav Vivien", 3);
    static Course computerSci11 = new Course("Data Structures", "Ramazan Maria", 3);
    static Course computerSci12 = new Course("Data Structures", "Indra Rina", 3);
    static Course computerSci13 = new Course("Data Structures", "Zaire Jeremiel", 3);
    static Course computerSci14 = new Course("Data Structures", "Goodwin Moncho", 3);

    static Course computerSci15 = new Course("Program Development", "Ramanathan Sakku", 3);
    static Course computerSci16 = new Course("Program Development", "Emanul John", 3);
    static Course computerSci17 = new Course("Program Development", "Desislav Vivien", 3);
    static Course computerSci18 = new Course("Program Development", "Ramazan Maria", 3);
    static Course computerSci19 = new Course("Program Development", "Indra Rina", 3);
    static Course computerSci20 = new Course("Program Development", "Zaire Jeremiel", 3);
    static Course computerSci21 = new Course("Program Development", "Goodwin Moncho", 3);

    static Course computerSci22 = new Course("Integrative Project", "Ramanathan Sakku", 3);
    static Course computerSci23 = new Course("Integrative Project", "Emanul John", 3);
    static Course computerSci24 = new Course("Integrative Project", "Desislav Vivien", 3);
    static Course computerSci25 = new Course("Integrative Project", "Ramazan Maria", 3);
    static Course computerSci26 = new Course("Integrative Project", "Indra Rina", 3);
    static Course computerSci27 = new Course("Integrative Project", "Zaire Jeremiel", 3);
    static Course computerSci28 = new Course("Integrative Project", "Goodwin Moncho", 3);

    static Course Math1 = new Course("Calculus I", "Mateja Zarina", 3);
    static Course Math2 = new Course("Calculus I", "Mala Tatiana", 3);
    static Course Math3 = new Course("Calculus I", "Lassana Duff", 3);
    static Course Math4 = new Course("Calculus I", "Dinara Leonie", 3);
    static Course Math5 = new Course("Calculus I", "Pinelopi Tiina", 3);
    static Course Math6 = new Course("Calculus I", "Shamil Diana", 3);
    static Course Math7 = new Course("Calculus I", "Esme Wayne", 3);

    static Course Math8 = new Course("Calculus II", "Mateja Zarina", 3);
    static Course Math9 = new Course("Calculus II", "Mala Tatiana", 3);
    static Course Math10 = new Course("Calculus II", "Lassana Duff", 3);
    static Course Math11 = new Course("Calculus II", "Dinara Leonie", 3);
    static Course Math12 = new Course("Calculus II", "Pinelopi Tiina", 3);
    static Course Math13 = new Course("Calculus II", "Shamil Diana", 3);
    static Course Math14 = new Course("Calculus II", "Esme Wayne", 3);

    static Course Math15 = new Course("Linear Algebra", "Mateja Zarina", 3);
    static Course Math16 = new Course("Linear Algebra", "Mala Tatiana", 3);
    static Course Math17 = new Course("Linear Algebra", "Lassana Duff", 3);
    static Course Math18 = new Course("Linear Algebra", "Dinara Leonie", 3);
    static Course Math19 = new Course("Linear Algebra", "Pinelopi Tiina", 3);
    static Course Math20 = new Course("Linear Algebra", "Shamil Diana", 3);
    static Course Math21 = new Course("Linear Algebra", "Esme Wayne", 3);

    static Course Math22 = new Course("Discrete Mathematics", "Mateja Zarina", 3);
    static Course Math23 = new Course("Discrete Mathematics", "Mala Tatiana", 3);
    static Course Math24 = new Course("Discrete Mathematics", "Lassana Duff", 3);
    static Course Math25 = new Course("Discrete Mathematics", "Dinara Leonie", 3);
    static Course Math26 = new Course("Discrete Mathematics", "Pinelopi Tiina", 3);
    static Course Math27 = new Course("Discrete Mathematics", "Shamil Diana", 3);
    static Course Math28 = new Course("Discrete Mathematics", "Esme Wayne", 3);

    static Course Chemistry1 = new Course("General Chemistry", "Turcu Andrei", 3);
    static Course Chemistry2 = new Course("General Chemistry", "Reimund Maunu", 3);
    static Course Chemistry3 = new Course("General Chemistry", "Ian Vassilis", 3);
    static Course Chemistry4 = new Course("General Chemistry", "Epaphras Yasu", 3);
    static Course Chemistry5 = new Course("General Chemistry", "Damian Jesse", 3);
    static Course Chemistry6 = new Course("General Chemistry", "Magnhildr Ivan", 3);
    static Course Chemistry7 = new Course("General Chemistry", "Surendra Calpurnia", 3);

    static Course Chemistry8 = new Course("Chemistry of Solutions", "Turcu Andrei", 3);
    static Course Chemistry9 = new Course("Chemistry of Solutions", "Reimund Maunu", 3);
    static Course Chemistry10 = new Course("Chemistry of Solutions", "Ian Vassilis", 3);
    static Course Chemistry11 = new Course("Chemistry of Solutions", "Epaphras Yasu", 3);
    static Course Chemistry12 = new Course("Chemistry of Solutions", "Damian Jesse", 3);
    static Course Chemistry13 = new Course("Chemistry of Solutions", "Magnhildr Ivan", 3);
    static Course Chemistry14 = new Course("Chemistry of Solutions", "Surendra Calpurnia", 3);

    static Course Chemistry15 = new Course("Organic Chemistry", "Turcu Andrei", 3);
    static Course Chemistry16 = new Course("Organic Chemistry", "Reimund Maunu", 3);
    static Course Chemistry17 = new Course("Organic Chemistry", "Ian Vassilis", 3);
    static Course Chemistry18 = new Course("Organic Chemistry", "Epaphras Yasu", 3);
    static Course Chemistry19 = new Course("Organic Chemistry", "Damian Jesse", 3);
    static Course Chemistry20 = new Course("Organic Chemistry", "Magnhildr Ivan", 3);
    static Course Chemistry21 = new Course("Organic Chemistry", "Surendra Calpurnia", 3);

    static Course humanities1 = new Course("World Views", "Shiv Mathew", 2);
    static Course humanities2 = new Course("World Views", "Trev Antonijo", 2);
    static Course humanities3 = new Course("World Views", "Gaheriet Nikol", 2);
    static Course humanities4 = new Course("World Views", "Aldhard Hieronim", 2);
    static Course humanities5 = new Course("World Views", "Prateek Alwin", 1);
    static Course humanities6 = new Course("World Views", "Stigandr Keinan", 1);
    static Course humanities7 = new Course("World Views", "Puroshottam Rosa Maria", 1);

    static Course humanities8 = new Course("Knowledge", "Shiv Mathew", 2);
    static Course humanities9 = new Course("Knowledge", "Trev Antonijo", 2);
    static Course humanities10 = new Course("Knowledge", "Gaheriet Nikol", 2);
    static Course humanities11 = new Course("Knowledge", "Aldhard Hieronim", 2);
    static Course humanities12 = new Course("Knowledge", "Prateek Alwin", 2);
    static Course humanities13 = new Course("Knowledge", "Stigandr Keinan", 2);
    static Course humanities14 = new Course("Knowledge", "Puroshottam Rosa Maria", 2);

    static Course english1 = new Course("English", "Ambroos Gunter", 2);
    static Course english2 = new Course("English", "Traian Otmar", 2);
    static Course english3 = new Course("English", "Kolleen Varinia", 2);
    static Course english4 = new Course("English", "Tiburtius Roger", 2);
    static Course english5 = new Course("English", "Aenor Gerard", 2);
    static Course english6 = new Course("English", "Blanid Zachary", 2);
    static Course english7 = new Course("English", "Karna Justinian", 2);

    static Course french1 = new Course("French", "Sixte Alix", 1);
    static Course french2 = new Course("French", "Benerice Reine", 1);
    static Course french3 = new Course("French", "Eloi Celeste", 1);
    static Course french4 = new Course("French", "Coring Mariette", 1);
    static Course french5 = new Course("French", "Isidore Sebastien", 1);
    static Course french6 = new Course("French", "Roxane Daphnee", 1);
    static Course french7 = new Course("French", "Hildegarde Roseline", 1);

    static Course pe1 = new Course("Physical Education", "Florentin Rosette", 1);
    static Course pe2 = new Course("Physical Education", "Philemon Ram", 1);
    static Course pe3 = new Course("Physical Education", "Nazariy Ally", 1);
    static Course pe4 = new Course("Physical Education", "Hagir Dewi", 1);
    static Course pe5 = new Course("Physical Education", "Kybele Julissa", 1);
    static Course pe6 = new Course("Physical Education", "Lexus Zoi", 1);
    static Course pe7 = new Course("Physical Education", "Achard Stefan", 1);

    static Course physics1 = new Course("Mechanics", "Drobogost Draupadi", 3);
    static Course physics2 = new Course("Mechanics", "Long Margaretta", 3);
    static Course physics3 = new Course("Mechanics", "Mamun Emma", 3);
    static Course physics4 = new Course("Mechanics", "Babur Iustus", 3);
    static Course physics5 = new Course("Mechanics", "Kallisto Marko", 3);
    static Course physics6 = new Course("Mechanics", "Meical Mukhtar", 3);
    static Course physics7 = new Course("Mechanics", "Dipti Jabril", 3);

    static Course physics8 = new Course("Waves and Optics", "Drobogost Draupadi", 3);
    static Course physics9 = new Course("Waves and Optics", "Long Margaretta", 3);
    static Course physics10 = new Course("Waves and Optics", "Mamun Emma", 3);
    static Course physics11 = new Course("Waves and Optics", "Babur Iustus", 3);
    static Course physics12 = new Course("Waves and Optics", "Kallisto Marko", 3);
    static Course physics13 = new Course("Waves and Optics", "Meical Mukhtar", 3);
    static Course physics14 = new Course("Waves and Optics", "Dipti Jabril", 3);

    static Course physics15 = new Course("Electricity and Magnetism", "Drobogost Draupadi", 3);
    static Course physics16 = new Course("Electricity and Magnetism", "Long Margaretta", 3);
    static Course physics17 = new Course("Electricity and Magnetism", "Mamun Emma", 3);
    static Course physics18 = new Course("Electricity and Magnetism", "Babur Iustus", 3);
    static Course physics19 = new Course("Electricity and Magnetism", "Kallisto Marko", 3);
    static Course physics20 = new Course("Electricity and Magnetium", "Meical Mukhtar", 3);
    static Course physics21 = new Course("Electricity and Magnetism", "Dipti Jabril", 3);

    public Course() {

        csCourses.put("CS1", computerSci1);
        csCourses.put("CS2", computerSci2);
        csCourses.put("CS3", computerSci3);
        csCourses.put("CS4", computerSci4);
        csCourses.put("CS5", computerSci5);
        csCourses.put("CS6", computerSci6);
        csCourses.put("CS7", computerSci7);
        csCourses.put("CS8", computerSci8);
        csCourses.put("CS9", computerSci9);
        csCourses.put("CS10", computerSci10);
        csCourses.put("CS11", computerSci11);
        csCourses.put("CS12", computerSci12);
        csCourses.put("CS13", computerSci13);
        csCourses.put("CS14", computerSci14);
        csCourses.put("CS15", computerSci15);
        csCourses.put("CS16", computerSci16);
        csCourses.put("CS17", computerSci17);
        csCourses.put("CS18", computerSci18);
        csCourses.put("CS19", computerSci19);
        csCourses.put("CS20", computerSci20);
        csCourses.put("CS21", computerSci21);
        csCourses.put("CS22", computerSci22);
        csCourses.put("CS23", computerSci23);
        csCourses.put("CS24", computerSci24);
        csCourses.put("CS25", computerSci25);
        csCourses.put("CS26", computerSci26);
        csCourses.put("CS27", computerSci27);
        csCourses.put("CS28", computerSci28);

        mathCourses.put("MATH1", Math1);
        mathCourses.put("MATH2", Math2);
        mathCourses.put("MATH3", Math3);
        mathCourses.put("MATH4", Math4);
        mathCourses.put("MATH5", Math5);
        mathCourses.put("MATH6", Math6);
        mathCourses.put("MATH7", Math7);
        mathCourses.put("MATH8", Math8);
        mathCourses.put("MATH9", Math9);
        mathCourses.put("MATH10", Math10);
        mathCourses.put("MATH11", Math11);
        mathCourses.put("MATH12", Math12);
        mathCourses.put("MATH13", Math13);
        mathCourses.put("MATH14", Math14);
        mathCourses.put("MATH15", Math15);
        mathCourses.put("MATH16", Math16);
        mathCourses.put("MATH17", Math17);
        mathCourses.put("MATH18", Math18);
        mathCourses.put("MATH19", Math19);
        mathCourses.put("MATH20", Math20);
        mathCourses.put("MATH21", Math21);
        mathCourses.put("MATH22", Math22);
        mathCourses.put("MATH23", Math23);
        mathCourses.put("MATH24", Math24);
        mathCourses.put("MATH25", Math25);
        mathCourses.put("MATH26", Math26);
        mathCourses.put("MATH27", Math27);
        mathCourses.put("MATH28", Math28);

        chemCourses.put("CHEM1", Chemistry1);
        chemCourses.put("CHEM2", Chemistry2);
        chemCourses.put("CHEM3", Chemistry3);
        chemCourses.put("CHEM4", Chemistry4);
        chemCourses.put("CHEM5", Chemistry5);
        chemCourses.put("CHEM6", Chemistry6);
        chemCourses.put("CHEM7", Chemistry7);
        chemCourses.put("CHEM8", Chemistry8);
        chemCourses.put("CHEM9", Chemistry9);
        chemCourses.put("CHEM10", Chemistry10);
        chemCourses.put("CHEM11", Chemistry11);
        chemCourses.put("CHEM12", Chemistry12);
        chemCourses.put("CHEM13", Chemistry13);
        chemCourses.put("CHEM14", Chemistry14);
        chemCourses.put("CHEM15", Chemistry15);
        chemCourses.put("CHEM16", Chemistry16);
        chemCourses.put("CHEM17", Chemistry17);
        chemCourses.put("CHEM18", Chemistry18);
        chemCourses.put("CHEM19", Chemistry19);
        chemCourses.put("CHEM20", Chemistry20);
        chemCourses.put("CHEM21", Chemistry21);

        humCourses.put("HUM1", humanities1);
        humCourses.put("HUM2", humanities2);
        humCourses.put("HUM3", humanities3);
        humCourses.put("HUM4", humanities4);
        humCourses.put("HUM5", humanities5);
        humCourses.put("HUM6", humanities6);
        humCourses.put("HUM7", humanities7);
        humCourses.put("HUM8", humanities8);
        humCourses.put("HUM9", humanities9);
        humCourses.put("HUM10", humanities10);
        humCourses.put("HUM11", humanities11);
        humCourses.put("HUM12", humanities12);
        humCourses.put("HUM13", humanities13);
        humCourses.put("HUM14", humanities14);

        engCourses.put("ENG1", english1);
        engCourses.put("ENG2", english2);
        engCourses.put("ENG3", english3);
        engCourses.put("ENG4", english4);
        engCourses.put("ENG5", english5);
        engCourses.put("ENG6", english6);
        engCourses.put("ENG7", english7);

        frenchCourses.put("FRENCH1", french1);
        frenchCourses.put("FRENCH2", french2);
        frenchCourses.put("FRENCH3", french3);
        frenchCourses.put("FRENCH4", french4);
        frenchCourses.put("FRENCH5", french5);
        frenchCourses.put("FRENCH6", french6);
        frenchCourses.put("FRENCH7", french7);

        peCourses.put("GYM1", pe1);
        peCourses.put("GYM2", pe2);
        peCourses.put("GYM3", pe3);
        peCourses.put("GYM4", pe4);
        peCourses.put("GYM5", pe5);
        peCourses.put("GYM6", pe6);
        peCourses.put("GYM7", pe7);

        physicsCourses.put("PHYS1", physics1);
        physicsCourses.put("PHYS2", physics2);
        physicsCourses.put("PHYS3", physics3);
        physicsCourses.put("PHYS4", physics4);
        physicsCourses.put("PHYS5", physics5);
        physicsCourses.put("PHYS6", physics6);
        physicsCourses.put("PHYS7", physics7);
        physicsCourses.put("PHYS8", physics8);
        physicsCourses.put("PHYS9", physics9);
        physicsCourses.put("PHYS10", physics10);
        physicsCourses.put("PHYS11", physics11);
        physicsCourses.put("PHYS12", physics12);
        physicsCourses.put("PHYS13", physics13);
        physicsCourses.put("PHYS14", physics14);
        physicsCourses.put("PHYS15", physics15);
        physicsCourses.put("PHYS16", physics16);
        physicsCourses.put("PHYS17", physics17);
        physicsCourses.put("PHYS18", physics18);
        physicsCourses.put("PHYS19", physics19);
        physicsCourses.put("PHYS20", physics20);
        physicsCourses.put("PHYS21", physics21);

        courses.put(csCourses, "Computer Science");

        courses.put(mathCourses, "Math");

        courses.put(chemCourses, "Chemistry");

        courses.put(humCourses, "Humanities");

        courses.put(engCourses, "English");

        courses.put(frenchCourses, "French");

        courses.put(peCourses, "Physical Education");

        courses.put(physicsCourses, "Physics");

    }

    public Course(String course, String teacher, int numOfClassPerWeek) {
        this.course = course;
        this.numOfClassPerWeek = numOfClassPerWeek;
        this.teacher = teacher;
    }

    public Course(String course, int numOfClassPerWeek) {
        this.course = course;
        this.numOfClassPerWeek = numOfClassPerWeek;
    }

    public Course(String course, String teacher) {

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

    public void displayCourses(String coursesAsked) {
    	        int size = 0;
        Teacher te = new Teacher();
        
        
        for (Map.Entry<HashMap, String> course : courses.entrySet()) {
            if (course.getValue().equals(coursesAsked)) {
                Set set2 = course.getKey().entrySet();
                Iterator iterator2 = set2.iterator();
                while (iterator2.hasNext()) {
                    Map.Entry mentry2 = (Map.Entry) iterator2.next();
                    System.out.println("[ " + mentry2.getKey() + " ] " + mentry2.getValue());

                }

            }

        }
    	

    }

    public void addCourse(String key, String coursesAsked, Account a) {
       
        for (Map.Entry<HashMap, String> course : courses.entrySet()) {
            if (course.getValue().equals(coursesAsked)) {
                Set set2 = course.getKey().entrySet();
                Iterator iterator2 = set2.iterator();
                while (iterator2.hasNext()) {
                    
                    Map.Entry mentry2 = (Map.Entry) iterator2.next();
                    if(mentry2.getKey().equals(key)){
                        a.myCourse.add((Course)mentry2.getValue());
                        System.out.println("Course added!" + " [ " + mentry2.getKey() + " ] " + mentry2.getValue());
                    }
                }

            }

        }
    }

    @Override
    public String toString() {
        return this.course + " " + this.numOfClassPerWeek + " " + this.teacher;
    }

    @Override
    public int compare(Course o1, Course o2
    ) {
        return o1.course.compareTo(o2.course);
    }
}
