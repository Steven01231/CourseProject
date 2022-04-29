/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author 2153617
 */
public class Course implements Comparator<Course> {
	
	
    
    ArrayList<Course> courses = new ArrayList<Course>();
    
    private String course;
    private int numOfClassPerWeek;
   
    //cs teachers
    Teacher cs1 = new Teacher("Ramanathan", "Sakku");
    Teacher cs2 = new Teacher ("Emanul", "John");
    Teacher cs3 = new Teacher("Desislava", "Vivien");
    Teacher cs4 = new Teacher("Ramazan", "Maria");
    Teacher cs5 = new Teacher("Indra", "Rina");
    Teacher cs6 = new Teacher("Zaire", "Jeremiel");
    Teacher cs7 = new Teacher("Goodwin", "Moncho");
    
    Course computerSci1 = new Course("Computer Science", cs1, 3);
    Course computerSci2 = new Course("Computer Science", cs2, 3);
    Course computerSci3 = new Course("Computer Science", cs3, 3);
    Course computerSci4 = new Course("Computer Science", cs4, 3);
    Course computerSci5 = new Course("Computer Science", cs5, 3);
    Course computerSci6 = new Course("Computer Science", cs6, 3);
    Course computerSci7 = new Course("Computer Science", cs7, 3);
    
    //Math teachers
    Teacher cal1 = new Teacher("Mateja", "Zarina");
    Teacher cal2 = new Teacher("Mala", "Tatiana");
    Teacher cal3 = new Teacher("Lassana", "Duff");
    Teacher cal4 = new Teacher("Dinara", "Leonie");
    Teacher cal5 = new Teacher("Pinelopi", "Tiina");
    Teacher cal6 = new Teacher("Shamil", "Diana");
    Teacher cal7 = new Teacher("Esme", "Wayne");
    
    Course Math1 = new Course("Calculus I", cal1, 3);
    Course Math2 = new Course("Calculus I", cal2, 3);
    Course Math3 = new Course("Calculus I", cal3, 3);
    Course Math4 = new Course("Calculus I", cal4, 3);
    Course Math5 = new Course("Calculus I", cal5, 3);
    Course Math6 = new Course("Calculus I", cal6, 3);
    Course Math7 = new Course("Calculus I", cal7, 3);
    
    Course Math8 = new Course("Calculus II", cal1, 3);
    Course Math9 = new Course("Calculus II", cal2, 3);
    Course Math10 = new Course("Calculus II", cal3, 3);
    Course Math11 = new Course("Calculus II", cal4, 3);
    Course Math12 = new Course("Calculus II", cal5, 3);
    Course Math13 = new Course("Calculus II", cal6, 3);
    Course Math14 = new Course("Calculus II", cal7, 3);
    
    Course Math15 = new Course("Linear Algebra", cal1, 3);
    Course Math16 = new Course("Linear Algebra", cal2, 3);
    Course Math17 = new Course("Linear Algebra", cal3, 3);
    Course Math18 = new Course("Linear Algebra", cal4, 3);
    Course Math19 = new Course("Linear Algebra", cal5, 3);
    Course Math20 = new Course("Linear Algebra", cal6, 3);
    Course Math21 = new Course("Linear Algebra", cal7, 3);
    
    //Chemistry teachers
    Teacher chem1 = new Teacher("Turcu", "Andrei");
    Teacher chem2 = new Teacher("Reimund", "Maunu");
    Teacher chem3 = new Teacher("Ian", "Vassilis");
    Teacher chem4 = new Teacher("Epaphras", "Yasu");
    Teacher chem5 = new Teacher("Damian", "Jesse");
    Teacher chem6 = new Teacher("Magnhildr", "Ivan");
    Teacher chem7 = new Teacher("Surendra", "Calpurnia");
    
