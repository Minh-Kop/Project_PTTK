package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class ChangePasswordView extends JFrame {

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
					ChangePasswordView frame = new ChangePasswordView();
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
	public ChangePasswordView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(3, 1, 0, 0));
		
		JLabel changePassLabel = new JLabel("Đổi mật khẩu");
		changePassLabel.setHorizontalAlignment(SwingConstants.LEFT);
		changePassLabel.setForeground(Color.RED);
		changePassLabel.setBackground(Color.WHITE);
		changePassLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		contentPane.add(changePassLabel);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1, BorderLayout.WEST);
		panel_1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Mật khẩu cũ:");
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mật khẩu mới:");
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2, BorderLayout.CENTER);
		panel_2.setLayout(new GridLayout(2, 1, 0, 0));
		
		textField = new JTextField();
		panel_2.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel changePassButtonPanel = new JPanel();
		contentPane.add(changePassButtonPanel);
		changePassButtonPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Thay đổi");
		btnNewButton.setBounds(81, 33, 73, 23);
		btnNewButton.setVerticalAlignment(SwingConstants.BOTTOM);
		changePassButtonPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Quay về");
		btnNewButton_1.setBounds(269, 33, 73, 23);
		btnNewButton_1.setVerticalAlignment(SwingConstants.BOTTOM);
		changePassButtonPanel.add(btnNewButton_1);
	}

}
