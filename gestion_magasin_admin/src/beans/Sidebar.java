package beans;

import java.util.function.Consumer;


public class Sidebar extends javax.swing.JPanel {


    private Consumer<String> navigationListener;
    public Sidebar() {
        initComponents();
        setupButtonActions();
    }
    public void setNavigationListener(Consumer<String> listener) {
        this.navigationListener = listener;
    }

    /**
     * Set up button actions to trigger navigation.
     */
    private void setupButtonActions() {
        commandes.addActionListener(e -> navigate("commandes"));
        products.addActionListener(e -> navigate("products"));
        categories.addActionListener(e -> navigate("categories"));
        addProduct.addActionListener(e -> navigate("addProduct"));
        addCategorie.addActionListener(e -> navigate("addCategorie"));
    }

    /**
     * Helper method to handle navigation.
     * @param targetPage The page to navigate to.
     */
    private void navigate(String targetPage) {
        if (navigationListener != null) {
            navigationListener.accept(targetPage);
        }
    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        commandes = new javax.swing.JButton();
        products = new javax.swing.JButton();
        categories = new javax.swing.JButton();
        addProduct = new javax.swing.JButton();
        addCategorie = new javax.swing.JButton();

        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setAutoscrolls(true);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        label1.setText("Admin Dashboard");

        commandes.setText("Commandes");

        products.setText("Produits");

        categories.setText("Categories");

        addProduct.setText("Ajouter Produits");

        addCategorie.setText("Ajouter Categories");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(commandes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                    .addComponent(products, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(categories, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCategorie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(commandes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(products)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(categories)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addProduct)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(addCategorie)
                .addContainerGap(197, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCategorie;
    private javax.swing.JButton addProduct;
    private javax.swing.JButton categories;
    private javax.swing.JButton commandes;
    private java.awt.Label label1;
    private javax.swing.JButton products;
    // End of variables declaration//GEN-END:variables

}
