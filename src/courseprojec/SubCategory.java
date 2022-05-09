package courseprojec;

import java.util.ArrayList;
import java.util.Comparator;

public class SubCategory implements Comparator<SubCategory> {
	
	private ArrayList<SubCategory> subCat = new ArrayList();
	
	private String nameSubCat;

	public SubCategory(String nameSubCat) {
		super();
		this.nameSubCat = nameSubCat;
	}

	public String getNameSubCat() {
		return nameSubCat;
	}

	public void setNameSubCat(String nameSubCat) {
		this.nameSubCat = nameSubCat;
	}

	@Override
	public String toString() {
		return this.nameSubCat;
	}
	
	@Override
    public int compare(SubCategory o1, SubCategory o2) {
        return o1.nameSubCat.compareTo(o2.nameSubCat);
    }
	
}
