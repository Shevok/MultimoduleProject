package com.netcracker.shevko.offer;

import com.netcracker.shevko.category.Category;
import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;
import com.netcracker.shevko.price.Price;
import com.netcracker.shevko.tag.Tag;
import com.sun.istack.internal.NotNull;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class OfferDaoImpl implements OfferDao {

    private EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();

    @Override
    public void create(@NotNull final Offer offer) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(offer);
        tx.commit();

    }

    @Override
    public void update(@NotNull final Offer offer) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(offer);
        tx.commit();

    }

    @Override
    public void delete(@NotNull final Long id) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Offer offer = entityManager.getReference(Offer.class,id);
        entityManager.remove(offer);
        tx.commit();
    }

    @Override
    public Offer findById(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Offer offer = entityManager.find(Offer.class, id);
        entityManager.detach(offer);
        tx.commit();
        return offer;
    }

    @Override
    public List<Offer> findAll() {
        return null;
    }

    @Override
    public List<Offer> findAllByTag(Tag tag) {
        return null;
    }

    @Override
    public List<Offer> findAllByPrice(Price price) {
        return null;
    }

    @Override
    public List<Offer> findAllByCategory(Category category) {
        return null;
    }


}
