package courseprojec;

import java.util.ArrayList;
import java.util.Comparator;

public class Category implements Comparator<Category>{
	ArrayList<Category> cat = new ArrayList();
	
	private String nameCategory;
	
	public Category(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	public String getNameCategory() {
		return nameCategory;
	}

	public void setNameCategory(String nameCategory) {
		this.nameCategory = nameCategory;
	}

	@Override
	public String toString() {
		return this.nameCategory;
	}
	
	@Override
    public int compare(Category o1, Category o2) {
        return o1.nameCategory.compareTo(o2.nameCategory);
    }
	
	
	
	

}
