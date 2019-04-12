package com.netcracker.shevko.offer;

import com.netcracker.shevko.category.Category;
import com.netcracker.shevko.price.Price;
import com.netcracker.shevko.tag.Tag;

import java.util.List;

public interface OfferDao {

    void create(Offer offer);

    void update(Offer offer);

    void delete(Long id);

    Offer findById(Long id);

    List<Offer> findAll();

    List<Offer> findAllByTag(Tag tag);

    List<Offer> findAllByPrice(Price price);

    List<Offer> findAllByCategory(Category category);


}
