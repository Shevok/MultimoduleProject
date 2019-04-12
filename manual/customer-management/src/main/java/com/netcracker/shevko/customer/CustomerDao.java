package com.netcracker.shevko.customer;

import java.util.List;

public interface CustomerDao {

    void create(Customer customer);

    Customer findById(Long id);

    void update(Customer customer);

    void delete(Long id);

    List<Customer> findAll();
}
