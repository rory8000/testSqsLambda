package com.example.service;

import com.example.model.Evaluation;

import java.util.UUID;

public interface IEvaluationService {
    Evaluation findById(UUID evaluationId);
}
