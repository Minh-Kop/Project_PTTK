package test;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTextField password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 2, 0, 0));
		
		JPanel loginPanel = new JPanel();
		contentPane.add(loginPanel);
		loginPanel.setLayout(new GridLayout(6, 1, 0, 0));
		
		JLabel loginLabel = new JLabel("Đăng nhập");
		loginLabel.setForeground(Color.RED);
		loginLabel.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		loginPanel.add(loginLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		loginPanel.add(usernameLabel);
		
		username = new JTextField();
		loginPanel.add(username);
		username.setColumns(10);
		
		JLabel passwordLabel = new JLabel("Password:");
		loginPanel.add(passwordLabel);
		
		password = new JTextField();
		password.setText("");
		loginPanel.add(password);
		password.setColumns(10);
		
		JButton btnNewButton = new JButton("Đăng nhập");
		loginPanel.add(btnNewButton);
		
		JLabel projectLabel = new JLabel("Quản lí khách sạn");
		projectLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		contentPane.add(projectLabel);
	}

}
