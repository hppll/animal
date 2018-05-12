package animal2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dispatcher {
	public static void main(String v) throws IOException {
		String value = v;
		String[] fileNames = new String [3];
		fileNames[0] = "D:\\uni\\javaP\\Animals\\Animal.txt";
		fileNames[1] = "D:\\uni\\javaP\\Animals\\Animal2.txt";
		fileNames[2] = "D:\\uni\\javaP\\Animals\\Animal3.txt";
		List<Animal> allAnimals = Reader.getAnimalFromFiles(fileNames);
		if (value.equals("Animal")) {
			Collections.sort(allAnimals, new SortName());
		}else if(value.equals("Weight")) {
			Collections.sort(allAnimals, new SortWeight());
		}else if(value.equals("Lifetime")) {
			Collections.sort(allAnimals, new SortLifetime());
		}
		Writer writer = new Writer();
		writer.writer(allAnimals);
	}
}
