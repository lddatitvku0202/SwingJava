package TestSwing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.DefaultBoundedRangeModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class table_demo {

	private JFrame frame;
	private JTextField id;
	private JTextField name;
	private JTextField contact;
	private JTextField course;
	private JTable table;
	DefaultTableModel model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					table_demo window = new table_demo();
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
	public table_demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 544, 381);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(135, 206, 235));
		panel.setBounds(0, 0, 528, 342);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setBounds(35, 64, 20, 14);
		panel.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NAME:");
		lblNewLabel_1.setBounds(35, 89, 52, 14);
		panel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("CONTACT:");
		lblNewLabel_2.setBounds(35, 114, 72, 14);
		panel.add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("COURSE:");
		lblNewLabel_3.setBounds(35, 139, 61, 14);
		panel.add(lblNewLabel_3);

		id = new JTextField();
		id.setBounds(101, 61, 97, 20);
		panel.add(id);
		id.setColumns(10);

		name = new JTextField();
		name.setBounds(101, 86, 97, 20);
		panel.add(name);
		name.setColumns(10);

		contact = new JTextField();
		contact.setBounds(101, 111, 97, 20);
		panel.add(contact);
		contact.setColumns(10);

		course = new JTextField();
		course.setBounds(101, 136, 97, 20);
		panel.add(course);
		course.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(227, 50, 291, 281);
		panel.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				id.setText(model.getValueAt(i, 0).toString());
				name.setText(model.getValueAt(i, 1).toString());
				contact.setText(model.getValueAt(i, 2).toString());
				course.setText(model.getValueAt(i, 3).toString());
			}
		});
		table.setBackground(new Color(34, 139, 34));
		model = new DefaultTableModel();
		Object[] column = { "ID", "NAME", "CONTACT", "COURSE" };
		final Object[] row = new Object[4];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);

		JButton btnNewButton = new JButton("ADD");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (id.getText().equals("") || name.getText().equals("") || course.getText().equals("")
						|| contact.getText().equals("")) {
					JOptionPane.showMessageDialog(null, "Please Fill Complete Information");
				} else {
					row[0] = id.getText();
					row[1] = name.getText();
					row[2] = contact.getText();
					row[3] = course.getText();
					model.addRow(row);

					id.setText("");
					name.setText("");
					contact.setText("");
					course.setText("");
					JOptionPane.showMessageDialog(null, "Saved Successfully");
				}
			}
		});
		btnNewButton.setBounds(18, 207, 89, 23);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("UPDATE");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.setValueAt(id.getText(), i, 0);
					model.setValueAt(name.getText(), i, 1);
					model.setValueAt(contact.getText(), i, 2);
					model.setValueAt(course.getText(), i, 3);
					JOptionPane.showMessageDialog(null, "Updated Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}
			}
		});
		btnNewButton_1.setBounds(132, 207, 89, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("DELETE");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int i = table.getSelectedRow();
				if (i >= 0) {
					model.removeRow(i);
					JOptionPane.showMessageDialog(null, "Deleted Successfully");
				} else {
					JOptionPane.showMessageDialog(null, "Please Select a Row First");
				}

			}
		});
		btnNewButton_2.setBounds(18, 257, 89, 23);
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("CLEAR");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				id.setText("");
				name.setText("");
				contact.setText("");
				course.setText("");
			}
		});
		btnNewButton_3.setBounds(132, 257, 89, 23);
		panel.add(btnNewButton_3);
	}
}
