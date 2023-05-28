package test;

import button.TableDeleteActionEvent;

public class Main {
	public static void main(String[] args) {
		String ketQua = "1";
		TableDeleteActionEvent d = new TableDeleteActionEvent() {
			
			@Override
			public void onDelete(int row) {
				// TODO Auto-generated method stub
				System.out.println("1");
			}
		};
//		System.out.println(ketQua.getClass().getTypeName().endsWith(".String"));
		System.out.println(d.getClass().getTypeName());
		System.out.println(d.getClass().getTypeName().endsWith(".TableDeleteActionEvent"));
	}
}
