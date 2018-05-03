package animal2;

import java.util.Comparator;

public class SortLifetime implements Comparator<Animal>{
	public int compare(Animal o1, Animal o2){
		int resultL = o1.Lifetime - o2.Lifetime;
		if(resultL == 0) {
			int w = o1.Animal.compareTo(o2.Animal);
			if (w == 0) {
				return o1.Weight - o2.Weight;
			}else if (w != 0)
				return w;
		}
		return resultL;
	}
}