package src.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.SpringLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SuaPhongView extends JFrame {

	private JPanel contentPane;
	private JTextField txtP;
	private JTextField txtangTrng;
	private JTextField txtDnDp;
	private JTextField textField_3;
	private JTextField txtPhngn;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuaPhongView frame = new SuaPhongView();
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
	public SuaPhongView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblThemPhong = new JLabel("Nhập thông tin phòng");
		panel.add(lblThemPhong);
		lblThemPhong.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblNewLabel = new JLabel("Mã phòng");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, panel_1);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tình trạng thuê");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 0, SpringLayout.WEST, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 75, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel_1, -347, SpringLayout.EAST, panel_1);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tình trạng dọn dẹp");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1, 126, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_1, 58, SpringLayout.WEST, panel_1);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Mã loại phòng");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_1, 58, SpringLayout.WEST, panel_1);
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Tên loại phòng");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_2, 228, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel_1_1_2, 58, SpringLayout.WEST, panel_1);
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNewLabel_1_1_2);
		
		txtP = new JTextField();
		txtP.setText("P11");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblNewLabel, 0, SpringLayout.SOUTH, txtP);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, -6, SpringLayout.WEST, txtP);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtP, 12, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtP, 291, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtP, 52, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtP, -26, SpringLayout.EAST, panel_1);
		txtP.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel, 22, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNewLabel, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblNewLabel, -283, SpringLayout.EAST, panel_1);
		panel_1.add(txtP);
		txtP.setColumns(10);
		
		txtangTrng = new JTextField();
		txtangTrng.setText("Đang thuê");
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtangTrng, -8, SpringLayout.NORTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtangTrng, 291, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtangTrng, 9, SpringLayout.SOUTH, lblNewLabel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtangTrng, 0, SpringLayout.EAST, txtP);
		txtangTrng.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtangTrng.setColumns(10);
		panel_1.add(txtangTrng);
		
		txtDnDp = new JTextField();
		txtDnDp.setText("Đã dọn dẹp");
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtDnDp, 12, SpringLayout.SOUTH, txtangTrng);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtDnDp, 77, SpringLayout.EAST, lblNewLabel_1_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtDnDp, -225, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtDnDp, -26, SpringLayout.EAST, panel_1);
		txtDnDp.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtDnDp.setColumns(10);
		panel_1.add(txtDnDp);
		
		textField_3 = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, textField_3, 10, SpringLayout.SOUTH, txtDnDp);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNewLabel_1_1_1, 8, SpringLayout.NORTH, textField_3);
		sl_panel_1.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, txtP);
		sl_panel_1.putConstraint(SpringLayout.EAST, textField_3, -26, SpringLayout.EAST, panel_1);
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 17));
		textField_3.setColumns(10);
		panel_1.add(textField_3);
		
		txtPhngn = new JTextField();
		txtPhngn.setText("Phòng đơn");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, textField_3, -12, SpringLayout.NORTH, txtPhngn);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtPhngn, -8, SpringLayout.NORTH, lblNewLabel_1_1_2);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtPhngn, 113, SpringLayout.EAST, lblNewLabel_1_1_2);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtPhngn, 0, SpringLayout.EAST, txtP);
		txtPhngn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtPhngn.setColumns(10);
		panel_1.add(txtPhngn);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtPhngn, -39, SpringLayout.NORTH, btnNewButton_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 299, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton_1, -57, SpringLayout.EAST, panel_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Lưu");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 299, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -58, SpringLayout.WEST, btnNewButton_1);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}

}
