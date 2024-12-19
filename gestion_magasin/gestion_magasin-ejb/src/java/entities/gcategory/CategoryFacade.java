/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcategory;

import entities.AbstractFacade;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A N I S
 */
@Stateless
public class CategoryFacade extends AbstractFacade<Category> implements CategoryFacadeRemote {

    @PersistenceContext(unitName = "gestion_magasin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CategoryFacade() {
        super(Category.class);
    }

    @Override
    public void delete(Long categoryId) {
        Category category = em.find(Category.class, categoryId);
        
        // If the category exists, remove it
        if (category != null) {
            em.remove(category);
        } else {
            System.out.println("Category with ID " + categoryId + " not found.");
        }
    }

    @Override
    public Category findByName(String name) {
        try {
            return em.createQuery("SELECT c FROM Category c WHERE c.name = :name", Category.class)
                     .setParameter("name", name)
                     .getSingleResult();
        } catch (Exception e) {
            System.out.println("Error finding category by name: " + e.getMessage());
            return null; 
        }
    }

}
