package com.netcracker.shevko.order;

/*import com.netcracker.shevko.baseentity.BaseEntity;
import com.netcracker.shevko.category.Category;
import com.netcracker.shevko.customer.Customer;
import com.netcracker.shevko.offer.Offer;
import com.netcracker.shevko.tag.Tag;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "order")
public class Order extends BaseEntity {

    @ManyToOne
    @JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name =  "order_has_offer",
            joinColumns = @JoinColumn(name = "order_id"),
            inverseJoinColumns = @JoinColumn(name = "offer_id") )
    private Set<Offer> offers = new HashSet<>();

    @Column(name = "sum")
    private int sum;

    @Column(name = "offer_count")
    private int offerCount;

    @Column(name = "date")
    private Date date;

    @Column(name = "payment")
    private String payment;

    @Column(name = "status")
    private String status;


}*/
