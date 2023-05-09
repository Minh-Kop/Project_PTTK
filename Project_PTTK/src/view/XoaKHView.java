package src.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SpringLayout;
import javax.swing.JButton;
import java.awt.Color;

public class XoaKHView extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					XoaKHView frame = new XoaKHView();
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
	public XoaKHView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("Xác nhận xóa khách hàng này?");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 19));
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JButton btnNewButton = new JButton("Xác nhận");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 72, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton, 94, SpringLayout.WEST, panel_1);
		panel_1.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 58, SpringLayout.EAST, btnNewButton);
		btnNewButton_1.setBackground(new Color(240, 240, 240));
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		panel_1.add(btnNewButton_1);
	}

}
