package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class GUIView extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldInput, tInputHill, tOutputHill, tfInputVigenere, tfOutputVigenere, tfKey1Vigenere,
			tfKey2Vigenere

	;
	private JTextField textFieldKeyPlainText;
	private JTextField textFieldOutCipher;
	private JTextField tkeyCipher;
	private JLayeredPane layeredPane;
	private JPanel panelCeasar;
	private JPanel panelHill;
	private JPanel panelVigenere, panelAffine;
	private JTextField tfInputAffine;
	private JTextField tfKey1Affine;
	private JTextField tfOutputAffine;
	private JTextField tfKey2Affine;
	private JTextField tfkeyBAffine;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField tfkeyB1Affine;
	private JTextField tfkeyA2Affine;
	private JTextField tfkeyB2Affine;
	private JTextField tfkeyA1Affine;
	// hill
	private static char p[] = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	private static char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J',
			'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M' };
	//

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {

					GUIView frame = new GUIView();
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
	public GUIView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 933, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 151, 423);
		contentPane.add(panel);
		panel.setLayout(null);

		JButton btnNewButton = new JButton("Caesar");
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchScreen(panelCeasar);
			}
		});
		btnNewButton.setBounds(25, 22, 89, 23);
		panel.add(btnNewButton);
// chuyển màn hình giữa các tab p1 p2 p3 _______________________________
		JButton btnNewButton_1 = new JButton("Hill");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchScreen(panelHill);
			}
		});

		btnNewButton_1.setBackground(new Color(192, 192, 192));

		btnNewButton_1.setBounds(26, 52, 89, 23);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Vigenere");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchScreen(panelVigenere);
			}
		});
		// panel1
		//
		btnNewButton_2.setBackground(new Color(192, 192, 192));

		btnNewButton_2.setBounds(26, 84, 89, 23);
		panel.add(btnNewButton_2);
//_______________________________________________________
		JButton btnNewButton_3 = new JButton("Affine");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switchScreen(panelAffine);

			}
		});
		btnNewButton_3.setBackground(new Color(192, 192, 192));
		btnNewButton_3.setBounds(26, 115, 89, 23);
		panel.add(btnNewButton_3);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(161, 0, 756, 423);
		contentPane.add(layeredPane);
		layeredPane.setLayout(null);
		// _______________________________________caesar_________________________________________________________________________
		panelCeasar = new JPanel();
		panelCeasar.setBackground(new Color(255, 128, 255));
		panelCeasar.setBounds(0, 0, 756, 423);
		layeredPane.add(panelCeasar);
		panelCeasar.setLayout(null);

		textFieldInput = new JTextField();
		// sự kiện nhâp input
//		textFieldInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String input = textFieldInput.getText();
//
//			}
//		});
		textFieldInput.setColumns(10);
		textFieldInput.setBounds(10, 78, 340, 170);
		panelCeasar.add(textFieldInput);

		JButton btnNewButton_4 = new JButton("File");
		btnNewButton_4.setBounds(293, 49, 57, 23);
		panelCeasar.add(btnNewButton_4);

		JButton btnDeletePlainText = new JButton("Delete");
		btnDeletePlainText.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDeletePlainText.setBounds(270, 260, 80, 24);
		panelCeasar.add(btnDeletePlainText);

		JButton btnSaveInput = new JButton("Save");
		btnSaveInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSaveInput.setBounds(180, 260, 80, 24);
		panelCeasar.add(btnSaveInput);
//________________________________// sự kiện cho btn encrypt______________________________________________
		JButton btnNewButton_2_3 = new JButton("Encrypt");

		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			String plainText = String.parseString(textFieldInput.getText());
				String plainText = textFieldInput.getText().toString().trim();
				int key = Integer.parseInt(textFieldKeyPlainText.getText().trim());
