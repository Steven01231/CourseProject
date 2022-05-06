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
public class Teacher {
    
		
        //cs teachers
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        
        static Teacher cs1 = new Teacher("Ramanathan", "Sakku");
        static Teacher cs2 = new Teacher ("Emanul", "John");
        static Teacher cs3 = new Teacher("Desislava", "Vivien");
        static Teacher cs4 = new Teacher("Ramazan", "Maria");
        static Teacher cs5 = new Teacher("Indra", "Rina");
        static Teacher cs6 = new Teacher("Zaire", "Jeremiel");
        static Teacher cs7 = new Teacher("Goodwin", "Moncho");
        
        static Teacher cal1 = new Teacher("Mateja", "Zarina");
        static Teacher cal2 = new Teacher("Mala", "Tatiana");
        static Teacher cal3 = new Teacher("Lassana", "Duff");
        static Teacher cal4 = new Teacher("Dinara", "Leonie");
        static Teacher cal5 = new Teacher("Pinelopi", "Tiina");
        static Teacher cal6 = new Teacher("Shamil", "Diana");
        static Teacher cal7 = new Teacher("Esme", "Wayne");
        
        static Teacher chem1 = new Teacher("Turcu", "Andrei");
        static Teacher chem2 = new Teacher("Reimund", "Maunu");
        static Teacher chem3 = new Teacher("Ian", "Vassilis");
        static Teacher chem4 = new Teacher("Epaphras", "Yasu");
        static Teacher chem5 = new Teacher("Damian", "Jesse");
        static Teacher chem6 = new Teacher("Magnhildr", "Ivan");
        static Teacher chem7 = new Teacher("Surendra", "Calpurnia");

        static Teacher hum1 = new Teacher("Shiv", "Mathew");
        static Teacher hum2 = new Teacher("Trev", "Antonijo");
        static Teacher hum3 = new Teacher("Gaheriet", "Nikol");
        static Teacher hum4 = new Teacher("Aldhard", "Hieronim");
        static Teacher hum5 = new Teacher("Prateek", "Alwin");
        static Teacher hum6 = new Teacher("Stigandr", "Keinan");
        static Teacher hum7 = new Teacher("Puroshottam", "Rosa Maria");
        
        static Teacher eng1 = new Teacher("Ambroos", "Gunter");
        static Teacher eng2 = new Teacher("Traian", "Otmar");
        static Teacher eng3 = new Teacher("Kolleen", "Varinia");
        static Teacher eng4 = new Teacher("Tiburtius", "Roger");
        static Teacher eng5 = new Teacher("Aenor", "Gerard");
        static Teacher eng6 = new Teacher("Blanid", "Zachary");
        static Teacher eng7 = new Teacher("Karna", "Justinian");
        
        static Teacher fr1 = new Teacher("Sixte", "Alix");
        static Teacher fr2 = new Teacher("Benerice", "Reine");
        static Teacher fr3 = new Teacher("Eloi", "Celeste");
        static Teacher fr4 = new Teacher("Coring", "Mariette");
        static Teacher fr5 = new Teacher("Isidore", "Sebastien");
        static Teacher fr6 = new Teacher("Roxane", "Daphnee");
        static Teacher fr7 = new Teacher("Hildegarde", "Roseline");

        static Teacher gym1 = new Teacher("Florentin", "Rosette");
        static Teacher gym2 = new Teacher("Philemon", "Ram");
        static Teacher gym3 = new Teacher("Nazariy", "Ally");
        static Teacher gym4 = new Teacher("Hagir", "Dewi");
        static Teacher gym5 = new Teacher("Kybele", "Julissa");
        static Teacher gym6 = new Teacher("Lexus", "Zoi");
        static Teacher gym7 = new Teacher("Achard", "Stefan");
        
