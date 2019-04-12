package com.netcracker.shevko.databasemanager;

import javax.persistence.EntityManager;

public interface DatabaseManager {
    EntityManager getEntityManager();
}