//				encrypt(plainText, key);
				textFieldOutCipher.setText(encrypt(plainText, key));
			}

			private String encrypt(String plainText, int key) {
				char s[] = new char[plainText.length()];
				for (int i = 0; i < s.length; i++) {
					int a = (int) plainText.charAt(i) + key;
					a = a > (int) 'Z' ? a - 26 : a;
					s[i] = (char) a;
				}

				return new String(s);
			}
		});
		btnNewButton_2_3.setBounds(90, 259, 80, 24);
		panelCeasar.add(btnNewButton_2_3);

		textFieldKeyPlainText = new JTextField();

		textFieldKeyPlainText.setColumns(10);
		textFieldKeyPlainText.setBounds(40, 258, 40, 24);
		panelCeasar.add(textFieldKeyPlainText);

		JLabel lblNewLabel = new JLabel("Key:");
		lblNewLabel.setBounds(10, 263, 31, 14);
		panelCeasar.add(lblNewLabel);

		textFieldOutCipher = new JTextField();
		textFieldOutCipher.setColumns(10);
		textFieldOutCipher.setBounds(406, 78, 340, 170);
		panelCeasar.add(textFieldOutCipher);

		tkeyCipher = new JTextField();
		tkeyCipher.setColumns(10);
		tkeyCipher.setBounds(436, 258, 40, 24);
		panelCeasar.add(tkeyCipher);

		JLabel lblKeyCipher = new JLabel("Key:");
		lblKeyCipher.setBounds(406, 263, 31, 14);
		panelCeasar.add(lblKeyCipher);
		// sự kiện btn decryption
//___________________________________________________________________________________________
		JButton btnEncryptCipher = new JButton("decrypt");
		btnEncryptCipher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cipherText = textFieldOutCipher.getText().toString().trim();
				int key = Integer.parseInt(tkeyCipher.getText().trim());
				textFieldInput.setText(decrypt(cipherText, key));

			}

			private String decrypt(String cipherText, int key) {

				char s[] = new char[cipherText.length()];
				for (int i = 0; i < s.length; i++) {
					int a = (int) cipherText.charAt(i) - key;
					a = a < (int) 'A' ? a + 26 : a;
					s[i] = (char) a;
				}
				return new String(s);
			}
		});

		btnEncryptCipher.setBounds(486, 259, 80, 24);
		panelCeasar.add(btnEncryptCipher);

		JButton btnSaveCipher = new JButton("Save");
		btnSaveCipher.setBounds(576, 260, 80, 24);
		panelCeasar.add(btnSaveCipher);

		JButton btnDeleteCipher = new JButton("Delete");
		btnDeleteCipher.setBounds(666, 260, 80, 24);
		panelCeasar.add(btnDeleteCipher);

		JButton btnNewButton_4_1 = new JButton("File");
		btnNewButton_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_4_1.setBounds(689, 49, 57, 23);
		panelCeasar.add(btnNewButton_4_1);

		JLabel lblPlainText = new JLabel("Plain text");
		lblPlainText.setBounds(10, 58, 66, 14);
		panelCeasar.add(lblPlainText);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 295, 736, 117);
		panelCeasar.add(textArea);
//________________________________________________hill____________________________________________________________________
		panelHill = new JPanel();
		//
		tInputHill = new JTextField();
		// sự kiện nhâp input
//		textFieldInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String input = textFieldInput.getText();
//
//			}
//		});
		tInputHill.setColumns(10);
		tInputHill.setBounds(10, 78, 340, 170);
		panelHill.add(tInputHill);

		JButton btnFile1Hill = new JButton("File");
		btnFile1Hill.setBounds(293, 49, 57, 23);
		panelHill.add(btnFile1Hill);

		JButton btnDelete1Hill = new JButton("Delete");
		btnDelete1Hill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete1Hill.setBounds(270, 260, 80, 24);
		panelHill.add(btnDelete1Hill);

		JButton btnSave1Hill = new JButton("Save");
		btnSave1Hill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave1Hill.setBounds(180, 260, 80, 24);
		panelHill.add(btnSave1Hill);
//_______________________________________________________________________________________________________
		JButton btnEncryptHill = new JButton("Encrypt");
		// sự kiện cho btn encrypt
		btnEncryptHill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String plainText = tInputHill.getText().toString().trim();
				tOutputHill.setText(encrypt(plainText));
			}

			private String encrypt(String plainText) {
				char c[] = new char[(plainText.length())];
				for (int i = 0; i < plainText.length(); i++) {
					for (int j = 0; j < 26; j++) {
						if (p[j] == plainText.charAt(i)) {
							c[i] = ch[j];
							break;
						}
					}
				}
				return (new String(c));
			}
		});
		btnEncryptHill.setBounds(90, 259, 80, 24);
		panelHill.add(btnEncryptHill);

