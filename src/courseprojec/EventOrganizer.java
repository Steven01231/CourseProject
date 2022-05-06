package courseprojec;

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
	
	private ArrayList<EventOrganizer> listOfEvents = new ArrayList();
    
    private String name;
    
    private Date dateOfEvents;
    
    public EventOrganizer(String name, Category category, SubCategory subCategory, DueDate dueDate) {
    	this.name = name;
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
    	
    	for(int i = 0; i < listOfEvents.size(); i++)
    		System.out.println(listOfEvents.get(i));
    	
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
    
    

	@Override
	public String toString() {
		return "EventOrganizer [listOfEvents=" + listOfEvents + "]";
	}
    
    
}

class dueDateComparator implements Comparator<EventOrganizer>{

    @Override
    public int compare(EventOrganizer o1, EventOrganizer o2) {
        if(o1.getDateOfEvents().before(o2.getDateOfEvents())){
            return -1;
        }
        else if(o1.getDateOfEvents().after(o2.getDateOfEvents())){
            return 1;
        }
        else{
            return 0;
        }
    }
    
}
