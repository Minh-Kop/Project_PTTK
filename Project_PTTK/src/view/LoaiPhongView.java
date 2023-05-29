package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.util.ArrayList;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import button.TableActionCellEditor;
import button.TableActionCellRender;
import button.TableDeleteActionEvent;
import button.TableEditActionEvent;
import model.LoaiPhongModel;

import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoaiPhongView extends JFrame {

	private JPanel contentPane;
	private JTextField txtTmTheoTn;
	private JTable table;
	private JScrollPane scrollPane;
	private ArrayList<LoaiPhongModel> dslp;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoaiPhongView frame = new LoaiPhongView();
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
	public LoaiPhongView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(10, 10));

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(14, 1, 0, 0));

		JButton btnNewButton_x = new JButton("Đăng xuất");
		panel.add(btnNewButton_x);

		JButton btnNewButton_0 = new JButton("Phòng");
		panel.add(btnNewButton_0);

		JButton btnNewButton = new JButton("Đặt phòng");
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Hóa đơn");
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("QL đoàn");
		panel.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("QL khách hàng");
		panel.add(btnNewButton_3);

		JButton btnNewButton_4 = new JButton("QL phòng");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QLPhongView qlp = new QLPhongView();
				qlp.show();
				dispose();
			}
		});
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
		panel_1.setLayout(new BorderLayout(0, 10));

		table = new JTable();
		table.setRowHeight(50);

		scrollPane = new JScrollPane(table, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		panel_1.add(scrollPane, BorderLayout.CENTER);

		JButton btnNewButton_12_1 = new JButton("Thêm loại phòng");
		btnNewButton_12_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemLoaiPhongView tlpv = new ThemLoaiPhongView();
				tlpv.setVisible(true);
				dispose();
			}
		});
		btnNewButton_12_1.setVerticalAlignment(SwingConstants.TOP);
		panel_1.add(btnNewButton_12_1, BorderLayout.SOUTH);

		JPanel panel_2 = new JPanel();
		panel_1.add(panel_2, BorderLayout.NORTH);
		panel_2.setLayout(new BorderLayout(0, 0));

		txtTmTheoTn = new JTextField();
		txtTmTheoTn.setText("Tìm kiếm theo loại phòng");
		panel_2.add(txtTmTheoTn, BorderLayout.CENTER);
		txtTmTheoTn.setColumns(10);

		// Set the foreground color to gray to indicate the placeholder text
		txtTmTheoTn.setForeground(Color.GRAY);
		txtTmTheoTn.addFocusListener((FocusListener) new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				// When the text field gains focus, remove the placeholder text
				if (txtTmTheoTn.getText().equals("Tìm kiếm theo loại phòng")) {
					txtTmTheoTn.setText("");
					txtTmTheoTn.setForeground(Color.BLACK);
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				// When the text field loses focus, set the placeholder text if no text was
				// entered
				if (txtTmTheoTn.getText().isEmpty()) {
					txtTmTheoTn.setText("Tìm kiếm theo loại phòng");
					txtTmTheoTn.setForeground(Color.GRAY);
				}
			}
		});

		JButton btnNewButton_12 = new JButton("Tìm kiếm");
		btnNewButton_12.setVerticalAlignment(SwingConstants.BOTTOM);
		panel_2.add(btnNewButton_12, BorderLayout.EAST);

		this.setJTable();
	}

	private void clearJTable() {
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		model.setRowCount(0);
		table.repaint();
		scrollPane.revalidate();
	}

	private void setJTable() {
		this.clearJTable();

		table.setModel(new DefaultTableModel(new Object[][] {},
				new String[] { "Mã loại phòng", "Tên loại phòng", "Giá", "Chỉnh sửa", "Xóa" }) {
			boolean[] canEdit = new boolean[] { false, false, false, true, true };

			public boolean isCellEditable(int rowIndex, int columnIndex) {
				return canEdit[columnIndex];
			}
		});
//		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);

		DefaultTableModel dTModel = (DefaultTableModel) table.getModel();

		dslp = LoaiPhongModel.getInstance().layDSLoaiPhong();
		for (int i = 0; i < dslp.size(); i++) {
			LoaiPhongModel temp = dslp.get(i);
			String[] rowValue = new String[dTModel.getColumnCount()];
			rowValue[0] = temp.getMaLP();
			rowValue[1] = temp.getTenLP();
			rowValue[2] = String.valueOf(temp.getGia());
			dTModel.addRow(rowValue);
		}

		TableEditActionEvent editEvent = new TableEditActionEvent() {
			@Override
			public void onEdit(int row) {
//				DefaultTableModel model = (DefaultTableModel) table.getModel();
//				Object value = model.getValueAt(row, 1);
//				String tel = (String) value;
//				System.out.println("Tel: " + tel);
				
				SuaLoaiPhong suaLP = new SuaLoaiPhong(dslp.get(row));
				suaLP.setVisible(true);
				dispose();
				
			}
		};

		TableDeleteActionEvent deleteEvent = new TableDeleteActionEvent() {
			@Override
			public void onDelete(int row) {
				if (table.isEditing()) {
					table.getCellEditor().stopCellEditing();
				}
				int option = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa không?", "Xác nhận",
						JOptionPane.YES_NO_OPTION);

				if (option == JOptionPane.YES_OPTION) {
					DefaultTableModel model = (DefaultTableModel) table.getModel();
					Object value = model.getValueAt(row, 0);
					String maLP = (String) value;
					LoaiPhongModel lp = new LoaiPhongModel(maLP);
					lp.toString();

					int ketQua = lp.xoaLoaiPhong();
					if (ketQua != 0) {
						JOptionPane.showMessageDialog(null, "Đã xóa thành công!", "Thông báo",
								JOptionPane.INFORMATION_MESSAGE);
						setJTable();
					} else {
						JOptionPane.showMessageDialog(null, "Xóa không thành công!", "Thông báo",
								JOptionPane.INFORMATION_MESSAGE);
					}

//					DefaultTableModel model = (DefaultTableModel) table.getModel();
//					model.removeRow(row);
				} else {
					System.out.println("Người dùng đã chọn Không đồng ý.");
				}
			}
		};

		table.getColumnModel().getColumn(table.getColumnCount() - 2).setCellRenderer(new TableActionCellRender(1));
		table.getColumnModel().getColumn(table.getColumnCount() - 2)
				.setCellEditor(new TableActionCellEditor(editEvent));

		table.getColumnModel().getColumn(table.getColumnCount() - 1).setCellRenderer(new TableActionCellRender(2));
		table.getColumnModel().getColumn(table.getColumnCount() - 1)
				.setCellEditor(new TableActionCellEditor(deleteEvent));
	}
}
