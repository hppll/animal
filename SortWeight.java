package animal2;

import java.util.Comparator;

class SortWeight implements Comparator<Animal>{
	SortName sn = new SortName();
	public int compare(Animal o1, Animal o2){
		sn.compare(o1.Animal, o2.Animal);
    	if (o1.Animal.equals(o2.Animal)) {
    		return o1.Weight - o2.Weight;
    	}else if (o1.Weight == o2.Weight) {
    		return o1.Lifetime - o2.Lifetime;
    	} else {
    		return o1.Weight - o2.Weight;
    	}
    }
 }