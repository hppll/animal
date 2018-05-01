package animal2;

import java.util.Comparator;
import java.util.*;

class SortWeight implements Comparator<Animal>{
   
	public int compare(Animal o1, Animal o2){
	 int resultA = o1.Weight - o2.Weight;
	
	 if(o1.Weight == o2.Weight) {
		 return o2.Animal.compareTo(o1.Animal);
	 }
	 if (o1.Animal.equals(o2.Animal)) {
		 return o1.Lifetime - o2.Lifetime;
	 }else {
		  return resultA;
		 }
	}
}
