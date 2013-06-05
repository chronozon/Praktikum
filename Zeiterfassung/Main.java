import java.io.IOException;
import java.util.Scanner;
//import java.text.SimpleDateFormat;
//import java.util.Date;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner for Reading input from command line
		Scanner Eingabe = new Scanner(System.in);
		/*Debug purpose
		//creates Date Container in the given Format
		SimpleDateFormat Datum = new SimpleDateFormat("dd.MM.yyyy");
		SimpleDateFormat Zeit = new SimpleDateFormat("HH:mm:ss");
		*/
		System.out.println("Zeiterfassung: ");
		System.out.println("Name: ");
		String username = Eingabe.nextLine();
		System.out.println("(k)ommt / (g)eht");
		String InOrOut = Eingabe.nextLine();
		System.out.println(username+" "+InOrOut);
		
		/*Debug purpose
		System.out.println("Datum: "+Datum.format(new Date()));
		System.out.println("Zeit: "+Zeit.format(new Date()));
		*/
		//
		//Writes to a file appending ; adds Date and Time
		WriteToFile WF = new WriteToFile();
		try {
			WF.write(username, InOrOut);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Eingabe.close();
	}

}
