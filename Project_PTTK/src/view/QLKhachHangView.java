package src.view;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class QLKhachHangView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTmTheoTn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QLKhachHangView frame = new QLKhachHangView();
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
	public QLKhachHangView() {
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


		String[] columnNames = { "Mã khách hàng", "CCCD", "Tên khách hàng", "Ngày sinh", "SDT", "Địa chỉ", "Gmail", "Chỉnh sửa", "Xóa" };

		String[][] data = { { "KH01", "079212345678", "Trần Minh Đạo", "19/8/1991", "0918645789", "Quận 5", "tg@gmail.com", "...","X" },
				{ "KH02", "079212345679", "Trần Văn Khoa", "19/8/1987", "0918625789", "Quận 1", "tvk@gmail.com", "...","X" },
				{ "KH03", "079212345648", "Trần Cảnh ", "9/7/1995", "0918645781", "Quận 3", "tgdg@gmail.com", "...","X" } };
		
		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BoxLayout(panel_2, BoxLayout.X_AXIS));
		
		txtTmTheoTn = new JTextField();
		panel_2.add(txtTmTheoTn);
		txtTmTheoTn.setColumns(10);
		
		  // Set the foreground color to gray to indicate the placeholder text
		txtTmTheoTn.setForeground(Color.GRAY);
		txtTmTheoTn.setText("Tìm theo tên khách hàng");
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
	                // When the text field loses focus, set the placeholder text if no text was entered
	                if (txtTmTheoTn.getText().isEmpty()) {
	                	txtTmTheoTn.setText("Tìm theo tên khách hàng");
	                	txtTmTheoTn.setForeground(Color.GRAY);
	                }
	            }
	        });
		
		JButton btnNewButton_12 = new JButton("Thêm khách hàng");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnSearch = new JButton("Tìm");
		panel_2.add(btnSearch);
		panel_2.add(btnNewButton_12);
		
	}

}
