package gestion_magasin_admin;


import javax.naming.InitialContext;
import javax.naming.NameClassPair;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
import javax.swing.SwingUtilities;

public class Gestion_magasin_admin {

    public static void main(String[] args) throws NamingException  {

        InitialContext ctx = new InitialContext();
        NamingEnumeration children = ctx.list("");
        while(children.hasMore()) {
            NameClassPair ncPair = (NameClassPair)children.next();
            System.out.println(ncPair.getName());
        }
        SwingUtilities.invokeLater(() -> {
            // Create an instance of MainFrame
            MainFrame mainFrame = new MainFrame();
            mainFrame.setLocationRelativeTo(null); // Center the frame on screen
            mainFrame.setVisible(true);
        });
    }
}