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
import javax.swing.JComboBox;

public class ThemDoanView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTenDoan;
	private JTextField txtSDT;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThemDoanView frame = new ThemDoanView();
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
	public ThemDoanView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 592, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JLabel lblThemDoan = new JLabel("Nhập thông tin đoàn");
		panel.add(lblThemDoan);
		lblThemDoan.setFont(new Font("Tahoma", Font.BOLD, 30));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(192, 192, 192));
		contentPane.add(panel_1, BorderLayout.CENTER);
		SpringLayout sl_panel_1 = new SpringLayout();
		panel_1.setLayout(sl_panel_1);
		
		JLabel lblTenDoan = new JLabel("Tên đoàn");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTenDoan, 36, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTenDoan, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblTenDoan, -283, SpringLayout.EAST, panel_1);
		lblTenDoan.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblTenDoan);
		
		JLabel lblCCCD = new JLabel("Trưởng đoàn");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblCCCD, 89, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblCCCD, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblCCCD, -347, SpringLayout.EAST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, lblTenDoan, -6, SpringLayout.NORTH, lblCCCD);
		lblCCCD.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblCCCD);
		
		JLabel lblSL = new JLabel("Số lượng phòng");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblSL, 23, SpringLayout.SOUTH, lblCCCD);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblSL, 0, SpringLayout.WEST, lblTenDoan);
		lblSL.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblSL);
		
		JLabel lblNgayDen = new JLabel("Ngày đến");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNgayDen, 28, SpringLayout.SOUTH, lblSL);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNgayDen, 0, SpringLayout.WEST, lblTenDoan);
		lblNgayDen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNgayDen);
		
		JLabel lblNgayDi = new JLabel("Ngày đi");
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblNgayDi, 33, SpringLayout.SOUTH, lblNgayDen);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblNgayDi, 0, SpringLayout.WEST, lblTenDoan);
		lblNgayDi.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel_1.add(lblNgayDi);
		
		txtTenDoan = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtTenDoan, 27, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtTenDoan, 6, SpringLayout.EAST, lblTenDoan);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtTenDoan, -26, SpringLayout.EAST, panel_1);
		txtTenDoan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		sl_panel_1.putConstraint(SpringLayout.NORTH, lblTenDoan, 22, SpringLayout.NORTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, lblTenDoan, 58, SpringLayout.WEST, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, lblTenDoan, -283, SpringLayout.EAST, panel_1);
		panel_1.add(txtTenDoan);
		txtTenDoan.setColumns(10);
		
		txtSDT = new JTextField();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtTenDoan, -54, SpringLayout.NORTH, txtSDT);
		sl_panel_1.putConstraint(SpringLayout.NORTH, txtSDT, -8, SpringLayout.NORTH, lblSL);
		sl_panel_1.putConstraint(SpringLayout.WEST, txtSDT, 0, SpringLayout.WEST, txtTenDoan);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, txtSDT, -217, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, txtSDT, 0, SpringLayout.EAST, txtTenDoan);
		txtSDT.setFont(new Font("Tahoma", Font.PLAIN, 17));
		txtSDT.setColumns(10);
		panel_1.add(txtSDT);
		
		JButton btnNewButton_1 = new JButton("Hủy");
		sl_panel_1.putConstraint(SpringLayout.WEST, btnNewButton_1, 436, SpringLayout.WEST, panel_1);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel_1.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Lưu");
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton, 0, SpringLayout.NORTH, btnNewButton_1);
		sl_panel_1.putConstraint(SpringLayout.EAST, btnNewButton, -42, SpringLayout.WEST, btnNewButton_1);
		panel_1.add(btnNewButton);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		
		JDateChooser dcBD = new JDateChooser();
		sl_panel_1.putConstraint(SpringLayout.NORTH, btnNewButton_1, 33, SpringLayout.SOUTH, dcBD);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, dcBD, -111, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.WEST, dcBD, 0, SpringLayout.WEST, txtTenDoan);
		sl_panel_1.putConstraint(SpringLayout.EAST, dcBD, 0, SpringLayout.EAST, txtTenDoan);
		panel_1.add(dcBD);
		
		JDateChooser dateChooser = new JDateChooser();
		sl_panel_1.putConstraint(SpringLayout.SOUTH, dateChooser, -166, SpringLayout.SOUTH, panel_1);
		sl_panel_1.putConstraint(SpringLayout.NORTH, dcBD, 11, SpringLayout.SOUTH, dateChooser);
		sl_panel_1.putConstraint(SpringLayout.NORTH, dateChooser, 6, SpringLayout.SOUTH, txtSDT);
		sl_panel_1.putConstraint(SpringLayout.WEST, dateChooser, 0, SpringLayout.WEST, txtTenDoan);
		sl_panel_1.putConstraint(SpringLayout.EAST, dateChooser, -26, SpringLayout.EAST, panel_1);
		panel_1.add(dateChooser);
		
		JComboBox comboBox = new JComboBox();
		sl_panel_1.putConstraint(SpringLayout.NORTH, comboBox, 6, SpringLayout.SOUTH, txtTenDoan);
		sl_panel_1.putConstraint(SpringLayout.WEST, comboBox, 6, SpringLayout.EAST, lblTenDoan);
		sl_panel_1.putConstraint(SpringLayout.SOUTH, comboBox, -8, SpringLayout.NORTH, txtSDT);
		sl_panel_1.putConstraint(SpringLayout.EAST, comboBox, 0, SpringLayout.EAST, txtTenDoan);
		panel_1.add(comboBox);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.SOUTH);
	}
}
