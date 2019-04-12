package com.netcracker.shevko.category;

import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CategoryDaoImpl implements CategoryDao {

    private EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();


    @Override
    public void create(Category category) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(category);
        tx.commit();
    }

    @Override
    public Category findById(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Category category = entityManager.find(Category.class, id);
        entityManager.detach(category);
        tx.commit();
        return category;
    }

    @Override
    public void update(Category category) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(category);
        tx.commit();
    }

    @Override
    public void delete(Long id) {

        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Category category = entityManager.getReference(Category.class,id);
        entityManager.remove(category);
        tx.commit();
    }

    @Override
    public List<Category> findAll() {
        return null;
    }
}
