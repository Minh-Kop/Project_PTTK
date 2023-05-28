package button;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import java.awt.*;

/**
 *
 * @author RAVEN
 */
public class TableActionCellRender extends DefaultTableCellRenderer {
	private int isEdit;

	public TableActionCellRender(int isEdit) {
		super();
		this.isEdit = isEdit;
	}

	@Override
	public Component getTableCellRendererComponent(JTable jtable, Object o, boolean isSelected, boolean bln1, int row,
			int column) {
		Component com = super.getTableCellRendererComponent(jtable, o, isSelected, bln1, row, column);
//		button.PanelAction action = new PanelAction();
		PanelAction action = new PanelAction(this.isEdit);
		if (isSelected == false && row % 2 == 0) {
			action.setBackground(Color.WHITE);
		} else {
			action.setBackground(com.getBackground());
		}
		return action;
	}
}
