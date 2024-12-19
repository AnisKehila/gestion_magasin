package gestion_magasin_admin;

import java.awt.Container;
import javax.naming.NamingException;
import javax.swing.JPanel;


public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        setTitle("Admin Panel");
        sidebar1.setNavigationListener(this::navigateToPage);

    }
    private void navigateToPage(String page) {
        try {
        switch (page) {
            case "products":
                setPage(new beans.Products());
                break;
            case "categories":
                setPage(new beans.Categories());
                break;
            case "commandes":
                setPage(new beans.Commandes());
                break;
            case "addProduct":
                setPage(new beans.AddProduct());
                break;
            case "addCategorie":
                setPage(new beans.AddCategorie());
                break;
            default:
                break;
        }} catch(NamingException e) {
            
        }
        
    }
    
    private void setPage(Container page) {
        // Create a new JPanel to hold the sidebar and the selected page
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new java.awt.BorderLayout());

        // Re-add the sidebar
        sidebar1 = new beans.Sidebar();
        sidebar1.setNavigationListener(this::navigateToPage);
        mainPanel.add(sidebar1, java.awt.BorderLayout.WEST);

        // Add the selected page to the center of the layout
        mainPanel.add(page, java.awt.BorderLayout.CENTER);

        // Replace the content pane with the new main panel
        setContentPane(mainPanel);

        // Refresh the frame to reflect changes
        revalidate();
        repaint();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidebar1 = new beans.Sidebar();
        commandes1 = new beans.Commandes();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commandes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(sidebar1, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commandes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private beans.Commandes commandes1;
    private beans.Sidebar sidebar1;
    // End of variables declaration//GEN-END:variables

}
