import javax.swing.*;
 
class HelloWorldSwing {
    public static void main(String[] args) {
        // Verpacke den auszuf�hrenden Quellcode in ein eigenes
        // Runnable-Objekt, um diesen nachher im Event Dispatching
        // Thread ausf�hren zu k�nnen
        Runnable guiCreator = new Runnable() {
            public void run() {
                // Erstellt das Swing-Fenster
                JFrame fenster = new JFrame("Hallo Welt mit Swing");
                // Swing anweisen, das Programm zu beenden, wenn das Fenster
                // geschlossen wird
                fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
                // F�gt den "Hallo Welt"-Text hinzu
                JLabel label = new JLabel("Hallo Welt");
                fenster.getContentPane().add(label);
                
                //Jbutton Test
          
                JButton button1 = new JButton("OK");
                button1.addActionListener(new MyButtonListener(fenster));
                fenster.getContentPane().add(button1);

                // Zeigt das Fenster an
                fenster.setSize(300, 200);
                fenster.setVisible(true);
                
                
            }
        };
 
        // F�hre den obigen Quellcode im Event-Dispatch-Thread aus
        SwingUtilities.invokeLater(guiCreator);
    }
}

