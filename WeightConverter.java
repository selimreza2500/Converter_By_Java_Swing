package Conveter_GUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class WeightConverter extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField output;
	private JButton button;
	private JLabel JlabelW;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WeightConverter frame = new WeightConverter();
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
	public WeightConverter() {
		setBackground(new Color(221, 160, 221));
		setFont(new Font("Dialog", Font.BOLD, 14));
		setTitle("WeightConverter");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 340);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 204));
		input.setBounds(86, 74, 109, 30);
		contentPane.add(input);
		input.setColumns(10);
		
		output = new JTextField();
		output.setBackground(new Color(255, 255, 204));
		output.setBounds(86, 159, 109, 30);
		contentPane.add(output);
		output.setColumns(10);
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(153, 255, 255));
		comboBox.addItem("Kilogram to Pound");
		comboBox.addItem("Pound to Kilogram");
		//comboBox.setSelectedItem(null);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.setBackground(new Color(51, 255, 102));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float ratio;
				String u;
				if(comboBox.getSelectedItem()=="Kilogram to Pound") {
					ratio = 2.20462f;
					u="Pounds";
					
				}
				else {
					ratio = 1/2.20462f;
					u="KG";
					
				}
				float i = Float.parseFloat(input.getText());
				float result = i*ratio;
				output.setText(String.valueOf(result));
				JlabelW.setText(u);
			}
		});
		
		btnNewButton.setBounds(86, 115, 109, 30);
		contentPane.add(btnNewButton);
		
	

		
		comboBox.setBounds(66, 28, 152, 35);
		contentPane.add(comboBox);
		
		button = new JButton("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter frame = new Converter();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		button.setBounds(222, 253, 64, 37);
		contentPane.add(button);
		
		JlabelW = new JLabel("");
		JlabelW.setFont(new Font("Tahoma", Font.BOLD, 12));
		JlabelW.setBounds(205, 164, 64, 30);
		contentPane.add(JlabelW);
	}

}
