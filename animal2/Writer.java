package animal2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Writer {
	 public static void main(List<Animal> allAnimals) throws IOException {
		// List<Animal> Animals = allAnimals;
			Reader read = new Reader();
		 try {
			 File file = new File("animal2\\output\\less10.txt");// just object
			 PrintStream fw =  new PrintStream(file);
			 File file2 = new File("animal2\\output\\between 11 and 40.txt");
			 PrintStream fw2 =  new PrintStream(file2);
			 File file3 = new File("animal2\\output\\more than 40.txt");
			 PrintStream fw3 =  new PrintStream(file3);
			 for (Animal anim : allAnimals) {
				 if(anim.Weight <= 10 ) {
					 fw.println(anim.toString()); // writing symbols to file
				 }else if (11 <= anim.Weight && anim.Weight <= 40) {
					 fw2.println(anim.toString());
				 }else if (anim.Weight > 40)
					 fw3.println(anim.toString());
			 }
			 fw.flush();
			 fw.close();
		 }  catch(IOException  e) { }
		 System.out.print("!");  
	 }
}
