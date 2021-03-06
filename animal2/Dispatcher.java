package animal2;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.util.Collections;
import java.util.List;

public class Dispatcher {
	public void handle(String value) throws IOException,
	IllegalArgumentException, FileSystemException, RuntimeException {
		String[] fileNames = new String [3];
		fileNames[0] = "input\\Animal.txt"; 
		fileNames[1] = "input\\Animal2.txt";
		fileNames[2] = "input\\Animal3.txt";
		List<Animal> allAnimals = Reader.getAnimalFromFiles(fileNames);
		if (value.equals("Animal")) {
			Collections.sort(allAnimals, new SortName());
		}else if(value.equals("Weight")) {
			Collections.sort(allAnimals, new SortWeight());
		}else if(value.equals("Lifetime")) {
			Collections.sort(allAnimals, new SortLifetime());
		}
		String[] distributedAnimals = distribute(allAnimals);
		Writer.write(distributedAnimals);
	}
	private String[] distribute(List<Animal> allAnimals) throws IOException {
		StringBuilder lessThan10 = new StringBuilder();
		StringBuilder between11and40 = new StringBuilder();
		StringBuilder moreThan40 = new StringBuilder();
		for (Animal animal : allAnimals) {
			if(animal.Weight <= 10 ) {
				lessThan10.append(animal).append("\r\n").toString();
			}else if (animal.Weight <= 40) {
				between11and40.append(animal).append("\r\n").toString();
			}else {
				moreThan40.append(animal).append("\r\n").toString();
			}
		}
		String [] distributedAnimals = new String[3];
		distributedAnimals[0] = lessThan10.toString();
		distributedAnimals[1] = between11and40.toString();
		distributedAnimals[2] = moreThan40.toString();
		return (distributedAnimals);
	}
}
