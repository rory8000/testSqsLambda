package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProducer {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("evaluationDS");

    @Produces
    @ApplicationScoped
    public EntityManager produceEntityManager() {
        return emf.createEntityManager();
    }
}
