package animal2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class Reader {

	// List<Animal> animalList = new ArrayList<>();

	public List<Animal> getAnimalFromFiles(String[] fileNames) {
		  List<Animal> animalList = new ArrayList<>();
		
		for (String fileName : fileNames) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line;
			while ((line = br.readLine()) != null) {
				 String[] splittedLine = line.split(" ");
			Animal anim = new Animal(Integer.parseInt(splittedLine[0]), splittedLine[1], Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]));
             animalList.add(anim);
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		return (animalList);
		}
}
		    
