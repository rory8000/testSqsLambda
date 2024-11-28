package com.example.environment.lambda;

import org.jboss.weld.environment.se.Weld;
import org.jboss.weld.environment.se.WeldContainer;

public class CDIContext {
    private static final WeldContainer container;

    static {
        Weld weld = new Weld();
        container = weld.initialize();
    }

    public static <T> T getBean(Class<T> beanClass) {
        return container.select(beanClass).get();
    }
}
