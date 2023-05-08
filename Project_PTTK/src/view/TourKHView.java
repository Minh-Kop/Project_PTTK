package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.SwingConstants;

public class TourKHView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTmTheoTn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TourKHView frame = new TourKHView();
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
	public TourKHView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(14, 1, 0, 0));

		JButton btnNewButton_x = new JButton("Đăng xuất");
		panel.add(btnNewButton_x);
		
		JButton btnNewButton_0 = new JButton("Phòng");
		panel.add(btnNewButton_0);

		JButton btnNewButton = new JButton("Đặt phòng");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Hóa đơn");
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("QL đoàn");
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("QL khách hàng");
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("QL phòng");
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("QL loại phòng");
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("QL lịch dịch vụ");
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("QL dịch vụ");
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("QL loại dịch vụ");
		panel.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("QL tour");
		panel.add(btnNewButton_9);

		JButton btnNewButton_10 = new JButton("QL đặt tour");
		panel.add(btnNewButton_10);

		JButton btnNewButton_11 = new JButton("QL nhân viên");
		panel.add(btnNewButton_11);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new BorderLayout(0, 10));

		String[] columnNames = { "Mã phiếu", "Tên khách hàng", "Ngày lập phiếu", "Tên nhân viên", "Chi tiết", "Xóa" };

		String[][] data = { { "PD01", "Trần Kim Tiên", "2/1/2023", "Lê Thị Chung", "...", "X" },
				{ "PD02", "Trần Thị Tiên", "4/1/2023", "Lê Thị Chung", "...", "X" },
				{ "PD03", "Trần Minh Khôi", "8/1/2023", "Lê Kim Anh", "...", "X" },
				{ "PD04", "Trần Minh Khoa", "8/1/2023", "Lê Kim Anh", "...", "X" },
				{ "PD05", "Trần Minh Khoa", "11/2/2023", "Lê Kim Anh", "...", "X" },
				{ "PD06", "Trần Minh Khoa", "9/3/2023", "Lê Kim Anh", "...", "X" },
				{ "PD07", "Trần Minh Tiến", "9/3/2023", "Lê Kim Anh", "...", "X" },
				{ "PD08", "Trần Anh Khoa", "12/3/2023", "Lê Kim Anh", "...", "X" },
				{ "PD09", "Trần Minh Khương", "21/3/2023", "Lê Kim Anh", "...", "X" },
				{ "PD10", "Trần Minh Khoa", "29/3/2023", "Lê Kim Anh", "...", "X" },
				{ "PD11", "Trần Minh Khôi", "29/3/2023", "Lê Kim Anh", "...", "X" } };

		JTable table = new JTable(data, columnNames);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"T01", "KH01", "30/4/2023", "2", "true", "Kh\u00F4ng", "X"},
				{"T02", "KH02", "1/4/2023", "3", "false", "Kh\u00F4ng", "X"},
				{"T03", "KH03", "15/6/2023", "1", "true", "Kh\u00F4ng", "X"},
			},
			new String[] {
				"M\u00E3 tour", "M\u00E3 Kh\u00E1ch H\u00E0ng", "Th\u1EDDi Gian", "S\u1ED1 Ng\u01B0\u1EDDi", "\u0110\u01B0a \u0111\u00F3n", "Nhu c\u1EA7u \u0111\u1EB7c bi\u1EC7t", "X\u00F3a"
			}
		));
		table.getColumnModel().getColumn(1).setPreferredWidth(99);
		table.getColumnModel().getColumn(5).setPreferredWidth(116);
		table.setBounds(30, 40, 200, 300);
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JButton btnNewButton_12_1 = new JButton("Thêm đăng ký tour");
		btnNewButton_12_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(btnNewButton_12_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		txtTmTheoTn = new JTextField();
		txtTmTheoTn.setText("Tìm kiếm theo tour");
		txtTmTheoTn.setToolTipText("Tìm theo tên khách hàng");
		panel_2.add(txtTmTheoTn, BorderLayout.CENTER);
		txtTmTheoTn.setColumns(10);

		// Set the foreground color to gray to indicate the placeholder text
		txtTmTheoTn.setForeground(Color.GRAY);
		txtTmTheoTn.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// When the text field gains focus, remove the placeholder text
				if (txtTmTheoTn.getText().equals("Tìm theo tên khách hàng")) {
					txtTmTheoTn.setText("");
					txtTmTheoTn.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// When the text field loses focus, set the placeholder text if no text was
				// entered
				if (txtTmTheoTn.getText().isEmpty()) {
					txtTmTheoTn.setText("Tìm theo tên khách hàng");
					txtTmTheoTn.setForeground(Color.GRAY);
				}
			}
		});

		JButton btnNewButton_12 = new JButton("Tìm kiếm");
		btnNewButton_12.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(btnNewButton_12, BorderLayout.EAST);

	}

}
