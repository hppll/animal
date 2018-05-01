package animal2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

	class test2 {
		
		
	    // Не нуждаемся в глобальном стринге для чтения строк
	    //String line;
	    // Справа необязательно указывать тип массива
/*		
	    List<Animal> mass = new ArrayList<>();

	    public void reader() {
	        BufferedReader readFromFile = null;
	        BufferedReader readFromFile2 = null;
	        BufferedReader readFromFile3 = null;
	        try {
	            readFromFile = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal.txt"));
	            readFromFile2 = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal2.txt"));
	            readFromFile3 = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal3.txt"));
	            // Поэтому создать ссылку для чтения файла мы можем прямо тут
	            String line;
	            while ((line = readFromFile.readLine()) != null) {
	            	if (line.isEmpty()) continue;
	                // ПОсле чтения одной строки "1 Bear 60 35", мы ее спиллитим по пробельному символу
	                // И получаем массив строк {"1", "Bear", "30", "30"}
	                String[] splittedLine = line.split(" ");
	                // Теперь мы можем создать экземпляр класса Animal из полученнего массива
	                // Но так как 3/4 полей у нас типа Int, а массив string, то надо воспользоваться парсером
	                // Integer.parseInt(), который преобразует string в int, если это возможно.
	                Animal anim = new Animal(Integer.parseInt(splittedLine[0]), splittedLine[1], Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]));
	                // Кладем в массив считанное животное
	                mass.add(anim);
	            }
	            while ((line = readFromFile2.readLine()) != null) {
	            	if (line.isEmpty()) continue;
	                String[] splittedLine = line.split(" ");
	                Animal anim = new Animal(Integer.parseInt(splittedLine[0]), splittedLine[1], Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]));
	                mass.add(anim);
	            }
	            while ((line = readFromFile3.readLine()) != null) {
	            	if (line.isEmpty()) continue;
	                String[] splittedLine = line.split(" ");
	                Animal anim = new Animal(Integer.parseInt(splittedLine[0]), splittedLine[1], Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]));
	                mass.add(anim);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (readFromFile != null)
	                try {
	                    readFromFile.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	        }
	        Collections.sort(mass, new SortWeight());

	    }
	    

	    public static void main(String[] args) throws IOException {
	        test2 test = new test2();
	        test.reader();
	        try {
	            File file = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\less10.txt");//просто об’єкт
	            PrintStream fw =  new PrintStream(file);
	            File file2 = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\between 11 and 40.txt");//просто об’єкт
	            PrintStream fw2 =  new PrintStream(file2);
	            File file3 = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\more than 40.txt");//просто об’єкт
	            PrintStream fw3 =  new PrintStream(file3);
	            for (Animal anim : test.mass) {
	                if(anim.Weight <= 10 ) {
	                    fw.println(anim.toString()); //запис символів до файлу
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
	    */
	    
	}
	
