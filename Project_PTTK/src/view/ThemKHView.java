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
import com.toedter.calendar.JDayChooser;
import com.toedter.calendar.JDateChooser;

public class ThemKHView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenKH;
	private JTextField txtCCCD;
	private JTextField txtSDT;
	private JTextField txtADD;
	private JTextField txtEmail;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemKHView frame = new ThemKHView();
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
	public ThemKHView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblThemPhong = new JLabel("Nhập thông tin khách hàng");
		panel.add(lblThemPhong);
		lblThemPhong.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblTenKH = new JLabel("Tên khách hàng");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTenKH, 36, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTenKH, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblTenKH, -283, SpringLayout.EAST, panel_1);
		lblTenKH.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblTenKH);
		
		JLabel lblCCCD = new JLabel("CCCD");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCCCD, 89, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCCCD, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblCCCD, -347, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblTenKH, -6, SpringLayout.NORTH, lblCCCD);
		lblCCCD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblCCCD);
		
		JLabel lblBD = new JLabel("Ngày sinh");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblBD, 23, SpringLayout.SOUTH, lblCCCD);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblBD, 0, SpringLayout.WEST, lblTenKH);
		lblBD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblBD);
		
		JLabel lblSDT = new JLabel("SDT");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblSDT, 0, SpringLayout.WEST, lblTenKH);
		lblSDT.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblSDT);
		
		JLabel lblADD = new JLabel("Địa chỉ");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblADD, 0, SpringLayout.WEST, lblTenKH);
		lblADD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblADD);
		
		txtTenKH = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtTenKH, 27, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtTenKH, 6, SpringLayout.EAST, lblTenKH);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtTenKH, -26, SpringLayout.EAST, panel_1);
		txtTenKH.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTenKH, 22, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTenKH, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblTenKH, -283, SpringLayout.EAST, panel_1);
		panel_1.add(txtTenKH);
		txtTenKH.setColumns(10);
		
		txtCCCD = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtCCCD, 78, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtCCCD, -265, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtTenKH, -6, SpringLayout.NORTH, txtCCCD);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtCCCD, 6, SpringLayout.EAST, lblTenKH);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtCCCD, -26, SpringLayout.EAST, panel_1);
		txtCCCD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtCCCD.setColumns(10);
		panel_1.add(txtCCCD);
		
		txtSDT = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtSDT, 199, SpringLayout.EAST, lblSDT);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtSDT, -26, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblSDT, 8, SpringLayout.NORTH, txtSDT);
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSDT.setColumns(10);
		panel_1.add(txtSDT);
		
		txtADD = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblADD, 8, SpringLayout.NORTH, txtADD);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtSDT, -15, SpringLayout.NORTH, txtADD);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtADD, 231, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtADD, 0, SpringLayout.WEST, txtTenKH);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtADD, -26, SpringLayout.EAST, panel_1);
		txtADD.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtADD.setColumns(10);
		panel_1.add(txtADD);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Lưu");
		sl_panel_1.putConstraint(SpringLayout.SOUTH, btnNewButton, -24, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -178, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 0, SpringLayout.NORTH, btnNewButton);
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 48, SpringLayout.EAST, btnNewButton);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JLabel lblEmail = new JLabel("Email");
		sl_panel_1.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblTenKH);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.WEST, txtEmail, 190, SpringLayout.EAST, lblEmail);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtEmail, -26, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblEmail, 5, SpringLayout.NORTH, txtEmail);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtADD, -6, SpringLayout.NORTH, txtEmail);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtEmail, 277, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtEmail, -17, SpringLayout.NORTH, btnNewButton_1);
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtEmail.setColumns(10);
		panel_1.add(txtEmail);
		
		JDateChooser dcBD = new JDateChooser();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, dcBD, -215, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtSDT, 8, SpringLayout.SOUTH, dcBD);
		sl_panel_1.putConstraint(SpringLayout.NORTH, dcBD, 6, SpringLayout.SOUTH, txtCCCD);
		sl_panel_1.putConstraint(SpringLayout.WEST, dcBD, 0, SpringLayout.WEST, txtTenKH);
		sl_panel_1.putConstraint(SpringLayout.EAST, dcBD, -26, SpringLayout.EAST, panel_1);
		panel_1.add(dcBD);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}
}
