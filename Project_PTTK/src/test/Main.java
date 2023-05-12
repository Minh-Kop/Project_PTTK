package test;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Types;

import database.JDBCUtil;

public class Main {
	public static void main(String[] args) {
		String ketQua;
		try {
			// Bước 1: tạo kết nối đến CSDL
			Connection con = JDBCUtil.getConnection();

			// Bước 2: tạo ra đối tượng statement
			CallableStatement st = con.prepareCall("{CALL SYS.SP_TAOMALP(?)}");
			st.registerOutParameter(1, Types.CHAR);
			
			// Bước 3: thực thi câu lệnh SQL
			st.execute();
			Object maLP = st.getObject(1);
			ketQua = (String) maLP;
			ketQua = ketQua.substring(0, 3);
			
			// Bước 4:
			System.out.println("Có " + ketQua + " dòng bị thay đổi!");

			// Bước 5:
			JDBCUtil.closeConnection(con);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