// textfile output
		tOutputHill = new JTextField();
		tOutputHill.setColumns(10);
		tOutputHill.setBounds(406, 78, 340, 170);
		panelHill.add(tOutputHill);

		// sự kiện btn decryption
		// method catch event for button decrypt
//___________________________________________________________________________________________
		JButton btnDecryptHill = new JButton("decrypt");

		btnDecryptHill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cipherText = tOutputHill.getText().toString().trim();
				tInputHill.setText(decrypt(cipherText));
			}

			private String decrypt(String cipherText) {
				char p1[] = new char[(cipherText.length())];
				for (int i = 0; i < cipherText.length(); i++) {
					for (int j = 0; j < 26; j++) {
						if (ch[j] == cipherText.charAt(i)) {
							p1[i] = p[j];
							break;
						}
					}
				}
				return (new String(p1));
			}
		});
		btnDecryptHill.setBounds(486, 259, 80, 24);
		panelHill.add(btnDecryptHill);

		JButton btnSave2Hill = new JButton("Save");
		btnSave2Hill.setBounds(576, 260, 80, 24);
		panelHill.add(btnSave2Hill);

		JButton btnDelete2Hill = new JButton("Delete");
		btnDelete2Hill.setBounds(666, 260, 80, 24);
		panelHill.add(btnDelete2Hill);

		JButton btnFile2Hill = new JButton("File");
		btnFile2Hill.setBounds(689, 49, 57, 23);
		panelHill.add(btnFile2Hill);

		JLabel lblPlainTextHill = new JLabel("Plain text");
		lblPlainTextHill.setBounds(10, 58, 46, 14);
		panelHill.add(lblPlainTextHill);

		JTextArea taResultHill = new JTextArea();
		taResultHill.setBounds(10, 295, 736, 117);
		panelHill.add(taResultHill);

		//
		panelHill.setBounds(0, 0, 756, 423);
		layeredPane.add(panelHill);
		panelHill.setLayout(null);
//_________________________________________________vigenere panel_________________________________
		panelVigenere = new JPanel();
		//
		tfInputVigenere = new JTextField();
		// sự kiện nhâp input
//		textFieldInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String input = textFieldInput.getText();
//
//			}
//		});
		tfInputVigenere.setColumns(10);
		tfInputVigenere.setBounds(10, 78, 340, 170);
		panelVigenere.add(tfInputVigenere);

		JButton btnFile1Vigenere = new JButton("File");
		btnFile1Vigenere.setBounds(293, 49, 57, 23);
		panelVigenere.add(btnFile1Vigenere);

		JButton btnDelete1Vigenere = new JButton("Delete");
		btnDelete1Vigenere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete1Vigenere.setBounds(270, 260, 80, 24);
		panelVigenere.add(btnDelete1Vigenere);

		JButton btnSave1Vigenere = new JButton("Save");
		btnSave1Vigenere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave1Vigenere.setBounds(180, 260, 80, 24);
		panelVigenere.add(btnSave1Vigenere);
//__________________________________________ sự kiện cho btn encrypt____________________________
		// cath events for button encrypt
		JButton btnEncryptVigenere = new JButton("Encrypt");

		btnEncryptVigenere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			String plainText = String.parseString(textFieldInput.getText());
				String plainText = tfInputVigenere.getText().toString().trim();
//				int key = Integer.parseInt(textFieldKeyPlainText.getText().trim());
				String key = tfKey1Vigenere.getText().toString().trim();

				boolean isEnCode = true;
