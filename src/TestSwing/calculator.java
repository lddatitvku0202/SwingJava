package TestSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculator {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textFieldAns;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField1 = new JTextField();
		textField1.setBounds(25, 31, 171, 55);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(225, 31, 176, 55);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textFieldAns = new JTextField();
		textFieldAns.setBounds(129, 203, 163, 47);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ans:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(57, 203, 67, 47);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("+");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1+num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(37, 118, 67, 55);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("-");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1-num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setBounds(129, 118, 67, 55);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("*");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1*num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setBounds(225, 117, 67, 55);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("/");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int num1,num2,ans;
					num1=Integer.parseInt(textField1.getText());
					num2=Integer.parseInt(textField2.getText());
					
					ans=num1/num2;
					textFieldAns.setText(Integer.toString(ans));
				}
				catch(Exception e1) {
					
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(322, 117, 67, 55);
		frame.getContentPane().add(btnNewButton_3);
	}
}
