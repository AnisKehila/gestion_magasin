/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcommandeitem;

import entities.AbstractFacade;
import entities.gcommandeitem.CommandeItem;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author A N I S
 */
@Stateless
public class CommandeItemFacade extends AbstractFacade<CommandeItem> implements CommandeItemFacadeRemote {

    @PersistenceContext(unitName = "gestion_magasin-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CommandeItemFacade() {
        super(CommandeItem.class);
    }
    
}