        static Teacher phys1 = new Teacher("Drobogost", "Draupadi");
        static Teacher phys2 = new Teacher("Long", "Margaretta");
        static Teacher phys3 = new Teacher("Mamun", "Emma");
        static Teacher phys4 = new Teacher("Babur", "Iustus");
        static Teacher phys5 = new Teacher("Kallisto", "Marko");
        static Teacher phys6 = new Teacher("Meical", "Mukhtar");
        static Teacher phys7 = new Teacher("Dipti", "Jabril");

        
        public Teacher(){
        teachers.add(cs1);
        teachers.add(cs2);
        teachers.add(cs3);
        teachers.add(cs4);
        teachers.add(cs5);
        teachers.add(cs6);
        teachers.add(cs7);
        
        //Calculus teachers
        teachers.add(cal1);
        teachers.add(cal2);
        teachers.add(cal3);
        teachers.add(cal4);
        teachers.add(cal5);
        teachers.add(cal6);
        teachers.add(cal7);
        
        teachers.add(cal1);
        teachers.add(cal2);
        teachers.add(cal3);
        teachers.add(cal4);
        teachers.add(cal5);
        teachers.add(cal6);
        teachers.add(cal7);
        
        teachers.add(cal1);
        teachers.add(cal2);
        teachers.add(cal3);
        teachers.add(cal4);
        teachers.add(cal5);
        teachers.add(cal6);
        teachers.add(cal7);
        
        //Chemistry teachers
        teachers.add(chem1);
        teachers.add(chem2);
        teachers.add(chem3);
        teachers.add(chem4);
        teachers.add(chem5);
        teachers.add(chem6);
        teachers.add(chem7);
        
        teachers.add(chem1);
        teachers.add(chem2);
        teachers.add(chem3);
        teachers.add(chem4);
        teachers.add(chem5);
        teachers.add(chem6);
        teachers.add(chem7);
        
        teachers.add(chem1);
        teachers.add(chem2);
        teachers.add(chem3);
        teachers.add(chem4);
        teachers.add(chem5);
        teachers.add(chem6);
        teachers.add(chem7);
        
        //humanities teachers
        teachers.add(hum1);
        teachers.add(hum2);
        teachers.add(hum3);
        teachers.add(hum4);
        teachers.add(hum5);
        teachers.add(hum6);
        teachers.add(hum7);
        
        teachers.add(hum1);
        teachers.add(hum2);
        teachers.add(hum3);
        teachers.add(hum4);
        teachers.add(hum5);
        teachers.add(hum6);
        teachers.add(hum7);
        
        //english teachers
        teachers.add(eng1);
        teachers.add(eng2);
        teachers.add(eng3);
        teachers.add(eng4);
        teachers.add(eng5);
        teachers.add(eng6);
        teachers.add(eng7);
        //french teachers
        teachers.add(fr1);
        teachers.add(fr2);
        teachers.add(fr3);
        teachers.add(fr4);
        teachers.add(fr5);
        teachers.add(fr6);
        teachers.add(fr7);
        
        //gym teachers
        teachers.add(gym1);
        teachers.add(gym2);
        teachers.add(gym3);
        teachers.add(gym4);
        teachers.add(gym5);
        teachers.add(gym6);
        teachers.add(gym7);
        
        //physics teachers
        teachers.add(phys1);
        teachers.add(phys2);
        teachers.add(phys3);
        teachers.add(phys4);
        teachers.add(phys5);
        teachers.add(phys6);
        teachers.add(phys7);
        
        teachers.add(phys1);
        teachers.add(phys2);
        teachers.add(phys3);
        teachers.add(phys4);
        teachers.add(phys5);
        teachers.add(phys6);
        teachers.add(phys7);
        
        teachers.add(phys1);
        teachers.add(phys2);
        teachers.add(phys3);
        teachers.add(phys4);
        teachers.add(phys5);
        teachers.add(phys6);
        teachers.add(phys7);
        
        }
    
    private String lastName;
    private String firstName;
    
    public Teacher(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public void displayTeacher(int index) {
    	System.out.println(teachers.get(index));
        
    }

	
	public String toString() {
		return this.firstName + " " + this.lastName;
	}

    
    
}
