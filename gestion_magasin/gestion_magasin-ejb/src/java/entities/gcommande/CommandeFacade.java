/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcommande;

import entities.AbstractFacade;
import entities.gcommande.Commande;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A N I S
 */
@Stateless
public class CommandeFacade extends AbstractFacade<Commande> implements CommandeFacadeRemote {

    @PersistenceContext(unitName = "gestion_magasin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommandeFacade() {
        super(Commande.class);
    }
    
}
