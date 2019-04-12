package com.netcracker.shevko.tag;


import java.util.List;

public interface TagDao {

    void create(Tag tag);

    Tag findById(Long id);

    void update(Tag tag);

    void delete(Long id);

    List<Tag> findAll();
}
