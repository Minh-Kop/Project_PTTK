package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JTable;
import java.awt.Component;

public class PhieuDatPhongView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhieuDatPhongView frame = new PhieuDatPhongView();
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
	public PhieuDatPhongView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 917, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(40, 65, 825, 381);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thông tin phòng");
		lblNewLabel.setBounds(469, 10, 261, 37);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JLabel lblNewLabel_2 = new JLabel("Thông tin khách hàng");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_2.setBounds(22, 10, 329, 37);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Họ tên");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(54, 68, 45, 19);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("CCCD");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_1.setBounds(54, 105, 45, 19);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("Ngày sinh");
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_2.setBounds(54, 144, 66, 19);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("SDT");
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_3.setBounds(54, 187, 45, 19);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("Địa chỉ");
		lblNewLabel_3_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4.setBounds(54, 227, 53, 19);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_4_1 = new JLabel("Đoàn");
		lblNewLabel_3_4_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_1.setBounds(54, 314, 53, 19);
		panel.add(lblNewLabel_3_4_1);
		
		JLabel lblNewLabel_3_4_2 = new JLabel("Email");
		lblNewLabel_3_4_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_2.setBounds(54, 273, 53, 19);
		panel.add(lblNewLabel_3_4_2);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField.setBounds(129, 70, 159, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_1.setColumns(10);
		textField_1.setBounds(129, 107, 159, 19);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_2.setColumns(10);
		textField_2.setBounds(130, 146, 159, 19);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_3.setColumns(10);
		textField_3.setBounds(129, 189, 159, 19);
		panel.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_4.setColumns(10);
		textField_4.setBounds(129, 229, 159, 19);
		panel.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textField_5.setColumns(10);
		textField_5.setBounds(129, 275, 159, 19);
		panel.add(textField_5);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "D01", "D02", "D03", "D04"}));
		comboBox.setBounds(129, 315, 74, 21);
		panel.add(comboBox);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(Color.BLACK);
		separator.setBackground(Color.BLACK);
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(374, 60, 15, 294);
		panel.add(separator);
		
		JLabel lblNewLabel_3_5 = new JLabel("Ngày đến");
		lblNewLabel_3_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_5.setBounds(406, 73, 65, 19);
		panel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("Ngày đi");
		lblNewLabel_3_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_6.setBounds(597, 73, 58, 19);
		panel.add(lblNewLabel_3_6);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(481, 73, 106, 19);
		panel.add(dateChooser);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(661, 73, 106, 19);
		panel.add(dateChooser_1);
		
		JLabel lblNewLabel_3_2_1 = new JLabel("Danh sách phòng trống");
		lblNewLabel_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2_1.setBounds(412, 124, 197, 28);
		panel.add(lblNewLabel_3_2_1);
		
		JLabel lblNewLabel_3_2_1_1 = new JLabel("Phòng đã chọn");
		lblNewLabel_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_3_2_1_1.setBounds(661, 124, 122, 28);
		panel.add(lblNewLabel_3_2_1_1);
		
		JLabel lblNewLabel_3_4_1_1 = new JLabel("Loại phòng");
		lblNewLabel_3_4_1_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3_4_1_1.setBounds(418, 163, 85, 19);
		panel.add(lblNewLabel_3_4_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "Phòng đôi", "Phòng đơn", "Phòng suite"}));
		comboBox_1.setBounds(495, 162, 103, 21);
		panel.add(comboBox_1);
		
		
		String[] columnNames = { "Số phòng", "Loại phòng", "Thêm" };

		String[][] data = { { "P11", "Phòng đơn", "+" },
				{ "P12", "Phòng đơn", "+" },
				{ "P11", "Phòng đơn", "+" },
				{ "P13", "Phòng đơn", "+" },
				{ "P14", "Phòng đơn", "+" },
				{ "P24", "Phòng đôi", "+" },
				{ "P21", "Phòng đôi", "+" },
				{ "P94", "Phòng suite", "+" } };
		
		JTable table = new JTable(data, columnNames);
		table.setBounds(502, 338, 122, 90);
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(426, 204, 168, 129);
		panel.add(scrollPane);
		
		String[] columnNames2 = { "Số phòng", "Loại phòng", "Xóa" };

		String[][] data2 = { { "P23", "Phòng đôi", "x" },
				{ "P87", "Phòng suite", "x" } };
		
		JTable table2 = new JTable(data2, columnNames2);
		table2.setBounds(602, 338, 122, 90);
		JScrollPane scrollPane2 = new JScrollPane(table2);
		scrollPane2.setBounds(641, 204, 168, 129);
		panel.add(scrollPane2);
		
		JLabel lblNewLabel_1 = new JLabel("Đặt phòng");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 35));
		lblNewLabel_1.setBounds(351, 12, 189, 43);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Lưu");
		btnNewButton.setBackground(new Color(128, 128, 255));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(619, 456, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		btnNewButton_1.setBackground(new Color(128, 128, 255));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(745, 456, 85, 21);
		contentPane.add(btnNewButton_1);
	}
}
