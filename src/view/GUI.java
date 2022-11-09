package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 400);
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu mnNewMenu = new JMenu("Cearsar");
		menuBar.add(mnNewMenu);

		JMenuItem mntmNewMenuItem = new JMenuItem("Hill");
		mnNewMenu.add(mntmNewMenuItem);

		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Affine");
		mnNewMenu.add(mntmNewMenuItem_1);

		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Affine");
		mnNewMenu.add(mntmNewMenuItem_2);

//		JMenuItem mntmNewMenuItem_3 = new JMenuItem("Affine");
//		mnNewMenu.add(mntmNewMenuItem_3);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField = new JTextField();
		textField.setBounds(10, 73, 340, 170);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("File");
		btnNewButton.setBounds(293, 44, 57, 23);
		contentPane.add(btnNewButton);

		textField_2 = new JTextField();
		textField_2.setBounds(40, 253, 40, 24);
		contentPane.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblNewLabel = new JLabel("Key:");
		lblNewLabel.setBounds(10, 258, 31, 14);
		contentPane.add(lblNewLabel);

		JButton btnNewButton_2 = new JButton("Encrypt");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(90, 254, 80, 24);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_2_1 = new JButton("Save");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_1.setBounds(180, 255, 80, 24);
		contentPane.add(btnNewButton_2_1);

		JButton btnNewButton_2_2 = new JButton("Delete");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2_2.setBounds(270, 255, 80, 24);
		contentPane.add(btnNewButton_2_2);

		JButton btnNewButton_2_2_1 = new JButton("Delete");
		btnNewButton_2_2_1.setBounds(694, 253, 80, 24);
		contentPane.add(btnNewButton_2_2_1);

		JButton btnNewButton_2_1_1 = new JButton("Save");
		btnNewButton_2_1_1.setBounds(604, 253, 80, 24);
		contentPane.add(btnNewButton_2_1_1);

		JButton btnNewButton_2_3 = new JButton("Encrypt");
		btnNewButton_2_3.setBounds(514, 252, 80, 24);
		contentPane.add(btnNewButton_2_3);

		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(464, 251, 40, 24);
		contentPane.add(textField_1);

		JLabel lblNewLabel_1 = new JLabel("Key:");
		lblNewLabel_1.setBounds(434, 256, 31, 14);
		contentPane.add(lblNewLabel_1);

		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(434, 71, 340, 170);
		contentPane.add(textField_3);

		JButton btnNewButton_1 = new JButton("File");
		btnNewButton_1.setBounds(434, 44, 57, 23);
		contentPane.add(btnNewButton_1);
		//
		
	}
}
