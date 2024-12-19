package beans;


import entities.gcategory.Category;
import entities.gcategory.CategoryFacadeRemote;
import javax.naming.InitialContext;
import javax.swing.JOptionPane;

/**
 *
 * @author A N I S
 */
public class AddCategorie extends javax.swing.JPanel {

 
    //@EJB
    //private static CategoryFacade categoryFacade;

    public AddCategorie() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        categorieTxt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setMinimumSize(new java.awt.Dimension(1000, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajouter Categorie");
        jLabel1.setFocusable(false);

        categorieTxt.setText("Categorie");
        categorieTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categorieTxtActionPerformed(evt);
            }
        });

        jButton1.setText("Confirm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                    .addComponent(categorieTxt)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(categorieTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(400, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void categorieTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categorieTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categorieTxtActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String categoryName = categorieTxt.getText().trim();
        if (categoryName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Veuillez entrer une catégorie!", "Erreur", JOptionPane.ERROR_MESSAGE);
            return;
        }

        try {
            InitialContext ctx = new InitialContext();
            
            CategoryFacadeRemote categoryFacade = (CategoryFacadeRemote) ctx.lookup("entities.gcategory.CategoryFacadeRemote");
            // Create a new category and persist it using the EJB
            Category category = new Category();
            category.setName(categoryName);
            categoryFacade.create(category);
            // Show success message
            JOptionPane.showMessageDialog(this, "Catégorie ajoutée avec succès!", "Succès", JOptionPane.INFORMATION_MESSAGE);
            categorieTxt.setText("");
        } catch (Exception ex) {
            // Handle errors
            JOptionPane.showMessageDialog(this, "Erreur lors de l'ajout de la catégorie: " + ex.getMessage(), "Erreur", JOptionPane.ERROR_MESSAGE);
            System.err.println(ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField categorieTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables



}
