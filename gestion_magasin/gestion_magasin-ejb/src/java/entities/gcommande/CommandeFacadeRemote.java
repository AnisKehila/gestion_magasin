/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcommande;

import entities.gcommande.Commande;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author A N I S
 */
@Remote
public interface CommandeFacadeRemote {

    void create(Commande commande);

    void edit(Commande commande);

    void remove(Commande commande);

    Commande find(Object id);

    List<Commande> findAll();

    List<Commande> findRange(int[] range);

    int count();
    
}
