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

import model.LoaiPhongModel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThemLoaiPhongView extends JFrame {

	private JTextField maLPTextField;
	private JTextField tenLPTextField;
	private JTextField giaTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemLoaiPhongView window = new ThemLoaiPhongView();
					window.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ThemLoaiPhongView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 226);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Thêm Loại Phòng");
		lblNewLabel.setForeground(new Color(255, 128, 64));
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(141, 0, 146, 22);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setToolTipText("");
		
		getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(26, 32, 388, 134);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Mã Loại Phòng");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(10, 13, 116, 13);
		panel.add(lblNewLabel_1);
		
		maLPTextField = new JTextField();
		maLPTextField.setBounds(157, 12, 159, 19);
		panel.add(maLPTextField);
		maLPTextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Tên Loại Phòng");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(10, 48, 106, 13);
		panel.add(lblNewLabel_2);
		
		tenLPTextField = new JTextField();
		tenLPTextField.setBounds(157, 47, 159, 19);
		panel.add(tenLPTextField);
		tenLPTextField.setColumns(10);
		
		JButton btnNewButton = new JButton("Thêm");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ketqua = themLoaiPhong();
				if (ketqua == 1) {
					LoaiPhongView lpv = new LoaiPhongView();
					lpv.show();
					dispose();
				}
			}
		});
		
		btnNewButton.setBounds(300, 113, 88, 21);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoaiPhongView lpv = new LoaiPhongView();
				lpv.show();
				dispose();
			}
		});
		btnNewButton_1.setBounds(205, 113, 85, 21);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_2_1 = new JLabel("Giá thuê");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2_1.setBounds(28, 82, 88, 13);
		panel.add(lblNewLabel_2_1);
		
		giaTextField = new JTextField();
		giaTextField.setColumns(10);
		giaTextField.setBounds(157, 81, 159, 19);
		panel.add(giaTextField);
	}
	
	public int themLoaiPhong() {
		int ketqua = 0;
		LoaiPhongModel lp = new LoaiPhongModel(maLPTextField.getText(), tenLPTextField.getText(), Integer.parseInt(giaTextField.getText()));
//		System.out.println(lp.toString());
		ketqua = lp.themLoaiPhong();
		return ketqua;
	}
}
