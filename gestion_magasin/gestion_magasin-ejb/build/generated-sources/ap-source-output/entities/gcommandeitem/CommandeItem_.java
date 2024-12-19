package entities.gcommandeitem;

import entities.gcommande.Commande;
import entities.gproduct.Product;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-18T22:14:10")
@StaticMetamodel(CommandeItem.class)
public class CommandeItem_ { 

    public static volatile SingularAttribute<CommandeItem, Product> product;
    public static volatile SingularAttribute<CommandeItem, Integer> quantity;
    public static volatile SingularAttribute<CommandeItem, Double> price;
    public static volatile SingularAttribute<CommandeItem, Long> id;
    public static volatile SingularAttribute<CommandeItem, Commande> commande;

}