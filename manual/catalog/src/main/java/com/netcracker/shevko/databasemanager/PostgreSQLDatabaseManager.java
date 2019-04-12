package com.netcracker.shevko.databasemanager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PostgreSQLDatabaseManager implements DatabaseManager{
    private static final EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("userPersistenceUnit");
    private static final DatabaseManager INSTANCE = null;
    private EntityManager entityManager;

    private PostgreSQLDatabaseManager(){
        entityManager = ENTITY_MANAGER_FACTORY.createEntityManager();
    }

    @Override
    public EntityManager getEntityManager(){
        return entityManager;
    }

    public  static DatabaseManager getInstance(){
        return PostgreSQLDatabaseManager.INSTANCE;
    }

}

