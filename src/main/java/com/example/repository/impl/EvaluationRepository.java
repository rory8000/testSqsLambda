package com.example.repository.impl;

import com.example.model.Evaluation;
import com.example.repository.IEvaluationRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@ApplicationScoped
public class EvaluationRepository implements IEvaluationRepository {

    @Inject
    protected EntityManager em;

    public Evaluation findById(UUID id) {
        // Convert the UUID to a string
        String uuidString = id.toString();
        String lastTwoCharacters = uuidString.substring(uuidString.length() - 2);
        long lastTwoDigits = Long.parseLong(lastTwoCharacters, 16); // Base 16 for hexadecimal
        Evaluation entity = em.find(Evaluation.class, lastTwoDigits);
        if (entity == null) {
            throw new EntityNotFoundException("Entity " + Evaluation.class.getName() +
                    " with id [" + id +
                    "] not found");
        }
        return entity;
    }
}
