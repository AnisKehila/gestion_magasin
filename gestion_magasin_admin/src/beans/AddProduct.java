package beans;

import entities.gcategory.Category;
import entities.gcategory.CategoryFacadeRemote;
import entities.gproduct.Product;
import entities.gproduct.ProductFacadeRemote;
import java.util.List;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JOptionPane;

public class AddProduct extends javax.swing.JPanel {

   
    public AddProduct() throws NamingException {
        initComponents();
        InitialContext ctx = new InitialContext();
        CategoryFacadeRemote categoryFacade = (CategoryFacadeRemote) ctx.lookup("entities.gcategory.CategoryFacadeRemote");
        List<Category> categories = categoryFacade.findAll();
        for (Category category : categories) {
           jComboBox1.addItem(category.getName());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        price = new javax.swing.JTextField();
        quanitity = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        confirm = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter Produit");
        jLabel1.setFocusable(false);

        name.setText("Produit Nom");

        price.setText("Price");

        quanitity.setText("Quantité");
        quanitity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quanitityActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Description");
        jScrollPane1.setViewportView(jTextArea1);

        jComboBox1.setToolTipText("Select a category");
        jComboBox1.setMinimumSize(new java.awt.Dimension(65, 24));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(name)
                    .addComponent(price)
                    .addComponent(quanitity)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(confirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(quanitity, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(confirm, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void quanitityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quanitityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quanitityActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        try {
            InitialContext ctx = new InitialContext();
            ProductFacadeRemote productFacade = (ProductFacadeRemote) ctx.lookup("entities.gproduct.ProductFacadeRemote");

            // Create a new Product object
            Product p = new Product();

            // Set name, price, and quantity from user inputs
            String productName = name.getText().trim();
            String productPriceText = price.getText().trim();
            String productQuantityText = quanitity.getText().trim();
            String productDescription = jTextArea1.getText().trim();
            String selectedCategoryName = (String) jComboBox1.getSelectedItem();

            // Validate inputs
            if (productName.isEmpty() || productPriceText.isEmpty() || productQuantityText.isEmpty() || selectedCategoryName == null) {
                JOptionPane.showMessageDialog(this, "Veuillez remplir tous les champs obligatoires.", "Erreur", JOptionPane.WARNING_MESSAGE);
                return;
            }

            try {
                // Parse numerical values
                Double productPrice = Double.parseDouble(productPriceText);
                Integer productQuantity = Integer.parseInt(productQuantityText);

                // Find the category object by its name (assuming unique category names)
                CategoryFacadeRemote categoryFacade = (CategoryFacadeRemote) ctx.lookup("entities.gcategory.CategoryFacadeRemote");
                Category selectedCategory = categoryFacade.findByName(selectedCategoryName);
                if (selectedCategory == null) {
                    JOptionPane.showMessageDialog(this, "Catégorie invalide.", "Erreur", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                // Set the properties of the Product object
                p.setName(productName);
                p.setPrice(productPrice);
                p.setStock(productQuantity);
                p.setDescription(productDescription);
                p.setCategory(selectedCategory);

                // Save the product using the facade
                productFacade.create(p);

                // Show success message
                JOptionPane.showMessageDialog(this, "Produit ajouté avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, "Veuillez entrer des valeurs numériques valides pour le prix et la quantité.", "Erreur", JOptionPane.WARNING_MESSAGE);
            }

        } catch (Exception ex) {
            // Handle errors
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout de produit: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }//GEN-LAST:event_confirmActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField price;
    private javax.swing.JTextField quanitity;
    // End of variables declaration//GEN-END:variables
}
