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
	    // �� ��������� � ���������� ������� ��� ������ �����
	    //String line;
	    // ������ ������������� ��������� ��� �������
	    List<Animal> mass = new ArrayList<>();

	    public void reader() {
	        BufferedReader readFromFile = null;
	        BufferedReader readFromFile2 = null;
	        BufferedReader readFromFile3 = null;
	        try {
	            readFromFile = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal.txt"));
	            readFromFile2 = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal2.txt"));
	            readFromFile3 = new BufferedReader(new FileReader("D:\\uni\\javaP\\Animals\\Animal3.txt"));
	            // ������� ������� ������ ��� ������ ����� �� ����� ����� ���
	            String line;
	            while ((line = readFromFile.readLine()) != null) {
	            	if (line.isEmpty()) continue;
	                // ����� ������ ����� ������ "1 Bear 60 35", �� �� ��������� �� ����������� �������
	                // � �������� ������ ����� {"1", "Bear", "30", "30"}
	                String[] splittedLine = line.split(" ");
	                // ������ �� ����� ������� ��������� ������ Animal �� ����������� �������
	                // �� ��� ��� 3/4 ����� � ��� ���� Int, � ������ string, �� ���� ��������������� ��������
	                // Integer.parseInt(), ������� ����������� string � int, ���� ��� ��������.
	                Animal anim = new Animal(Integer.parseInt(splittedLine[0]), splittedLine[1], Integer.parseInt(splittedLine[2]), Integer.parseInt(splittedLine[3]));
	                // ������ � ������ ��������� ��������
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
	            File file = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\less10.txt");//������ �ᒺ��
	            PrintStream fw =  new PrintStream(file);
	            File file2 = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\between 11 and 40.txt");//������ �ᒺ��
	            PrintStream fw2 =  new PrintStream(file2);
	            File file3 = new File("D:\\uni\\javaP\\Animals\\testCharacteristics\\more than 40.txt");//������ �ᒺ��
	            PrintStream fw3 =  new PrintStream(file3);
	            for (Animal anim : test.mass) {
	                if(anim.Weight <= 10 ) {
	                    fw.println(anim.toString()); //����� ������� �� �����
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

	class Animal{
	    public int Number;
	    public String Animal;
	    public int Weight;
	    public int Lifetime;

	    public Animal (int Number, String Animal, int Weight, int Lifetime){
	        this.Number = Number;
	        this.Animal = Animal;
	        this.Weight = Weight;
	        this.Lifetime = Lifetime;
	    }

	    // toString �������� ��� ������ � Java, �� �� ��������� �� ���������� ���-�� ����� ����-��� � ������� "Animal@1540e19d"
	    // ����� �� ������� ��, ��� ��� ����������, �� ����� ��� �������������� � �������� ��, ��� ��� ����������
	    @Override
	    public String toString() {
	        return this.Number + " " + this.Animal + " " + this.Weight + " " + this.Lifetime;
	    }
	}
class SortWeight implements Comparator<Animal>
	{
	SortName sn = new SortName();
	
	    public int compare(Animal o1, Animal o2)
	    {
	    	sn.compare(o1.Animal, o2.Animal);
	    	if (o1.Animal.equals(o2.Animal)) {
	    		return o1.Weight - o2.Weight;
	    	}else if (o1.Weight == o2.Weight) {
	    		return o1.Lifetime - o2.Lifetime;
	    	} else {
	    	return o1.Weight - o2.Weight;
	    }
	}
class SortName implements Comparator<String>{
	public int compare(String a, String b) {
		return a.compareTo(b);
	}
		}
	}
}