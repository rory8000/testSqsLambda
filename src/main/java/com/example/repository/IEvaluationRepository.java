package com.example.repository;

import com.example.model.Evaluation;

import java.util.UUID;

public interface IEvaluationRepository {

    Evaluation findById(UUID id);
}
