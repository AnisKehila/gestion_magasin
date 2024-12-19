package beans.component;

import javax.swing.JButton;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

public class DeleteButton extends JButton {
    public DeleteButton() {
        setText("Delete");
        
        setFont(new Font("Arial", Font.BOLD, 14));
        
        setBackground(new Color(220, 53, 69));
        
        setForeground(Color.WHITE);
        
        setBorder(BorderFactory.createEmptyBorder());
        setFocusPainted(false); // Remove focus border
        setContentAreaFilled(false); // Disable default content area
        setOpaque(true); // Enable custom background
        setPreferredSize(new java.awt.Dimension(100, 40));
    }
}
