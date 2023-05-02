package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.SystemColor;
import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;

public class ThemDichVuPhongKHView extends JFrame {

	private JPanel contentPane;
	private JTable DichVuTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemDichVuPhongKHView frame = new ThemDichVuPhongKHView();
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
	public ThemDichVuPhongKHView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 473);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(37, 56, 617, 359);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel KHNameLabel = new JLabel("Danh sách dịch vụ");
		KHNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		KHNameLabel.setBounds(71, 9, 171, 46);
		panel.add(KHNameLabel);

		JLabel dateLabel = new JLabel("Dịch vụ đã chọn");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateLabel.setBounds(397, 9, 150, 46);
		panel.add(dateLabel);

		String[] columnNames = { "Dịch vụ", "Loại dịch vụ", "Mã thời gian", "Ngày thực hiện", "Số lượng",
				"Thành tiền" };

		String[][] data = { { "Mỳ ý", "Món ăn", "", "25/4/2023", "1", "45000" },
				{ "Massage chân", "Massage", "T34", "25/4/2023", "1", "50000" } };

		DichVuTable = new JTable(data, columnNames);
		DichVuTable.setBounds(67, 107, 223, 125);
		TableColumnModel columnModel = DichVuTable.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(100); // set độ rộng cột "Dịch vụ" là 120 pixels
		columnModel.getColumn(1).setPreferredWidth(80); // set độ rộng cột "Loại dịch vụ" là 100 pixels
		columnModel.getColumn(2).setPreferredWidth(80); // set độ rộng cột "Mã thời gian" là 80 pixels
		columnModel.getColumn(3).setPreferredWidth(90); // set độ rộng cột "Ngày thực hiện" là 100 pixels
		columnModel.getColumn(4).setPreferredWidth(70); // set độ rộng cột "Số lượng" là 60 pixels
		columnModel.getColumn(5).setPreferredWidth(80); // set độ rộng cột "Thành tiền" là 80 pixels
		
		for (int i = 0; i < columnModel.getColumnCount(); i++) {
		    TableColumn column = columnModel.getColumn(i);
		    System.out.println(column.getHeaderValue() + " width: " + column.getPreferredWidth());
		}
		DichVuTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(DichVuTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(28, 107, 260, 185);
		panel.add(scrollPane);
		
		JButton LuuButton = new JButton("Lưu");
		LuuButton.setBackground(new Color(147, 112, 219));
		LuuButton.setBounds(349, 318, 100, 21);
		panel.add(LuuButton);
		
		JButton ThoatButton = new JButton("Thoát");
		ThoatButton.setBackground(new Color(147, 112, 219));
		ThoatButton.setBounds(487, 318, 100, 21);
		panel.add(ThoatButton);
		
		JSeparator separator = new JSeparator();
		separator.setForeground(new Color(0, 0, 0));
		separator.setBackground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(307, 10, 13, 298);
		panel.add(separator);
		
		JScrollPane scrollPane_1 = new JScrollPane((Component) null, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_1.setBounds(327, 107, 260, 185);
		panel.add(scrollPane_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(28, 63, 66, 21);
		panel.add(comboBox);
//		panel.add(DichVuTable);

		JLabel roomNameLabel = new JLabel("Thêm dịch vụ");
		roomNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		roomNameLabel.setBounds(227, 10, 224, 36);
		contentPane.add(roomNameLabel);
	}
}
