package ru.perm.v.camunda;

import org.camunda.bpm.engine.delegate.DelegateExecution;

public interface DelegateService {
    /**
     * Вызов в camunda  через Expression ${delegateService.myMethod(execution}
     * <pre>
     * Пример:
     * &lt;bpmn:serviceTask id="Task1"
     *      camunda:expression="${delegateService.callOnExecution(execution)}"&gt;
     * </pre>
     * delegateService определен в OSGI-INF/blueprint/blueprint.xml
     */
    String request(String id);
    void callOnExecution(DelegateExecution delegateExecution);
}
