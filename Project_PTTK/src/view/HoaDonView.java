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

public class HoaDonView extends JFrame {

	private JPanel contentPane;
	private JTable DichVuDaChonTable;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HoaDonView frame = new HoaDonView();
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
	public HoaDonView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 496);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(37, 56, 617, 376);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel KHNameLabel = new JLabel("Trần Minh Huy");
		KHNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		KHNameLabel.setBounds(38, 9, 171, 46);
		panel.add(KHNameLabel);

		String[] columnNames_2 = { "Dịch vụ", "Loại dịch vụ", "Mã thời gian", "Ngày thực hiện", "Số lượng",
				"Thành tiền" };

		String[][] data_2 = { { "Massage mặt", "Massage", "T34", "25/4/2023", "1", "50000" },
							  { "Tiền phòng 70%", "", "", "", "", "6500000"} };

		DichVuDaChonTable = new JTable(data_2, columnNames_2);
		DichVuDaChonTable.setBounds(67, 107, 223, 125);
		TableColumnModel columnModel_2 = DichVuDaChonTable.getColumnModel();
		columnModel_2.getColumn(0).setPreferredWidth(136); // set độ rộng cột "Dịch vụ" là 120 pixels
		columnModel_2.getColumn(1).setPreferredWidth(100); // set độ rộng cột "Loại dịch vụ" là 100 pixels
		columnModel_2.getColumn(2).setPreferredWidth(80); // set độ rộng cột "Mã thời gian" là 80 pixels
		columnModel_2.getColumn(3).setPreferredWidth(90); // set độ rộng cột "Ngày thực hiện" là 100 pixels
		columnModel_2.getColumn(4).setPreferredWidth(60); // set độ rộng cột "Số lượng" là 60 pixels
		columnModel_2.getColumn(5).setPreferredWidth(80); // set độ rộng cột "Thành tiền" là 80 pixels
//
//for (int i = 0; i < columnModel.getColumnCount(); i++) {
//    TableColumn column = columnModel.getColumn(i);
//    System.out.println(column.getHeaderValue() + " width: " + column.getPreferredWidth());
//}
		DichVuDaChonTable.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		JScrollPane scrollPane_2 = new JScrollPane(DichVuDaChonTable, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		scrollPane_2.setBounds(38, 126, 549, 180);
		panel.add(scrollPane_2);
		
		JLabel txtNgayLapHDLabel = new JLabel("Ngày lập hóa đơn:");
		txtNgayLapHDLabel.setBounds(38, 51, 105, 16);
		panel.add(txtNgayLapHDLabel);
		
		JLabel ngayLapHoaDonLabel = new JLabel("26/4/2023");
		ngayLapHoaDonLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		ngayLapHoaDonLabel.setBounds(153, 51, 68, 16);
		panel.add(ngayLapHoaDonLabel);
		
		JLabel lblMHan = new JLabel("Mã hóa đơn:");
		lblMHan.setBounds(38, 75, 91, 16);
		panel.add(lblMHan);
		
		JLabel lblHd = new JLabel("HD001");
		lblHd.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblHd.setBounds(153, 75, 68, 16);
		panel.add(lblHd);
		
		JLabel txtTenLeTanLabel = new JLabel("Tên lễ tân:");
		txtTenLeTanLabel.setBounds(327, 51, 91, 16);
		panel.add(txtTenLeTanLabel);
		
		JLabel tenLeTanLabel = new JLabel("Nguyễn Hoàng Anh");
		tenLeTanLabel.setFont(new Font("Tahoma", Font.BOLD, 10));
		tenLeTanLabel.setBounds(452, 51, 129, 16);
		panel.add(tenLeTanLabel);
		
		JLabel txtNgayLapHDLabel_3 = new JLabel("Số ngày:");
		txtNgayLapHDLabel_3.setBounds(327, 75, 105, 16);
		panel.add(txtNgayLapHDLabel_3);
		
		JLabel ngayLapHoaDonLabel_3 = new JLabel("5");
		ngayLapHoaDonLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		ngayLapHoaDonLabel_3.setBounds(452, 75, 68, 16);
		panel.add(ngayLapHoaDonLabel_3);
		
		JLabel txtNgayLapHDLabel_4 = new JLabel("Tên đoàn");
		txtNgayLapHDLabel_4.setBounds(327, 100, 91, 16);
		panel.add(txtNgayLapHDLabel_4);
		
		JLabel ngayLapHoaDonLabel_4 = new JLabel("");
		ngayLapHoaDonLabel_4.setFont(new Font("Tahoma", Font.BOLD, 10));
		ngayLapHoaDonLabel_4.setBounds(452, 100, 159, 16);
		panel.add(ngayLapHoaDonLabel_4);
		
		JLabel lblMHan_1 = new JLabel("Mã phòng:");
		lblMHan_1.setBounds(38, 100, 91, 16);
		panel.add(lblMHan_1);
		
		JLabel lblHd_1 = new JLabel("P01");
		lblHd_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblHd_1.setBounds(153, 101, 68, 16);
		panel.add(lblHd_1);
		
		JLabel txtNgayLapHDLabel_1 = new JLabel("Tổng tiền:");
		txtNgayLapHDLabel_1.setBounds(418, 316, 62, 13);
		panel.add(txtNgayLapHDLabel_1);
		
		JLabel ngayLapHoaDonLabel_1 = new JLabel("6550000 VND");
		ngayLapHoaDonLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		ngayLapHoaDonLabel_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		ngayLapHoaDonLabel_1.setBounds(482, 316, 105, 13);
		panel.add(ngayLapHoaDonLabel_1);
		
		JButton btnXcNhn = new JButton("Xác nhận");
		btnXcNhn.setBackground(new Color(147, 112, 219));
		btnXcNhn.setBounds(349, 339, 100, 21);
		panel.add(btnXcNhn);
		
		JButton ThoatButton = new JButton("Thoát");
		ThoatButton.setBackground(new Color(147, 112, 219));
		ThoatButton.setBounds(487, 339, 100, 21);
		panel.add(ThoatButton);
//		panel.add(DichVuDaChonTable);

		JLabel roomNameLabel = new JLabel("Hóa đơn");
		roomNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		roomNameLabel.setBounds(275, 10, 114, 36);
		contentPane.add(roomNameLabel);
	}
}
