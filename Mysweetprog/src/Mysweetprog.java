import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mysweetprog {

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("Hello World");
		
		Scanner in = new Scanner(new File("src/student.txt"));
		
		List<String> students = new ArrayList<String>();
		
		while(in.hasNextLine()) {
			students.add(in.nextLine());
		}	 
		
		for(int i = 0; i<students.size(); i++) {
			System.out.println("name:" + students.get(i));
		}
		
		in.close();		
	}

}
