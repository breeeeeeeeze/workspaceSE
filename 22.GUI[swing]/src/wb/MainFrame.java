package wb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.JFormattedTextField;

public class MainFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	public MainFrame() {
		setTitle("First Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel.setBounds(129, 89, 57, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("PW");
		lblNewLabel_1.setFont(new Font("맑은 고딕", Font.BOLD | Font.ITALIC, 29));
		lblNewLabel_1.setBounds(132, 172, 57, 36);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(268, 170, 286, 44);
		contentPane.add(textField_1);
		
		JButton btnNewButton = new JButton("ID/PW 찾기");
		btnNewButton.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton.setBounds(111, 360, 185, 62);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("로그인");
		btnNewButton_1.setFont(new Font("맑은 고딕", Font.BOLD, 18));
		btnNewButton_1.setBounds(392, 360, 185, 62);
		contentPane.add(btnNewButton_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("ID 저장하기");
		chckbxNewCheckBox.setBackground(new Color(255, 240, 245));
		chckbxNewCheckBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		chckbxNewCheckBox.setBounds(86, 285, 109, 42);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("자동 로그인");
		chckbxNewCheckBox_1.setForeground(new Color(255, 192, 203));
		chckbxNewCheckBox_1.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		chckbxNewCheckBox_1.setBounds(211, 284, 115, 43);
		contentPane.add(chckbxNewCheckBox_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("");
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setForeground(new Color(233, 150, 122));
		comboBox.setFont(new Font("맑은 고딕", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"로그인 방법 선택", "-------------------", "카카오", "구글", "네이버"}));
		comboBox.setBounds(394, 283, 183, 44);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(268, 89, 286, 44);
		contentPane.add(textField);
	}
}
