package com.example.service.impl;

import com.example.model.Evaluation;
import com.example.repository.IEvaluationRepository;
import com.example.service.IEvaluationService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class EvaluationService implements IEvaluationService {

    @Inject
    private IEvaluationRepository evaluationRepository;

    @Override
    public Evaluation findById(UUID evaluationId) {
        return this.evaluationRepository.findById(evaluationId);
    }
}
