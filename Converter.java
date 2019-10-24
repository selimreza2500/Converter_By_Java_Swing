package Conveter_GUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JRadioButton;
import javax.swing.JToolBar;
import javax.swing.JTextPane;
import javax.swing.JLabel;

public class Converter extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Converter() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mahabub\\Desktop\\1200x630bb.jpg"));
		setType(Type.UTILITY);
		setTitle("Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 368);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(102, 204, 0));
		contentPane.setBackground(new Color(153, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnL = new JButton("Length");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LengthConveter LC = new LengthConveter();
			    LC.setVisible(true);
				setVisible(false);
				
				}
			
		});
		
		btnL.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnL.setBackground(new Color(0, 250, 154));
		btnL.setBounds(28, 78, 129, 66);
		contentPane.add(btnL);
		
		JButton btnC = new JButton("Currency");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CurrencyConverter CC = new CurrencyConverter();
				CC.setVisible(true);
				setVisible(false);
			}
		});
		btnC.setBackground(new Color(0, 250, 154));
		btnC.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		btnC.setBounds(180, 78, 129, 66);
		contentPane.add(btnC);
		
		JButton btnW = new JButton("Weight");
		btnW.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WeightConverter WC = new WeightConverter();
				WC.setVisible(true);
				setVisible(false);
			}
		});
		btnW.setBackground(new Color(0, 250, 154));
		btnW.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnW.setBounds(28, 166, 129, 66);
		contentPane.add(btnW);
		
		JButton btnT = new JButton("Temperature");
		btnT.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TemperatureConverter TC = new TemperatureConverter();
				TC.setVisible(true);
				setVisible(false);
			}
		});
		btnT.setBackground(new Color(0, 250, 154));
		btnT.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnT.setBounds(180, 166, 129, 66);
		contentPane.add(btnT);
		
		JLabel lblSeliml = new JLabel("Select an Option");
		lblSeliml.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSeliml.setBounds(112, 23, 138, 29);
		contentPane.add(lblSeliml);
	}
}
