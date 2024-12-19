/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcommandeitem;

import entities.gcommandeitem.CommandeItem;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author A N I S
 */
@Remote
public interface CommandeItemFacadeRemote {

    void create(CommandeItem commandeItem);

    void edit(CommandeItem commandeItem);

    void remove(CommandeItem commandeItem);

    CommandeItem find(Object id);

    List<CommandeItem> findAll();

    List<CommandeItem> findRange(int[] range);

    int count();
    
}
