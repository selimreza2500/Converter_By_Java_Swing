package Conveter_GUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class CurrencyConverter extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField output;
	private JButton btnBack;
	private JLabel JlabelC;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter frame = new CurrencyConverter();
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
	public CurrencyConverter() {
		setTitle("CurrencyConverter");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 404, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(0, 204, 204));
		comboBox.addItem("Taka to Dollar");
		comboBox.addItem("Dollar to Taka");
	//	comboBox.setSelectedItem();

		comboBox.setBounds(92, 67, 202, 33);
		contentPane.add(comboBox);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 204));
		input.setBounds(145, 111, 90, 30);
		contentPane.add(input);
		input.setColumns(10);
		
		output = new JTextField();
		output.setBackground(new Color(255, 255, 204));
		output.setBounds(145, 202, 90, 30);
		contentPane.add(output);
		output.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBackground(new Color(51, 204, 0));
		btnNewButton.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				float ratio;
				String u;
				if(comboBox.getSelectedItem()=="Dollar to Taka") {
					ratio = 84.47f;
					u="Tk";
				}
				else {
					ratio = 1/84.47f;
					u="U$";
				}
				float i = Float.parseFloat(input.getText());
				float result = i*ratio;
				output.setText(String.valueOf(result));
				 JlabelC.setText(u);
			}
		});
		btnNewButton.setBounds(145, 155, 89, 36);
		contentPane.add(btnNewButton);
		
		btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter frame = new Converter();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBounds(308, 280, 70, 23);
		contentPane.add(btnBack);
		
		JlabelC = new JLabel(" ");
		JlabelC.setBounds(245, 202, 40, 28);
		contentPane.add(JlabelC);
	}

}
