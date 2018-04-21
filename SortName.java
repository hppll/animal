package animal2;

import java.util.Comparator;

class SortName implements Comparator<String>{
	public int compare(String a, String b) {
		return a.compareTo(b);
	}	
}
