import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;


class MyButtonListener implements ActionListener {
	private JFrame fens;
	
	public MyButtonListener(JFrame f){
		this.fens = f;
	}
	
	  public void actionPerformed(ActionEvent event) {
	    // Quelltext, der ausgeführt wird, wenn der JButton angeklickt wird.
		 
	  }
	}