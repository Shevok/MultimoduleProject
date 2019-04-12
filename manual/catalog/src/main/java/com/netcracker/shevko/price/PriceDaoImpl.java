package com.netcracker.shevko.price;

import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;
import com.netcracker.shevko.offer.Offer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class PriceDaoImpl implements PriceDao {

    private EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();

    @Override
    public void create(Price price) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(price);
        tx.commit();
    }

    @Override
    public Price findById(Long id) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Price price = entityManager.find(Price.class, id);
        entityManager.detach(price);
        tx.commit();
        return price;
    }

    @Override
    public void update(Price price) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(price);
        tx.commit();
    }

    @Override
    public void delete(Long id) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Price price = entityManager.getReference(Price.class,id);
        entityManager.remove(price);
        tx.commit();

    }

    @Override
    public List<Price> findAll() {
        return null;
    }
}
