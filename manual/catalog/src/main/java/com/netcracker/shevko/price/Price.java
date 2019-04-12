package com.netcracker.shevko.price;

import com.netcracker.shevko.baseentity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "price")
@Data
public class Price extends BaseEntity {

    @Column(name = "price")
    private int price;

}
