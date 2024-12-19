package entities.gcommande;

import entities.gcommandeitem.CommandeItem;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-12-18T22:14:10")
@StaticMetamodel(Commande.class)
public class Commande_ { 

    public static volatile SingularAttribute<Commande, Date> date;
    public static volatile SingularAttribute<Commande, String> address;
    public static volatile SingularAttribute<Commande, Long> id;
    public static volatile ListAttribute<Commande, CommandeItem> items;
    public static volatile SingularAttribute<Commande, String> customer;

}