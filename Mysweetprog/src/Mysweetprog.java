import java.util.Scanner;

public class Mysweetprog {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
/*		if(s.equals("Caleb")) {
			System.out.println("Hey Caleb");
		} 
		else if(s.equals("Sally")) {
			System.out.println("Hey Sally");
		}
		else {
			System.out.println("You're not wecome");
		}
		
		
		int i = 0;
		while(i < 10) {
			System.out.println("i is:" + i);
			i++;
		}*/
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i ="+ i);
		}
		
		in.close();
				
	}

}
