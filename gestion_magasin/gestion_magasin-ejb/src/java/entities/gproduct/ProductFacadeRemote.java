/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gproduct;

import entities.gproduct.Product;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author A N I S
 */
@Remote
public interface ProductFacadeRemote {

    void create(Product product);

    void edit(Product product);

    void remove(Product product);

    void delete(Long id);
    
    Product find(Object id);

    List<Product> findAll();

    List<Product> findRange(int[] range);

    int count();
    public String getNames();

}
