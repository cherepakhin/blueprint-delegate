package ru.perm.v.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;

@Slf4j
/**
 * Типичный делегат
 */
public class DelegateSimple2 implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("==========================DelegateSimple2");
    }
}
