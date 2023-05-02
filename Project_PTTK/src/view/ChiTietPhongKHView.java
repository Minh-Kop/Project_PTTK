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

public class ChiTietPhongKHView extends JFrame {

	private JPanel contentPane;
	private JTable DichVuTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChiTietPhongKHView frame = new ChiTietPhongKHView();
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
	public ChiTietPhongKHView() {
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

		JLabel KHNameLabel = new JLabel("Trần Văn A");
		KHNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		KHNameLabel.setBounds(28, 9, 117, 46);
		panel.add(KHNameLabel);

		JLabel dateLabel = new JLabel("20/4/2023");
		dateLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dateLabel.setBounds(256, 9, 100, 46);
		panel.add(dateLabel);

		JLabel numberOfDaysLabel = new JLabel("3 ngày");
		numberOfDaysLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		numberOfDaysLabel.setBounds(498, 10, 72, 45);
		panel.add(numberOfDaysLabel);

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
		scrollPane.setBounds(28, 99, 286, 125);
		panel.add(scrollPane);
		
		JPanel CapNhatPanel = new JPanel();
		CapNhatPanel.setBackground(SystemColor.inactiveCaption);
		CapNhatPanel.setBounds(377, 99, 210, 196);
		panel.add(CapNhatPanel);
		CapNhatPanel.setLayout(null);
		
		JLabel TinhTrangThueLabel = new JLabel("Cập nhật tình trạng thuê");
		TinhTrangThueLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TinhTrangThueLabel.setBounds(10, 10, 184, 25);
		CapNhatPanel.add(TinhTrangThueLabel);
		
		JLabel TinhTrangDonDepLabel = new JLabel("Cập nhật tình trạng dọn dẹp");
		TinhTrangDonDepLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		TinhTrangDonDepLabel.setBounds(10, 102, 216, 25);
		CapNhatPanel.add(TinhTrangDonDepLabel);
		
		JComboBox ThueComboBox = new JComboBox();
		ThueComboBox.setModel(new DefaultComboBoxModel(new String[] {"Phòng đã đặt", "Phòng đang thuê", "Phòng đang trống"}));
		ThueComboBox.setBounds(38, 58, 156, 21);
		CapNhatPanel.add(ThueComboBox);
		
		JComboBox DonDepComboBox = new JComboBox();
		DonDepComboBox.setModel(new DefaultComboBoxModel(new String[] {"Đã dọn dẹp", "Đang dọn dẹp", "Chưa dọn dẹp"}));
		DonDepComboBox.setBounds(38, 137, 156, 21);
		CapNhatPanel.add(DonDepComboBox);
		
		JButton ThemDichVuButton = new JButton("Thêm dịch vụ");
		ThemDichVuButton.setBounds(126, 234, 117, 33);
		panel.add(ThemDichVuButton);
		
		JButton ThanhToanButton = new JButton("Thanh toán");
		ThanhToanButton.setBounds(214, 318, 100, 21);
		panel.add(ThanhToanButton);
		
		JButton LuuButton = new JButton("Lưu");
		LuuButton.setBounds(349, 318, 100, 21);
		panel.add(LuuButton);
		
		JButton ThoatButton = new JButton("Thoát");
		ThoatButton.setBounds(487, 318, 100, 21);
		panel.add(ThoatButton);
//		panel.add(DichVuTable);

		JLabel roomNameLabel = new JLabel("P101");
		roomNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 35));
		roomNameLabel.setBounds(303, 10, 82, 36);
		contentPane.add(roomNameLabel);
	}
}
