package model;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class ChonThuocView extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChonThuocView frame = new ChonThuocView();
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
	public ChonThuocView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 662, 532);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 206, 209));
		panel.setBounds(41, 58, 566, 180);
		contentPane.add(panel);
		panel.setLayout(null);
		
		String[] columnNames = { "Mã thuốc", "Tên thuốc", "Đơn vị tính", "Số lượng", "Chọn" };
		
		String[][] data = { { "T01", "Panadol", "Viên", "500", "X" },
				{ "T02", "Aspirin", "Viên", "500", "X" } };

		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		table.setBounds(30, 40, 200, 300);
		scrollPane.setBounds(30, 40, 385, 116);
		panel.add(scrollPane);
		
		textField = new JTextField();
		textField.setBounds(30, 10, 385, 19);
		panel.add(textField);
		textField.setColumns(10);
		
		textField.setForeground(Color.GRAY);
		textField.setText("Tìm theo tên thuốc");
		textField.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// When the text field gains focus, remove the placeholder text
				if (textField.getText().equals("Tìm theo tên thuốc")) {
					textField.setText("");
					textField.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// When the text field loses focus, set the placeholder text if no text was
				// entered
				if (textField.getText().isEmpty()) {
					textField.setText("Tìm theo tên thuốc");
					textField.setForeground(Color.GRAY);
				}
			}
		});
		
		JButton btnNewButton = new JButton("Tìm kiếm");
		btnNewButton.setBounds(445, 9, 85, 21);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("Danh sách thuốc");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblNewLabel.setBounds(41, 10, 368, 38);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(41, 298, 566, 139);
		contentPane.add(panel_1);
		
		String[] columnNames2 = { "Mã thuốc", "Tên thuốc", "Đơn vị tính", "Số lượng", "Liều lượng", "Xóa" };
		
		String[][] data2 = { { "T09", "Thuốc cảm", "Viên", "20", "2", "X" } };

		JTable table2 = new JTable(data2, columnNames2);
		
		JScrollPane scrollPane_1 = new JScrollPane(table2, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_1.setBounds(32, 10, 511, 116);
		panel_1.add(scrollPane_1);
		
		JLabel lblDanhSchThuc = new JLabel("Danh sách thuốc đã chọn");
		lblDanhSchThuc.setFont(new Font("Tahoma", Font.PLAIN, 35));
		lblDanhSchThuc.setBounds(41, 248, 434, 38);
		contentPane.add(lblDanhSchThuc);
		
		JButton btnNewButton_1 = new JButton("Lập đơn");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(249, 447, 129, 38);
		contentPane.add(btnNewButton_1);
	}
}
