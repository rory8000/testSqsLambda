package com.example;

import javax.enterprise.context.ApplicationScoped;
import java.util.UUID;

@ApplicationScoped
public class FinishEvaluationProcessor2 {
    public void process(UUID evaluationId) {
        System.out.println("Procesando mensaje 2: "+evaluationId);
    }
}
