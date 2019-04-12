package com.netcracker.shevko.tag;

import com.netcracker.shevko.baseentity.BaseEntity;
import com.netcracker.shevko.offer.Offer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@Entity
@Table(name = "tag")
public class Tag extends BaseEntity {

    @Column(name = "tag_search")
    private String tagDescription;

    @ManyToMany(mappedBy = "tags")
    private Set<Offer> offersWithTags = new HashSet<>();

}
