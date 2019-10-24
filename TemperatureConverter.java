package Conveter_GUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class TemperatureConverter extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JTextField output;
	private JButton btnNewButton_1;
	private JLabel JlabelT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TemperatureConverter frame = new TemperatureConverter();
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
	public TemperatureConverter() {
		setTitle("TemperatureConverter");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 318, 363);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("Celsius to Farenheit");
		comboBox.addItem("Farenheit to Celsius");
		//comboBox.setSelectedItem(null);
		
		comboBox.setBounds(56, 48, 160, 35);
		contentPane.add(comboBox);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 204));
		input.setBounds(92, 94, 90, 30);
		contentPane.add(input);
		input.setColumns(10);
		
		output = new JTextField();
		output.setBackground(new Color(255, 255, 204));
		output.setBounds(92, 175, 90, 30);
		contentPane.add(output);
		output.setColumns(10);
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String u;
				if(comboBox.getSelectedItem()=="Celsius to Farenheit") {
				float C = Float.parseFloat(input.getText());

					float F=(C * 9/5) + 32;
					output.setText(String.valueOf(F));
                     u="°F";
                     JlabelT.setText(u);
			
				}
				else {
					float F = Float.parseFloat(input.getText());
					float C =(F- 32) * 5/9;
					u="°C";
					JlabelT.setText(u);
					output.setText(String.valueOf(C));
					
					
				}
			
			}
		});
		
		btnNewButton.setBounds(92, 135, 90, 30);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter frame = new Converter();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(218, 290, 74, 23);
		contentPane.add(btnNewButton_1);
		
		JlabelT = new JLabel("");
		JlabelT.setFont(new Font("Tahoma", Font.BOLD, 14));
		JlabelT.setBounds(192, 175, 40, 28);
		contentPane.add(JlabelT);
	}

}
