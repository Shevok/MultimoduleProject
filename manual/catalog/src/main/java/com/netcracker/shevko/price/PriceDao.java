package com.netcracker.shevko.price;

import java.util.List;

public interface PriceDao {

    void create(Price price);

    Price findById(Long id);

    void update(Price price);

    void delete(Long id);

    List<Price> findAll();
}
