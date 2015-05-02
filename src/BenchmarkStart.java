import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
 
// Damit Objekte der Klasse BeispielListener
// zum ActionListener werden kann, muss das Interface
// ActionListener implementiert werden
public class BenchmarkStart extends JFrame implements ActionListener {
	JButton button1;
    JLabel label;
    JPanel panel;
    JTextArea ergebnis;
    JScrollPane scrollpane;
 
    public BenchmarkStart() {
        this.setTitle("Benchmark - Start");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new JPanel();
 
        // Leeres JLabel-Objekt wird erzeugt
        label = new JLabel();
 
        //Drei Buttons werden erstellt
        button1 = new JButton("Start - Benchmark");
 
        //Buttons werden dem Listener zugeordnet
        button1.addActionListener(this);
 
        //Buttons werden dem JPanel hinzugefügt
        panel.add(button1);
        
        //Ergebnis
    	ergebnis = new JTextArea(22,48);
    	ergebnis.setText("Ergebnis: ");
    	ergebnis.setLineWrap(true);
    	ergebnis.setWrapStyleWord(true);
    	
    	scrollpane = new JScrollPane(ergebnis); 
    	scrollpane.setVisible(false);
    	panel.add(scrollpane);
 
        //JLabel wird dem Panel hinzugefügt
        panel.add(label);
        this.add(panel);
    }
 
    public static void main(String[] args)
    {
        // Ein neues Objekt der Klasse BeispielListener wird erzeugt
        // und sichtbar gemacht
        BenchmarkStart bl = new BenchmarkStart();
        bl.setVisible(true);
    }
    
 
    public void actionPerformed (ActionEvent ae){

        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        if(ae.getSource() == this.button1){
        	Benchmark ben = new Benchmark(this);
            ben.startBenchmark();
            button1.setVisible(false);
            scrollpane.setVisible(true);
        }
    }
    
    public void printErgebnis(String s) {
        ergebnis.append(s + "\n");
    }
    
    
}