//				encrypt(plainText, key);
				tfOutputVigenere.setText(encrypt(plainText, key, isEnCode));
			}

		});
		btnEncryptVigenere.setBounds(90, 259, 80, 24);
		panelVigenere.add(btnEncryptVigenere);

		tfKey1Vigenere = new JTextField();

		tfKey1Vigenere.setColumns(10);
		tfKey1Vigenere.setBounds(40, 258, 40, 24);
		panelVigenere.add(tfKey1Vigenere);

		JLabel lblKey1Vigenere = new JLabel("Key:");
		lblKey1Vigenere.setBounds(10, 263, 31, 14);
		panelVigenere.add(lblKey1Vigenere);

		tfOutputVigenere = new JTextField();
		tfOutputVigenere.setColumns(10);
		tfOutputVigenere.setBounds(406, 78, 340, 170);
		panelVigenere.add(tfOutputVigenere);

		tfKey2Vigenere = new JTextField();
		tfKey2Vigenere.setColumns(10);
		tfKey2Vigenere.setBounds(436, 258, 40, 24);
		panelVigenere.add(tfKey2Vigenere);

		JLabel lblKey2Vigenere = new JLabel("Key:");
		lblKey2Vigenere.setBounds(406, 263, 31, 14);
		panelVigenere.add(lblKey2Vigenere);
		// sự kiện btn decryption
//______________________________________sự kiện btn decryption____________________________
		JButton btnDecryptVigenere = new JButton("decrypt");
		btnDecryptVigenere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cipherText = tfOutputVigenere.getText().toString().trim();
				String key = tfKey2Vigenere.getText().toString().trim();
				boolean isEnCode = false;
				tfInputVigenere.setText(encrypt(cipherText, key, isEnCode));

			}

		});

		btnDecryptVigenere.setBounds(486, 259, 80, 24);
		panelVigenere.add(btnDecryptVigenere);

		JButton btnSave2Vigenere = new JButton("Save");
		btnSave2Vigenere.setBounds(576, 260, 80, 24);
		panelVigenere.add(btnSave2Vigenere);

		JButton btnDelete2Vigenere = new JButton("Delete");
		btnDelete2Vigenere.setBounds(666, 260, 80, 24);
		panelVigenere.add(btnDelete2Vigenere);

		JButton btnFile2Vigenere = new JButton("File");
		btnFile2Vigenere.setBounds(689, 49, 57, 23);
		panelVigenere.add(btnFile2Vigenere);

		JLabel lblPlainTextVigenere = new JLabel("Plain text");
		lblPlainTextVigenere.setBounds(10, 58, 46, 14);
		panelVigenere.add(lblPlainTextVigenere);

		JTextArea taResultVigenere = new JTextArea();
		taResultVigenere.setBounds(10, 295, 736, 117);
		panelVigenere.add(taResultVigenere);
		//
		panelVigenere.setBackground(new Color(0, 128, 255));
		panelVigenere.setBounds(0, 0, 756, 423);
		layeredPane.add(panelVigenere);
		panelVigenere.setLayout(null);

		panelAffine = new JPanel();
		panelAffine.setBounds(0, 0, 756, 423);
		layeredPane.add(panelAffine);
		panelAffine.setLayout(null);

		// _____________________________________Affine_______________________________________

		panelAffine = new JPanel();
		panelAffine.setBackground(new Color(192, 192, 192));

		tfInputAffine = new JTextField();
		// sự kiện nhâp input
//		textFieldInput.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				String input = textFieldInput.getText();
//
//			}
//		});
		tfInputAffine.setColumns(10);
		tfInputAffine.setBounds(10, 78, 340, 170);
		panelAffine.add(tfInputAffine);

		JButton btnFile1Affine = new JButton("File");
		btnFile1Affine.setBounds(293, 49, 57, 23);
		panelAffine.add(btnFile1Affine);

		JButton btnDelete1Affine = new JButton("Delete");
		btnDelete1Affine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDelete1Affine.setBounds(280, 260, 70, 24);
		panelAffine.add(btnDelete1Affine);

		JButton btnSave1Affine = new JButton("Save");
		btnSave1Affine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSave1Affine.setBounds(200, 260, 70, 24);
		panelAffine.add(btnSave1Affine);
//________________________________// sự kiện cho btn encrypt______________________________________________
		JButton btnEncryptAffine = new JButton("Encrypt");

		btnEncryptAffine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//			String plainText = String.parseString(textFieldInput.getText());
				String plainText = textFieldInput.getText().toString().trim();
				int key = Integer.parseInt(textFieldKeyPlainText.getText().trim());
