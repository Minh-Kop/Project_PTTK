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
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JSeparator;
import java.awt.Component;
import javax.swing.ScrollPaneConstants;
import javax.swing.JTextField;

public class ThemDichVuPhongKhongTheoNgayKHView extends JFrame {

	private JPanel contentPane;
	private JTable DichVuDaChonTable;
	private JTable DichVuTable;
	private JTextField txtTimDichVu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemDichVuPhongKhongTheoNgayKHView frame = new ThemDichVuPhongKhongTheoNgayKHView();
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
	public ThemDichVuPhongKhongTheoNgayKHView() {
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
		dateLabel.setBounds(379, 9, 150, 46);
		panel.add(dateLabel);

		String[] columnNames_1 = { "Dịch vụ", "Loại dịch vụ", "Giá", "Thêm" };

		String[][] data_1 = { { "Kem dâu", "Đồ ăn", "15000", "+" },
				{ "Cơm bò", "Đồ ăn", "50000", "+" } };

		DichVuTable = new JTable(data_1, columnNames_1);
		DichVuTable.setBounds(67, 107, 223, 125);
		TableColumnModel columnModel = DichVuTable.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(90); // set độ rộng cột "Dịch vụ" là 120 pixels
		columnModel.getColumn(1).setPreferredWidth(80); // set độ rộng cột "Loại dịch vụ" là 100 pixels
		columnModel.getColumn(2).setPreferredWidth(50); // set độ rộng cột "Mã thời gian" là 80 pixels
		columnModel.getColumn(3).setPreferredWidth(50); // set độ rộng cột "Ngày thực hiện" là 100 pixels
//		
//		for (int i = 0; i < columnModel.getColumnCount(); i++) {
//		    TableColumn column = columnModel.getColumn(i);
//		    System.out.println(column.getHeaderValue() + " width: " + column.getPreferredWidth());
//		}
		DichVuTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane = new JScrollPane(DichVuTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(28, 123, 260, 169);
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

		String[] columnNames_2 = { "Dịch vụ", "Loại dịch vụ", "Ngày thực hiện", "Số lượng",
				"Thành tiền", "Xóa" };

		String[][] data_2 = { { "Mỳ ý", "Đồ ăn", "25/4/2023", "1", "45000", "X" } };

		DichVuDaChonTable = new JTable(data_2, columnNames_2);
		DichVuDaChonTable.setBounds(67, 107, 223, 125);
		TableColumnModel columnModel_2 = DichVuDaChonTable.getColumnModel();
		columnModel_2.getColumn(0).setPreferredWidth(90); // set độ rộng cột "Dịch vụ" là 120 pixels
		columnModel_2.getColumn(1).setPreferredWidth(80); // set độ rộng cột "Loại dịch vụ" là 100 pixels
		columnModel_2.getColumn(2).setPreferredWidth(90); // set độ rộng cột "Mã thời gian" là 80 pixels
		columnModel_2.getColumn(3).setPreferredWidth(60); // set độ rộng cột "Ngày thực hiện" là 100 pixels
		columnModel_2.getColumn(4).setPreferredWidth(80); // set độ rộng cột "Số lượng" là 60 pixels
		columnModel_2.getColumn(5).setPreferredWidth(50); // set độ rộng cột "Thành tiền" là 80 pixels
//
//for (int i = 0; i < columnModel.getColumnCount(); i++) {
//    TableColumn column = columnModel.getColumn(i);
//    System.out.println(column.getHeaderValue() + " width: " + column.getPreferredWidth());
//}
		DichVuDaChonTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane_2 = new JScrollPane(DichVuDaChonTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane_2.setBounds(327, 123, 260, 169);
		panel.add(scrollPane_2);

		JComboBox cbbLDV = new JComboBox();
		cbbLDV.setBackground(new Color(224, 255, 255));
		cbbLDV.setModel(new DefaultComboBoxModel(new String[] { "", "Đồ ăn", "Thức uống", "Spa", "Hồ bơi" }));
		cbbLDV.setBounds(164, 63, 124, 21);
		panel.add(cbbLDV);

		txtTimDichVu = new JTextField();
		txtTimDichVu.setBounds(28, 94, 183, 19);
		panel.add(txtTimDichVu);
		txtTimDichVu.setColumns(10);
		
		// Set the foreground color to gray to indicate the placeholder text
		txtTimDichVu.setForeground(Color.GRAY);
		txtTimDichVu.setText("Tìm dịch vụ");
		txtTimDichVu.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// When the text field gains focus, remove the placeholder text
				if (txtTimDichVu.getText().equals("Tìm dịch vụ")) {
					txtTimDichVu.setText("");
					txtTimDichVu.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// When the text field loses focus, set the placeholder text if no text was
				// entered
				if (txtTimDichVu.getText().isEmpty()) {
					txtTimDichVu.setText("Tìm dịch vụ");
					txtTimDichVu.setForeground(Color.GRAY);
				}
			}
		});

		JButton EnterButton = new JButton("Enter");
		EnterButton.setBounds(221, 94, 67, 21);
		panel.add(EnterButton);
		
		JComboBox cbbTheoNgay = new JComboBox();
		cbbTheoNgay.setBackground(new Color(224, 255, 255));
		cbbTheoNgay.setModel(new DefaultComboBoxModel(new String[] {"Theo ngày", "Không theo ngày"}));
		cbbTheoNgay.setBounds(28, 63, 126, 21);
		panel.add(cbbTheoNgay);
//		panel.add(DichVuDaChonTable);

		JLabel roomNameLabel = new JLabel("Thêm dịch vụ");
		roomNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		roomNameLabel.setBounds(244, 10, 224, 36);
		contentPane.add(roomNameLabel);
	}
}
