package com.example;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import javax.persistence.EntityManager;
import java.util.UUID;

@ApplicationScoped
public class FinishEvaluationProcessor {
//    @Inject
//    private EntityManager entityManager;
    public void process(UUID evaluationId) {
        System.out.println("Procesando mensaje: "+evaluationId);
    }
}
