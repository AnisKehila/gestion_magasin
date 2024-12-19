/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gproduct;

import entities.AbstractFacade;
import entities.gproduct.Product;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A N I S
 */
@Stateless
public class ProductFacade extends AbstractFacade<Product> implements ProductFacadeRemote {

    @PersistenceContext(unitName = "gestion_magasin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductFacade() {
        super(Product.class);
    }

    public String getNames() { return "Anis"; }

    @Override
    public void delete(Long id) {
        Product product = em.find(Product.class, id);
        
        // If the category exists, remove it
        if (product != null) {
            em.remove(product);
        } else {
            System.out.println("product with ID " + id + " not found.");
        }
    }
}
