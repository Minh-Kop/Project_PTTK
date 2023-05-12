package model;

import java.util.ArrayList;

import dao.LoaiPhongDAO;
import database.JDBCUtil;

public class LoaiPhongModel {
	private String MaLP;
	private String TenLP;
	private int Gia;
	private static LoaiPhongModel instance;
	
	public LoaiPhongModel() {
		super();
	}
	
	public LoaiPhongModel(String maLP, String tenLP, int gia) {
		super();
		this.MaLP = maLP;
		this.TenLP = tenLP;
		this.Gia = gia;
	}
	
	public static LoaiPhongModel getInstance() {
		if (instance == null)
			instance = new LoaiPhongModel();
		return instance;
	}

	public String getMaLP() {
		return MaLP;
	}
	
	public ArrayList<LoaiPhongModel> layDSLoaiPhong() {
		ArrayList<LoaiPhongModel> dsLP = LoaiPhongDAO.getInstance().selectAll();
		
		return dsLP;
	}
	
	public int themLoaiPhong() {
		int ketqua = LoaiPhongDAO.getInstance().insert(this);
		return ketqua;
	}

	public void setMaLP(String maLP) {
		MaLP = maLP;
	}

	public String getTenLP() {
		return TenLP;
	}

	public void setTenLP(String tenLP) {
		TenLP = tenLP;
	}

	public int getGia() {
		return Gia;
	}

	public void setGia(int gia) {
		Gia = gia;
	}

	@Override
	public String toString() {
		return "LoaiPhongModel [MaLP=" + MaLP + ", TenLP=" + TenLP + ", Gia=" + Gia + "]";
	}
}