    Course Chemistry1 = new Course("General Chemistry", chem1, 3);
    Course Chemistry2 = new Course("General Chemistry", chem2, 3);
    Course Chemistry3 = new Course("General Chemistry", chem3, 3);
    Course Chemistry4 = new Course("General Chemistry", chem4, 3);
    Course Chemistry5 = new Course("General Chemistry", chem5, 3);
    Course Chemistry6 = new Course("General Chemistry", chem6, 3);
    Course Chemistry7 = new Course("General Chemistry", chem7, 3);
    
    Course Chemistry8 = new Course("Chemistry of Solutions", chem1, 3);
    Course Chemistry9 = new Course("Chemistry of Solutions", chem2, 3);
    Course Chemistry10 = new Course("Chemistry of Solutions", chem3, 3);
    Course Chemistry11 = new Course("Chemistry of Solutions", chem4, 3);
    Course Chemistry12 = new Course("Chemistry of Solutions", chem5, 3);
    Course Chemistry13 = new Course("Chemistry of Solutions", chem6, 3);
    Course Chemistry14 = new Course("Chemistry of Solutions", chem7, 3);
    
    Course Chemistry15 = new Course("Organic Chemistry", chem1, 3);
    Course Chemistry16 = new Course("Organic Chemistry", chem2, 3);
    Course Chemistry17 = new Course("Organic Chemistry", chem3, 3);
    Course Chemistry18 = new Course("Organic Chemistry", chem4, 3);
    Course Chemistry19 = new Course("Organic Chemistry", chem5, 3);
    Course Chemistry20 = new Course("Organic Chemistry", chem6, 3);
    Course Chemistry21 = new Course("Organic Chemistry", chem7, 3);
    
    //humanities teachers
    Teacher hum1 = new Teacher("Shiv", "Mathew");
    Teacher hum2 = new Teacher("Trev", "Antonijo");
    Teacher hum3 = new Teacher("Gaheriet", "Nikol");
    Teacher hum4 = new Teacher("Aldhard", "Hieronim");
    Teacher hum5 = new Teacher("Prateek", "Alwin");
    Teacher hum6 = new Teacher("Stigandr", "Keinan");
    Teacher hum7 = new Teacher("Puroshottam", "Rosa Maria");
    
    Course humanities1 = new Course("World Views", hum1, 2);
    Course humanities2 = new Course("World Views", hum2, 2);
    Course humanities3 = new Course("World Views", hum3, 2);
    Course humanities4 = new Course("World Views", hum4, 2);
    Course humanities5 = new Course("World Views", hum5, 1);
    Course humanities6 = new Course("World Views", hum6, 1);
    Course humanities7 = new Course("World Views", hum7, 1);
    
    Course humanities8 = new Course("Knowledge", hum1, 2);
    Course humanities9 = new Course("Knowledge", hum2, 2);
    Course humanities10 = new Course("Knowledge", hum3, 2);
    Course humanities11 = new Course("Knowledge", hum4, 2);
    Course humanities12 = new Course("Knowledge", hum5, 2);
    Course humanities13 = new Course("Knowledge", hum6, 2);
    Course humanities14 = new Course("Knowledge", hum7, 2);
    
    //english teachers
    Teacher eng1 = new Teacher("Ambroos", "Gunter");
    Teacher eng2 = new Teacher("Traian", "Otmar");
    Teacher eng3 = new Teacher("Kolleen", "Varinia");
    Teacher eng4 = new Teacher("Tiburtius", "Roger");
    Teacher eng5 = new Teacher("Aenor", "Gerard");
    Teacher eng6 = new Teacher("Blanid", "Zachary");
    Teacher eng7 = new Teacher("Karna", "Justinian");
    
    Course english1 = new Course("English", eng1, 2);
    Course english2 = new Course("English", eng2, 2);
    Course english3 = new Course("English", eng3, 2);
    Course english4 = new Course("English", eng4, 2);
    Course english5 = new Course("English", eng5, 2);
    Course english6 = new Course("English", eng6, 2);
    Course english7 = new Course("English", eng7, 2);
    
