package animal2;

import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Reader {
	public static List<Animal> getAnimalFromFiles(String[] fileNames) throws IOException,
	IllegalArgumentException, FileSystemException {
		List<String> list = new ArrayList<>();
		List<Animal> animalList = new ArrayList<>();
		for (String fileName : fileNames) {
			try (Stream<String> stream = Files.lines(Paths.get(fileName))) {
				list = stream.collect(Collectors.toList());
				for (String line : list) {
					String[] splittedLine = line.split(" ");
					Animal anim = new Animal(Integer.parseInt(splittedLine[0]),
							splittedLine[1], Integer.parseInt(splittedLine[2]),
							Integer.parseInt(splittedLine[3]));
					animalList.add(anim);
				}	
			}catch (NumberFormatException e) {
				throw new NumberFormatException("Wrong lines format.");
			}catch (NoSuchFileException e) {
				throw new NoSuchFileException("File '" + fileName + "' not found.");
			}catch (IOException e) {
				throw new IOException("Something went wrong.");
			}
		}
		return (animalList);
	}
}
		    
