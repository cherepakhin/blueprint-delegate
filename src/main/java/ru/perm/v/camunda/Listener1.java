package ru.perm.v.camunda;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.ExecutionListener;

@Slf4j
public class Listener1 implements ExecutionListener {
    @Override
    public void notify(DelegateExecution delegateExecution) throws Exception {
        log.info("Listener:" + delegateExecution.toString());
    }
}
