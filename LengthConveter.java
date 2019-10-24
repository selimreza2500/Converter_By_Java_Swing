package Conveter_GUL;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Window.Type;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JRadioButton;

public class LengthConveter extends JFrame {

	private JPanel contentPane;
	private JTextField input;
	private JButton convert;
	private JLabel output;
	private JLabel unit;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LengthConveter frame = new LengthConveter();
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
	public LengthConveter() {
		setTitle("Length Converter");
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 360, 334);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBackground(new Color(51, 153, 51));
		comboBox.addItem("Kilometer to Mile");
		comboBox.addItem("Mile to Kilometer");
		//comboBox.setSelectedItem(null);
		
		comboBox.setBounds(65, 41, 172, 34);
		contentPane.add(comboBox);
		
		input = new JTextField();
		input.setBackground(new Color(255, 255, 204));
		input.setFont(new Font("Tahoma", Font.BOLD, 14));
		input.setBounds(86, 86, 130, 30);
		contentPane.add(input);
		input.setColumns(10);
		
		convert = new JButton("Convert");
		convert.setBackground(new Color(51, 153, 51));
		convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float ratio;
				String u;
				if(comboBox.getSelectedItem()=="Kilometer to Mile") {
					ratio = 1/1.609f;
					u = "Mile";
				}
				else {
					ratio = 1.609f;
					u = "Km";
				}
				float i = Float.parseFloat(input.getText());
				float result = i*ratio;
				output.setText(String.valueOf(result));
				unit.setText(u);
			}
		});
		
		convert.setBounds(107, 128, 90, 30);
		contentPane.add(convert);
		
		output = new JLabel("");
		output.setFont(new Font("Ebrima", Font.BOLD, 20));
		output.setBounds(65, 193, 114, 49);
		contentPane.add(output);
		
		unit = new JLabel("");
		unit.setFont(new Font("Tahoma", Font.BOLD, 20));
		unit.setBounds(189, 193, 55, 45);
		contentPane.add(unit);
		
		btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Converter frame = new Converter();
				frame.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBounds(245, 261, 89, 23);
		contentPane.add(btnNewButton);
	}
}
