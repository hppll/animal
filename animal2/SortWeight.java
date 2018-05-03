package animal2;

import java.util.Comparator;
import java.util.*;

class SortWeight implements Comparator<Animal>{
	public int compare(Animal o1, Animal o2){
		int resultW = o1.Weight - o2.Weight;
		if(resultW == 0) {
			int a = o1.Animal.compareTo(o2.Animal);
			if (a == 0) {
				return o1.Lifetime - o2.Lifetime;
			}else if (a != 0)
				return a;
		}
		return resultW;
	}
}