//				encrypt(plainText, key);
				textFieldOutCipher.setText(encrypt(plainText, key));
			}

			private String encrypt(String plainText, int key) {
				char s[] = new char[plainText.length()];
				for (int i = 0; i < s.length; i++) {
					int a = (int) plainText.charAt(i) + key;
					a = a > (int) 'Z' ? a - 26 : a;
					s[i] = (char) a;
				}

				return new String(s);
			}
		});
		btnEncryptAffine.setBounds(120, 260, 70, 24);
		panelAffine.add(btnEncryptAffine);

		tfkeyA1Affine = new JTextField();

		tfkeyA1Affine.setColumns(10);
		tfkeyA1Affine.setBounds(70, 260, 40, 24);
		panelAffine.add(tfkeyA1Affine);

		JLabel lblKeyAAffine = new JLabel("Key A:");
		lblKeyAAffine.setBounds(10, 270, 41, 14);
		panelAffine.add(lblKeyAAffine);

		tfOutputAffine = new JTextField();
		tfOutputAffine.setColumns(10);
		tfOutputAffine.setBounds(406, 78, 340, 170);
		panelAffine.add(tfOutputAffine);

		JButton btnFile2Affine = new JButton("File");
		btnFile2Affine.setBounds(689, 49, 57, 23);
		panelAffine.add(btnFile2Affine);

		JLabel lblPlainTextAffile = new JLabel("Plain text");
		lblPlainTextAffile.setBounds(10, 58, 57, 14);
		panelAffine.add(lblPlainTextAffile);

		tfkeyB1Affine = new JTextField();
		tfkeyB1Affine.setColumns(10);
		tfkeyB1Affine.setBounds(70, 295, 40, 24);
		panelAffine.add(tfkeyB1Affine);

		JLabel lblKeyB = new JLabel("Key B:");
		lblKeyB.setBounds(10, 305, 41, 14);
		panelAffine.add(lblKeyB);

		JLabel lblNewLabel_1 = new JLabel("Key A:");
		lblNewLabel_1.setBounds(406, 270, 41, 14);
		panelAffine.add(lblNewLabel_1);

		tfkeyA2Affine = new JTextField();
		tfkeyA2Affine.setColumns(10);
		tfkeyA2Affine.setBounds(466, 260, 40, 24);
		panelAffine.add(tfkeyA2Affine);

		JButton btnDecryptAffine = new JButton("Decrypt");
		btnDecryptAffine.setBounds(516, 260, 70, 24);
		panelAffine.add(btnDecryptAffine);

		JButton btnSave2Affine = new JButton("Save");
		btnSave2Affine.setBounds(596, 260, 70, 24);
		panelAffine.add(btnSave2Affine);

		JButton btnDeletePlainText_1 = new JButton("Delete");
		btnDeletePlainText_1.setBounds(676, 260, 70, 24);
		panelAffine.add(btnDeletePlainText_1);

		JLabel lblKeyB_1 = new JLabel("Key B:");
		lblKeyB_1.setBounds(406, 305, 41, 14);
		panelAffine.add(lblKeyB_1);

		tfkeyB2Affine = new JTextField();
		tfkeyB2Affine.setColumns(10);
		tfkeyB2Affine.setBounds(466, 295, 40, 24);
		panelAffine.add(tfkeyB2Affine);
//
		panelAffine.setBounds(0, 0, 756, 423);
		layeredPane.add(panelAffine);
		panelAffine.setLayout(null);
		//

	}

	// phương thức chuyển các tab khi nhấn vào các button ở panel bên trái

	public void switchScreen(JPanel p) {
		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

	// nối dài key d dể bằng plain text vigenere
	private static String keyExpanding(String plainText, String key) {
		String result = "";
		int i = 0;
		while (i < plainText.length()) {
			result += String.valueOf(key.charAt(i % key.length()));
			i++;

		}
		return result;

	}
	// method encrypt and decrypt algorithm vigenere
	// if isEncode =true then encrypt and vice versa (ngược lại :V)

	public static String encrypt(String plainText, String key, boolean isEncode) {
		String result = "";
		// key đã moor rông , là được cộng với key rùi
		String keyE = keyExpanding(plainText, key);
		for (int i = 0; i < plainText.length(); i++) {
			int x = (plainText.charAt(i) + (isEncode ? keyE.charAt(i) : -keyE.charAt(i) + 26)) % 26;
			// bảng mã ascii
			result += String.valueOf((char) (x + 65));
		}
		return result;
	}
}
