package com.netcracker.shevko.category;

import com.netcracker.shevko.baseentity.BaseEntity;
import com.netcracker.shevko.offer.Offer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "category")
public class Category extends BaseEntity {

    @Column(name = "category_name")
    private String categoryName;

    @OneToMany(mappedBy="category")
    private List<Offer> offers = new ArrayList<>();

}
