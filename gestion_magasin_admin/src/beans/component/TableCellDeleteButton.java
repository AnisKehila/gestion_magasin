
package beans.component;

import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class TableCellDeleteButton extends DefaultTableCellRenderer {
    
    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
        super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
        DeleteButton pa = new DeleteButton();
        return pa;
    }
    
}
