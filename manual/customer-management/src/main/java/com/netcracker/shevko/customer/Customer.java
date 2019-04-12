package com.netcracker.shevko.customer;

import com.netcracker.shevko.baseentity.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "customer")
public class Customer extends BaseEntity {

    private String lastname;

    private String firstname;

    private String patronymic;

    private int age;

}
