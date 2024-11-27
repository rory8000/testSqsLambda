package com.example.repository.impl;

import com.example.model.Evaluation;
import com.example.repository.IEvaluationRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.UUID;

@ApplicationScoped
public class EvaluationRepository implements IEvaluationRepository {

    @PersistenceContext(unitName = "evaluationDS")
    protected EntityManager em;

    public Evaluation findById(UUID id) {
        Evaluation entity = em.find(Evaluation.class, id);
        if (entity == null) {
            throw new EntityNotFoundException("Entity " + Evaluation.class.getName() +
                    " with id [" + id +
                    "] not found");
        }
        return entity;
    }
}
