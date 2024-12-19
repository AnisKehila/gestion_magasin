package entities.gcommande;

import entities.gcommandeitem.CommandeItem;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "commande")
public class Commande implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false)
    private Date date;
        
    @Column(nullable = false)
    private String customer;

    @Column(nullable = false)
    private String address;
    
    @OneToMany(mappedBy = "commande", cascade = CascadeType.ALL)
    private List<CommandeItem> items;

    // Constructors, Getters, and Setters
    public Commande() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getDate() { return date; }
    public void setDate(Date date) { this.date = date; }

    public String getCustomer() { return customer; }
    public void setCustomer(String customer) { this.customer = customer; }

    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    
    public List<CommandeItem> getItems() { return items; }
    public void setItems(List<CommandeItem> items) { this.items = items; }
}
