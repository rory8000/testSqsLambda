package com.example;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SQSEvent;
import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

import java.util.UUID;

public class EvaluationSqsMessageListener implements RequestHandler<SQSEvent, String> {

    private static final Weld weld = new Weld();
    private static final WeldContainer container = weld.initialize();

    private FinishEvaluationProcessor finishEvaluationProcessor;

    public String handleRequest(SQSEvent event, Context context) {
        finishEvaluationProcessor = container.select(FinishEvaluationProcessor.class).get();
        event.getRecords().forEach(sqsMessage -> {
            UUID evaluationId = null;
            try {
                String messageBody = sqsMessage.getBody();
                evaluationId = UUID.fromString(messageBody);
                System.out.println("Mensaje recibido: " + evaluationId);
                finishEvaluationProcessor.process(evaluationId);
            } catch (Exception ex) {
                String message1 = String.format("ERROR DESCONOCIDO de procesamiento evaluationId[%s]", evaluationId);
                System.err.println(message1);
                ex.printStackTrace();
//                throw new RuntimeException(message1);
            }
        });
        return "Mensajes procesados con éxito";
    }
}
