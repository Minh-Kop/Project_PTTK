package button;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author RAVEN
 */
public class TableActionCellEditor extends DefaultCellEditor {
	private TableDeleteActionEvent deleteEvent;
	private TableEditActionEvent editEvent;
	private int isEdit;

	public TableActionCellEditor(TableEditActionEvent event) {
		super(new JCheckBox());
		this.editEvent = event;
		this.isEdit = 1;
	}

	public TableActionCellEditor(TableDeleteActionEvent event) {
		super(new JCheckBox());
		this.deleteEvent = event;
		this.isEdit = 2;
	}

	@Override
	public Component getTableCellEditorComponent(JTable jtable, Object o, boolean bln, int row, int column) {
		PanelAction action = new PanelAction(this.isEdit);
		if (this.isEdit == 1) {
			action.initEditEvent(editEvent, row);
		} else if (this.isEdit == 2) {
			action.initDeleteEvent(deleteEvent, row);
		}
		action.setBackground(jtable.getSelectionBackground());
		return action;
	}
}
