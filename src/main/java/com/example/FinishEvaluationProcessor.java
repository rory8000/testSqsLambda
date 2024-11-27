package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.util.UUID;

@ApplicationScoped
public class FinishEvaluationProcessor {
    @Inject
    private FinishEvaluationProcessor2 finishEvaluationProcessor2;
    public void process(UUID evaluationId) {
        System.out.println("Procesando mensaje: "+evaluationId);
        finishEvaluationProcessor2.process(evaluationId);
    }
}
