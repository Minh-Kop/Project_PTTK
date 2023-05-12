package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import database.JDBCUtil;
import model.LoaiPhongModel;

public class LoaiPhongDAO implements DAOInterface<LoaiPhongModel> {

	public static LoaiPhongDAO getInstance() {
		return new LoaiPhongDAO();
	}

	@Override
	public int insert(LoaiPhongModel t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "INSERT INTO qlks.loaiphong (malp, tenloaiphong, gia) VALUES (?, ?, ?)";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaLP());
			st.setString(2, t.getTenLP());
			st.setInt(3, t.getGia());

			// Bước 3: thực thi câu lệnh SQL
			ketQua = st.executeUpdate();

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int update(LoaiPhongModel t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "UPDATE qlks.loaiphong SET tenloaiphong = ?, gia = ? WHERE malp = ?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getTenLP());
			st.setInt(2, t.getGia());
			st.setString(3, t.getMaLP());
			
			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ketQua = st.executeUpdate();

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public int delete(LoaiPhongModel t) {
		int ketQua = 0;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "DELETE from qlks.loaiphong WHERE malp = ?";

			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaLP());

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ketQua = st.executeUpdate();

			// Bước 4:
			System.out.println("Bạn đã thực thi: " + sql);
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public ArrayList<LoaiPhongModel> selectAll() {
		ArrayList<LoaiPhongModel> ketQua = new ArrayList<LoaiPhongModel>();
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "select * from qlks.loaiphong";
			PreparedStatement st = con.prepareStatement(sql);

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();
			System.out.println("rs1");

			// Bước 4:
			while (rs.next()) {
				String malp = rs.getString(1);
				System.out.println(malp);
				String tenloaiphong = rs.getString(2);
				int gia = rs.getInt(3);
				System.out.println(gia);

				LoaiPhongModel row = new LoaiPhongModel(malp, tenloaiphong, gia);
				ketQua.add(row);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ketQua;
	}

	@Override
	public LoaiPhongModel selectById(LoaiPhongModel t) {
		LoaiPhongModel ketQua = null;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			String sql = "SELECT * FROM qlks.loaiphong where malp = ?";
			PreparedStatement st = con.prepareStatement(sql);
			st.setString(1, t.getMaLP());

			// Bước 3: thực thi câu lệnh SQL
			System.out.println(sql);
			ResultSet rs = st.executeQuery();

			// Bước 4:
			while (rs.next()) {
				String malp = rs.getString("malp");
				String tenloaiphong = rs.getString("tenloaiphong");
				int gia = rs.getInt("gia");

				ketQua = new LoaiPhongModel(malp, tenloaiphong, gia);
			}

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ketQua;
	}
}
