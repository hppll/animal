package animal2;

import java.util.List;

public class Dispatcher {
	public static void main(String[] args) {
		String[] fileNames = new String [3];
		fileNames[0] = "D:\\uni\\javaP\\Animals\\Animal.txt";
		fileNames[1] = "D:\\uni\\javaP\\Animals\\Animal2.txt";
		fileNames[2] = "D:\\uni\\javaP\\Animals\\Animal3.txt";
		Reader.getAnimalFromFiles(fileNames);
	}
}
