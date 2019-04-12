package com.netcracker.shevko.tag;

import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;
import com.netcracker.shevko.offer.Offer;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class TagDaoImpl implements TagDao {

    private EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();

    @Override
    public void create(Tag tag) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(tag);
        tx.commit();
    }

    @Override
    public Tag findById(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Tag tag = entityManager.find(Tag.class, id);
        entityManager.detach(tag);
        tx.commit();
        return tag;
    }

    @Override
    public void update(Tag tag) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(tag);
        tx.commit();
    }

    @Override
    public void delete(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Tag tag = entityManager.getReference(Tag.class,id);
        entityManager.remove(tag);
        tx.commit();
    }

    @Override
    public List<Tag> findAll() {
        return null;
    }
}
