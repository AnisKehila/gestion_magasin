/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities.gcategory;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author A N I S
 */
@Remote
public interface CategoryFacadeRemote {

    void create(Category category);

    void edit(Category category);

    void remove(Category category);

    Category find(Object id);

    Category findByName(String name);
    
    List<Category> findAll();

    List<Category> findRange(int[] range);

    int count();
    public void delete(Long categoryId);

    
}
