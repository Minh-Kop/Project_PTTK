package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JCheckBox;

public class DKTour extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DKTour frame = new DKTour();
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
	public DKTour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(139, 54, 165, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Mã KH");
		lblNewLabel.setBounds(55, 57, 45, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mã tour");
		lblNewLabel_1.setBounds(55, 100, 45, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Đăng ký tour");
		lblNewLabel_2.setBounds(175, 10, 113, 34);
		contentPane.add(lblNewLabel_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(139, 97, 165, 19);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Thời gian");
		lblNewLabel_1_1.setBounds(55, 141, 45, 13);
		contentPane.add(lblNewLabel_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(139, 138, 165, 19);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Số lượng");
		lblNewLabel_1_1_1.setBounds(55, 177, 45, 13);
		contentPane.add(lblNewLabel_1_1_1);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(139, 174, 30, 20);
		contentPane.add(spinner);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Đưa đón");
		chckbxNewCheckBox.setBounds(205, 173, 93, 21);
		contentPane.add(chckbxNewCheckBox);
		
		textField_3 = new JTextField();
		textField_3.setBounds(175, 204, 129, 59);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Nhu cầu đặc biệt");
		lblNewLabel_1_1_1_1.setBounds(55, 205, 81, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
	}
}
