package TestSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JEditorPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.SystemColor;

public class CalDemoPro {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			// TODO: handle exception
		}
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalDemoPro window = new CalDemoPro();
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
	public CalDemoPro() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.window);
		frame.setBounds(500, 100, 267, 369);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Tahoma", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 11, 231, 81);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+9);;
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton.setBounds(10, 125, 48, 31);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("6");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+6);
			}
		});
		btnNewButton_1.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_1.setBounds(10, 167, 48, 31);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+3);
			}
		});
		btnNewButton_2.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_2.setBounds(10, 209, 48, 31);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_4 = new JButton("8");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+8);
			}
		});
		btnNewButton_4.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_4.setBounds(68, 125, 48, 31);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+5);
			}
		});
		btnNewButton_5.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_5.setBounds(68, 167, 48, 31);
		frame.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("2");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+2);
			}
		});
		btnNewButton_6.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_6.setBounds(68, 209, 48, 31);
		frame.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("0");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+0);
			}
		});
		btnNewButton_7.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_7.setBounds(10, 251, 106, 31);
		frame.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("7");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+7);
			}
		});
		btnNewButton_8.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_8.setBounds(138, 125, 48, 31);
		frame.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("4");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+4);
			}
		});
		btnNewButton_9.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_9.setBounds(138, 167, 48, 31);
		frame.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("1");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value2.getText()+1);
			}
		});
		btnNewButton_10.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_10.setBounds(138, 209, 48, 31);
		frame.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one=Integer.parseInt(value1.getText());
				int two=Integer.parseInt(value2.getText());
				
				if(actionRecived.getText().equals("sub"))
				{ int sub=one-two;
				      value2.setText(String.valueOf(sub));
				}
				if(actionRecived.getText().equals("add"))
				{ int add=one+two;
				      value2.setText(String.valueOf(add)); 
				}
				if(actionRecived.getText().equals("mul"))
				{ int mul=one*two;
				      value2.setText(String.valueOf(mul));
				}
				if(actionRecived.getText().equals("div"))
				{ int div=one/two;
				      value2.setText(String.valueOf(div));
			}
			}
		});
		btnNewButton_11.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_11.setBounds(138, 251, 48, 31);
		frame.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("+");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("add");
				value2.setText(null);
			}
		});
		btnNewButton_12.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_12.setBounds(193, 125, 48, 31);
		frame.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("-");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("sub");
				value2.setText(null);
			}
		});
		btnNewButton_13.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_13.setBounds(193, 167, 48, 31);
		frame.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("*");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("mul");
				value2.setText(null);
			}
		});
		btnNewButton_14.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_14.setBounds(193, 209, 48, 31);
		frame.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("/");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value2.getText());
				actionRecived.setText("div");
				value2.setText(null);
			}
		});
		btnNewButton_15.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_15.setBounds(193, 251, 48, 31);
		frame.getContentPane().add(btnNewButton_15);
		
		value2 = new JTextField();
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setToolTipText("");
		value2.setFont(new Font("Unispace", Font.PLAIN, 20));
		value2.setBorder(null);
		value2.setBounds(20, 48, 215, 40);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Unispace", Font.PLAIN, 15));
		value1.setBorder(null);
		value1.setBackground(new Color(255, 255, 255));
		value1.setBounds(141, 18, 98, 32);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		actionRecived = new JLabel(""); //making global variable
		actionRecived.setForeground(SystemColor.control);
		actionRecived.setBackground(SystemColor.control);
		actionRecived.setBounds(20, 293, 55, 27);
		frame.getContentPane().add(actionRecived);
		
		JButton btnNewButton_3 = new JButton("C");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
				value1.setText(null);
				value2.setText(null);
				actionRecived.setText(null);
			}
		});
		btnNewButton_3.setFont(new Font("Unispace", Font.BOLD, 20));
		btnNewButton_3.setBounds(163, 290, 55, 31);
		frame.getContentPane().add(btnNewButton_3);
	}
	private JLabel actionRecived;
}
