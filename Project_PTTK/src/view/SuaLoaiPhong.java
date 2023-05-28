package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuaLoaiPhong {

	private JFrame frame;
	private JTextField textField_TenLP;
	private JTextField textField_GiaThue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaLoaiPhong window = new SuaLoaiPhong();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuaLoaiPhong() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 453, 253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Cập Nhật Thông Tin Loại Phòng");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JLabel lblNewLabel_1 = new JLabel("Mã loại phòng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JLabel lblNewLabel_2 = new JLabel("Tên loại phòng");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_TenLP = new JTextField();
		textField_TenLP.setHorizontalAlignment(SwingConstants.LEFT);
		textField_TenLP.setColumns(10);
		
		JButton btnNewButton = new JButton("Lưu");
		
		JButton btnNewButton_1 = new JButton("Hủy");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JLabel lblNewLabel_2_1 = new JLabel("Giá thuê");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		textField_GiaThue = new JTextField();
		textField_GiaThue.setHorizontalAlignment(SwingConstants.LEFT);
		textField_GiaThue.setColumns(10);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(78)
					.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
					.addGap(72))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(26)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGap(25))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(4)
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
					.addGap(6)
					.addComponent(panel, GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
					.addGap(10))
		);
		
		JLabel lblMaLP = new JLabel("New label");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addComponent(lblNewLabel_2_1)
					.addGap(88)
					.addComponent(textField_GiaThue, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
					.addGap(12))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(188)
					.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(18)
					.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
					.addGap(8))
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
					.addGap(41)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(textField_TenLP, GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
							.addGap(12))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblMaLP, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
							.addContainerGap())))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(2)
							.addComponent(lblMaLP, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
					.addGap(16)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
							.addGap(3))
						.addGroup(gl_panel.createSequentialGroup()
							.addGap(3)
							.addComponent(textField_TenLP, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
					.addGap(12)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_2_1, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
						.addComponent(textField_GiaThue, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
					.addGap(22)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(btnNewButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addGap(14))
		);
		panel.setLayout(gl_panel);
		frame.getContentPane().setLayout(groupLayout);
	}
}
