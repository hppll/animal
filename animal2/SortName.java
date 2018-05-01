package animal2;

import java.util.Comparator;

public class SortName implements Comparator<Animal>{
	public int compare(Animal o1, Animal o2){
		int resultA = o1.Animal.compareTo(o2.Animal);
		if(resultA == 0) {
			int w = o1.Weight - o2.Weight;
			if (w == 0) {
				return o1.Lifetime - o2.Lifetime;
			}else if (w != 0)
				return w;
		}
		return resultA;
	}
}
	
	

