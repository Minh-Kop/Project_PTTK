package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CheckInView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckInView frame = new CheckInView();
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
	public CheckInView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(12, 1, 0, 0));

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
		
		
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(3, 2, 10, 0));
		
		JLabel lblNewLabel = new JLabel("Tên khách hàng");
		panel_2.add(lblNewLabel);
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_14 = new JButton("Tìm kiếm");
		panel_2.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("Thêm dịch vụ");
		panel_2.add(btnNewButton_15);
		
		JButton btnNewButton_12 = new JButton("Chỉnh sửa");
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Check in");
		panel_2.add(btnNewButton_13);


		String[] columnNames = { "Phòng", "Người đặt", "Số lượng", "Thời gian (ngày)", "Ngày đặt", "Trạng thái" };

		String[][] data = { { "P01", "Trống", "0", "0", "", "Đã dọn dẹp" },
				{ "P02", "Trần Trọng B", "1", "3", "2/2/2023", "Đã dọn dẹp" },
				{ "P03", "Võ Thị C", "3", "2", "3/4/2023", "Đã dọn dẹp" },
				{ "P04", "Trống", "0", "0", "", "Chưa dọn dẹp" },
				{ "P03", "Võ Thị D", "3", "2", "3/4/2023", "Đã dọn dẹp" },
				{ "P03", "Võ Thị E", "2", "3", "13/4/2023", "Đã dọn dẹp" },
				{ "P03", "Võ Thị F", "1", "1", "30/8/2023", "Đã dọn dẹp" },
				{ "P03", "Trống", "4", "2", "23/6/2023", "Đã dọn dẹp" },
				{ "P03", "Trống", "1", "3", "31/1/2023", "Chưa dọn dẹp" },
				{ "P03", "Trống", "1", "1", "28/2/2023", "Chưa dọn dẹp" },
				{ "P03", "Võ Thị F", "2", "2", "17/3/2023", "Đã dọn dẹp" } };
		
		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		JScrollPane scrollPane = new JScrollPane(table);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		
	}

}
