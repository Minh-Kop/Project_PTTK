package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class ThemDvPhong extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemDvPhong frame = new ThemDvPhong();
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
	public ThemDvPhong() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Đăng ký dịch vụ");
		lblNewLabel.setBounds(159, 27, 104, 13);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Phòng 100");
		lblNewLabel_1.setBounds(42, 61, 77, 13);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Danh sách dịch vụ");
		lblNewLabel_2.setBounds(31, 99, 149, 13);
		contentPane.add(lblNewLabel_2);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(233, 137, 30, 20);
		contentPane.add(spinner);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(349, 136, 85, 21);
		contentPane.add(btnNewButton);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(233, 152, 30, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(233, 171, 30, 20);
		contentPane.add(spinner_2);
		
		JButton btnNewButton_1 = new JButton("Thêm");
		btnNewButton_1.setBounds(349, 151, 85, 21);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Thêm");
		btnNewButton_2.setBounds(349, 167, 85, 21);
		contentPane.add(btnNewButton_2);
		
		textField = new JTextField();
		textField.setBounds(273, 171, 77, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setSurrendersFocusOnKeystroke(true);
		table.setColumnSelectionAllowed(true);
		table.setCellSelectionEnabled(true);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"7 up", "10000"},
				{"Sting", "15000"},
				{"Spa", "450000"},
			},
			new String[] {
				"D\u1ECBch v\u1EE5", "\u0110\u01A1n gi\u00E1"
			}
		));
		table.setBounds(10, 139, 213, 48);
		contentPane.add(table);
		
		JLabel lblNewLabel_3 = new JLabel("Thời gian sử dụng");
		lblNewLabel_3.setBounds(256, 99, 139, 13);
		contentPane.add(lblNewLabel_3);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(273, 152, 77, 19);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(273, 137, 77, 19);
		contentPane.add(textField_2);
	}
}
