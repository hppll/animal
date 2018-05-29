package animal2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class Writer {
	 public static void writer(StringBuilder lessThan10, StringBuilder between11and40,
			 StringBuilder moreThan40) throws IOException {
		 try {
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
			 
		 }catch(SecurityException  e) {
			 throw new SecurityException ("No access to the requested path.");
		 }
		 catch(FileNotFoundException  e) {
			 throw new FileNotFoundException("Incorrect path to the file to be recorded.");
		 }
		 catch(IOException  e) {
			 throw new IOException();
		 }
	 }
}
