import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hallo Welt");
		System.out.println("Input your name: ");
		Scanner Eingabe = new Scanner(System.in);
		String yourname = Eingabe.nextLine();
		System.out.println("Input a number: ");
		int Param1 = Eingabe.nextInt();
		System.out.println("Input anoter number: ");
		int Param2 = Eingabe.nextInt();
		System.out.println("1st number: "+Param1);
		System.out.println("1st number: "+Param2);
		System.out.println("Hallo "+yourname);
		//Time and Date
		SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		System.out.println("It's "+format.format(new Date()));
		System.out.println(Param1+" + "+Param2+" = "+Addiere(Param1,Param2));
		Eingabe.close();
	}

	private static String Addiere(int param1, int param2) {
		// TODO Auto-generated method stub
		int add;
		add=param1+param2;
		return "" + add;

	}

}
