package main;

import java.util.Scanner;

import user.User;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//Prints out Hello Axtesys
		System.out.println("Hello Axtesys");
		//String input & Output
		System.out.println("Input your name: ");
		String yourname;
		Scanner in = new Scanner(System.in);
		yourname = in.nextLine();
		System.out.println("Hello "+yourname);
		//Uses User.java
		User user = new User();
		user.setName("Heinz");
		System.out.println("Hello "+user.getName());
		in.close();
	}

}


/* import java.util.Scanner;

public class InputExp {

   public static void main(String[] args) {

       String name;
       int age;
       Scanner in = new Scanner(System.in);

       // Reads a single line from the console 
       // and stores into name variable
       name = in.nextLine();

       // Reads a integer from the console
       // and stores into age variable
       age=in.nextInt();
       in.close();            

       // Prints name and age to the console
       System.out.println("Name :"+name);
       System.out.println("Age :"+age);

    }
}

*/