    //french teachers
    Teacher fr1 = new Teacher("Sixte", "Alix");
    Teacher fr2 = new Teacher("Benerice", "Reine");
    Teacher fr3 = new Teacher("Eloi", "Celeste");
    Teacher fr4 = new Teacher("Coring", "Mariette");
    Teacher fr5 = new Teacher("Isidore", "Sebastien");
    Teacher fr6 = new Teacher("Roxane", "Daphnee");
    Teacher fr7 = new Teacher("Hildegarde", "Roseline");
    
    Course french1 = new Course("French", fr1, 1);
    Course french2 = new Course("French", fr2, 1);
    Course french3 = new Course("French", fr3, 1);
    Course french4 = new Course("French", fr4, 1);
    Course french5 = new Course("French", fr5, 1);
    Course french6 = new Course("French", fr6, 1);
    Course french7 = new Course("French", fr7, 1);
    
    //gym teachers
    Teacher gym1 = new Teacher("Florentin", "Rosette");
    Teacher gym2 = new Teacher("Philemon", "Ram");
    Teacher gym3 = new Teacher("Nazariy", "Ally");
    Teacher gym4 = new Teacher("Hagir", "Dewi");
    Teacher gym5 = new Teacher("Kybele", "Julissa");
    Teacher gym6 = new Teacher("Lexus", "Zoi");
    Teacher gym7 = new Teacher("Achard", "Stefan");
    
    Course pe1 = new Course("Physical Education", gym1, 1);
    Course pe2 = new Course("Physical Education", gym2, 1);
    Course pe3 = new Course("Physical Education", gym3, 1);
    Course pe4 = new Course("Physical Education", gym4, 1);
    Course pe5 = new Course("Physical Education", gym5, 1);
    Course pe6 = new Course("Physical Education", gym6, 1);
    Course pe7 = new Course("Physical Education", gym7, 1);
    
    //physics teachers
    Teacher phys1 = new Teacher("Drobogost", "Draupadi");
    Teacher phys2 = new Teacher("Long", "Margaretta");
    Teacher phys3 = new Teacher("Mamun", "Emma");
    Teacher phys4 = new Teacher("Babur", "Iustus");
    Teacher phys5 = new Teacher("Kallisto", "Marko");
    Teacher phys6 = new Teacher("Meical", "Mukhtar");
    Teacher phys7 = new Teacher("Dipti", "Jabril");
    
    Course physics1 = new Course("Mechanics", phys1, 3);
    Course physics2 = new Course("Mechanics", phys2, 3);
    Course physics3 = new Course("Mechanics", phys3, 3);
    Course physics4 = new Course("Mechanics", phys4, 3);
    Course physics5 = new Course("Mechanics", phys5, 3);
    Course physics6 = new Course("Mechanics", phys6, 3);
    Course physics7 = new Course("Mechanics", phys7, 3);
    
    Course physics8 = new Course("Waves and Optics", phys1, 3);
    Course physics9 = new Course("Waves and Optics", phys2, 3);
    Course physics10 = new Course("Waves and Optics", phys3, 3);
    Course physics11 = new Course("Waves and Optics", phys4, 3);
    Course physics12 = new Course("Waves and Optics", phys5, 3);
    Course physics13 = new Course("Waves and Optics", phys6, 3);
    Course physics14 = new Course("Waves and Optics", phys7, 3);
    
    Course physics15 = new Course("Electricity and Magnetism", phys1, 3);
    Course physics16 = new Course("Electricity and Magnetism", phys2, 3);
    Course physics17 = new Course("Electricity and Magnetism", phys3, 3);
    Course physics18 = new Course("Electricity and Magnetism", phys4, 3);
    Course physics19 = new Course("Electricity and Magnetism", phys5, 3);
    Course physics20 = new Course("Electricity and Magnetium", phys6, 3);
    Course physics21 = new Course("Electricity and Magnetism", phys7, 3);
    
    
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
    
    @Override
    public int compare(Course o1, Course o2) {
        return o1.course.compareTo(o2.course);
    }
}
