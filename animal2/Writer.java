package animal2;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Writer {
	 public static void writer(List<Animal> allAnimals) throws IOException {
		 try {
			 StringBuilder lessThan10 = new StringBuilder();
			 StringBuilder between11and40 = new StringBuilder();
			 StringBuilder moreThan40 = new StringBuilder();
			 for (Animal anim : allAnimals) {
				 if(anim.Weight <= 10 ) {
					lessThan10.append(anim).append("\r\n").toString();
				 }else if (11 <= anim.Weight && anim.Weight <= 40) {
					 between11and40.append(anim).append("\r\n").toString();
				 }else {
					 moreThan40.append(anim).append("\r\n").toString();
				 }
			 }
			 File file = new File("output\\less_than_10.txt");// just object
			 PrintStream fw =  new PrintStream(file);
			 fw.print(lessThan10);
			 fw.flush();
			 fw.close();
			 
			 File file2 = new File("output\\between_11_and_40.txt");
			 PrintStream fw2 =  new PrintStream(file2);
			 fw2.println(between11and40);
			 fw2.flush();
			 fw2.close();
			 
			 File file3 = new File("output\\more_than_40.txt");
			 PrintStream fw3 =  new PrintStream(file3);
			 fw3.println(moreThan40);
			 fw3.flush();
			 fw3.close();
			 
		 }  catch(IOException  e) { }
		 System.out.print("!");  
	 }
}
