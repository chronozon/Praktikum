import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.*;

/**
 * 
 * 
 * @author jeffrey.born
 *
 */
public class WriteToFile {

	public WriteToFile() {
		// TODO Auto-generated constructor stub
	}

	public WriteToFile(int nr){
		this.num = nr;
	}
	
	public static int nummer = 3;
	private int num;
	
	/**
	 * 
	 * @param args
	 */
	public void write(String name,String kommtGeht) throws IOException 
	{
		// TODO Auto-generated method stub
		 SimpleDateFormat datum = new SimpleDateFormat("dd.MM.yyyy");
		 SimpleDateFormat zeit = new SimpleDateFormat("HH:mm:ss");
		
		FileWriter fw = new FileWriter("Zeiten.txt",true);
	    BufferedWriter bw = new BufferedWriter(fw);
	    /*Debug purpose
		 System.out.println("Datum: "+Datum.format(new Date()));
		 System.out.println("Zeit: "+Zeit.format(new Date()));

	    //bw.write("Test;test;test;test");
	    */
	    String heute = ""+datum.format(new Date());
	    String now = ""+zeit.format(new Date());
	    bw.append(name+";"+kommtGeht+";"+heute+";"+now);
	    /*Debug purpose
	    bw.append(name+";"+kommtgeht+";"+"DATUM"+";"+"Zeit");
	    */
	   
	    bw.newLine();
	    bw.close();
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
}


