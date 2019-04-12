package com.netcracker.shevko.category;


import java.util.List;

public interface CategoryDao {

    void create(Category category);

    Category findById(Long id);

    void update(Category category);

    void delete(Long id);

    List<Category> findAll();
}
