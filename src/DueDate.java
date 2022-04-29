import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class DueDate implements Comparable<DueDate> {
	
	
	
	
	private int day, month, year;
	private LocalDate date;
	

	public DueDate(int day, int month, int year) {
		this.date = date.of(year, month, day);
	}

	public DueDate() {
		
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "" + this.date +  "";
	}

	

	@Override
	public int compareTo(DueDate o) {
		// TODO Auto-generated method stub
		return this.date.compareTo(o.date);
	}

	
	
	
	
	
}
