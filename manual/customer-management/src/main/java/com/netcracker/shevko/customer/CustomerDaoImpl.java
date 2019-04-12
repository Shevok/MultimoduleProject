package com.netcracker.shevko.customer;

import com.netcracker.shevko.databasemanager.PostgreSQLDatabaseManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private EntityManager entityManager = PostgreSQLDatabaseManager.getInstance().getEntityManager();

    @Override
    public void create(Customer customer) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(customer);
        tx.commit();
    }

    @Override
    public Customer findById(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Customer customer = entityManager.find(Customer.class, id);
        entityManager.detach(customer);
        tx.commit();
        return customer;
    }

    @Override
    public void update(Customer customer) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.merge(customer);
        tx.commit();
    }

    @Override
    public void delete(Long id) {
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        Customer customer = entityManager.getReference(Customer.class,id);
        entityManager.remove(customer);
        tx.commit();
    }

    @Override
    public List<Customer> findAll() {
        EntityTransaction transaction = entityManager.getTransaction();
        List<Customer> customers;
        transaction.begin();
        customers = entityManager.createQuery("SELECT elem FROM Customer elem ORDER BY elem.id", Customer.class).getResultList();
        transaction.commit();
        return customers;
    }
}
