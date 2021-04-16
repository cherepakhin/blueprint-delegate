package ru.perm.v.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;

@Slf4j
public class BeanBluePrint {

    private final String id;

    public BeanBluePrint(String id) {
        this.id = id;
    }

    /**
     * Вызов в camunda  через Expression ${beanBluePrint.myMethod(execution}
     * <pre>
     * Пример:
     * &lt;bpmn:serviceTask id="Task1"
     *      camunda:expression="${beanBluePrint.myMethod(execution)}"&gt;
     * </pre>
     * beanBluePrint  определен в OSGI-INF/blueprint/blueprint.xml
     * @param delegateExecution
     */
    public void myMethod(DelegateExecution delegateExecution) {
        log.info("===================myMethod");
    }
}
