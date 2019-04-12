package com.netcracker.shevko.order;

import java.util.List;

public interface OrderDao<Entity, Key> {

    void create(Entity entity);

    void update(Entity entity);

    void delete(Entity entity);

    Entity findById(Key key);

    List<Entity> findAll(Key key);

    List<Entity> findAllByTag(Key key);

    List<Entity> findAllByPrice(Key key);

    List<Entity> findAllByCategory(Key key);


}