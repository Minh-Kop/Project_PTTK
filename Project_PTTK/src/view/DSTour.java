package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.Font;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;

public class DSTour extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DSTour frame = new DSTour();
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
	public DSTour() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 474, 184);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane txtpntTour = new JTextPane();
		txtpntTour.setFont(new Font("Tahoma", Font.PLAIN, 19));
		txtpntTour.setBounds(160, 10, 93, 34);
		txtpntTour.setText("Đặt tour");
		contentPane.add(txtpntTour);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"DL01", "Ph\u00FA Qu\u1ED1c"},
				{"DL02", "\u0110\u1ED3ng Nai"},
				{null, null},
			},
			new String[] {
				"M\u00E3 tour", "T\u00EAn Tour"
			}
		));
		table.setBounds(39, 76, 304, 69);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("Đăng ký");
		btnNewButton.setBounds(341, 73, 85, 21);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Đăng ký");
		btnNewButton_1.setBounds(341, 92, 85, 21);
		contentPane.add(btnNewButton_1);
		
	}
}
