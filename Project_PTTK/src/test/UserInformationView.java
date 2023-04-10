package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UserInformationView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserInformationView frame = new UserInformationView();
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
	public UserInformationView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(12, 1, 0, 10));
		
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
		panel_1.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.SOUTH);
		panel_2.setLayout(new GridLayout(1, 0, 10, 0));
		
		JButton btnNewButton_12 = new JButton("Lưu thông tin");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel_2.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("Thay đổi mật khẩu");
		panel_2.add(btnNewButton_13);
		
		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.CENTER);
		panel_3.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên:");
		lblNewLabel.setBounds(0, 4, 330, 52);
		panel_3.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("NV001");
		lblNewLabel_1.setBounds(330, 4, 330, 52);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Họ tên:");
		lblNewLabel_2.setBounds(0, 56, 330, 52);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nguyễn Văn A");
		lblNewLabel_3.setBounds(330, 56, 330, 52);
		panel_3.add(lblNewLabel_3);
		
		JLabel lblNewLabel_2_1 = new JLabel("Vai trò");
		lblNewLabel_2_1.setBounds(0, 109, 330, 52);
		panel_3.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Tình trạng");
		lblNewLabel_2_1_1.setBounds(0, 161, 330, 52);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Lễ tân");
		lblNewLabel_2_1_2.setEnabled(false);
		lblNewLabel_2_1_2.setBounds(330, 109, 330, 52);
		panel_3.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Đang làm việc");
		lblNewLabel_2_1_3.setEnabled(false);
		lblNewLabel_2_1_3.setBounds(330, 161, 330, 52);
		panel_3.add(lblNewLabel_2_1_3);
		
		textField = new JTextField();
		textField.setBounds(330, 109, 321, 52);
		panel_3.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(330, 161, 321, 52);
		panel_3.add(textField_1);
	}
}
