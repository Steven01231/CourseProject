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
    
   static{
        //cs teachers
        ArrayList<Teacher> teachers = new ArrayList<Teacher>();
        teachers.add(new Teacher("Ramanathan", "Sakku"));
        teachers.add(new Teacher("Emanul", "John"));
        teachers.add(new Teacher("Desislava", "Vivien"));
        teachers.add(new Teacher("Ramazan", "Maria"));
        teachers.add(new Teacher("Indra", "Rina"));
        teachers.add(new Teacher("Zaire", "Jeremiel"));
        teachers.add(new Teacher("Goodwin", "Moncho"));
        
        //Calculus teachers
        teachers.add(new Teacher("Mateja", "Zarina"));
        teachers.add(new Teacher("Mala", "Tatiana"));
        teachers.add(new Teacher("Lassana", "Duff"));
        teachers.add(new Teacher("Dinara", "Leonie"));
        teachers.add(new Teacher("Pinelopi", "Tiina"));
        teachers.add(new Teacher("Shamil", "Diana"));
        teachers.add(new Teacher("Esme", "Wayne"));
        
        //Chemistry teachers
        teachers.add(new Teacher("Turcu", "Andrei"));
        teachers.add(new Teacher("Reimund", "Maunu"));
        teachers.add(new Teacher("Ian", "Vassilis"));
        teachers.add(new Teacher("Epaphras", "Yasu"));
        teachers.add(new Teacher("Damian", "Jesse"));
        teachers.add(new Teacher("Magnhildr", "Ivan"));
        
        //humanities teachers
        teachers.add(new Teacher("Shiv", "Mathew"));
        teachers.add(new Teacher("Trev", "Antonijo"));
        teachers.add(new Teacher("Gaheriet", "Nikol"));      
        teachers.add(new Teacher("Aldhard", "Hieronim"));
        teachers.add(new Teacher("Prateek", "Alwin"));
        teachers.add(new Teacher("Stigandr", "Keinan"));
        teachers.add(new Teacher("Puroshottam", "Rosa Maria"));
        
        //english teachers
        teachers.add(new Teacher("Ambroos", "Gunter"));
        teachers.add(new Teacher("Traian", "Otmar"));
        teachers.add(new Teacher("Kolleen", "Varinia"));
        teachers.add(new Teacher("Tiburtius", "Roger"));
        teachers.add(new Teacher("Aenor", "Gerard"));
        teachers.add(new Teacher("Blanid", "Zachary"));
        teachers.add(new Teacher("Karna", "Justinian"));
        
        //french teachers
        teachers.add(new Teacher("Sixte", "Alix"));
        teachers.add(new Teacher("Benerice", "Reine"));
        teachers.add(new Teacher("Eloi", "Celeste"));
        teachers.add(new Teacher("Coring", "Mariette"));
        teachers.add(new Teacher("Isidore", "Sebastien"));
        teachers.add(new Teacher("Roxane", "Daphnee"));
        teachers.add(new Teacher("Hildegarde", "Roseline"));
        
        //gym teachers
        teachers.add(new Teacher("Florentin", "Rosette"));
        teachers.add(new Teacher("Philemon", "Ram"));
        teachers.add(new Teacher("Nazariy", "Ally"));
        teachers.add(new Teacher("Hagir", "Dewi"));
        teachers.add(new Teacher("Kybele", "Julissa"));
        teachers.add(new Teacher("Lexus", "Zoi"));
        teachers.add(new Teacher("Achard", "Stefan"));
        
        //physics teachers
        teachers.add(new Teacher("Drobogost", "Draupadi"));
        teachers.add(new Teacher("Long", "Margaretta"));
        teachers.add(new Teacher("Mamun", "Emma"));
        teachers.add(new Teacher("Babur", "Iustus"));
        teachers.add(new Teacher("Kallisto", "Marko"));
        teachers.add(new Teacher("Meical", "Mukhtar"));
        teachers.add(new Teacher("Dipti", "Jabril"));
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

    
    
}
