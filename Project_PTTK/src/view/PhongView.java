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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.FlowLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

public class PhongView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTmTheoPhng;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PhongView frame = new PhongView();
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
	public PhongView() {
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

		JButton btnNewButton_6 = new JButton("QL dịch vụ theo ngày");
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

		String[] columnNames = { "Mã phòng", "Loại phòng", "Trạng thái thuê", "Tên khách hàng", "Ngày thuê",
				"Số ngày thuê", "Chi tiết" };

		String[][] data = { { "P11", "Phòng đơn", "Đang thuê", "Nguyễn Khoa", "21/4/2023", "10", "..." },
				{ "P31", "Phòng đôi", "Đang trống", "", "", "", "..." },
				{ "P91", "Phòng suite", "Đã đặt ", "Lưu Minh Trí", "2/5/2023", "2", "..." } };

		JTable table = new JTable(data, columnNames);
		table.setBounds(30, 40, 200, 300);
		JScrollPane scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_1.add(scrollPane, BorderLayout.CENTER);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] { "", "Phòng đơn", "Phòng đôi", "Phòng suite" }));
		panel_2.add(comboBox, BorderLayout.CENTER);

		JDateChooser dateChooser = new JDateChooser();
		panel_2.add(dateChooser, BorderLayout.NORTH);

		JPanel panel_3 = new JPanel();
		panel_2.add(panel_3, BorderLayout.SOUTH);
		panel_3.setLayout(new BorderLayout(0, 0));

		txtTmTheoPhng = new JTextField();
		panel_3.add(txtTmTheoPhng, BorderLayout.CENTER);
		txtTmTheoPhng.setText("Tìm theo phòng");
		txtTmTheoPhng.setForeground(Color.GRAY);
		txtTmTheoPhng.setColumns(10);

		// Set the foreground color to gray to indicate the placeholder text
		txtTmTheoPhng.setForeground(Color.GRAY);
		txtTmTheoPhng.setText("Tìm theo phòng");

		JButton nhapButton = new JButton("Enter");
		panel_3.add(nhapButton, BorderLayout.EAST);
		txtTmTheoPhng.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// When the text field gains focus, remove the placeholder text
				if (txtTmTheoPhng.getText().equals("Tìm theo phòng")) {
					txtTmTheoPhng.setText("");
					txtTmTheoPhng.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// When the text field loses focus, set the placeholder text if no text was
				// entered
				if (txtTmTheoPhng.getText().isEmpty()) {
					txtTmTheoPhng.setText("Tìm theo phòng");
					txtTmTheoPhng.setForeground(Color.GRAY);
				}
			}
		});

	}

}
