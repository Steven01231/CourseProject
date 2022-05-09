package courseprojec;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;

import javax.tools.ForwardingFileObject;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 2153617
 */
public class EventOrganizer {

    ArrayList<EventOrganizer> listOfEvents = new ArrayList();

    private String name;
    public Category cat;
    private SubCategory subCat;
    private DueDate duedate;

    private Date dateOfEvents;

    public EventOrganizer(String name, Category category, SubCategory subCategory, DueDate dueDate) {
        this.name = name;
        cat = category;
        subCat = subCategory;
        duedate = dueDate;
    }

    public EventOrganizer() {
        // TODO Auto-generated constructor stub
    }

    public ArrayList<EventOrganizer> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(ArrayList<EventOrganizer> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayEvents() {

        for (int i = 0; i < listOfEvents.size(); i++) {
            System.out.println(listOfEvents.get(i));
        }

    }

    public void removeEvent(DueDate userDate) {
        DueDate d = new DueDate();

        for (int i = 0; i < listOfEvents.size(); i++) {
            if (listOfEvents.get(i).duedate.equals(userDate)) {

            }
        }
    }

    public Date getDateOfEvents() {
        return dateOfEvents;
    }

    public void setDateOfEvents(Date dateOfEvents) {
        this.dateOfEvents = dateOfEvents;
    }

    public void addEvents(EventOrganizer newEvent) {
        listOfEvents.add(newEvent);
    }

    public Category getCat() {
        return cat;
    }

    public void setCat(Category cat) {
        this.cat = cat;
    }

    public SubCategory getSubCat() {
        return subCat;
    }

    public void setSubCat(SubCategory subCat) {
        this.subCat = subCat;
    }

    public DueDate getDuedate() {
        return duedate;
    }

    public void setDuedate(DueDate duedate) {
        this.duedate = duedate;
    }

    @Override
    public String toString() {
        return this.name + " " + cat + " " + subCat + " " + duedate;
    }

}

class dueDateComparator implements Comparator<EventOrganizer> {

    @Override
    public int compare(EventOrganizer o1, EventOrganizer o2) {
        return o1.getDuedate().compareTo(o2.getDuedate());
    }
}

class EventNameComparato implements Comparator<EventOrganizer> {

    @Override
    public int compare(EventOrganizer o1, EventOrganizer o2) {
        return o1.getName().compareTo(o2.getName());
    }

}

class CategoryComparator implements Comparator<EventOrganizer> {

    @Override
    public int compare(EventOrganizer o1, EventOrganizer o2) {
        return o1.getCat().getNameCategory().compareTo(o2.getCat().getNameCategory());
    }

}

class SubCategoryComparator implements Comparator<EventOrganizer> {

    @Override
    public int compare(EventOrganizer o1, EventOrganizer o2) {
        return o1.getSubCat().getNameSubCat().compareTo(o2.getSubCat().getNameSubCat());
    }

}
