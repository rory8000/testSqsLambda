package com.example;

import com.example.model.Evaluation;
import com.example.service.IEvaluationService;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import java.util.UUID;

@ApplicationScoped
public class FinishEvaluationProcessor {
    @Inject
    private IEvaluationService evaluationService;

    @Transactional(Transactional.TxType.NOT_SUPPORTED)
    public void process(UUID evaluationId) {
        System.out.println("Procesando mensaje 1: "+evaluationId);
        Evaluation evaluation = this.evaluationService.findById(evaluationId);
        System.out.println("Evaluation" + evaluation.toString());
    }
}
