
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// Damit Objekte der Klasse BeispielListener
// zum ActionListener werden kann, muss das Interface
// ActionListener implementiert werden
public class Program extends JFrame implements ActionListener {
    JButton startBtn;
    JLabel label;
    JPanel panel1;
    private JTextArea textArea1;
    JTextArea ergebnis;
    JScrollPane scrollpane;

    public Program() {
        this.setTitle("Benchmark - Start");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Komponenten
        label = new JLabel();
        startBtn = new JButton("Start - Benchmark");
        startBtn.setBounds(300, 200, 20, 5);
        startBtn.addActionListener(this);
        ergebnis = new JTextArea(22, 48);
        ergebnis.setText("Ergebnis: ");
        ergebnis.setLineWrap(true);
        ergebnis.setWrapStyleWord(true);
        scrollpane = new JScrollPane(ergebnis);
        scrollpane.setSize(590, 380);
        scrollpane.setVisible(false);
        panel1 = new JPanel();
        panel1.add(label);
        panel1.add(startBtn, JLayeredPane.DEFAULT_LAYER);
        panel1.add(scrollpane, JLayeredPane.PALETTE_LAYER);
        this.add(panel1);
    }

    public static void main(String[] args) {
        // Ein neues Objekt der Klasse BeispielListener wird erzeugt
        // und sichtbar gemacht
        Program program = new Program();
        program.setVisible(true);
    }


    public void actionPerformed(ActionEvent ae) {

        // Die Quelle wird mit getSource() abgefragt und mit den
        // Buttons abgeglichen. Wenn die Quelle des ActionEvents einer
        // der Buttons ist, wird der Text des JLabels entsprechend geändert
        if (ae.getSource() == this.startBtn) {
            Benchmark ben = new Benchmark(this);
            ben.startBenchmark();
            startBtn.setVisible(false);
            scrollpane.setVisible(true);
        }
    }

    public void printErgebnis(String s) {
        ergebnis.append(s + "\n");
    }
}