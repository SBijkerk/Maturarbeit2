import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Event;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;

import java.math.BigInteger;


public class BenchmarkStart extends JFrame {

	private JPanel contentPane;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BenchmarkStart frame = new BenchmarkStart();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BenchmarkStart() {
		
		//Frame
		JFrame frame = new JFrame("Benchmark - Start");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 350);
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
		
		//Startbutton
		JButton startBtn = new JButton("Start Benchmark");
		startBtn.setBounds(127, 149, 146, 29);
		frame.getContentPane().add(startBtn);
		
	}
	
	public void BenchmarkDurchlauf() {
		
		//Frame
		JFrame frame2 = new JFrame("Benchmark - Test");
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setSize(400, 350);
		frame2.setVisible(true);
		frame2.getContentPane().setLayout(null);
		
		
	}
}
