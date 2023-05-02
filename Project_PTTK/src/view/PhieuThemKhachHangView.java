package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class PhieuThemKhachHangView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuThemKhachHangView frame = new PhieuThemKhachHangView();
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
	public PhieuThemKhachHangView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 372);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(45, 57, 320, 225);
		panel.setBackground(new Color(192, 192, 192));
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Tên đoàn");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(31, 43, 73, 19);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(131, 45, 148, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblTrngon = new JLabel("Trưởng đoàn");
		lblTrngon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTrngon.setBounds(31, 87, 88, 19);
		panel.add(lblTrngon);
		
		JLabel lblNewLabel_3 = new JLabel("Tên đoàn");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(31, 130, 73, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tên đoàn");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(31, 173, 73, 19);
		panel.add(lblNewLabel_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "1972111111", "1278942222"}));
		comboBox.setBounds(131, 88, 148, 21);
		panel.add(comboBox);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(131, 130, 106, 19);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(131, 173, 106, 19);
		panel.add(dateChooser_1);
		
		JLabel lblNewLabel_1 = new JLabel("Nhập thông tin đoàn");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(24, 10, 371, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setBounds(184, 292, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBackground(new Color(128, 128, 255));
		btnNewButton_1.setBounds(310, 292, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
